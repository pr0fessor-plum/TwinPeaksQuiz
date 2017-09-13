package com.example.android.twinpeaksquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Submit Answers button is clicked.
     */
    public void submitAnswers(View view) {
        int correctAnswers = 0;

        RadioButton q1 = (RadioButton) findViewById(R.id.correct_answer_1_radio_button);
        if (q1.isChecked()) {correctAnswers += 1;}

        RadioButton q2 = (RadioButton) findViewById(R.id.correct_answer_2_radio_button);
        if (q2.isChecked()) {correctAnswers += 1;}

        RadioButton q3 = (RadioButton) findViewById(R.id.correct_answer_3_radio_button);
        if (q3.isChecked()){correctAnswers += 1;}

        RadioButton q4 = (RadioButton) findViewById(R.id.correct_answer_4_radio_button);
        if (q4.isChecked()){correctAnswers += 1;}

        CheckBox q5a1 = (CheckBox) findViewById(R.id.correct_answer_5_checkbox_1);
        CheckBox q5a2 = (CheckBox) findViewById(R.id.correct_answer_5_checkbox_2);
        CheckBox q5a3 = (CheckBox) findViewById(R.id.incorrect_answer_5_checkbox_3);
        CheckBox q5a4 = (CheckBox) findViewById(R.id.incorrect_answer_5_checkbox_4);
        if (q5a1.isChecked() &&
                q5a2.isChecked() &&
                !q5a3.isChecked() &&
                !q5a4.isChecked()) {correctAnswers += 1;}

        EditText q6 = (EditText) findViewById(R.id.answer_6_field);
       if (q6.getText().toString().equals("The Great Northern") ||
               q6.getText().toString().equals("The Great Northern Hotel") ||
                       q6.getText().toString().equals("Great Northern") ||
                            q6.getText().toString().equals("Great Northern Hotel")) {correctAnswers += 1;}

        RadioButton q7 = (RadioButton) findViewById(R.id.correct_answer_7_radio_button);
        if (q7.isChecked()) {correctAnswers += 1;}

        CheckBox q8a1 = (CheckBox) findViewById(R.id.correct_answer_8_checkbox_1);
        CheckBox q8a2 = (CheckBox) findViewById(R.id.correct_answer_8_checkbox_2);
        CheckBox q8a3 = (CheckBox) findViewById(R.id.incorrect_answer_8_checkbox_3);
        CheckBox q8a4 = (CheckBox) findViewById(R.id.correct_answer_8_checkbox_4);
        if (q8a1.isChecked() &&
                q8a2.isChecked() &&
                !q8a3.isChecked() &&
                q8a4.isChecked()) {correctAnswers += 1;}

        RadioButton q9 = (RadioButton) findViewById(R.id.correct_answer_9_radio_button);
        if (q9.isChecked()) {correctAnswers += 1;}

        EditText q10 = (EditText) findViewById(R.id.answer_10_field);
        if (q10.getText().toString().equals("Norma") ||
                q10.getText().toString().equals("Norma Jennings")) {correctAnswers += 1;}

        makeText(this, "You have answered " + correctAnswers + " out of 10 questions correctly!", Toast.LENGTH_LONG).show();
    }

}
