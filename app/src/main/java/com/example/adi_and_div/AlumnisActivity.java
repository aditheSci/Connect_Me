package com.example.adi_and_div;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class AlumnisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumnis);

        // Dummy data for alumnis
        List<Student> alumnis = new ArrayList<>();
        alumnis.add(new Student("Vikas", "Your branch", "2017", "xxxxxxxxxxx"));
        alumnis.add(new Student("Rohit", "Your branch", "2018", "xxxxxxxxxxx"));
        alumnis.add(new Student("Meena", "Your branch", "2019", "xxxxxxxxxxx"));
        alumnis.add(new Student("Sunil", "Your branch", "2020", "xxxxxxxxxxx"));
        alumnis.add(new Student("Ankita", "Your branch", "2021", "xxxxxxxxxxx"));
        alumnis.add(new Student("Ramesh", "Your branch", "2022", "xxxxxxxxxxx"));
        alumnis.add(new Student("Ramesh", "Your branch", "2022", "xxxxxxxxxxx"));
        alumnis.add(new Student("Ramesh", "Your branch", "2022", "xxxxxxxxxxx"));
        alumnis.add(new Student("Ramesh", "Your branch", "2022", "xxxxxxxxxxx"));
        alumnis.add(new Student("Ramesh", "Your branch", "2022", "xxxxxxxxxxx"));
        alumnis.add(new Student("Ramesh", "Your branch", "2022", "xxxxxxxxxxx"));
        alumnis.add(new Student("Ramesh", "Your branch", "2022", "xxxxxxxxxxx"));
        alumnis.add(new Student("Ramesh", "Your branch", "2022", "xxxxxxxxxxx"));


        // Get the container layout for alumnis list
        LinearLayout alumnisListContainer = findViewById(R.id.alumnis_list_container);

        // Dynamically add each alumni's details to the container
        for (Student alumni : alumnis) {
            TextView studentView = new TextView(this);
            studentView.setText(String.format(
                    "Name: %s\nBranch: %s\nBatch: %s\nContact: %s",
                    alumni.getName(), alumni.getBranch(), alumni.getSection(), alumni.getContact()
            ));
            studentView.setPadding(10, 10, 10, 10);
            studentView.setTextSize(16);
            studentView.setBackgroundResource(android.R.drawable.dialog_holo_light_frame);
            studentView.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            studentView.setPadding(20, 20, 20, 20);
            alumnisListContainer.addView(studentView);

            // Add spacing between entries
            TextView spacer = new TextView(this);
            spacer.setHeight(16);
            alumnisListContainer.addView(spacer);
        }

        // Handle "Other Colleges" button click
        Button otherCollegesButton = findViewById(R.id.button8);
        otherCollegesButton.setOnClickListener(view -> {

        });
    }

    // Helper class for student details
    public static class Student {
        private final String name;
        private final String branch;
        private final String section; // Used as "Batch" for alumni
        private final String contact;

        public Student(String name, String branch, String section, String contact) {
            this.name = name;
            this.branch = branch;
            this.section = section;
            this.contact = contact;
        }

        public String getName() {
            return name;
        }

        public String getBranch() {
            return branch;
        }

        public String getSection() {
            return section;
        }

        public String getContact() {
            return contact;
        }
    }
}