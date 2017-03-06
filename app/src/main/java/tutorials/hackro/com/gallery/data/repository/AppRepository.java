package tutorials.hackro.com.gallery.data.repository;

import android.support.annotation.NonNull;

import java.io.File;

import javax.inject.Inject;

import rx.Observable;
import tutorials.hackro.com.gallery.data.entity.returnImages.ImagesResponse;
import tutorials.hackro.com.gallery.data.entity.addImage.AddMoviesResponse;
import tutorials.hackro.com.gallery.data.remote.AppRemoteData;

/**
 * Created by hackro on 6/03/17.
 */
public class AppRepository implements AppDataImages{



    private AppRemoteData remoteData;

    @Inject
    public AppRepository(@NonNull  AppRemoteData remoteData) {
        this.remoteData = remoteData;
    }

    @Override
    public Observable<ImagesResponse> getImages() {
        return remoteData.getImages();
    }

    @Override
    public Observable<AddMoviesResponse> addImage(File image) {
        return remoteData.addImage(image);
    }
}
