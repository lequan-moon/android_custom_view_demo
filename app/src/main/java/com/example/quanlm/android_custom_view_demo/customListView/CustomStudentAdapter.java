package com.example.quanlm.android_custom_view_demo.customListView;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.quanlm.android_custom_view_demo.R;
import com.example.quanlm.android_custom_view_demo.model.Student;

/**
 * Created by QuanLM on 6/9/2017.
 */

public class CustomStudentAdapter extends ArrayAdapter<Student> {

    public CustomStudentAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_view_item, parent, false);
        TextView txtStudentRollNo = (TextView) rowView.findViewById(R.id.txtStudentRollNo);
        TextView txtStudentFullName = (TextView) rowView.findViewById(R.id.txtStudentFullName);
        TextView txtStudentEmail = (TextView) rowView.findViewById(R.id.txtStudentEmail);

        Student item = getItem(position);
        txtStudentRollNo.setText(item.getRollNo());
        txtStudentFullName.setText(item.getFullName());
        txtStudentEmail.setText(item.getEmail());

        return rowView;
    }
}
