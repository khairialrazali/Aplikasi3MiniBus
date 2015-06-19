package id.ac.unsyiah.elektro.mobile.aplikasi3minibus;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class DaftarTarifBus extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_tarif_bus);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_daftar_tarif_bus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //ini buat menuju menu jadwal mobil minibus
    public void onButtonDaftarTarifSamudra(View view){


        Intent intent = new Intent(this, Tarif.class);
        startActivity(intent);

    }

    //ini buat menuju menu jadwal mobil minibus
    public void onButtonDaftarTarifMandala(View view){


        Intent intent = new Intent(this, TarifMandalaTour.class);
        startActivity(intent);

    }

    //ini buat menuju menu jadwal mobil minibus
    public void onButtonDaftarTarifBack(View view){


        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }
}
