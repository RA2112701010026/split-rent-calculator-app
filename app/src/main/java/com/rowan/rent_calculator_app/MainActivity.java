package com.rowan.rent_calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText totalRent,noOfPeople,otherExpencives,electricBill,electrictyBillPerUnit;
        Button btn;
        TextView title,result;

        noOfPeople=findViewById(R.id.noOfPeople);
        totalRent=findViewById(R.id.totalRent);
        otherExpencives=findViewById(R.id.otherExpencives);
        electricBill=findViewById(R.id.electricBill);
      electrictyBillPerUnit=findViewById(R.id.electrictyBillPerUnit);
        btn=findViewById(R.id.btn);
        result=findViewById(R.id.result);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              double p= Integer.parseInt(noOfPeople.getText().toString()) ;
               double t= Integer.parseInt(totalRent.getText().toString()) ;
                double o=Integer.parseInt(otherExpencives.getText().toString()) ;
                double e=Integer.parseInt(electricBill.getText().toString());
                double u=Integer.parseInt(electrictyBillPerUnit.getText().toString());
                double totalE=e*u;
                double split=(o+t+totalE)/p;
                result.setText(String.format("%.2f",split));

            }
        });






    }
}