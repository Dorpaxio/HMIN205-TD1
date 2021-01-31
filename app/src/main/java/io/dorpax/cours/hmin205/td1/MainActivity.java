package io.dorpax.cours.hmin205.td1;

import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        TextView tv = new TextView(this);
        tv.setText("Hello, Android");

        EditText et = new EditText(this);

        layout.addView(tv);
        layout.addView(et);
        setContentView(layout);
    }
}
