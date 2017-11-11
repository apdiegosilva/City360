package city360.fernandosoares.com.city360;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalServidorActivity extends AppCompatActivity {


    private Button btnSolicitar;
    private Button btnSolicitacoes;
    private Button btnAnalisados;
    private Button btnContraCheque;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_servidor);
        btnSolicitar = (Button) findViewById(R.id.btnEnviarSolicitacaoId);
        btnSolicitacoes = (Button) findViewById(R.id.btnPendentesId);
        btnAnalisados = (Button) findViewById(R.id.btnAnalisadosId);
        btnContraCheque = (Button) findViewById(R.id.btnContraChequeId);

        btnContraCheque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnAnalisados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrincipalServidorActivity.this, SolicitacoesAnalisadasActivity.class));
            }
        });
        btnSolicitacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrincipalServidorActivity.this, MinhasSolicitacoesActivity.class));
            }
        });
        btnSolicitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrincipalServidorActivity.this, SolicitarAtendimentoActivity.class));
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
