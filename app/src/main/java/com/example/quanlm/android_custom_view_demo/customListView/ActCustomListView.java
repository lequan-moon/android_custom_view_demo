package com.example.quanlm.android_custom_view_demo.customListView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.quanlm.android_custom_view_demo.R;
import com.example.quanlm.android_custom_view_demo.model.Student;

public class ActCustomListView extends AppCompatActivity {
    ListView listStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_custom_list_view);

        initControls();
    }

    private void initControls() {
        listStudent = (ListView) findViewById(R.id.lstStudent);
        ArrayAdapter studentAdapter = new CustomStudentAdapter(this, R.layout.custom_list_view_item);
        studentAdapter.add(new Student("001", "Nguyen Van A", "aaaaa"));
        studentAdapter.add(new Student("001", "Nguyen Van A", "aaaaa"));
        studentAdapter.add(new Student("001", "Nguyen Van A", "aaaaa"));
        studentAdapter.add(new Student("001", "Nguyen Van A", "aaaaa"));
        studentAdapter.add(new Student("001", "Nguyen Van A", "aaaaa"));
        studentAdapter.add(new Student("001", "Nguyen Van A", "aaaaa"));
        listStudent.setAdapter(studentAdapter);
    }
}
