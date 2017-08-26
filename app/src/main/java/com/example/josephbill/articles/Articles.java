package com.example.josephbill.articles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;

public class Articles extends AppCompatActivity {
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);



    }

   public void searchart (View view){
       goToUrl("https://scholar.google.com/");

   }


    public void viewart (View view){
        goToUrl ("http://jamesclear.com/articles");


    }


    public void logout (View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    private void goToUrl(String url) {

        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}