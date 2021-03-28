package com.example.kalkulatorwalut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    EditText editNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNumber = findViewById((R.id.editNumber));
    }

    public void konwertuj(View view){

        if(editNumber.getText().toString().isEmpty())
        {
            Toast.makeText(this, "nic nie podales/as", Toast.LENGTH_LONG).show();
            double eur =(double) (Integer.valueOf(editNumber.getText().toString()) * 0.21);
            Toast.makeText(this, eur +" euro", Toast.LENGTH_LONG).show();
        }
        else {
            double eur = (double) (Integer.valueOf(editNumber.getText().toString()) * 0.21);
            Toast.makeText(this, eur + " euro", Toast.LENGTH_LONG).show();
        }
    }
}