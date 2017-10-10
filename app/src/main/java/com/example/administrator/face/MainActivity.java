package com.example.administrator.face;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button bnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnt=(Button)findViewById(R.id.button);

        //添加注释  2017-10-10 22.08
    }
}
