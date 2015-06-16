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
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static android.support.v4.app.ActivityCompat.startActivity;


public class Jadwal extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jadwal, menu);
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

    //ini menuju ke samudra
    public void onButtonSamudra(View view){

        Intent intent = new Intent(this, SamudraTour.class);
        startActivity(intent);

    }

    //ini menuju ke mandala
    public void onButtonMandala(View view) {

        Intent intent = new Intent(this, Mandala.class);
        startActivity(intent);
    }

    //ini menuju ke mentari
    public void onButtonMentari(View view){

        Intent intent = new Intent(this, Mentari.class);
        startActivity(intent);
    }

    //Kembali ke halaman sebelumnya
    public void onButtonKembali2(View view){

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}