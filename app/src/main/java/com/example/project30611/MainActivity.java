package com.example.project30611;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text1, text2;
    Switch chkAgree;
    RadioGroup rGroup1;
    RadioButton oreo, pie, q10;
    Button exit,reset;
    ImageView imgPet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        text1 = findViewById(R.id.Text1);
        chkAgree = findViewById(R.id.ChkAgree);
        text2 = findViewById(R.id.Text2);
        rGroup1 = findViewById(R.id.Rgroup1);
        oreo = findViewById(R.id.oreo);
        pie = findViewById(R.id.pie);
        q10 = findViewById(R.id.q10);
        exit = findViewById(R.id.exit);
        reset = findViewById(R.id.reset);
        imgPet = findViewById(R.id.ImgPet);
        oreo.setOnClickListener(this);
        pie.setOnClickListener(this);
        q10.setOnClickListener(this);
        exit.setOnClickListener(this);
        reset.setOnClickListener(this);
        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chkAgree.isChecked()==true){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    exit.setVisibility(View.VISIBLE);
                    reset.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }
                else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    exit.setVisibility(View.INVISIBLE);
                    reset.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }

        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.oreo:
                imgPet.setImageResource(R.drawable.oreo);
                break;
            case R.id.pie:
                imgPet.setImageResource(R.drawable.pie);
                break;
            case R.id.q10:
                imgPet.setImageResource(R.drawable.q10);
                break;
            case R.id.exit:
                finish();
                break;
            case R.id.reset:
                chkAgree.setChecked(false);
                rGroup1.clearCheck();
                imgPet.setImageResource(0);
                break;
        }
    }
}