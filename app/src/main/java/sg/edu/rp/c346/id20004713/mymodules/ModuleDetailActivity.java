package sg.edu.rp.c346.id20004713.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvOutput;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvOutput = findViewById(R.id.tvOutput);
        btnBack = findViewById(R.id.btnBack);

        Intent intent = getIntent();
        String code = intent.getStringExtra("code");
        String name = intent.getStringExtra("name");
        int year = intent.getIntExtra("year", 0);
        int sam = intent.getIntExtra("sam", 0);
        int credit = intent.getIntExtra("credit", 0);
        String venue = intent.getStringExtra("venue");

        //tvOutput.setText(""+sam);

        String out = String.format("Module Code: %s \nModule Name: %s \nmodule Year: %d \nSemester: %d" +
                "\nModule Credit: %d \nVenue: %s", code, name, year, sam, credit, venue);

        tvOutput.setText(out);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}