package com.example.devoir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private TextView nom;
    private TextView mail;
    private TextView num;
    private TextView adr;
    private Spinner spinner;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.nom);
        num = findViewById(R.id.phone);
        adr = findViewById(R.id.adr);
        mail = findViewById(R.id.email);
        spinner = findViewById(R.id.spinner);
        radioGroup = findViewById(R.id.genre);

        ArrayList<String> villes = new ArrayList<>(Arrays.asList("Casablanca", "Rabat", "Marrakech", "Fès", "Tanger", "Agadir",
                "Meknès", "Oujda", "Kenitra", "Tetouan", "Safi", "El Jadida", "Errachidia"));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, villes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void envoyer(View view) {
        String nomTxt = "Nom : " + nom.getText().toString();
        String numTxt = "Numéro : " + num.getText().toString();
        String adrTxt = "Adresse : " + adr.getText().toString();
        String mailTxt = "Email : " + mail.getText().toString();
        String ville = "Ville : " + spinner.getSelectedItem().toString();

        int selectedId = radioGroup.getCheckedRadioButtonId();
        String genre;

        if (selectedId != -1) {
            RadioButton selectedRadioButton = findViewById(selectedId);
            genre = "Genre : " + selectedRadioButton.getText().toString();
        } else  {
            genre = "Genre : ";
        }

        Intent intent = new Intent(this, Screen2.class);
        intent.putExtra("nom", nomTxt);
        intent.putExtra("num", numTxt);
        intent.putExtra("adr", adrTxt);
        intent.putExtra("mail", mailTxt);
        intent.putExtra("ville", ville);
        intent.putExtra("genre", genre);
        startActivity(intent);
    }
}
