package com.example.preston.testingscala2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by preston on 2/16/15.
 */
public class MainActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.tvTest);
        tv.setText("" + test.hello(4));
    }
}
