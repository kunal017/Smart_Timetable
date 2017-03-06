package com.kunal.smart_timetable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

/**
 * Created by kunal on 3/5/2017.
 */

public class facultycourses_ee extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facultycourses_ee);

    }
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_102:
                if (checked){

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;
            case R.id.checkbox_103:
                if (checked){

                }
                // Cheese me
                else
                    // I'm lactose intolerant
                    break;

            case R.id.checkbox_212:
                if (checked){

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;

            case R.id.checkbox_221:
                if (checked){

                }
                // Put some meat on the sandwich
                else
                    // Remove the meat
                    break;
                // TODO: Veggie sandwich
        }
    }
    public void submit1(View view)
    {
        Intent openStartingPoint=new Intent("com.kunal.smart_timetable.TT_EE");
        startActivity(openStartingPoint);
    }
}
