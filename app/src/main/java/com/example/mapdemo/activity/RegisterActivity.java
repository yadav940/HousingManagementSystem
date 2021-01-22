package com.example.mapdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mapdemo.R;

public class RegisterActivity extends AppCompatActivity {
    private Button reg_button_join_us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        reg_button_join_us=findViewById(R.id.reg_button_join_us);

        reg_button_join_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}