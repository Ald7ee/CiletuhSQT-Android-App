package com.example.sqoutgeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sqoutgeo.models.Feature;

public class DescriptionAct extends AppCompatActivity {

    Database db;
    ImageView ivimage,ivimage2;
    TextView tvname , tvdesc;
    Feature f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        ivimage = findViewById(R.id.iv_image);
        tvname = findViewById(R.id.tv_name);
        tvdesc = findViewById(R.id.tv_desc);
        ivimage2 = findViewById(R.id.iv_image2);


        db = Database.getInstance();
        String itName = getIntent().getExtras().getString("feature_name");

        f = db.getFeature(itName);

        ivimage.setImageResource(f.getImage());
        tvname.setText(f.getName());
        tvdesc.setText(f.getDesc());
        ivimage2.setImageResource(f.getImage());
    }
}