package com.example.bijay.myapp_vibgyor;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_v;
    private Button btn_i;
    private Button btn_b;
    private Button btn_g;
    private Button btn_y;
    private Button btn_o;
    private Button btn_r;
    private CharSequence text = "";
    private int duration = Toast.LENGTH_SHORT;

    Context context;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();

        btn_v = (Button) findViewById(R.id.button_v);
        btn_i = (Button) findViewById(R.id.button_i);
        btn_b = (Button) findViewById(R.id.button_b);
        btn_g = (Button) findViewById(R.id.button_g);
        btn_y = (Button) findViewById(R.id.button_y);
        btn_o = (Button) findViewById(R.id.button_o);
        btn_r = (Button) findViewById(R.id.button_r);

        btn_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               text="Button Pressed for Color: Violate";
               toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        btn_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text="Button Pressed for Color: Indigo";
                toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text="Button Pressed for Color: Blue";
                toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        btn_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text="Button Pressed for Color: Green";
                toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        btn_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text="Button Pressed for Color: Yellow";
                toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        btn_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text="Button Pressed for Color: Orange";
                toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        btn_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text="Button Pressed for Color: red";
                toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

    }
}