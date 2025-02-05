package com.regadeveloper.celciusconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Converter extends AppCompatActivity {
    Button btn_konversi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        EditText celcius = findViewById(R.id.edtxt_celcius);
        EditText kelvin = findViewById(R.id.edtxt_kelvin);
        EditText farenheit = findViewById(R.id.edtxt_farenheit);
        EditText reamur = findViewById(R.id.edtxt_reamur);
        btn_konversi = findViewById(R.id.btn_konvert);
    }
    public void konversiSuhu (View view){
        try {
            int ncelcius = Integer.parseInt(celcius.getText().toString());
            double nkelvin = ncelcius*273.15;
            double nfarenheit = ncelcius*1.8*32;
            double nreamur = ncelcius*6.8;
            kelvin.setText(String.valueOf(nkelvin));
            farenheit.setText(String.valueOf(nfarenheit));
            reamur.setText(String.valueOf(nreamur));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void keluar (View view){

        finish();
    }

}
