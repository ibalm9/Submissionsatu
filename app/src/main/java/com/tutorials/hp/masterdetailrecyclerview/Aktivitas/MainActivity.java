package com.tutorials.hp.masterdetailrecyclerview.Aktivitas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

import com.tutorials.hp.masterdetailrecyclerview.ObjekWisata.TempatWisataData;
import com.tutorials.hp.masterdetailrecyclerview.R;
import com.tutorials.hp.masterdetailrecyclerview.RecyclerView.MyAdapter;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarde);
        setSupportActionBar(toolbar);


        RecyclerView rv= (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter=new MyAdapter(this, TempatWisataData.getSpaceCrafts());
        rv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_favorite) {
            Intent activity4Intent = new Intent(getApplicationContext(), ProfileActivity.class);
            startActivity(activity4Intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
