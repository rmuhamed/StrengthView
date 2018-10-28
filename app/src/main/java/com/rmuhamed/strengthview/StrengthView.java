package com.rmuhamed.strengthview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;

public class StrengthView extends LinearLayout {

  //Mapping from an "Integer id" with a View
  private SparseArray<View> dictionary;

  public StrengthView(Context context, AttributeSet attrs) {
    super(context, attrs);

    View v = View.inflate(context, R.layout.strength_view, this);

    this.dictionary = new SparseArray<>(10);

    this.initialise(v);
  }

  public void setScore(Integer score) {
    @ColorRes int defaultColor = R.color.grey;
    @ColorRes int scoringColor = -1;

    switch (score) {
      case 1:
      case 2:
        scoringColor = R.color.red;
        break;

      case 3:
      case 4:
        scoringColor = R.color.yellow;
        break;

      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
        scoringColor = R.color.green;
        break;

      default:
        scoringColor = R.color.grey;
        break;
    }

    this.updateFrom(score, scoringColor, defaultColor);
  }

  private void initialise(View v) {
    this.dictionary.put(1, v.findViewById(R.id.score_1));
    this.dictionary.put(2, v.findViewById(R.id.score_2));
    this.dictionary.put(3, v.findViewById(R.id.score_3));
    this.dictionary.put(4, v.findViewById(R.id.score_4));
    this.dictionary.put(5, v.findViewById(R.id.score_5));
    this.dictionary.put(6, v.findViewById(R.id.score_6));
    this.dictionary.put(7, v.findViewById(R.id.score_7));
    this.dictionary.put(8, v.findViewById(R.id.score_8));
    this.dictionary.put(9, v.findViewById(R.id.score_9));
    this.dictionary.put(10, v.findViewById(R.id.score_10));
  }

  private void updateFrom(Integer score, @ColorRes int scoringColor, @ColorRes int defaultColor) {
    int colorToBeApplied = 0;
    for (int i = 0; i < this.dictionary.size(); i++) {
      GradientDrawable bgShape = (GradientDrawable) this.dictionary.get(this.dictionary.keyAt(i)).getBackground();
      colorToBeApplied = this.dictionary.keyAt(i) <= score ?
          ContextCompat.getColor(this.getContext(), scoringColor)
          : ContextCompat.getColor(this.getContext(), defaultColor);
      bgShape.setColor(colorToBeApplied);
    }
  }
}
