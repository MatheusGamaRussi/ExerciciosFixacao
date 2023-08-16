package com.example.exercciosficao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HorarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario);

        // Encontrando elementos da interface pelo ID
        EditText inputTime = findViewById(R.id.edtInputTime);
        Button calculateButton = findViewById(R.id.btnCalcular2);
        TextView outputTime = findViewById(R.id.txtOutput);

        //Definindo o click para o botão
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (inputTime.getText().toString().matches("")) {
                    Toast.makeText(HorarioActivity.this, "Por favor, preencha os dados acima", Toast.LENGTH_SHORT).show();
                } else {
                    //Ira ler o horáro da entrada digitado pelo usuário
                    String inputTimeString = inputTime.getText().toString();
                    int inputTime = Integer.parseInt(inputTimeString);

                    // Agora vamos calcular os dois horários (tendo em mente o turno de 6hrs)
                    int ot = (inputTime + 6) % 24;

                    //Por fim,ira mostrar o horário da saída na tela
                    outputTime.setText(getString(R.string.horario_saida) + " " + ot + "h");
                }
            }
        });
    }
}
