package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.googlecode.aviator.AviatorEvaluator;

public class MainActivity extends AppCompatActivity {
    TextView input, result;
    Button ce, c, tui, chu, qi, ba, jiu, cheng, si, wu, liu, jian, yi, er, san, jia, chuyv, ling, dian, dengyu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);
        result = findViewById(R.id.result);
        ling = findViewById(R.id.ling);
        yi = findViewById(R.id.yi);
        er = findViewById(R.id.er);
        san = findViewById(R.id.san);
        si = findViewById(R.id.si);
        wu = findViewById(R.id.wu);
        liu = findViewById(R.id.liu);
        qi = findViewById(R.id.qi);
        ba = findViewById(R.id.ba);
        jiu = findViewById(R.id.jiu);
        dian = findViewById(R.id.dian);
        chuyv = findViewById(R.id.chuyv);
        chu = findViewById(R.id.chu);
        jia = findViewById(R.id.jia);
        jian = findViewById(R.id.jian);
        cheng = findViewById(R.id.cheng);
        tui = findViewById(R.id.tui);
        ce = findViewById(R.id.ce);
        c = findViewById(R.id.c);
        dengyu = findViewById(R.id.dengyv);
        dengyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String expr = input.getText().toString(); // "5-2"
                Object r = AviatorEvaluator.execute(expr);
                result.setText(String.valueOf(r));

            }
        });
        ling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("0");
            }
        });
        yi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("1");
            }
        });
        er.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("2");
            }
        });
        san.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("3");
            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("4");
            }
        });
        wu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("5");
            }
        });
        liu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("6");
            }
        });
        qi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("7");
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("8");
            }
        });
        jiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("9");
            }
        });
        dian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(".");
            }
        });
        chuyv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("%");
            }
        });
        chu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("/");
            }
        });
        jia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("+");
            }
        });
        jian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("-");
            }
        });
        cheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("*");
            }
        });
        tui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence text = input.getText();
                input.setText(text.subSequence(0, text.length() - 1));
            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
            }
        });
    }
}