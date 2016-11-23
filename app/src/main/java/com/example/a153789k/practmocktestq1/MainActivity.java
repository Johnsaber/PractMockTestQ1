package com.example.a153789k.practmocktestq1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button o;
    EditText etName;
    EditText etPhone;
    TextView tvRegister;
    RadioGroup g;
   boolean male, female;
    String dis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        o = (Button) findViewById(R.id.uuu);
        etName = (EditText) findViewById(R.id.txtName);
        etPhone = (EditText) findViewById(R.id.txtPhone);
        tvRegister = (TextView) findViewById(R.id.tvRegister);
        g = (RadioGroup) findViewById(R.id.ii);

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String name = etName.getText().toString();
             String phone = etPhone.getText().toString();

                male = ((RadioButton)findViewById(R.id.rdnBtn1)).isChecked();
                female = ((RadioButton)findViewById(R.id.rdnBtn2)).isChecked();

                int findInt = g.getCheckedRadioButtonId();
                dis = ((RadioButton)findViewById(findInt)).getText().toString();


//                dis = ((RadioButton)findViewById(g.getCheckedRadioButtonId())).getText().toString();


                tvRegister.setText(name+","+phone+","+male+","+female);






            }
        });




    }
//   public void btnClick(View v)
//   {

//   }
}
