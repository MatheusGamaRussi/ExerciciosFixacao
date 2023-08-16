package com.example.exercciosficao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CardapioActivity extends AppCompatActivity {

    //Declarando as variaveis
    public float cPreco, rPreco, sPreco, result;
    EditText cQtd, rQtd, sQtd;
    TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);

        //Preenchendo-as com seus respectivos valores
        cPreco = 2.0f;
        rPreco = 2.5f;
        sPreco = 1.5f;

        cQtd = (EditText) findViewById(R.id.edtCQuantidade);
        rQtd = (EditText) findViewById(R.id.edtRQuantidade);
        sQtd = (EditText) findViewById(R.id.edtSQuantidade);
        total = (TextView) findViewById(R.id.txtTotal);
    }

    /*Método sendo referenciado na propriedade "onClick" do botão, para apresentar o resultado retornado pelo
    método "calcularTotal" na tela*/
    public void botaoCalcular(View view){
        total.setText(getString(R.string.total) + " R$" + String.valueOf(calcularTotal()));
    }

    //Método do tipo floar que faz todo o calculo, checando se qualquer campo está vazio
    private float calcularTotal(){
        if (cQtd.getText().toString().matches("") ||
                rQtd.getText().toString().matches("") ||
                sQtd.getText().toString().matches("")) {
            Toast.makeText(this, "Por favor, preencha os dados acima", Toast.LENGTH_SHORT).show();
        } else {
            float c = Integer.parseInt(cQtd.getText().toString());
            float r = Integer.parseInt(rQtd.getText().toString());
            float s = Integer.parseInt(sQtd.getText().toString());

            result = (c * cPreco) + (r * rPreco) + (s * sPreco);
        }
        return result;
    }
}