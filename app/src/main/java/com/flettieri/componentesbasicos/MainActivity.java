package com.flettieri.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkVerde;
    private CheckBox checkBranco;
    private CheckBox checkVermelho;

    private RadioButton sexoMasculino;
    private RadioButton sexoFeminino;
    private RadioGroup opcaoSexo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editName);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textView);

        checkVerde = findViewById(R.id.checkVerde);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);

        sexoFeminino = findViewById(R.id.radioButtonFeminino);
        sexoMasculino = findViewById(R.id.radioButtonMasculino);
        opcaoSexo = findViewById(R.id.radioGroupSexo);

        radioButton();

    }

    public void checkbox() {
        String texto = "";
        if (checkVerde.isChecked()) {
            texto = checkVerde.getText().toString();
        }

        if (checkBranco.isChecked()) {
            texto = checkBranco.getText().toString();
        }

        if (checkVermelho.isChecked()) {
            texto = checkVermelho.getText().toString();
        }

        textoResultado.setText(texto);


    }

    public void radioButton() {
        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButtonMasculino) {
                    textoResultado.setText("Masculino Selecionado");
                } else {
                    textoResultado.setText("Feminino Selecionado");
                }
            }
        });
    }

    public void enviar(View view) {
        radioButton();
//        checkbox();

        /*
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        textoResultado.setText("Nome: " + nome + "\nE-mail: " + email);
         */
    }

    public void limpar(View view) {
        campoNome.setText("");
        campoEmail.setText("");
    }
}