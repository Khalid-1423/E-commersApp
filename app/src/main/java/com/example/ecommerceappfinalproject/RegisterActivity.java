package com.example.ecommerceappfinalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity
{
    private EditText emailtext,passwordtext;
    private Button registerBtn;

    private FirebaseAuth mAuth; //copy

    @Override
    protected void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance(); //copy

        emailtext = findViewById(R.id.emailId);
        passwordtext = findViewById(R.id.passId);

        registerBtn = findViewById(R.id.registerUserId);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String email = emailtext.getText().toString();
                String password = passwordtext.getText().toString();

           //copy
                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful())
                                {
                                    Toast.makeText(RegisterActivity.this, "Registration Successfull!", Toast.LENGTH_SHORT).show();

                                    Intent intent = new Intent(RegisterActivity.this,LogInActivity.class);
                                    startActivity(intent);
                                }
                                else
                                {
                                    Toast.makeText(RegisterActivity.this, "Registration Failed!", Toast.LENGTH_SHORT).show();


                                }



                            }
                        }); //copy end







            }
        });
    }


}
