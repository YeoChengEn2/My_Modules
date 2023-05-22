package sg.edu.rp.c346.id22022416.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC390;
    TextView tvC203;
    TextView tvC206;
    TextView tvC218;
    TextView tvC235;
    TextView tvC346;
    TextView tvG953;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC390 = findViewById(R.id.textViewC390);
        tvC203 = findViewById(R.id.textViewC203);
        tvC206 = findViewById(R.id.textViewC206);
        tvC218 = findViewById(R.id.textViewC218);
        tvC235 = findViewById(R.id.textViewC235);
        tvC346 = findViewById(R.id.textViewC346);
        tvG953 = findViewById(R.id.textViewG953);

        tvC390.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Modules.class);
                intent.putExtra("Code", "C390");
                intent.putExtra("Name", "Portfolio Development");
                intent.putExtra("Year", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "-");
                startActivity(intent);
            }
        });

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Modules.class);
                intent.putExtra("Code", "C203");
                intent.putExtra("Name", "Web Appln Development in php");
                intent.putExtra("Year", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Modules.class);
                intent.putExtra("Code", "C206");
                intent.putExtra("Name", "Software Development Process");
                intent.putExtra("Year", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Modules.class);
                intent.putExtra("Code", "C218");
                intent.putExtra("Name", "UI/UX Design for Apps");
                intent.putExtra("Year", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Modules.class);
                intent.putExtra("Code", "C235");
                intent.putExtra("Name", "IT Security and Management");
                intent.putExtra("Year", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Modules.class);
                intent.putExtra("Code", "C346");
                intent.putExtra("Name", "Mobile App Development");
                intent.putExtra("Year", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "E63A");
                startActivity(intent);
            }
        });

        tvG953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Modules.class);
                intent.putExtra("Code", "G953");
                intent.putExtra("Name", "Life Skills III");
                intent.putExtra("Year", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "-");
                startActivity(intent);
            }
        });
    }
}