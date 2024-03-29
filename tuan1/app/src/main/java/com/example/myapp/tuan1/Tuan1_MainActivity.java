package com.example.myapp.tuan1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.tuan1.R;

public class Tuan1_MainActivity extends AppCompatActivity {

    EditText txt1, txt2;
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan1_main);
        txt1=findViewById(R.id.demo1_txt1);
        txt2=findViewById(R.id.demo1_txt2);
        btn=findViewById(R.id.demo1_btn);
        tv=findViewById(R.id.demo1_tv);
        btn.setOnClickListener(v -> {
            tinhtong();
        });
        
    }

    private void tinhtong() {
        String str1=txt1.getText().toString();
        float so1=Float.parseFloat(str1);
        String str2=txt2.getText().toString();
        float so2=Float.parseFloat(str2);
        float tong=so1+so2;
        tv.setText(String.valueOf(tong));
    }
}