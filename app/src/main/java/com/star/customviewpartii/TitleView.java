package com.star.customviewpartii;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class TitleView extends FrameLayout {

    private Button mLeftButton;

    private TextView mTitleTextView;

    public TitleView(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.title, this);

        mLeftButton = (Button) findViewById(R.id.button_left);
        mLeftButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((AppCompatActivity) getContext()).finish();
            }
        });
    }

    public void setLeftButton(Button leftButton) {
        mLeftButton = leftButton;
    }

    public void setTitleTextView(TextView titleTextView) {
        mTitleTextView = titleTextView;
    }

    public void setLeftButtonListener(OnClickListener onClickListener) {
        mLeftButton.setOnClickListener(onClickListener);
    }

}
