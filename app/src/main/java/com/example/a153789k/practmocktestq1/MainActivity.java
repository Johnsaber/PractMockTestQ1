package com.example.a153789k.practmocktestq1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button o;
    EditText etName;
    EditText etPhone;
    TextView tvRegister;
   boolean male, female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        o = (Button) findViewById(R.id.uuu);
        etName = (EditText) findViewById(R.id.txtName);
        etPhone = (EditText) findViewById(R.id.txtPhone);
        tvRegister = (TextView) findViewById(R.id.tvRegister);

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String name = etName.getText().toString();
             String phone = etPhone.getText().toString();

                male = findViewById(R.id.rdnBtn1).isSelected();
                female = findViewById(R.id.rdnBtn2).isSelected();

                tvRegister.setText(name+","+phone+","+male+","+female);




            }
        });




    }
//   public void btnClick(View v)
//   {

   }
}
