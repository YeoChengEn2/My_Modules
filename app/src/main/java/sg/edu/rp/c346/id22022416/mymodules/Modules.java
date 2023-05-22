package sg.edu.rp.c346.id22022416.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Modules extends AppCompatActivity {

    TextView tvModInfo1;
    TextView tvModInfo2;
    TextView tvModInfo3;
    TextView tvModInfo4;
    TextView tvModInfo5;
    TextView tvModInfo6;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1);

        btnBack = findViewById(R.id.buttonBack);
        tvModInfo1 = findViewById(R.id.textView1);
        tvModInfo2 = findViewById(R.id.textView2);
        tvModInfo3 = findViewById(R.id.textView3);
        tvModInfo4 = findViewById(R.id.textView4);
        tvModInfo5 = findViewById(R.id.textView5);
        tvModInfo6 = findViewById(R.id.textView6);
        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("Code");
        String name = intentReceived.getStringExtra("Name");
        String year = intentReceived.getStringExtra("Year");
        String sem = intentReceived.getStringExtra("Semester");
        String credit = intentReceived.getStringExtra("Credit");
        String venue = intentReceived.getStringExtra("Venue");
        tvModInfo1.setText("Module Code: " + code);
        tvModInfo2.setText("Module Name: " + name);
        tvModInfo3.setText("Academic Year: " + year);
        tvModInfo4.setText("Semester: " + sem);
        tvModInfo5.setText("Module Credit: " + credit);
        tvModInfo6.setText("Venue: " + venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Modules.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}