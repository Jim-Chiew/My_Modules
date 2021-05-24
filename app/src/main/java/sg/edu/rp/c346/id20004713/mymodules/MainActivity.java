package sg.edu.rp.c346.id20004713.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvWeb;
    TextView tvOS;
    TextView tvNetwork;
    TextView tvForensic;
    TextView tvMobile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWeb = findViewById(R.id.tvWeb);
        tvOS = findViewById(R.id.tvOS);
        tvNetwork = findViewById(R.id.tvForensic);
        tvForensic = findViewById(R.id.tvForensic);
        tvMobile = findViewById(R.id.tvMobile);

        tvWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C203");
                intent.putExtra("name", "Web Appln Development in php");
                intent.putExtra("year", 2021);
                intent.putExtra("sam", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W67L");
                startActivity(intent);
            }
        });

        tvOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C228");
                intent.putExtra("name", "Operating Systems Security");
                intent.putExtra("year", 2021);
                intent.putExtra("sam", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "E62L");
                startActivity(intent);
            }
        });

        tvNetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C328");
                intent.putExtra("name", "Intelligent Networks");
                intent.putExtra("year", 2021);
                intent.putExtra("sam", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "E62C");
                startActivity(intent);
            }
        });

        tvForensic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C331");
                intent.putExtra("name", "Digital Security and Forensics");
                intent.putExtra("year", 2021);
                intent.putExtra("sam", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "E61J");
                startActivity(intent);
            }
        });

        tvMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Mobile App Development");
                intent.putExtra("year", 2021);
                intent.putExtra("sam", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "E62E");
                startActivity(intent);
            }
        });
    }
}