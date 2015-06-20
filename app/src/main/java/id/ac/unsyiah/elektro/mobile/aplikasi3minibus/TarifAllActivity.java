package id.ac.unsyiah.elektro.mobile.aplikasi3minibus;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class TarifAllActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarif_all);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tarif_all, menu);
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
    public void onTombolSamudra(View view){
        Intent intent = new Intent(this, SamudraTarifActivity.class);
        startActivity(intent);
    }

    public void onTombolMentari(View view){
        Intent intent = new Intent(this, Tarif.class);
        startActivity(intent);
    }

    public void onTombolMandala(View view){
        Intent intent = new Intent(this, MandalaTarifActivity.class);
        startActivity(intent);
    }
    public void onTombolKmbl(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
