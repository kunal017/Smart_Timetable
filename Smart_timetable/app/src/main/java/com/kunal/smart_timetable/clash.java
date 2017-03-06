package com.kunal.smart_timetable;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by kunal on 3/5/2017.
 */

public class clash extends Activity {

    String var1,var2,var3;
    private TextView tv01,tv02,tv03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clash);

        tv01 = (TextView) findViewById(R.id.textView13);
        tv02 = (TextView) findViewById(R.id.textView14);
        tv03 = (TextView) findViewById(R.id.textView15);

        var1 = getIntent().getStringExtra("var1");
        var2 = getIntent().getStringExtra("var2");
        var3 = getIntent().getStringExtra("var3");

        tv01.setText(var1+"");
        tv02.setText(var2+"");
        tv03.setText(var3+"");
    }
}
