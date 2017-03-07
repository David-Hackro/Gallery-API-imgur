package tutorials.hackro.com.gallery.presentation.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import butterknife.BindView;
import butterknife.ButterKnife;
import tutorials.hackro.com.gallery.R;
import tutorials.hackro.com.gallery.presentation.model.DataPresentation;
import tutorials.hackro.com.gallery.presentation.presenter.HomePresenter;

/**
 * Created by hackro on 6/03/17.
 */
public class ImageViewHolder extends RecyclerView.ViewHolder{


    @BindView(R.id.name_image)
    TextView name;
    @BindView(R.id.src_image)
    ImageView imageView;
    @BindView(R.id.date_image)
    TextView date;


    private final HomePresenter presenter;


    public ImageViewHolder(@NonNull View itemView,@NonNull HomePresenter presenter) {
        super(itemView);
        this.presenter = presenter;
        ButterKnife.bind(this, itemView);

    }


    public void render(DataPresentation dataPresentation){
        onItemClick(dataPresentation);
        renderImage(dataPresentation.getLink());
        renderTeamName(dataPresentation.getTitle());
        renderTeamDate(dataPresentation.getDescription().toString());
    }

    private void renderTeamDate(String s) {
       date.setText(s);
    }


    private void onItemClick(final DataPresentation imagePresentation) {

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                presenter.onTeamClicked(imagePresentation);
            }
        });}



    private void renderTeamName(String name) {
        this.name.setText(name);
    }


    private void renderImage(String urlImage) {
        getImage(urlImage, imageView);
    }

    private void getImage(String urlImage, ImageView imageView) {
        Log.e("url: ",urlImage);
        Glide.with(getContext())
                .load(urlImage)
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .placeholder(R.mipmap.ic_launcher)
                .skipMemoryCache(true)
                .into(imageView);
    }

    private Context getContext() {
        return itemView.getContext();
    }
}
