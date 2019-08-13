package com.tutorials.hp.masterdetailrecyclerview.Aktivitas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.tutorials.hp.masterdetailrecyclerview.ObjekWisata.TempatWisataData;
import com.tutorials.hp.masterdetailrecyclerview.R;
import com.tutorials.hp.masterdetailrecyclerview.RecyclerView.MyAdapter;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        RecyclerView rv= (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter=new MyAdapter(this, TempatWisataData.getSpaceCrafts());
        rv.setAdapter(adapter);
    }

}
