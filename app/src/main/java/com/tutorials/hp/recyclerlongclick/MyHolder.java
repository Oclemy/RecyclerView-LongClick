package com.tutorials.hp.recyclerlongclick;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Oclemmy on 3/27/2016 for ProgrammingWizards Channel.
 */
public class MyHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener {

    ImageView img;
    TextView nameTxt;
    ItemLongClickListener itemLongClickListener;

    public MyHolder(View itemView) {
        super(itemView);

        img= (ImageView) itemView.findViewById(R.id.movieImage);
        nameTxt= (TextView) itemView.findViewById(R.id.nameTxt);

        itemView.setOnLongClickListener(this);

    }

    public void setItemLongClickListener(ItemLongClickListener ic)
    {
        this.itemLongClickListener=ic;
    }

    @Override
    public boolean onLongClick(View v) {
        this.itemLongClickListener.onItemLongClick(v,getLayoutPosition());
        return false;
    }
}
