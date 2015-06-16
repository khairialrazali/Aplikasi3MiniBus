package id.ac.unsyiah.elektro.mobile.aplikasi3minibus;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.support.v4.app.ActivityCompat.startActivity;


public class SecondActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
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
    public void onButtonClicked(View view){


        Intent intent = new Intent(this, Jadwal.class);
        startActivity(intent);

    }

    //ini buat menuju menu jadwal mobil minibus
    public void onButtonTarifClicked(View view){


        Intent intent = new Intent(this, Tarif.class);
        startActivity(intent);

    }

    //kembali ke halaman sebelumnya
    public void onButtonKembali(View view){


        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}