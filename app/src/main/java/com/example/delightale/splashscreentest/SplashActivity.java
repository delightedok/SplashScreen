package com.example.delightale.splashscreentest;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by delighTale on 10/5/2016.
 */
public class SplashActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        imageView=(ImageView)findViewById(R.id.image);
        Intent intent=getIntent();
        if(intent!=null){
            //注意Intent传递对象的方式
            Bitmap bitmap=intent.getParcelableExtra("Image");
            imageView.setImageBitmap(bitmap);
        }
*/
    }

}
