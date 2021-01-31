package io.dorpax.cours.hmin205.td1;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        EditText editText = findViewById(R.id.editTextTextPersonName2);
        Toast.makeText(this, getString(R.string.hello_word) + " " + editText.getText().toString(),
                Toast.LENGTH_LONG).show();
    }
}
