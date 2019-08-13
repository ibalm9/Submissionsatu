package com.tutorials.hp.masterdetailrecyclerview.RecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorials.hp.masterdetailrecyclerview.R;

/**
 * Created by Oclemy on 5/11/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView nameTxt, kotatxt, regiontxt, tipetxt;
    ImageView img;
    ItemClickListener itemClickListener;

    public MyHolder(View itemView) {
        super(itemView);

        nameTxt= (TextView) itemView.findViewById(R.id.nameTxt);
        kotatxt= (TextView) itemView.findViewById(R.id.citytex);
        regiontxt= (TextView) itemView.findViewById(R.id.reg);
        tipetxt= (TextView) itemView.findViewById(R.id.tipee);
        img= (ImageView) itemView.findViewById(R.id.spacecraftImage);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(this.getLayoutPosition());
    }
}
