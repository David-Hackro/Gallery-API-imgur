package tutorials.hackro.com.gallery.presentation.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import tutorials.hackro.com.gallery.R;
import tutorials.hackro.com.gallery.presentation.BaseActivity;
import tutorials.hackro.com.gallery.presentation.HomeApplication;
import tutorials.hackro.com.gallery.presentation.adapter.PicturesAdapter;
import tutorials.hackro.com.gallery.presentation.model.DataPresentation;
import tutorials.hackro.com.gallery.presentation.presenter.HomePresenter;

public class HomeActivity extends BaseActivity implements HomePresenter.View{


    @Inject
    HomePresenter presenter;

    @BindView(R.id.list_images)
    RecyclerView teamList;

    private PicturesAdapter adapter;

    @Override
    public void initView() {
        super.initView();
        initializeDagger();
        initializePresenter();
        initializeAdapter();
        initializeRecyclerView();
        presenter.initialize();
    }


    private void initializeAdapter() {
        adapter = new PicturesAdapter(presenter);
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
        adapter.addAllImages(imagesList);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void openTeamScreen(DataPresentation dataPresentation) {

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


    private void initializeRecyclerView() {
        teamList.setLayoutManager(new LinearLayoutManager(this));
        //teamList.addItemDecoration(
          //      new DividerItemDecoration(HomeActivity.this, 1));
        teamList.setHasFixedSize(true);
        teamList.setAdapter(adapter);
    }
}
