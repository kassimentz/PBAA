package edm.kassimentz.projetointents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void abrirNavegador(View v){
        EditText textoUrl = (EditText) findViewById(R.id.textoUrl);
        Uri uri = Uri.parse(textoUrl.getText().toString());
        //intent para abrir o browser
        Intent it = new Intent(Intent.ACTION_VIEW, uri);

        startActivity(it);

    }
}
