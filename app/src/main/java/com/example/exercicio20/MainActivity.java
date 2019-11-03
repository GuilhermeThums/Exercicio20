package com.example.exercicio20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.btnSeguinte);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTela2();
            }
        });
    }


    public void abrirTela2(){
        TextView nome = findViewById(R.id.nome);
        String nomeText = nome.getText().toString();
        TextView idade = findViewById(R.id.idade);
        String idadeText = idade.getText().toString();
        TextView sexo = findViewById(R.id.sexo);
        String sexoText = sexo.getText().toString();
        TextView cpf = findViewById(R.id.cpf);
        String cpfText = cpf.getText().toString();
        TextView dataDeNascimento = findViewById(R.id.dataDeNascimento);
        String dataDeNascimentoText = dataDeNascimento.getText().toString();


        Intent intent = new Intent(this, Tela2.class);
//        Bundle nomes = new Bundle();
//        Bundle idades = new Bundle();
//        Bundle sexos = new Bundle();
//        Bundle cpfs = new Bundle();
//        Bundle dataDeNascimentos = new Bundle();
//        nomes.putString("nome", nomeText);
//        idades.putString("idade", idadeText);
//        sexos.putString("sexo", sexoText);
//        cpfs.putString("cpf", cpfText);
//        dataDeNascimentos.putString("dataDeNascimento", dataDeNascimentoText);
//        intent.putExtras(nomes);
//        intent.putExtras(idades);
//        intent.putExtras(sexos);
//        intent.putExtras(cpfs);
//        intent.putExtras(dataDeNascimentos);

        Bundle passagem = new Bundle();
        passagem.putString("nome", nomeText);
        passagem.putString("idade", idadeText);
        passagem.putString("sexo", sexoText);
        passagem.putString("cpf", cpfText);
        passagem.putString("dataDeNascimento", dataDeNascimentoText);
        intent.putExtras(passagem);
        startActivity(intent);
    }
}
