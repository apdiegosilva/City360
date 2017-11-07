package city360.fernandosoares.com.city360;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PrincipalCidadaoActivity extends AppCompatActivity {


    private Button imgRelatar;
    private Button imgSolucoes;
    private Button imgRelatosPendentes;
    private Button imgInformacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_cidadao);

        imgRelatar = (Button) findViewById(R.id.imgSolicitarId);
        imgSolucoes = (Button) findViewById(R.id.imgAnalisadosId);
        imgRelatosPendentes = (Button) findViewById(R.id.imgPendentesId);
        imgInformacoes = (Button) findViewById(R.id.imgInformacoesId);

        imgRelatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrincipalCidadaoActivity.this, RelatarActivity.class));
            }
        });
        imgRelatosPendentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrincipalCidadaoActivity.this, RelatosPendentesActivity.class));
            }
        });

        imgSolucoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(PrincipalCidadaoActivity.this, SolucoesActivity.class)));
            }
        });

        imgInformacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(PrincipalCidadaoActivity.this, InformacoesActivity.class)));
            }
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
