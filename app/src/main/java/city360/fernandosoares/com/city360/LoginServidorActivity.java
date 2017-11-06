package city360.fernandosoares.com.city360;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginServidorActivity extends AppCompatActivity {

    private Button btnAcessar;
    private TextView txtEsqueciSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_servidor);

        btnAcessar = (Button) findViewById(R.id.btnAcessoServidorId);
        txtEsqueciSenha = (TextView) findViewById(R.id.txtEsqueciSenhaId);

        txtEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginServidorActivity.this, EsqueciSenhaActivity.class));
            }
        });


        btnAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginServidorActivity.this, PrincipalServidorActivity.class));
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
