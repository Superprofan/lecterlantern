package com.superprofan.lekterlantern;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    boolean turnedOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!turnedOn) {
                    imageView.setImageResource(R.drawable.trans_on);
                    ((TransitionDrawable) imageView.getDrawable()).startTransition(2000);
                    button.setText("Ааа! Выключи!!!");
                    turnedOn = true;
                }else{
                    imageView.setImageResource(R.drawable.trans_off);
                    ((TransitionDrawable) imageView.getDrawable()).startTransition(3000);
                    button.setText("Вкл");
                    turnedOn = false;
                }
            }
        });
    }
}
