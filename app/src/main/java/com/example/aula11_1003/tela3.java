package com.example.aula11_1003;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class tela3 extends AppCompatActivity {
    private Button btn_volt, btn_avancar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.tela3);
        ListView listView = (ListView) findViewById(R.id.Lista);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn_volt = findViewById(R.id.btn_voltar);
        btn_avancar = findViewById(R.id.btn_avan);


        Log.d("activity.main", "onCreated: Started.");

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Tarcísio Santos Filho");
        nomes.add("Anna Luiza Pelles");
        nomes.add("Vitor Campos");
        nomes.add("Adriana Pacheco");
        nomes.add("Tarcísio Santos");
        nomes.add("Tiago Felippe");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.lista_3, nomes);
        listView.setAdapter(adapter);

    }

    public void avancar (View view) throws ClassNotFoundException {
        Intent intent = new Intent(view.getContext(), tela4.class);
        view.getContext().startActivity(intent);
    }

    public void voltar (View view){
        Intent intent = new Intent(view.getContext(), tela2.class);
        view.getContext().startActivity(intent);
    }
}