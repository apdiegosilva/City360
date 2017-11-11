package city360.fernandosoares.com.city360;

import android.content.Intent;
import android.net.Uri;
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
        btnContraCheque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.bomdespacho.mg.gov.br/wp-login.php?redirect_to=http%3A%2F%2Fwww.bomdespacho.mg.gov.br%2Fcc%2F&reauth=1"));
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
