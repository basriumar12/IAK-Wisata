package id.co.blogbasbas.wisataiak;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    //deklarasi variabel bentuknya global
    ImageView imgGambar;
    TextView txtdetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtdetail = (TextView) findViewById(R.id.txtdetail) ;
        imgGambar = (ImageView)
                findViewById(R.id.imgdetail);


        Intent terimadata = getIntent();
        String nm = terimadata.getStringExtra("NAMA");
        getSupportActionBar().setTitle(nm);
        txtdetail.setText(terimadata.getStringExtra("DET"));


        imgGambar.setImageResource
                (terimadata.getIntExtra("IMG", 0));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
