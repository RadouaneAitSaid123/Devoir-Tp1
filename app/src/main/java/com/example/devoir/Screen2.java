package com.example.devoir;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        TextView nom = findViewById(R.id.text1);
        TextView num = findViewById(R.id.text2);
        TextView adr = findViewById(R.id.text3);
        TextView mail = findViewById(R.id.text4);
        TextView ville = findViewById(R.id.text5);
        TextView genre = findViewById(R.id.genre);


        String txtNom = getIntent().getStringExtra("nom");
        String txtNum = getIntent().getStringExtra("num");
        String txtAdr = getIntent().getStringExtra("adr");
        String txtMail = getIntent().getStringExtra("mail");
        String txtVille = getIntent().getStringExtra("ville");
        String txtGenre = getIntent().getStringExtra("genre");



        nom.setText(txtNom);
        num.setText(txtNum);
        adr.setText(txtAdr);
        mail.setText(txtMail);
        ville.setText(txtVille);
        genre.setText(txtGenre);




    }
}
