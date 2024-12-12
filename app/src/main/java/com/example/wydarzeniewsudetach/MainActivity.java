package com.example.wydarzeniewsudetach;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView licznik, komunikat;
    private EditText email, haslo, powtorz;
    private Button polub, usun, zapisz,zobacz;
    private int counter =0;
    private boolean rejestracja = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        licznik = findViewById(R.id.licznik);
        komunikat = findViewById(R.id.komunikat);
        email = findViewById(R.id.email);
        haslo = findViewById(R.id.haslo);
        powtorz = findViewById(R.id.powtorz);
        polub = findViewById(R.id.polub);
        usun = findViewById(R.id.usun);
        zapisz = findViewById(R.id.zapisz);
        zobacz = findViewById(R.id.zobacz);
        komunikat.setText("Obszar komunikatów");
        polub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update(counter++);
            }
        });
        usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(counter>0){
                    update(counter);
                }
            }
        });
        zapisz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rejestracja = false;
                if(!(email.getText().toString().trim()).contains("@")){
                   komunikat.setText("Nieprawidlowy adres e-mail");
                } else if (!(haslo.getText().toString().trim()).equals(powtorz.getText().toString().trim())){
                    komunikat.setText("Hasła się różną");
                }else{
                    komunikat.setText("Zarejestrowano "+ email.getText().toString().trim());
                    rejestracja = true;
                }
            }
        });
        zobacz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rejestracja){
                    komunikat.setText(email.getText().toString().trim());
                }
            }
        });
    }
    public void update(int counter){
        licznik.setText(counter + " polubień");
    }
}