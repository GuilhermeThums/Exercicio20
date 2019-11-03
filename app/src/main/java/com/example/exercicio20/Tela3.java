package com.example.exercicio20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tela3 extends AppCompatActivity {
    Button button1;
    String nome1;
    String idade1;
    String sexo1;
    String cpf1;
    String dataDeNascimento1;
    String logradouro1;
    String numero1;
    String complemento1;
    String cidade1;
    String estado1;
    String pais1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
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


        String logradouro = args.getString("logradouro");
        String numero = args.getString("numero");
        String complemento = args.getString("complemento");
        String cidade = args.getString("cidade");
        String estado = args.getString("estado");
        String pais = args.getString("pais");

        TextView txvLogradouro = findViewById(R.id.txvLogradouro);
        txvLogradouro.setText("Logradouro: " + logradouro);
        logradouro1 = logradouro;
        TextView txvNumero = findViewById(R.id.txvNumero);
        txvNumero.setText("Número: " + numero);
        numero1 = numero;
        TextView txvComplemento = findViewById(R.id.txvComplemento);
        txvComplemento.setText("Complemento: " + complemento);
        complemento1 = complemento;
        TextView txvCidade = findViewById(R.id.txvCidade);
        txvCidade.setText("Cidade: " + cidade);
        cidade1 = cidade;
        TextView txvEstado = findViewById(R.id.txvEstado);
        txvEstado.setText("Estado: " + estado);
        estado1 = estado;
        TextView txvPais = findViewById(R.id.txvPais);
        txvPais.setText("País: " + pais);
        pais1 = pais;


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTela4();
            }
        });
    }

    public void abrirTela4(){
        TextView profissao = findViewById(R.id.profissao);
        String profissaoText = profissao.getText().toString();
        TextView cargo = findViewById(R.id.cargo);
        String cargoText = cargo.getText().toString();
        TextView salario = findViewById(R.id.salario);
        String salarioText = salario.getText().toString();
        TextView dataDeAdmissao = findViewById(R.id.dataDeAdmissao);
        String dataDeAdmissaoText = dataDeAdmissao.getText().toString();
        TextView regimeDeContrato = findViewById(R.id.regimeDeContratacao);
        String regimeDeContratoText = regimeDeContrato.getText().toString();
        TextView empresa = findViewById(R.id.empresa);
        String empresaText = empresa.getText().toString();

        Intent intent = new Intent(this, Tela4.class);

        Bundle profissaos = new Bundle();
        Bundle cargos = new Bundle();
        Bundle salarios = new Bundle();
        Bundle dataDeAdmissaos = new Bundle();
        Bundle regimeDeContratos = new Bundle();
        Bundle empresas = new Bundle();
        profissaos.putString("profissao", profissaoText);
        cargos.putString("cargo", cargoText);
        salarios.putString("salario", salarioText);
        dataDeAdmissaos.putString("data", dataDeAdmissaoText);
        regimeDeContratos.putString("regime", regimeDeContratoText);
        empresas.putString("empresa", empresaText);
        intent.putExtras(profissaos);
        intent.putExtras(cargos);
        intent.putExtras(salarios);
        intent.putExtras(dataDeAdmissaos);
        intent.putExtras(regimeDeContratos);
        intent.putExtras(empresas);

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
        logradouros.putString("logradouro", logradouro1);
        numeros.putString("numero", numero1);
        complementos.putString("complemento", complemento1);
        cidades.putString("cidade", cidade1);
        estados.putString("estado", estado1);
        paiss.putString("pais", pais1);
        intent.putExtras(logradouros);
        intent.putExtras(numeros);
        intent.putExtras(complementos);
        intent.putExtras(cidades);
        intent.putExtras(estados);
        intent.putExtras(paiss);

        startActivity(intent);
    }
}
