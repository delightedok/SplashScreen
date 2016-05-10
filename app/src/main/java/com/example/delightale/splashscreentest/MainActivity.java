package com.example.delightale.splashscreentest;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private static final String url="http://pic55.nipic.com/file/20141208/19462408_171130083000_2.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);


        //简单Splash Screen实现
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,SplashActivity.class);
                startActivity(intent);
                //启动Activity后销毁自身
                finish();
            }
        },3000);


        /*
        //在后台执行任务，传入url
        new FetchDataTask().execute(url);

    }
    public class FetchDataTask extends AsyncTask<String,Void,Bitmap>{

        //执行前调用
        @Override
        protected void onPreExecute(){
            super.onPreExecute();
        }

        //执行后台任务
        @Override
        protected Bitmap doInBackground(String... strings){
            Bitmap bitmap=null;
            try{
                //通过传入的图片地址，获取图片
                HttpURLConnection connection=(HttpURLConnection)(new URL(strings[0])).openConnection();
                InputStream inputStream=connection.getInputStream();
                bitmap= BitmapFactory.decodeStream(inputStream);
            }catch (IOException e){
                e.printStackTrace();
            }
            return bitmap;
        }

        //任务完成时调用
        @Override
        protected void onPostExecute(Bitmap result){
            super.onPostExecute(result);
            //将获取的数据通过Intent传递给MainActivity
            Intent intent=new Intent(MainActivity.this,SplashActivity.class);
            //注意，Intent传递图片时，图片对象大小不应该超过40K
            intent.putExtra("Image",result);
            startActivity(intent);
            //启动MainActivity后销毁自身
            finish();
        }

 */
    }
}
