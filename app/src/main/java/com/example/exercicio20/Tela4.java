package com.example.exercicio20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Tela4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        Bundle args = getIntent().getExtras();
        String nome = args.getString("nome");
        String idade = args.getString("idade");
        String sexo = args.getString("sexo");
        String cpf = args.getString("cpf");
        String dataDeNascimento = args.getString("dataDeNascimento");

        TextView txvNome = findViewById(R.id.txvNome);
        txvNome.setText("Nome: " + nome);
        TextView txvIdade = findViewById(R.id.txvIdade);
        txvIdade.setText("Idade: " + idade);
        TextView txvSexo = findViewById(R.id.txvSexo);
        txvSexo.setText("Sexo: " + sexo);
        TextView txvCpf = findViewById(R.id.txvCpf);
        txvCpf.setText("Cpf: " + cpf);
        TextView txvDataDeNascimento = findViewById(R.id.txvDataDeNascimento);
        txvDataDeNascimento.setText("Data de nascimento: " + dataDeNascimento);

        String logradouro = args.getString("logradouro");
        String numero = args.getString("numero");
        String complemento = args.getString("complemento");
        String cidade = args.getString("cidade");
        String estado = args.getString("estado");
        String pais = args.getString("pais");

        TextView txvLogradouro = findViewById(R.id.txvLogradouro);
        txvLogradouro.setText("Logradouro: " + logradouro);
        TextView txvNumero = findViewById(R.id.txvNumero);
        txvNumero.setText("Número: " + numero);
        TextView txvComplemento = findViewById(R.id.txvComplemento);
        txvComplemento.setText("Complemento: " + complemento);
        TextView txvCidade = findViewById(R.id.txvCidade);
        txvCidade.setText("Cidade: " + cidade);
        TextView txvEstado = findViewById(R.id.txvEstado);
        txvEstado.setText("Estado: " + estado);
        TextView txvPais = findViewById(R.id.txvPais);
        txvPais.setText("País: " + pais);

        String profissao = args.getString("profissao");
        String cargo = args.getString("cargo");
        String salario = args.getString("salario");
        String dataDeAdmissao = args.getString("data");
        String regimeDeContrato = args.getString("regime");
        String empresa = args.getString("empresa");

        TextView txvProfissao = findViewById(R.id.txvProfissao);
        TextView txvCargo = findViewById(R.id.txvCargo);
        TextView txvSalario = findViewById(R.id.txvSalario);
        TextView txvDataDeAdmissao = findViewById(R.id.txvDataDeAdmissao);
        TextView txvRegime = findViewById(R.id.txvRegime);
        TextView txvEmpresa = findViewById(R.id.txvEmpresa);

        txvProfissao.setText("Profissão: " + profissao);
        txvCargo.setText("Cargo: " + cargo);
        txvSalario.setText("Salário: " + salario);
        txvDataDeAdmissao.setText("Data de admissão: " + dataDeAdmissao);
        txvRegime.setText("Regime de Contrato: " + regimeDeContrato);
        txvEmpresa.setText("Empresa: " + empresa);

    }
}
