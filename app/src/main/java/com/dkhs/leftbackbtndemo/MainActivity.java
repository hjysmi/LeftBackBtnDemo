package com.dkhs.leftbackbtndemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CustomImageButton leftButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.leftButton = ((CustomImageButton) findViewById(R.id.left_btn));
        this.leftButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View paramView) {
                MainActivity.this.onBackPressed();
            }
        });
    }


}
