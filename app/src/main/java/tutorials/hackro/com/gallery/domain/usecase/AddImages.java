package tutorials.hackro.com.gallery.domain.usecase;

import java.io.File;

import javax.inject.Inject;

import rx.Observable;
import tutorials.hackro.com.gallery.data.repository.AppRepository;

/**
 * Created by hackro on 6/03/17.
 */
public class AddImages extends UseCase {

    private final AppRepository repository;
    private File image;

    @Inject
    public AddImages( AppRepository repository) {
        this.repository = repository;
    }

    public void addImage(File image) {
        this.image = image;
    }

    @Override
    protected Observable buildObservableUseCase() {
        return repository.addImage(image);
    }
}
