package barcellos.zamborlini.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent intent = getIntent(); // Pegar a intenção da troca de atividades (telas)
        String text = intent.getStringExtra("Texto"); // Pega o texto enviado da outra tela
        TextView tvExibir = findViewById(R.id.tvExibir); // Selecionando o Text View na interface
        tvExibir.setText(text); // Colocando o texto no Text View

    }
}