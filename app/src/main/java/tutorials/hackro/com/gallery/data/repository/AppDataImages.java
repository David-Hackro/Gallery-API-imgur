package tutorials.hackro.com.gallery.data.repository;

import java.io.File;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;
import tutorials.hackro.com.gallery.data.entity.ReturnImages.ImagesResponse;
import tutorials.hackro.com.gallery.data.entity.addImage.AddMoviesResponse;

/**
 * Created by hackro on 5/03/17.
 */
public interface AppDataImages {


    /**
     *
     * @param authorization
     * @param album
     * @return ImagesResponse
     * @apiNote Return all Images the public album https://imgur.com/a/W05w3
     */
    @GET("album/{album}/images")
    Observable<ImagesResponse> getImages(@Header("Authorization") String authorization, @Path("album") String album);


    /**
     *
     * @param authorization
     * @param album
     * @param image
     * @param nameAlbum
     * @return AddMoviesResponse
     * @apiNote Add Image in public album and return information about the image
     */
    @POST("{album}/add")
    @FormUrlEncoded
    Observable<AddMoviesResponse> addImage(@Header("Authorization") String authorization, @Path("album") String album, @Field("image")File image,@Field("album") String nameAlbum);


}
