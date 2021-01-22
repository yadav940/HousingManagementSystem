package com.example.mapdemo.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mapdemo.MapDemoActivity;
import com.example.mapdemo.R;

public class LoginActivity extends AppCompatActivity {
    private Button btn_login;
    private EditText reg_name_et,reg_password_et;
    private TextView tv_create_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_login = findViewById(R.id.btn_login);

        reg_name_et = findViewById(R.id.reg_name_et);
        reg_password_et = findViewById(R.id.reg_password_et);

        tv_create_account = findViewById(R.id.tv_create_account);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (reg_name_et.getText().toString().trim().isEmpty()||reg_password_et.getText().toString().trim().isEmpty()){
                    Toast.makeText(LoginActivity.this,"User name/password requered",Toast.LENGTH_SHORT).show();
                }else {
                    new AlertDialog.Builder(LoginActivity.this)
                            .setTitle("Do you want?")
                            //.setMessage("Are you sure you want to delete this entry?")

                            // Specifying a listener allows you to take an action before dismissing the dialog.
                            // The dialog is automatically dismissed when a dialog button is clicked.
                            .setPositiveButton("Rent", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    // Continue with delete operation
                                    startActivity(new Intent(LoginActivity.this, MapDemoActivity.class));
                                    finish();
                                }
                            })

                            // A null listener allows the button to dismiss the dialog and take no further action.
                            .setNegativeButton("Buy", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    // Continue with delete operation
                                    startActivity(new Intent(LoginActivity.this, MapDemoActivity.class));
                                    finish();
                                }
                            })
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();

                }

            }
        });

        tv_create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));

            }
        });
    }
}