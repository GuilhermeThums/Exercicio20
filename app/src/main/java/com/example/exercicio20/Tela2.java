package com.example.exercicio20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {
    Button button1;
    String nome1;
    String idade1;
    String sexo1;
    String cpf1;
    String dataDeNascimento1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        button1 = findViewById(R.id.btnSeguinte);

        Bundle args = getIntent().getExtras();
        String nome = args.getString("nome");
        String idade = args.getString("idade");
        String sexo = args.getString("sexo");
        String cpf = args.getString("cpf");
        String dataDeNascimento = args.getString("dataDeNascimento");

        TextView txvNome = findViewById(R.id.txvNome);
        txvNome.setText("Nome: " + nome);
        nome1 = nome;
        TextView txvIdade = findViewById(R.id.txvIdade);
        txvIdade.setText("Idade: " + idade);
        idade1 = idade;
        TextView txvSexo = findViewById(R.id.txvSexo);
        txvSexo.setText("Sexo: " + sexo);
        sexo1 = sexo;
        TextView txvCpf = findViewById(R.id.txvCpf);
        txvCpf.setText("Cpf: " + cpf);
        cpf1 = cpf;
        TextView txvDataDeNascimento = findViewById(R.id.txvDataDeNascimento);
        txvDataDeNascimento.setText("Data de nascimento: " + dataDeNascimento);
        dataDeNascimento1 = dataDeNascimento;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTela3();
            }
        });
    }



    public void abrirTela3(){
        TextView logradouro = findViewById(R.id.logradouro);
        String logradouroText = logradouro.getText().toString();
        TextView numero = findViewById(R.id.numero);
        String numeroText = numero.getText().toString();
        TextView complemento = findViewById(R.id.complemento);
        String complementoText = complemento.getText().toString();
        TextView cidade = findViewById(R.id.cidade);
        String cidadeText = cidade.getText().toString();
        TextView estado = findViewById(R.id.estado);
        String estadoText = estado.getText().toString();
        TextView pais = findViewById(R.id.pais);
        String paisText = pais.getText().toString();


        Intent intent = new Intent(this, Tela3.class);

        Bundle nomes1 = new Bundle();
        nomes1.putString("nome", nome1);
        Bundle idades1 = new Bundle();
        idades1.putString("idade", idade1);
        Bundle sexos1 = new Bundle();
        sexos1.putString("sexo", sexo1);
        Bundle cpfs1 = new Bundle();
        cpfs1.putString("cpf", cpf1);
        Bundle dataDeNascimentos1 = new Bundle();
        dataDeNascimentos1.putString("dataDeNascimento", dataDeNascimento1);
        intent.putExtras(nomes1);
        intent.putExtras(idades1);
        intent.putExtras(sexos1);
        intent.putExtras(cpfs1);
        intent.putExtras(dataDeNascimentos1);

        Bundle logradouros = new Bundle();
        Bundle numeros = new Bundle();
        Bundle complementos = new Bundle();
        Bundle cidades = new Bundle();
        Bundle estados = new Bundle();
        Bundle paiss = new Bundle();
        logradouros.putString("logradouro", logradouroText);
        numeros.putString("numero", numeroText);
        complementos.putString("complemento", complementoText);
        cidades.putString("cidade", cidadeText);
        estados.putString("estado", estadoText);
        paiss.putString("pais", paisText);
        intent.putExtras(logradouros);
        intent.putExtras(numeros);
        intent.putExtras(complementos);
        intent.putExtras(cidades);
        intent.putExtras(estados);
        intent.putExtras(paiss);


        startActivity(intent);
    }
}