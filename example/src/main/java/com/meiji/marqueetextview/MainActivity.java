package com.meiji.marqueetextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.meiji.library.MarqueeTextView;

public class MainActivity extends AppCompatActivity {

    private MarqueeTextView tv;
    private MarqueeTextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        tv.setText(new String[]{"11111111111", "2222", "3333333"})
                .setStep(4)
                .setOrientation(MarqueeTextView.TOLEFT)
                .create()
                .startScroll();

        tv2.setText(new String[]{"1111", "2222222222222222", "3333"})
                .setStep(5)
                .setOrientation(MarqueeTextView.TORIGHT)
                .setOnClickable(true)
                .create()
                .startScroll();
    }

    private void initView() {
        tv = findViewById(R.id.tv);
        tv2 = findViewById(R.id.tv2);
    }
}
