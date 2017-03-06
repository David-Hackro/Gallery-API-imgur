package tutorials.hackro.com.gallery.presentation.presenter;

import android.support.annotation.NonNull;

import java.util.List;

import javax.inject.Inject;

import tutorials.hackro.com.gallery.domain.model.DataDomain;
import tutorials.hackro.com.gallery.domain.usecase.DefaultSubscriber;
import tutorials.hackro.com.gallery.domain.usecase.GetImages;
import tutorials.hackro.com.gallery.presentation.mapper.ImageMapper;
import tutorials.hackro.com.gallery.presentation.model.DataPresentation;

/**
 * Created by hackro on 6/03/17.
 */
public class HomePresenter extends Presenter<HomePresenter.View> {

    private final GetImages getImages;
    private ImageMapper mapper;
    @Inject
    public HomePresenter(@NonNull GetImages getImages) {
        this.getImages = getImages;
        mapper = new ImageMapper();

    }


    @Override
    public void initialize() {
        super.initialize();
        getView().showLoading();
        getImages.execute(new ImagesListObserver());
    }


    private final class ImagesListObserver extends DefaultSubscriber<List<DataDomain>>{
        @Override
        public void onCompleted() {
            super.onCompleted();
            getView().hideLoading();
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
            getView().hideLoading();
            getView().showError(e.getMessage());
            e.printStackTrace();
        }

        @Override
        public void onNext(List<DataDomain> imagesList) {
            super.onNext(imagesList);

            getView().showImages(mapper.reverseMap(imagesList));
        }
    }

    public interface View extends Presenter.View{
        void showImages(List<DataPresentation> imagesList);
    }

    public void destroy(){
        this.getImages.unsubscribe();
        setView(null);
    }
}
