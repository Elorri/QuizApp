package com.elorri.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Depending on the notation, here is the grade when all anwers are corrects.
     */
    private static final int GRADE_MAX_VALUE = 60;
	
	/**
     * The number of questions of the quiz
     */
    private static final int NB_QUESTIONS = 4;

	/**
     * The variable will store the grade value
     */
    private int gradeValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void grade(View view) {
        int correctQuestions = 0;
        if (isQuestion1correct()) correctQuestions++;
        if (isQuestion2correct()) correctQuestions++;
        if (isQuestion3correct()) correctQuestions++;
        if (isQuestion4correct()) correctQuestions++;
        gradeValue=calculateGradeValue(correctQuestions, GRADE_MAX_VALUE, NB_QUESTIONS);
        Toast.makeText(this, getResources().getString(R.string.grade_value, this.gradeValue,
                GRADE_MAX_VALUE), Toast.LENGTH_SHORT).show();
    }


	/**
     * Tell if the correct answer is selected on screen for question 1
     */
    private boolean isQuestion1correct() {
      RadioButton europe = (RadioButton) findViewById(R.id.europe);

        //We could have simply used this line
        //return europe.isChecked()
        //the effect would have been the same
        if (europe.isChecked())
            return true;
        else
            return false;
    }

	/**
     * Tell if the correct answer is selected on screen for question 2
     */
    private boolean isQuestion2correct() {
        CheckBox androidDeveloper = (CheckBox) findViewById(R.id.android_developer);
        CheckBox trainDriver = (CheckBox) findViewById(R.id.train_driver);
        CheckBox ticketInspectors = (CheckBox) findViewById(R.id.ticket_inspectors);
        CheckBox englishTeacher = (CheckBox) findViewById(R.id.english_teacher);
        return trainDriver.isChecked()
                &&ticketInspectors.isChecked()
                &&!androidDeveloper.isChecked()
                &&!englishTeacher.isChecked();
    }
	
	
	/**
     * Tell if the correct answer is selected on screen for question 3
     */
    private boolean isQuestion3correct() {
        CheckBox smallProject = (CheckBox) findViewById(R.id.small_project);
        CheckBox customerFacing = (CheckBox) findViewById(R.id.customer_facing);
        CheckBox onSiteWork = (CheckBox) findViewById(R.id.on_site_work);
        CheckBox freelance = (CheckBox) findViewById(R.id.freelance);
        return customerFacing.isChecked()
                &&onSiteWork.isChecked()
                &&!smallProject.isChecked()
                &&!freelance.isChecked();
    }

	/**
     * Tell if the correct answer is selected on screen for question 4
     */
    private boolean isQuestion4correct() {
        CheckBox mentorshipOpportunities = (CheckBox) findViewById(R.id.mentorship_opportunities);
        CheckBox networkingOpportunities = (CheckBox) findViewById(R.id.networking_opportunities);
        CheckBox englishLanguageImprovement = (CheckBox) findViewById(R.id.english_language_improvement);
        return networkingOpportunities.isChecked()
                &&englishLanguageImprovement.isChecked()
                &&!mentorshipOpportunities.isChecked();
    }


    /**
     * Calculate the grade based on the number of questions correct, the maximum possible grade, and the total number of questions
     * @param nbCorrectQuestions the number of questions correct
     * @param gradeMaxValue the maximum possible grade
     * @param nbQuestions the total number of questions
     * @return the grade
     */
    private int calculateGradeValue(int nbCorrectQuestions, int gradeMaxValue, int nbQuestions) {
        return (gradeMaxValue*nbCorrectQuestions)/nbQuestions;
    }


}
