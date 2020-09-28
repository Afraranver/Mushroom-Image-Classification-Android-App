package org.codeforiraq.machinelearning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Register extends AppCompatActivity {

    EditText name, email, password;
    Button register;
    TextView logingo;
    FirebaseAuth fAuth;
    ProgressBar progressBar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = findViewById(R.id.name);
        email =findViewById(R.id.email);
        password = findViewById(R.id.password);
        logingo = findViewById(R.id.logingo);
        register = findViewById(R.id.register);
        progressBar = findViewById(R.id.progressBar);
        fAuth = FirebaseAuth.getInstance();




        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String el = email.getText().toString().trim();
                String pw = password.getText().toString().trim();

                if(TextUtils.isEmpty(el)){
                    email.setError("Email is required!");
                    return;
                }

                if(TextUtils.isEmpty(pw)){
                    password.setError(("Password is required!"));
                    return;
                }

                if(pw.length() < 4){
                    password.setError("Password you should 6 or more letters long!");
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);

                fAuth.createUserWithEmailAndPassword(el, pw).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){

                            FirebaseUser user = fAuth.getCurrentUser();
                            user.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    Toast.makeText(Register.this, "Verification Email has been Sent!", Toast.LENGTH_SHORT).show();

                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Toast.makeText(Register.this, "Verification Email Failed to Send!" + e.getMessage(), Toast.LENGTH_SHORT).show();



                                }
                            });

                            Toast.makeText(Register.this, "Welcome to TMI Mushroom APP!", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), StartActivity.class));
                            finish();
                        }
                        else{
                            Toast.makeText(Register.this, "Error!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });
            }
        });


        logingo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Login.class));
                finish();
            }
        });
    }
}