package com.example.quanlm.android_custom_view_demo.simpleListView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.quanlm.android_custom_view_demo.R;

public class ActSimpleListView extends AppCompatActivity {
    ListView listStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_simple_list_view);

        initControls();

    }

    private void initControls() {
        listStudent = (ListView) findViewById(R.id.lstStudent);
        ArrayAdapter lstStudents = new ArrayAdapter<String>(this, R.layout.simple_list_view_item);
        lstStudents.add("SV001 - Nguyễn Văn A");
        lstStudents.add("SV002 - Nguyễn Văn A");
        lstStudents.add("SV003 - Nguyễn Văn A");
        lstStudents.add("SV004 - Nguyễn Văn A");
        lstStudents.add("SV005 - Nguyễn Văn A");
        lstStudents.add("SV006 - Nguyễn Văn A");
        lstStudents.add("SV007 - Nguyễn Văn A");

        listStudent.setAdapter(lstStudents);
    }

}
