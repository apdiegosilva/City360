package city360.fernandosoares.com.city360;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PrincipalCidadaoActivity extends AppCompatActivity {


    private ImageView imgRelatar;
    private ImageView imgSolucoes;
    private ImageView imgRelatosPendentes;
    private ImageView imgInformacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_cidadao);

        imgRelatar = (ImageView) findViewById(R.id.imgSolicitarId);
        imgSolucoes = (ImageView) findViewById(R.id.imgAnalisadosId);
        imgRelatosPendentes = (ImageView) findViewById(R.id.imgPendentesId);
        imgInformacoes = (ImageView) findViewById(R.id.imgInformacoesId);

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
