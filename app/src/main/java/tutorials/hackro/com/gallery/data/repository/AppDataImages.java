package tutorials.hackro.com.gallery.data.repository;

import java.io.File;
import java.util.List;

import rx.Observable;
import tutorials.hackro.com.gallery.data.entity.addImage.AddMoviesResponse;
import tutorials.hackro.com.gallery.domain.model.DataDomain;

/**
 * Created by hackro on 6/03/17.
 */
public interface AppDataImages {

    Observable<List<DataDomain>> getImages();
    Observable<AddMoviesResponse> addImage(File image);

}
