package tutorials.hackro.com.gallery.presentation;

import android.app.Application;

import tutorials.hackro.com.gallery.di.component.AppComponent;
import tutorials.hackro.com.gallery.di.component.DaggerAppComponent;
import tutorials.hackro.com.gallery.di.module.AppModule;
import tutorials.hackro.com.gallery.di.module.ImageModule;

/**
 * Created by hackro on 6/03/17.
 */
public class HomeApplication extends Application{

    private AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .imageModule(new ImageModule())

                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
