package com.example.ecommerceappfinalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogInActivity extends AppCompatActivity {

    private EditText emailtext,passwordtext;
    private Button loginButton;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        mAuth = FirebaseAuth.getInstance();

        emailtext = findViewById(R.id.emailId);
        passwordtext = findViewById(R.id.passId);

        loginButton = findViewById(R.id.loginBtn);



        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String email = emailtext.getText().toString();
                String password = passwordtext.getText().toString();

                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(LogInActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful())
                                {
                                    Toast.makeText(LogInActivity.this,"Login Successfull!",Toast.LENGTH_SHORT).show();

                                    Intent intent = new Intent(LogInActivity.this,ShowProductActivity.class);
                                    startActivity(intent);


                                }
                                else
                                {
                                    Toast.makeText(LogInActivity.this,"Login Failed!!",Toast.LENGTH_SHORT).show();
                                }



                            }
                        });



            }
        });


    }
}
