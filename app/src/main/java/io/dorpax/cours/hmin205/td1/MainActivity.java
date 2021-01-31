package io.dorpax.cours.hmin205.td1;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button button;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.mainbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), R.string.msg_btn1, Toast.LENGTH_LONG).show();
            }
        });

        findViewById(R.id.button2).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.msg_btn2, Toast.LENGTH_LONG).show();
                LinearLayout layout = findViewById(R.id.layout);
                System.out.println(layout);
                TextView text = new TextView(v.getContext());
                text.setText(R.string.exo4);
                layout.addView(text);
                return true;
            }
        });

    }
}
