package facci.juliointriago.practica5a;

import android.app.Dialog;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opcion_login:

                Dialog dialogo = new Dialog(MainActivity.this);
                dialogo.setContentView(R.layout.activity_dialogo_login);

                final EditText txt_usu = (EditText)dialogo.findViewById(R.id.txt_usu);
                final EditText txt_pw = (EditText)dialogo.findViewById(R.id.txt_pw);
                Button btn_aut = (Button)dialogo.findViewById(R.id.btn_aut);

                btn_aut.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),txt_usu.getText().toString() + " " + txt_pw.getText().toString(),Toast.LENGTH_LONG).show();
                    }
                });

                dialogo.show();
                break;
            case R.id.opcion_registrar:
                Dialog dialogo_1 = new Dialog(MainActivity.this);
                dialogo_1.setContentView(R.layout.activity_registro);
                final EditText txt_id =(EditText)dialogo_1.findViewById(R.id.id_reg);
                final EditText txt_nom = (EditText)dialogo_1.findViewById(R.id.nom_reg);
                final EditText tlf_reg = (EditText)dialogo_1.findViewById(R.id.tlf_reg);
                Button btn_reg = (Button)dialogo_1.findViewById(R.id.btn_reg);

                btn_reg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), txt_nom.getText().toString() + " se registrado", Toast.LENGTH_LONG).show();
                    }
                });
                dialogo_1.show();

                break;
        }
        return true;
    }
}

