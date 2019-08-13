package com.tutorials.hp.masterdetailrecyclerview.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.tutorials.hp.masterdetailrecyclerview.R;
import com.tutorials.hp.masterdetailrecyclerview.ObjekWisata.TempatWisata;
import com.tutorials.hp.masterdetailrecyclerview.Aktivitas.DetailActivity;

import java.util.ArrayList;

/**
 * Created by Oclemy on 5/11/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<TempatWisata> tempatWisatas;

    public MyAdapter(Context c, ArrayList<TempatWisata> tempatWisatas) {
        this.c = c;
        this.tempatWisatas = tempatWisatas;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        final String name= tempatWisatas.get(position).getName();
        final String kota= tempatWisatas.get(position).getKota();
        final String region= tempatWisatas.get(position).getDaerah();
        final String alamat= tempatWisatas.get(position).getAlamat();
        final String suka= tempatWisatas.get(position).getSuka();
        final String komentar= tempatWisatas.get(position).getKomentar();
        final String reviewer= tempatWisatas.get(position).getReviewer();
        final String rating= tempatWisatas.get(position).getRating();
        final String website= tempatWisatas.get(position).getWebsite();
        final String nomortelp= tempatWisatas.get(position).getNomortelp();
        final String email= tempatWisatas.get(position).getEmail();
        final String deskripsi= tempatWisatas.get(position).getDeskripsi();
        final String jarak= tempatWisatas.get(position).getJarak();
        final String tipe= tempatWisatas.get(position).getTipe();

        final int image= tempatWisatas.get(position).getImage();

        //BIND DATA
        holder.nameTxt.setText(name);
        holder.kotatxt.setText(kota);
        holder.regiontxt.setText(region);
        holder.tipetxt.setText(tipe);
        holder.img.setImageResource(image);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                openDetailActivity(name,image,alamat,deskripsi,email,jarak,nomortelp,reviewer,rating,suka,website,komentar);
                Toast.makeText(c,name,Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return tempatWisatas.size();
    }

    private void openDetailActivity(String name,int image,String alamat, String deskripsi, String email,String jarak, String nomortelp, String reviewer, String rating, String suka, String website, String komentar)
    {
        Intent i=new Intent(c, DetailActivity.class);

        //PACK DATA TO SEND
        i.putExtra("NAME_KEY",name);
        i.putExtra("ALAMAT_KEY",alamat);
        i.putExtra("DESKRIPSI_KEY",deskripsi);
        i.putExtra("EMAIL_KEY",email);
        i.putExtra("JARAK_KEY",jarak);
        i.putExtra("NOMORTELP_KEY",nomortelp);
        i.putExtra("REVIEWER_KEY",reviewer);
        i.putExtra("RATING_KEY",rating);
        i.putExtra("SUKA_KEY",suka);
        i.putExtra("WEBSITE_KEY",website);
        i.putExtra("KOMENTAR_KEY",komentar);


        i.putExtra("IMAGE_KEY",image);

        //open activity
        c.startActivity(i);

    }
}
