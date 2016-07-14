package com.elorri.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int EUROPE_FACTOR = 3;
    private static final int ASIA_FACTOR = 2;
    private static final int USA_FACTOR = 1;
    private static final int ANDROID_DEVELOPER_FACTOR = 1;
    private static final int ANDROID_DEVELOPER_MENTOR_FACTOR = 1;
    private static final int ENGLISH_TEACHER_FACTOR = 1;
    private static final int SEO_MANAGER_FACTOR = 1;
    private static final int SMALL_PROJECT_FACTOR = 1;
    private static final int CUSTOMER_FACING_FACTOR = 1;
    private static final int ON_SITE_WORK_FACTOR = 1;
    private static final int FREELANCE_FACTOR = 1;
    private static final int MENTORSHIP_OPPORTUNITIES_FACTOR = 1;
    private static final int NETWORKING_OPPORTUNITIES_FACTOR = 1;
    private static final int ENGLISH_LANGUAGE_IMPROVEMENT_FACTOR = 1;

    private int gradeValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void grade(View view) {

        // Getting the ids of the views we need
        RadioButton europe = (RadioButton) findViewById(R.id.europe);
        RadioButton asia = (RadioButton) findViewById(R.id.asia);
        RadioButton usa = (RadioButton) findViewById(R.id.usa);
        CheckBox androidDeveloper = (CheckBox) findViewById(R.id.android_developer);
        CheckBox androidDeveloperMentor = (CheckBox) findViewById(R.id.android_developer_mentor);
        CheckBox englishTeacher = (CheckBox) findViewById(R.id.english_teacher);
        CheckBox seoManager = (CheckBox) findViewById(R.id.seo_manager);
        CheckBox smallProject = (CheckBox) findViewById(R.id.small_project);
        CheckBox customerFacing = (CheckBox) findViewById(R.id.customer_facing);
        CheckBox onSiteWork = (CheckBox) findViewById(R.id.on_site_work);
        CheckBox freelance = (CheckBox) findViewById(R.id.freelance);
        CheckBox mentorshipOpportunities = (CheckBox) findViewById(R.id.mentorship_opportunities);
        CheckBox networkingOpportunities = (CheckBox) findViewById(R.id.networking_opportunities);
        CheckBox englishLanguageImprovement = (CheckBox) findViewById(R.id.english_language_improvement);
        TextView gradeValue=(TextView)findViewById(R.id.gradeValue);


        if (europe.isChecked())
            increaseGrade(EUROPE_FACTOR);
        if (asia.isChecked())
            increaseGrade(ASIA_FACTOR);
        if (usa.isChecked())
            increaseGrade(USA_FACTOR);
        if (androidDeveloper.isChecked())
            increaseGrade(ANDROID_DEVELOPER_FACTOR);
        if (androidDeveloperMentor.isChecked())
            increaseGrade(ANDROID_DEVELOPER_MENTOR_FACTOR);
        if (englishTeacher.isChecked())
            increaseGrade(ENGLISH_TEACHER_FACTOR);
        if (seoManager.isChecked())
            increaseGrade(SEO_MANAGER_FACTOR);
        if (smallProject.isChecked())
            increaseGrade(SMALL_PROJECT_FACTOR);
        if (customerFacing.isChecked())
            increaseGrade(CUSTOMER_FACING_FACTOR);
        if (onSiteWork.isChecked())
            increaseGrade(ON_SITE_WORK_FACTOR);
        if (freelance.isChecked())
            increaseGrade(FREELANCE_FACTOR);
        if (mentorshipOpportunities.isChecked())
            increaseGrade(MENTORSHIP_OPPORTUNITIES_FACTOR);
        if (networkingOpportunities.isChecked())
            increaseGrade(NETWORKING_OPPORTUNITIES_FACTOR);
        if (englishLanguageImprovement.isChecked())
            increaseGrade(ENGLISH_LANGUAGE_IMPROVEMENT_FACTOR);

        gradeValue.setText(getResources().getString(R.string.grade_value, this.gradeValue));

    }

    private void increaseGrade(int factor) {
        gradeValue = gradeValue + factor;
    }


}
