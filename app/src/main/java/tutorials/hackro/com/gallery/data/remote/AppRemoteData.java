package tutorials.hackro.com.gallery.data.remote;

import android.support.annotation.NonNull;

import java.io.File;

import javax.inject.Inject;

import retrofit2.Retrofit;
import rx.Observable;
import tutorials.hackro.com.gallery.BuildConfig;
import tutorials.hackro.com.gallery.data.entity.returnImages.ImagesResponse;
import tutorials.hackro.com.gallery.data.entity.addImage.AddMoviesResponse;
import tutorials.hackro.com.gallery.data.repository.DataSource;

/**
 * Created by hackro on 6/03/17.
 */
public class AppRemoteData implements DataSource {


    private Retrofit retrofit;

    @Inject
    public AppRemoteData(@NonNull Retrofit retrofit) {
        this.retrofit = retrofit;
    }


    @Override
    public Observable<ImagesResponse> getImages() {
        return retrofit.create(ImagesService.class)
                .getImages(BuildConfig.TOKEN_SERVICE,BuildConfig.ALBUM);
    }

    @Override
    public Observable<AddMoviesResponse> addImage(File image) {
        return retrofit.create(ImagesService.class)
                .addImage(BuildConfig.TOKEN_SERVICE,BuildConfig.ENDPOINTALBUM,image,BuildConfig.ALBUM);
    }
}
