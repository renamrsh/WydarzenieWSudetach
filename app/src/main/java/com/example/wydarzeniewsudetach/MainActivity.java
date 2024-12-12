package com.example.wydarzeniewsudetach;

import android.os.Bundle;
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

    }
}