package city360.fernandosoares.com.city360;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SolicitarAtendimentoActivity extends AppCompatActivity {


    private Button btnEnviarSolicitacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitar_atendimento);

        btnEnviarSolicitacao = (Button) findViewById(R.id.btnEnviarSolicitacaoId);

        btnEnviarSolicitacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SolicitarAtendimentoActivity.this, "Solicitação enviada com Sucesso!",
                        Toast.LENGTH_LONG).show();
                startActivity(new Intent(SolicitarAtendimentoActivity.this,PrincipalServidorActivity.class));

            }
        });

        final Spinner spTipoSolicitacao = (Spinner) findViewById(R.id.spinnerId);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,
                R.array.TipoSolicitacao, android.R.layout.simple_spinner_item);
        spTipoSolicitacao.setAdapter(adapter);
        String texto = spTipoSolicitacao.getSelectedItem().toString();
        int a = spTipoSolicitacao.getSelectedItemPosition();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
