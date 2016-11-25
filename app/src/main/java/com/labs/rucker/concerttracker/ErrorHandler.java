package com.labs.rucker.concerttracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Carlos on 7/24/2016.
 */
public class ErrorHandler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public Boolean ErrorHandler(){

        TextView errorTxt = (TextView)findViewById(R.id.errorTxt);
        errorTxt.setVisibility(View.VISIBLE);

        return true;
    }
}
