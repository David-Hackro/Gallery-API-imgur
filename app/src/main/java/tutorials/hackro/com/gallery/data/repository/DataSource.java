package tutorials.hackro.com.gallery.data.repository;

import java.io.File;

import rx.Observable;
import tutorials.hackro.com.gallery.data.entity.returnImages.ImagesResponse;
import tutorials.hackro.com.gallery.data.entity.addImage.AddMoviesResponse;

/**
 * Created by hackro on 6/03/17.
 */
public interface DataSource {
    Observable<ImagesResponse> getImages();
    Observable<AddMoviesResponse> addImage(File image);
}
