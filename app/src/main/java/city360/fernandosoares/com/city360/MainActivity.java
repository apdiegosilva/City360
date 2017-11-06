package city360.fernandosoares.com.city360;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView btnCidadao;
    private ImageView btnServidor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCidadao = (ImageView) findViewById(R.id.imgCidadaoId);
        btnServidor = (ImageView) findViewById(R.id.imgServidorId);

        btnCidadao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginCidadaoActivity.class));
            }
        });

        btnServidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginServidorActivity.class));
            }
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
