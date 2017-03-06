package tutorials.hackro.com.gallery.di.component;

import javax.inject.Singleton;

import dagger.Component;
import tutorials.hackro.com.gallery.data.remote.AppRemoteData;
import tutorials.hackro.com.gallery.di.module.AppModule;
import tutorials.hackro.com.gallery.di.module.ImageModule;
import tutorials.hackro.com.gallery.presentation.activity.HomeActivity;

/**
 * Created by hackro on 6/03/17.
 */

@Singleton
@Component(modules = {AppModule.class, ImageModule.class})
public interface AppComponent {

    void inject(HomeActivity homeActivity);
    void inject(AppRemoteData appRemoteData);
}
