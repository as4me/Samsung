package napster.itschool.samsung.ru.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import napster.itschool.samsung.ru.Main2Activity;

public class MainActivity extends AppCompatActivity {
    Button buttonLog;
    EditText editText2, editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText = (EditText) findViewById(R.id.editText);

        buttonLog = (Button) findViewById(R.id.buttonLog);
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText2.getText().toString().equals("admin") &&
                        editText.getText().toString().equals("password")) {
                    Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG);
                    Intent intent = new Intent(MainActivity.this,
                            Main2Activity.class);
                    startActivity(intent);
                }
            }
        });
    }
}

