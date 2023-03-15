package barcellos.zamborlini.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnviar = findViewById(R.id.btnEnviar); // Botão da interface principal
        btnEnviar.setOnClickListener(new View.OnClickListener() { // Colocando o evento para pegar o click no botão
            @Override
            public void onClick(View view) {
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); // Campo de texto da interface principal
                String text = etDigiteAqui.getText().toString(); // Texto escrito no campo de texto
                Intent intent = new Intent(MainActivity.this, NextActivity.class); // Intenção de abrir a nova atividade (tela)
                intent.putExtra("Texto", text); // Levando o texto para a nova atividade
                startActivity(intent); // Começando a nova atividade
            }
        });
    }
}