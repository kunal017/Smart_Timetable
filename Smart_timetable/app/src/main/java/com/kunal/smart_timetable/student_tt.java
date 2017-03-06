package com.kunal.smart_timetable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by kunal on 3/5/2017.
 */

public class student_tt extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_tt);
    }

    public void cse(View view)
    {
        Intent openStartingPoint=new Intent("com.kunal.smart_timetable.TT_CSE");
        startActivity(openStartingPoint);
    }
    public void ece(View view)
    {
        Intent openStartingPoint=new Intent("com.kunal.smart_timetable.TT_ECE");
        startActivity(openStartingPoint);
    }
    public void ee(View view)
    {
        Intent openStartingPoint=new Intent("com.kunal.smart_timetable.TT_EE");
        startActivity(openStartingPoint);
    }
    public void get_home(View view)
    {
        Intent openStartingPoint=new Intent(this , MainActivity.class);
        startActivity(openStartingPoint);
    }

}
