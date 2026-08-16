package io.mastercoding.journalapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    //Widgets
    Button loginBtn, createAccountBtn;
    private EditText emailET, passET;
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    private FirebaseUser currentUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createAccountBtn = findViewById(R.id.create_account);

        createAccountBtn.setOnClickListener( view-> {
            Intent i = new Intent(MainActivity.this,SignUpActivity.class);
            startActivity(i);
        });

        //Login
        loginBtn = findViewById(R.id.email_signin);
        emailET = findViewById(R.id.email);
        passET = findViewById(R.id.password);

        //Firebase Authentication
        firebaseAuth = FirebaseAuth.getInstance();

        loginBtn.setOnClickListener(v -> {
            logEmailPassUser(emailET.getText().toString().trim(),
                    passET.getText().toString().trim());
        });

    }


    private void logEmailPassUser(String email,String pwd){
        //Checking for empty Texts
        if(!TextUtils.isEmpty(email) && !TextUtils.isEmpty(pwd)) {
            firebaseAuth.signInWithEmailAndPassword(email, pwd).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    FirebaseUser user = firebaseAuth.getCurrentUser();

                    Intent i = new Intent(MainActivity.this, JournalListActivity.class);
                    startActivity(i);
                }
            });
        }
    }
}