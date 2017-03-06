package com.kunal.smart_timetable;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
/**
 * Created by kunal on 3/4/2017.
 */

public class studentcourses extends Activity {

    private Spinner planets_spinner12, planets_spinner11, planets_spinner21,planets_spinner22,planets_spinner31,planets_spinner32,planets_spinner41,planets_spinner42,planets_spinner51,planets_spinner52;
    //ArrayList<String> a = new ArrayList<String>();
    int ar[] = {1,2,3,4,1,2,3,4,1,2,3,4};

    ArrayList<String> b = new ArrayList<String>();
    ArrayList<String> c = new ArrayList<String>();
    ArrayList<String> d = new ArrayList<String>();
    private SQLiteDatabase db;
    private TextView tv01,tv02;
    Cursor kunal;
    ContentValues conten=new ContentValues();
    String dummy,temp="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentcourses);
        tv01 = (TextView) findViewById(R.id.textView01);
        tv02 = (TextView) findViewById(R.id.textView02);
        dummy = getIntent().getStringExtra("extra_value");

        db=openOrCreateDatabase("codefundo3",MODE_APPEND,null);
        kunal=db.rawQuery("SELECT * FROM codefundo3",null);
        while(kunal.moveToNext())
        {
            if(dummy.equals(kunal.getString(kunal.getColumnIndex("enroll"))))
            {
                tv01.setText(kunal.getString(kunal.getColumnIndex(("class"))));
                tv02.setText(kunal.getString(kunal.getColumnIndex(("enroll"))));
                break;
            }
        }
        temp = dummy;
        Toast.makeText(studentcourses.this, dummy,
                Toast.LENGTH_LONG).show();

        //tv02.setText(dummy);
        //tv02.setText(kunal.getString(kunal.getColumnIndex("enroll")));

        planets_spinner11 = (Spinner) findViewById(R.id.planets_spinner11);
        planets_spinner12 = (Spinner) findViewById(R.id.planets_spinner12);
        planets_spinner21 = (Spinner) findViewById(R.id.planets_spinner21);
        planets_spinner22 = (Spinner) findViewById(R.id.planets_spinner22);
        planets_spinner31 = (Spinner) findViewById(R.id.planets_spinner31);
        planets_spinner32 = (Spinner) findViewById(R.id.planets_spinner32);
        planets_spinner41 = (Spinner) findViewById(R.id.planets_spinner41);
        planets_spinner42 = (Spinner) findViewById(R.id.planets_spinner42);
        planets_spinner51 = (Spinner) findViewById(R.id.planets_spinner51);
        planets_spinner52 = (Spinner) findViewById(R.id.planets_spinner52);

        fillarray();

        //planets_spinner11.setAdapter(new ArrayAdapter<String>(studentcourses.this,
        //        android.R.layout.simple_dropdown_item_1line, a));

        planets_spinner11.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int pos,
                                       long arg3) {
                // TODO Auto-generated method stub
                if (pos == 0) {
                    planets_spinner12.setAdapter(new ArrayAdapter<String>(
                            studentcourses.this,
                            android.R.layout.simple_dropdown_item_1line, b));
                } else if (pos == 1) {
                    planets_spinner12.setAdapter(new ArrayAdapter<String>(
                            studentcourses.this,
                            android.R.layout.simple_dropdown_item_1line, c));
                } else {
                    planets_spinner12.setAdapter(new ArrayAdapter<String>(
                            studentcourses.this,
                            android.R.layout.simple_dropdown_item_1line, d));
                }
            }
                public void onNothingSelected(AdapterView<?> arg0) {

                }
        });

        //planets_spinner21.setAdapter(new ArrayAdapter<String>(studentcourses.this,
        //       android.R.layout.simple_dropdown_item_1line, a));

        planets_spinner21.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int pos,
                                       long arg3) {
                // TODO Auto-generated method stub
                if (pos == 0) {
                    planets_spinner22.setAdapter(new ArrayAdapter<String>(
                            studentcourses.this,
                            android.R.layout.simple_dropdown_item_1line, b));
                } else if (pos == 1) {
                    planets_spinner22.setAdapter(new ArrayAdapter<String>(
                            studentcourses.this,
                            android.R.layout.simple_dropdown_item_1line, c));
                } else {
                    planets_spinner22.setAdapter(new ArrayAdapter<String>(
                            studentcourses.this,
                            android.R.layout.simple_dropdown_item_1line, d));
                }
            }
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });

        //planets_spinner31.setAdapter(new ArrayAdapter<String>(studentcourses.this,
        //        android.R.layout.simple_dropdown_item_1line, a));

        planets_spinner31.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int pos,
                                       long arg3) {
                // TODO Auto-generated method stub
                if (pos == 0) {
                    planets_spinner32.setAdapter(new ArrayAdapter<String>(
                            studentcourses.this,
                            android.R.layout.simple_dropdown_item_1line, b));
                } else if (pos == 1) {
                    planets_spinner32.setAdapter(new ArrayAdapter<String>(
                            studentcourses.this,
                            android.R.layout.simple_dropdown_item_1line, c));
                } else {
                    planets_spinner32.setAdapter(new ArrayAdapter<String>(
                            studentcourses.this,
                            android.R.layout.simple_dropdown_item_1line, d));
                }
            }
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });

        //planets_spinner41.setAdapter(new ArrayAdapter<String>(studentcourses.this,
        //        android.R.layout.simple_dropdown_item_1line, a));

        planets_spinner41.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int pos,
                                       long arg3) {
                // TODO Auto-generated method stub
                if (pos == 0) {
                    planets_spinner42.setAdapter(new ArrayAdapter<String>(
                            studentcourses.this,
                            android.R.layout.simple_dropdown_item_1line, b));
                } else if (pos == 1) {
                    planets_spinner42.setAdapter(new ArrayAdapter<String>(
                            studentcourses.this,
                            android.R.layout.simple_dropdown_item_1line, c));
                } else {
                    planets_spinner42.setAdapter(new ArrayAdapter<String>(
                            studentcourses.this,
                            android.R.layout.simple_dropdown_item_1line, d));
                }
            }
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });

        //planets_spinner51.setAdapter(new ArrayAdapter<String>(studentcourses.this,
        //        android.R.layout.simple_dropdown_item_1line, a));

        planets_spinner51.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int pos,
                                       long arg3) {
                // TODO Auto-generated method stub
                if (pos == 0) {
                    planets_spinner52.setAdapter(new ArrayAdapter<String>(
                            studentcourses.this,
                            android.R.layout.simple_dropdown_item_1line, b));
                } else if (pos == 1) {
                    planets_spinner52.setAdapter(new ArrayAdapter<String>(
                            studentcourses.this,
                            android.R.layout.simple_dropdown_item_1line, c));
                } else {
                    planets_spinner52.setAdapter(new ArrayAdapter<String>(
                            studentcourses.this,
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
            b.add("CS102");
            b.add("CS103");
            b.add("CS212");
            b.add("CS221");

            c.clear();
            c.add("EC101");
            c.add("EC104");
            c.add("EC232");
            c.add("EC316");

            d.clear();
            d.add("EE101");
            d.add("EE112");
            d.add("EE212");
            d.add("EE356");
        }
        public void submit1(View view)
        {
            conten.put(String.valueOf(planets_spinner12.getSelectedItem()),"1");
            conten.put(String.valueOf(planets_spinner22.getSelectedItem()),"1");
            conten.put(String.valueOf(planets_spinner32.getSelectedItem()),"1");
            conten.put(String.valueOf(planets_spinner42.getSelectedItem()),"1");
            conten.put(String.valueOf(planets_spinner52.getSelectedItem()),"1");

            //db=openOrCreateDatabase("codefundo3",MODE_APPEND,null);

            db.update("codefundo3", conten, "enroll="+dummy, null);
            if(String.valueOf(planets_spinner12.getSelectedItem())=="EC101"&&String.valueOf(planets_spinner22.getSelectedItem())=="CS102")
            {
                Toast.makeText(studentcourses.this, "Clash",
                        Toast.LENGTH_LONG).show();
                Intent openStartingPoint = new Intent("com.kunal.smart_timetable.CLASH");
                openStartingPoint.putExtra("var1","EC101");
                openStartingPoint.putExtra("var2","CS102");
                openStartingPoint.putExtra("var3","9-10 am");
                startActivity(openStartingPoint);
            }
            else if(String.valueOf(planets_spinner12.getSelectedItem())=="EC104"&&String.valueOf(planets_spinner22.getSelectedItem())=="CS103")
            {
                Toast.makeText(studentcourses.this, "Clash",
                        Toast.LENGTH_LONG).show();
                Intent openStartingPoint = new Intent("com.kunal.smart_timetable.CLASH");
                openStartingPoint.putExtra("var1","EC104");
                openStartingPoint.putExtra("var2","CS103");
                openStartingPoint.putExtra("var3","10-11 am");
                startActivity(openStartingPoint);
            }
            else if (String.valueOf(planets_spinner12.getSelectedItem())=="EC101"&&String.valueOf(planets_spinner22.getSelectedItem())=="EE101")
            {
                Toast.makeText(studentcourses.this, "Clash",
                        Toast.LENGTH_LONG).show();
                Intent openStartingPoint = new Intent("com.kunal.smart_timetable.CLASH");
                openStartingPoint.putExtra("var1","EC101");
                openStartingPoint.putExtra("var2","EE101");
                openStartingPoint.putExtra("var3","9-10 am");
                startActivity(openStartingPoint);
            }

            //Cursor kunal=db.rawQuery("SELECT * FROM codefundo3",null);
            /*while(kunal.moveToNext()) {
                if (dummy.equals(kunal.getString(kunal.getColumnIndex("enroll")))) {

                    break;
                }
            }*/
            /*if(Integer.parseInt(kunal.getString(kunal.getColumnIndex("CS102")))+Integer.parseInt(kunal.getString(kunal.getColumnIndex("EC101")))+Integer.parseInt(kunal.getString(kunal.getColumnIndex("EE101")))>1)
            {
                Intent openStartingPoint = new Intent("com.kunal.smart_timetable.CLASH");
                openStartingPoint.putExtra("var1",Integer.parseInt(kunal.getString(kunal.getColumnIndex("CS102"))));
                openStartingPoint.putExtra("var2",Integer.parseInt(kunal.getString(kunal.getColumnIndex("EC101"))));
                openStartingPoint.putExtra("var3",Integer.parseInt(kunal.getString(kunal.getColumnIndex("EE101"))));
                startActivity(openStartingPoint);
            }
            else if(Integer.parseInt(kunal.getString(kunal.getColumnIndex("CS103")))+Integer.parseInt(kunal.getString(kunal.getColumnIndex("EC104")))+Integer.parseInt(kunal.getString(kunal.getColumnIndex("EE112")))>1)
            {
                Intent openStartingPoint = new Intent("com.kunal.smart_timetable.CLASH");

                openStartingPoint.putExtra("var1",Integer.parseInt(kunal.getString(kunal.getColumnIndex("CS103"))));
                openStartingPoint.putExtra("var2",Integer.parseInt(kunal.getString(kunal.getColumnIndex("EC104"))));
                openStartingPoint.putExtra("var3",Integer.parseInt(kunal.getString(kunal.getColumnIndex("EE112"))));
                startActivity(openStartingPoint);
            }
            else if(Integer.parseInt(kunal.getString(kunal.getColumnIndex("CS212")))+Integer.parseInt(kunal.getString(kunal.getColumnIndex("EC232")))+Integer.parseInt(kunal.getString(kunal.getColumnIndex("EE212")))>1)
            {
                Intent openStartingPoint = new Intent("com.kunal.smart_timetable.CLASH");

                openStartingPoint.putExtra("var1",Integer.parseInt(kunal.getString(kunal.getColumnIndex("CS212"))));
                openStartingPoint.putExtra("var2",Integer.parseInt(kunal.getString(kunal.getColumnIndex("EC232"))));
                openStartingPoint.putExtra("var3",Integer.parseInt(kunal.getString(kunal.getColumnIndex("EE212"))));
                startActivity(openStartingPoint);
            }
            else if(Integer.parseInt(kunal.getString(kunal.getColumnIndex("CS221")))+Integer.parseInt(kunal.getString(kunal.getColumnIndex("EC316")))+Integer.parseInt(kunal.getString(kunal.getColumnIndex("EE356")))>1)
            {
                Intent openStartingPoint = new Intent("com.kunal.smart_timetable.CLASH");

                openStartingPoint.putExtra("var1",Integer.parseInt(kunal.getString(kunal.getColumnIndex("CS221"))));
                openStartingPoint.putExtra("var2",Integer.parseInt(kunal.getString(kunal.getColumnIndex("EC316"))));
                openStartingPoint.putExtra("var3",Integer.parseInt(kunal.getString(kunal.getColumnIndex("EE356"))));
                startActivity(openStartingPoint);
            }
            else {*/
            else {
                Intent openStartingPoint = new Intent("com.kunal.smart_timetable.STUDENT_TT");
                startActivity(openStartingPoint);
            }
            //}
        }
}
