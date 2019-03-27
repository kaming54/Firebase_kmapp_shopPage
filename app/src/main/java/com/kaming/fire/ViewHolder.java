package com.kaming.fire;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class ViewHolder extends RecyclerView.ViewHolder {

    View mView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        mView = itemView;
    }

    public void setDatails(Context ctx,String title,String image,String price,String status,String country){

        //Views
        TextView mTitleTv = mView.findViewById(R.id.rTitleTv);
        TextView mPriceTv = mView.findViewById(R.id.rPriceTv);
        TextView mStautsTv = mView.findViewById(R.id.rStutus);
        TextView mCountryTv = mView.findViewById(R.id.rCountryTv);
        ImageView mImageIv = mView.findViewById(R.id.rImageView);

        mTitleTv.setText(title);
        mPriceTv.setText(price);
        mStautsTv.setText(status);
        mCountryTv.setText(country);
        Picasso.get().load(image).into(mImageIv);

    }
}
