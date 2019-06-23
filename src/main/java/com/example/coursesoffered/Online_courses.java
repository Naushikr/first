package com.example.coursesoffered;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class Online_courses extends AppCompatActivity {
  private   RecyclerView recyclerView;
   private Course_Adapter adapter;
   private List <com.example.coursesoffered.Course_row_parts> course_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_courses);
        course_list=new ArrayList<>();
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        course_list.add(new com.example.coursesoffered.Course_row_parts("Manual Testing","Manual testing is the process of using the functions and features of an application...",R.drawable.manual_testing));
        course_list.add(new com.example.coursesoffered.Course_row_parts("Advanced Java","Advanced Java comprises the very complex advanced programming like Swings,....",R.drawable.advanced_java));
        course_list.add(new com.example.coursesoffered.Course_row_parts("Android Web Services","A web service is a standard for exchanging information...",R.drawable.aws));
        course_list.add(new com.example.coursesoffered.Course_row_parts("C-Programming","C language is a low level language...",R.drawable.c_language));
        course_list.add(new com.example.coursesoffered.Course_row_parts("Linux Administrator","A linux system administrator is a person who is responsible for the configuration,...",R.drawable.linux));
        course_list.add(new com.example.coursesoffered.Course_row_parts("Machine Learning","Machine learning  provides systems the ability to automatically learn and...",R.drawable.machine_learing));
        course_list.add(new com.example.coursesoffered.Course_row_parts("Salesforce CRM ","Salesforce is a cloud-based customer relationship management (CRM) platform...",R.drawable.salesforce_development));
        course_list.add(new com.example.coursesoffered.Course_row_parts("SAP","The master data is used to create transactional data in SAP...",R.drawable.sap_mm));
        adapter=new Course_Adapter(this,course_list);
        recyclerView.setAdapter(adapter);
    }
}
