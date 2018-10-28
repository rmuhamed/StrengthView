package com.rmuhamed.strengthview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    this.setContentView(R.layout.activity_main);

    this.doDemo();
  }

  private void doDemo() {
    final StrengthView aStrengthView = this.findViewById(R.id.strength_view);

    this.findViewById(R.id.score_1).setOnClickListener(v -> aStrengthView.setScore(1));
    this.findViewById(R.id.score_2).setOnClickListener(v -> aStrengthView.setScore(2));
    this.findViewById(R.id.score_3).setOnClickListener(v -> aStrengthView.setScore(3));
    this.findViewById(R.id.score_4).setOnClickListener(v -> aStrengthView.setScore(4));
    this.findViewById(R.id.score_5).setOnClickListener(v -> aStrengthView.setScore(5));
    this.findViewById(R.id.score_6).setOnClickListener(v -> aStrengthView.setScore(6));
    this.findViewById(R.id.score_7).setOnClickListener(v -> aStrengthView.setScore(7));
    this.findViewById(R.id.score_8).setOnClickListener(v -> aStrengthView.setScore(8));
    this.findViewById(R.id.score_9).setOnClickListener(v -> aStrengthView.setScore(9));
    this.findViewById(R.id.score_10).setOnClickListener(v -> aStrengthView.setScore(10));
  }
}
