package com.kunal.smart_timetable;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;


/**
 * Created by kunal on 3/4/2017.
 */

    public class studenthome extends Activity {

        public Spinner spinner1;
        public EditText edittext;
        private SQLiteDatabase db;
        ContentValues contentv=new ContentValues();
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            setContentView(R.layout.studenthome);
            spinner1 = (Spinner)findViewById(R.id.spinner);
            edittext=(EditText)findViewById(R.id.editText2);

            db=openOrCreateDatabase("codefundo3",MODE_APPEND,null);
        }

        public void submit1(View view)
        {
            String str = ((((edittext.getText().toString()).toUpperCase()).trim()).replaceAll("\\s", ""));
            contentv.put("enroll", ((((edittext.getText().toString()).toUpperCase()).trim()).replaceAll("\\s", "")));
            contentv.put("class",String.valueOf(spinner1.getSelectedItem()));
            /*contentv.put("CS102","0");
            contentv.put("CS103","0");
            contentv.put("CS212","0");
            contentv.put("CS221","0");
            contentv.put("EC101","0");
            contentv.put("EC104","0");
            contentv.put("EC232","0");
            contentv.put("EC316","0");
            contentv.put("EE101","0");
            contentv.put("EE102","0");
            contentv.put("EE212","0");
            contentv.put("EE256","0");*/
            db.insert("codefundo3", null, contentv);
            Intent openStartingPoint=new Intent("com.kunal.smart_timetable.STUDENTCOURSES");
            openStartingPoint.putExtra("extra_value", str);
            startActivity(openStartingPoint);
        }

    }


