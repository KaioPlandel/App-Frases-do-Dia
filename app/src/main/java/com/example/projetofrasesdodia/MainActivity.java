package com.example.projetofrasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button buttonGerar;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGerar = findViewById(R.id.buttonGerarFrase);
        textResult = findViewById(R.id.textResult);
        String[] frases = {"As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente.",
        "Motivação é a arte de fazer as pessoas fazerem o que você quer que elas façam porque elas o querem fazer.",
        "Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.",
        "No meio da dificuldade encontra-se a oportunidade.",
        "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas, acima de tudo, seja você sempre.",
        "Eu faço da dificuldade a minha motivação. A volta por cima vem na continuação.",
        "A verdadeira motivação vem de realização, desenvolvimento pessoal, satisfação no trabalho e reconhecimento.",
        "Pedras no caminho? Eu guardo todas. Um dia vou construir um castelo.",
        "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.",
        "O que me preocupa não é o grito dos maus. É o silêncio dos bons."};

        buttonGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numeroAleatorio = new Random().nextInt(frases.length);
                textResult.setText(frases[numeroAleatorio]);
            }
        });
    }
}