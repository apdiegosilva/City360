package city360.fernandosoares.com.city360;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class EsqueciSenhaActivity extends AppCompatActivity {

    private Button btnEnviar;
    private RadioButton rbtCidadao;
    private RadioButton rbtServidor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueci_senha);
        btnEnviar = (Button) findViewById(R.id.btnEnviarId);
        rbtCidadao = (RadioButton) findViewById(R.id.rbtCidadaoId);
        rbtServidor = (RadioButton) findViewById(R.id.rbtServidorId);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rbtCidadao.isChecked()) {
                    Toast.makeText(EsqueciSenhaActivity.this, "E-mail de redefinição de senha enviado com Sucesso!",
                            Toast.LENGTH_LONG).show();
                    startActivity(new Intent(EsqueciSenhaActivity.this, LoginCidadaoActivity.class));
                }

                if (rbtServidor.isChecked()){
                    Toast.makeText(EsqueciSenhaActivity.this, "E-mail de redefinição de senha enviado com Sucesso!",
                            Toast.LENGTH_LONG).show();
                    startActivity(new Intent(EsqueciSenhaActivity.this, LoginServidorActivity.class));
                }


            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
