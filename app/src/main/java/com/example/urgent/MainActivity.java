package com.example.urgent;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button btn = findViewById(R.id.button_to_web);
            btn.setOnClickListener(this);

            ActionBar actionBar = this.getSupportActionBar();
            if (actionBar != null) {
                actionBar.hide();
            }

        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.button_to_web) {
                Intent moveIntent = new Intent(MainActivity.this, WebActivity.class);
                startActivity(moveIntent);
            }
        }

}