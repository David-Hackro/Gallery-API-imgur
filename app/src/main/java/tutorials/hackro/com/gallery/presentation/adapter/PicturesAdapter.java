package tutorials.hackro.com.gallery.presentation.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import tutorials.hackro.com.gallery.data.entity.ReturnImages.Data;
import tutorials.hackro.com.gallery.presentation.RecyclerItemClickListener;

/**
 * Created by hackro on 5/03/17.
 */
public class PicturesAdapter {

    private List<Data> movies = new ArrayList<>();
    private RecyclerItemClickListener recyclerItemClickListener;



    public class PicturesHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView title;
        ImageView imageView;

        public PicturesHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this,itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (recyclerItemClickListener != null)
                recyclerItemClickListener.onItemClickListener(getAdapterPosition());
        }
    }
}
