package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView show_text;
    public static int money=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= findViewById(R.id.button);
        show_text=findViewById(R.id.showtext);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int c= money +100;
                money=c;
                NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
                show_text.setText(String.valueOf(numberFormat.format(c)));
                String con= show_text.getText().toString();
                Toast.makeText(MainActivity.this, con, Toast.LENGTH_LONG).show();





                switch (c)
                {
                    case 100:
                        show_text.setBackgroundColor(getResources().getColor(R.color.colchange1));
                        break;
                    case 2000:
                        show_text.setBackgroundColor(getResources().getColor(R.color.colchange2));
                        break;
                    case 3000:
                        show_text.setBackgroundColor(getResources().getColor(R.color.colchange1));
                        break;
                }
            }
        });

    }
}
