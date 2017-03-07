package tutorials.hackro.com.gallery.presentation.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

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

    private Animation animation;
    private int lastPosition;
    private Context context;

    public PicturesAdapter(HomePresenter presenter) {
        this.presenter = presenter;
        imagesList = new ArrayList<>();
        lastPosition = imagesList.size()-1;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_image, parent, false);
        context = view.getContext();
        animation = AnimationUtils.loadAnimation(context, R.anim.recycler_effect);
        animation.setDuration(1700);
        return new ImageViewHolder(view, presenter);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ImageViewHolder imageViewHolder = (ImageViewHolder) holder;
        DataPresentation team = imagesList.get(position);
        imageViewHolder.render(team);
        setAnimation(((ImageViewHolder) holder).cardView, position);
    }

    @Override
    public int getItemCount() {
        return imagesList.size();
    }


    public void addAllImages(List<DataPresentation> imagesList){
        this.imagesList.addAll(imagesList);
    }

    private void setAnimation(View viewToAnimate, int position)
    {
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.recycler_effect);
        viewToAnimate.startAnimation(animation);
        lastPosition = position;
    }

    public Context getContext() {
        return context;
    }
}
