package com.tutorials.hp.masterdetailrecyclerview.Aktivitas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorials.hp.masterdetailrecyclerview.R;

public class DetailActivity extends AppCompatActivity {

    TextView nameTxt,sukatex,komentex,jaraktex,ratingtex,revietex,destex,alamatex,phonetex,webtex,emailtex;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        //INITIALIZE VIEWS
        nameTxt= (TextView) findViewById(R.id.nameTxtDetail);
        sukatex= (TextView) findViewById(R.id.likestat);
        komentex= (TextView) findViewById(R.id.comment);
        jaraktex= (TextView) findViewById(R.id.distance);
        ratingtex= (TextView) findViewById(R.id.rating);
        revietex= (TextView) findViewById(R.id.reviewre);
        destex= (TextView) findViewById(R.id.descDetailTxt2);
        alamatex= (TextView) findViewById(R.id.address);
        phonetex= (TextView) findViewById(R.id.phone);
        webtex= (TextView) findViewById(R.id.web);
        emailtex= (TextView) findViewById(R.id.email);
        img= (ImageView) findViewById(R.id.spacecraftImageDetail);

        //RECEIVE DATA
        Intent i=this.getIntent();
        String name=i.getExtras().getString("NAME_KEY");
        String suka=i.getExtras().getString("SUKA_KEY");
        String komentar=i.getExtras().getString("KOMENTAR_KEY");
        String jarak=i.getExtras().getString("JARAK_KEY");
        String rating=i.getExtras().getString("RATING_KEY");
        String reviewer=i.getExtras().getString("REVIEWER_KEY");
        String deskripsi=i.getExtras().getString("DESKRIPSI_KEY");
        String alamat=i.getExtras().getString("ALAMAT_KEY");
        String nomortelp=i.getExtras().getString("NOMORTELP_KEY");
        String website=i.getExtras().getString("WEBSITE_KEY");
        String email=i.getExtras().getString("EMAIL_KEY");


        int image=i.getExtras().getInt("IMAGE_KEY");

        //BIND DATA
        nameTxt.setText(name);
        sukatex.setText(suka);
        komentex.setText(komentar);
        jaraktex.setText(jarak);
        ratingtex.setText(rating);
        revietex.setText(reviewer);
        destex.setText(deskripsi);
        alamatex.setText(alamat);
        phonetex.setText(nomortelp);
        webtex.setText(website);
        emailtex.setText(email);
        img.setImageResource(image);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
