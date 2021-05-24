package sg.edu.rp.c346.id20004713.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyOwnAddOn extends AppCompatActivity {
    TextView tvOut;
    Button btnNext;
    Button btnBackToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_own_add_on);

        tvOut = findViewById(R.id.tvOwnOut);
        btnNext = findViewById(R.id.btnNextPage);
        btnBackToMain = findViewById(R.id.backToMainPage);

        show(0);

        btnNext.setOnClickListener(new View.OnClickListener() {
            int count = 0;

            @Override
            public void onClick(View v) {
                count ++;
                show(count % 5);
            }
        });

        btnBackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void show (int num){
        int year = 2021;
        int sam = 1;
        int credit = 4;
        Intent intent = getIntent();
        String[] code = intent.getStringArrayExtra("code");
        String[] name = intent.getStringArrayExtra("name");
        String[] venue = intent.getStringArrayExtra("venue");

        String out = String.format("Module Code: %s \nModule Name: %s \nmodule Year: %d \nSemester: %d" +
                "\nModule Credit: %d \nVenue: %s", code[num], name[num], year, sam, credit, venue[num]);
        tvOut.setText(out);
    }
}