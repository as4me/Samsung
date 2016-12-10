package asergeev.samsung.itschool.ru.myapp;

import android.app.ProgressDialog;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button buttonRegister;
    private EditText editTextEmail;
    private  EditText editTextPass;
    private TextView textViewSignin;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonRegister =(Button)findViewById(R.id.buttonregister);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPass = (EditText) findViewById(R.id.editTextPass);
        textViewSignin = (TextView)findViewById(R.id.textviewSignin);
        buttonRegister.setOnClickListener(this);
        textViewSignin.setOnClickListener(this);
        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);
    }

    private void registerUsers(){
        String email = editTextEmail.getText().toString().trim();
        String pass = editTextPass.getText().toString().trim();
    if(TextUtils.isEmpty(email)){

        Toast.makeText(this, "Please Enter Email",Toast.LENGTH_SHORT).show();
        return;
    }
    if(TextUtils.isEmpty(pass)){
        Toast.makeText(this, "Please Enter Pass",Toast.LENGTH_SHORT).show();
        return;
    }

        progressDialog.setMessage("Registering USer....");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(email,pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                         Toast.makeText(MainActivity.this, "Register Successful", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(MainActivity.this, "Cannot Register", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
    }
    @Override
    public void onClick(View v) {
        if(v == buttonRegister){
            registerUsers();
        }

        if(v == textViewSignin);


    }
}
