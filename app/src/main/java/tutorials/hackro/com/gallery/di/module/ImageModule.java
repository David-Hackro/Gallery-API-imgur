package tutorials.hackro.com.gallery.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import tutorials.hackro.com.gallery.BuildConfig;
import tutorials.hackro.com.gallery.data.remote.AppRemoteData;

/**
 * Created by hackro on 6/03/17.
 */
@Module
public class ImageModule {

    /**
     *
     * @param application
     * @return
     */
    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(Application application){
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

    /**
     *
     * @param application
     * @return
     */
    @Provides
    @Singleton
    Cache provideHtttpCache(Application application){
        int cacheSize = 10 * 1024 * 1024;
        return new Cache(application.getCacheDir(),cacheSize);
    }

    /**
     *
     * @param cache
     * @return
     */
    @Provides
    @Singleton
    OkHttpClient provideOkhttpCLient(Cache cache){
        OkHttpClient.Builder client = new OkHttpClient.Builder();
        client.cache(cache);
        return client.build();
    }

    /**
     *
     * @return
     */
    @Provides
    @Singleton
    Gson provideGson(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        return gsonBuilder.create();
    }

    /**
     *
     * @param gson
     * @param okHttpClient
     * @return
     */
    @Provides
    @Singleton
    Retrofit provideRetrofit(Gson gson,OkHttpClient okHttpClient){
        return new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .baseUrl(BuildConfig.BASE_URL)
                    .client(okHttpClient)
                    .build();
    }

    /**
     *
     * @param retrofit
     * @return
     */
    @Provides
    @Singleton
    AppRemoteData provideAppRemoteData(Retrofit retrofit){
        return new AppRemoteData(retrofit);
    }



















}
