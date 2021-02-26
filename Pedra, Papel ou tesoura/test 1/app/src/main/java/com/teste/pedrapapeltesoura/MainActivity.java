package com.teste.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadopedra(View view) {
        this.opcaoSelecionada("pedra");
    }

    public void papel(View view) {
        this.opcaoSelecionada("papel");
    }

    public void tesoura(View view) {
        this.opcaoSelecionada("tesoura");
    }


    public void opcaoSelecionada(String opcaoSelecionada) {

        ImageView imageView = findViewById(R.id.imageView);
        TextView resultado = findViewById(R.id.textView2);

    int numero = new Random().nextInt(3);
    String[] opcoes = {"pedra", "papel", "tesoura"};
    String opcaoapp = opcoes [numero];

    switch (opcaoapp){

        case "pedra":
            imageView.setImageResource(R.drawable.pedra);
            break;
        case  "papel":
            imageView.setImageResource(R.drawable.papel);
            break;
        case "tesoura":
            imageView.setImageResource(R.drawable.tesoura);}

            if ((opcaoapp == "tesoura" && opcaoSelecionada == "papel")||
                (opcaoapp == "papel" && opcaoSelecionada == "pedra")||
                (opcaoapp == "pedra" && opcaoSelecionada == "tesoura")

            ){ resultado.setText("você perdeu");}


             else if(
            (opcaoapp == "papel" && opcaoSelecionada == "tesoura")||
            (opcaoapp == "pedra" && opcaoSelecionada == "papel")||
            (opcaoapp == "tesoura" && opcaoSelecionada == "pedra")
            ){resultado.setText("você ganhou");}

             else
                 {resultado.setText("Empate");}
    }}