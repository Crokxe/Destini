package com.necipakgz.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.storyTextView)
    TextView storyTextView;
    @BindView(R.id.buttonTop)
    Button buttonTop;
    @BindView(R.id.buttonBottom)
    Button buttonBottom;
    String myQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.buttonTop)
    public void onButtonTopClicked() {
        myQuestion = storyTextView.getText().toString();
        if (myQuestion.equals(getString(R.string.T1_Story))) {
            storyTextView.setText(R.string.T3_Story);
            buttonTop.setText(R.string.T3_Ans1);
            buttonBottom.setText(R.string.T3_Ans2);
        } else if (myQuestion.equals(getString(R.string.T3_Story))) {
            storyTextView.setText(R.string.T6_End);
            buttonTop.setVisibility(View.INVISIBLE);
            buttonBottom.setVisibility(View.INVISIBLE);
        } else if (myQuestion.equals(getString(R.string.T2_Story))) {
            storyTextView.setText(R.string.T3_Story);
            buttonTop.setText(R.string.T3_Ans1);
            buttonBottom.setText(R.string.T3_Ans2);
        }
    }

    @OnClick(R.id.buttonBottom)
    public void onButtonBottomClicked() {
        myQuestion = storyTextView.getText().toString();
        if (myQuestion.equals(getString(R.string.T1_Story))) {
            storyTextView.setText(R.string.T2_Story);
            buttonTop.setText(R.string.T2_Ans1);
            buttonBottom.setText(R.string.T2_Ans2);
        } else if (myQuestion.equals(getString(R.string.T2_Story))) {
            storyTextView.setText(R.string.T4_End);
            buttonTop.setVisibility(View.INVISIBLE);
            buttonBottom.setVisibility(View.INVISIBLE);
        } else if (myQuestion.equals(getString(R.string.T3_Story))) {
            storyTextView.setText(R.string.T5_End);
            buttonTop.setVisibility(View.INVISIBLE);
            buttonBottom.setVisibility(View.INVISIBLE);
        }
    }
}