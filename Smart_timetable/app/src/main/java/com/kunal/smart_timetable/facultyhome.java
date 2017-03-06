package com.kunal.smart_timetable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;


/**
 * Created by kunal on 3/4/2017.
 */

public class facultyhome extends Activity {

    private Spinner spinn,spinner,spinner2;
    ArrayList<String> b = new ArrayList<String>();
    ArrayList<String> c = new ArrayList<String>();
    ArrayList<String> d = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facultyhome);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);


        fillarray();

        //planets_spinner11.setAdapter(new ArrayAdapter<String>(studentcourses.this,
        //        android.R.layout.simple_dropdown_item_1line, a));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int pos,
                                       long arg3) {
                // TODO Auto-generated method stub
                if (pos == 0) {
                    spinner2.setAdapter(new ArrayAdapter<String>(
                            facultyhome.this,
                            android.R.layout.simple_dropdown_item_1line, b));
                } else if (pos == 1) {
                    spinner2.setAdapter(new ArrayAdapter<String>(
                            facultyhome.this,
                            android.R.layout.simple_dropdown_item_1line, c));
                } else {
                    spinner2.setAdapter(new ArrayAdapter<String>(
                            facultyhome.this,
                            android.R.layout.simple_dropdown_item_1line, d));
                }
            }
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });



    }

    private void fillarray() {
        // TODO Auto-generated method stub
        //a.clear();
        //a.add("CSE");
        //a.add("ECE");
        //a.add("EE");

        b.clear();
        b.add("Prof. Bala");
        b.add("Prof. Sandeep");
        b.add("Prof. Subhankar");
        b.add("Prof. Sudip");

        c.clear();
        c.add("Prof. Meenakshi");
        c.add("Prof. Pathak");
        c.add("Prof. Rajeeb");
        c.add("Prof. Vinod");


        d.clear();
        d.add("Prof. Anand");
        d.add("Prof. Brijesh");
        d.add("Prof. Pillai");
        d.add("Prof. Pramod");

    }
    public void submit1(View view)
    {
        spinn = (Spinner) findViewById(R.id.spinner);
        if (String.valueOf(spinn.getSelectedItem()).equals("CSE")) {
                    Intent openStartingPoint=new Intent("com.kunal.smart_timetable.FACULTYCOURSES_CSE");
                    startActivity(openStartingPoint);
                } else if (String.valueOf(spinn.getSelectedItem()).equals("ECE")) {
                    Intent openStartingPoint=new Intent("com.kunal.smart_timetable.FACULTYCOURSES_ECE");
                    startActivity(openStartingPoint);
                } else {
                    Intent openStartingPoint = new Intent("com.kunal.smart_timetable.FACULTYCOURSES_EE");
                    startActivity(openStartingPoint);
                }
    }

}
