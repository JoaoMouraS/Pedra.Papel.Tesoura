package com.teste.test2;

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


    public void papel(View view) {
        this.opcaoSelecionada("Papel");
    }

    public void pedra(View view) {
        this.opcaoSelecionada("Pedra");
    }

    public void tesoura(View view) {
        this.opcaoSelecionada("Tesoura");
    }


    public void opcaoSelecionada(String opcaoSelecionada) {

        ImageView imageView = findViewById(R.id.resultadoImagem);
        TextView textView = findViewById(R.id.resultado);
        int numero = new Random().nextInt(3);
        String[] opcoesUsuario = {"Pedra", "Papel", "Tesoura"};
        String opcoesApp = opcoesUsuario[numero];

        switch (opcoesApp) {
            case "Pedra":
                imageView.setImageResource(R.drawable.pedra);
                break;

            case "Papel":
                imageView.setImageResource(R.drawable.papel);
                break;

            default:
                imageView.setImageResource(R.drawable.tesoura);}

                if ((opcoesApp == "Pedra" && opcaoSelecionada == "Tesoura")||
                        (opcoesApp == "Tesoura" && opcaoSelecionada == "Papel")||
                        (opcoesApp == "Papel" && opcaoSelecionada == "Pedra"))
                {textView.setText("Você perdeu");}

                else if ((opcoesApp == "Tesoura" && opcaoSelecionada == "Pedra")||
                        (opcoesApp == "Papel" && opcaoSelecionada == "Tesoura")||
                        (opcoesApp == "Pedra" && opcaoSelecionada == "Papel"))
                {textView.setText("Você ganhour");}

                        else
                            {textView.setText("empate");}}}