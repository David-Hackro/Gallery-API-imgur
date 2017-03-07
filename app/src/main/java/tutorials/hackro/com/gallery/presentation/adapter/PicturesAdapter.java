package tutorials.hackro.com.gallery.presentation.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import tutorials.hackro.com.gallery.R;
import tutorials.hackro.com.gallery.presentation.model.DataPresentation;
import tutorials.hackro.com.gallery.presentation.presenter.HomePresenter;

/**
 * Created by hackro on 5/03/17.
 */
public class PicturesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private final HomePresenter presenter;
    private final List<DataPresentation> imagesList;

    public PicturesAdapter(HomePresenter presenter) {
        this.presenter = presenter;
        imagesList = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_image, parent, false);
        return new ImageViewHolder(view, presenter);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ImageViewHolder imageViewHolder = (ImageViewHolder) holder;
        DataPresentation team = imagesList.get(position);
        imageViewHolder.render(team);

    }

    @Override
    public int getItemCount() {
        return imagesList.size();
    }


    public void addAllImages(List<DataPresentation> imagesList){
        this.imagesList.addAll(imagesList);
    }


}
