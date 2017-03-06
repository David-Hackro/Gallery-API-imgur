package tutorials.hackro.com.gallery.domain.usecase;

import javax.inject.Inject;

import rx.Observable;
import tutorials.hackro.com.gallery.data.repository.AppRepository;

/**
 * Created by hackro on 6/03/17.
 */
public class GetImages extends UseCase {


    private final AppRepository repository;

    @Inject
    public GetImages(AppRepository repository) {
        this.repository = repository;
    }

    @Override
    protected Observable buildObservableUseCase() {
        return repository.getImages();
    }
}
