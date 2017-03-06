package tutorials.hackro.com.gallery.data.repository;

import android.support.annotation.NonNull;

import java.io.File;
import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import tutorials.hackro.com.gallery.data.entity.addImage.AddMoviesResponse;
import tutorials.hackro.com.gallery.data.remote.AppRemoteData;
import tutorials.hackro.com.gallery.domain.model.DataDomain;

/**
 * Created by hackro on 6/03/17.
 */
public class AppRepository implements AppDataImages{


    private DatatoDataEntityMaper mapper;
    private AppRemoteData remoteData;

    @Inject
    public AppRepository(@NonNull  AppRemoteData remoteData) {
        this.remoteData = remoteData;
        mapper = new DatatoDataEntityMaper();
    }

    @Override
    public Observable<List<DataDomain>> getImages() {
        return remoteData.getImages().map(imagesResponse -> mapper.reverseMap(imagesResponse.getData()));
    }

    @Override
    public Observable<AddMoviesResponse> addImage(File image) {
        return remoteData.addImage(image);
    }
}
