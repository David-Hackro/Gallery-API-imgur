package tutorials.hackro.com.gallery.presentation.activity;

import android.util.Log;

import java.util.List;

import javax.inject.Inject;

import tutorials.hackro.com.gallery.R;
import tutorials.hackro.com.gallery.presentation.BaseActivity;
import tutorials.hackro.com.gallery.presentation.HomeApplication;
import tutorials.hackro.com.gallery.presentation.model.DataPresentation;
import tutorials.hackro.com.gallery.presentation.presenter.HomePresenter;

public class HomeActivity extends BaseActivity implements HomePresenter.View{


    @Inject
    HomePresenter presenter;



    @Override
    public void initView() {
        super.initView();
        initializeDagger();
        initializePresenter();
        presenter.initialize();
    }

    private void initializePresenter() {
        presenter.setView(this);

    }

    private void initializeDagger() {
        HomeApplication app = (HomeApplication) getApplication();
        app.getAppComponent().inject(this);
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    public void showImages(List<DataPresentation> imagesList) {
        for (DataPresentation image : imagesList){
                Log.e("image:   ",image.toString());
        }
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String message) {
        Log.e("Error:       ",message);
    }
}
