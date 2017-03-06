package com.kunal.smart_timetable;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteDatabase db = openOrCreateDatabase("codefundo3", MODE_APPEND, null);
        db.execSQL("create table if not exists codefundo3(class text, enroll text, CS102 text, CS103 text, CS212 text, CS221 text, EC101 text, EC104 text, EC232 text, EC316 text, EE101 text, EE102 text, EE212 text, EE356 text)");
    }
    public void stud(View view)
    {
        Intent openStartingPoint=new Intent("com.kunal.smart_timetable.STUDENTHOME");
        startActivity(openStartingPoint);
    }

    public void facul(View view)
    {
        Intent openStartingPoint=new Intent("com.kunal.smart_timetable.FACULTYHOME");
        startActivity(openStartingPoint);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
