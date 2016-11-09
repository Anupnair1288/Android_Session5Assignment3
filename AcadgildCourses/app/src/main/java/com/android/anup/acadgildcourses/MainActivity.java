package com.android.anup.acadgildcourses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView courses_listview;

    Intent intent;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courses_listview = (ListView)findViewById(R.id.listview);

        Myadapter myadapter = new Myadapter(this);
        courses_listview.setAdapter(myadapter);

        courses_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle extras = new Bundle();
                extras.putInt("POSITION", position);
                intent = new Intent(MainActivity.this, Activity_mentor.class);
                intent.putExtras(extras);
                startActivity(intent);
            }
        });
    }
}
