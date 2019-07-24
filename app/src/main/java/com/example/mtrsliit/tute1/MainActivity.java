package com.example.mtrsliit.tute1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 =findViewById(R.id.textView2);
        textView2.setText(R.string.Msg2);

        Log.i("LifeCycle", "onCreate() Invoked!!! ");
    }

    public void onStart()
    {
        super.onStart();
        Log.i("LifeCycle", "onCreate() Invoked!!! ");

    }

    public void onRestart()
    {

        super.onRestart();
        Log.i("LifeCycle", "onCreate() Invoked!!! ");
    }

    public void onResume(){

        super.onResume();
        Log.i("LifeCycle", "onCreate() Invoked!!! ");

    }
}
