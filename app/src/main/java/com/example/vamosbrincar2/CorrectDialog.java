package com.example.vamosbrincar2;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CorrectDialog {

    private Context mContext;
    private Dialog correctDialog;
    private PlayActivity mplayActivity;

    public CorrectDialog(Context mContext) {
        this.mContext = mContext;
    }

    public void correctDialog(int score, final PlayActivity playActivity){

        mplayActivity = playActivity;

        correctDialog = new Dialog(mContext);
        correctDialog.setContentView(R.layout.correct_dialog);

        Button btCorrectDilaog = (Button) correctDialog.findViewById(R.id.bt_correct_dialog);

        score(score);


        btCorrectDilaog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playActivity.showQuestions();
                correctDialog.dismiss();
            }
        });

        correctDialog.show();
        correctDialog.setCancelable(false);
        correctDialog.setCanceledOnTouchOutside(false);

        correctDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

    }

    private void score(int score) {

        TextView textViewScore = (TextView) correctDialog.findViewById(R.id.text_score);
        textViewScore.setText("Score: " + String.valueOf(score));
    }


}
