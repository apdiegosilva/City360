package city360.fernandosoares.com.city360;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PrincipalServidorActivity extends AppCompatActivity {


    private ImageView imgSolicitar;
    private ImageView imgSolicitacoes;
    private ImageView imgAnalisados;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_servidor);
        imgSolicitar = (ImageView) findViewById(R.id.imgSolicitarId);
        imgSolicitacoes = (ImageView) findViewById(R.id.imgPendentesId);
        imgAnalisados = (ImageView) findViewById(R.id.imgAnalisadosId);

        imgAnalisados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrincipalServidorActivity.this, SolicitacoesAnalisadasActivity.class));
            }
        });
        imgSolicitacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrincipalServidorActivity.this, MinhasSolicitacoesActivity.class));
            }
        });
        imgSolicitar.setOnClickListener(new View.OnClickListener() {
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
