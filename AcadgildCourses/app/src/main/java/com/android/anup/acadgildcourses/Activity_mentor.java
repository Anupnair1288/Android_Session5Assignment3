package com.android.anup.acadgildcourses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity_mentor extends AppCompatActivity {
    Dataclass mdata = new Dataclass();;
    String cname, mname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentor);
        Intent intent = getIntent();
        int current_position = intent.getIntExtra("POSITION", 0);
        String cname = mdata.courses[current_position];
        String mname = mdata.mentor[current_position];
        TextView mentor_textview = (TextView)findViewById(R.id.textview_mentor);
        mentor_textview.setText(mname +" is the mentor for " + cname);
    }
}
