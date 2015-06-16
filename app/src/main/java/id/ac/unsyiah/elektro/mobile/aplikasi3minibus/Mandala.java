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


public class Mandala extends ActionBarActivity {

    //ini lis jadwal nya
    private String[] mandalaArray = { "08.00 WIB",
            "10.00 WIB",
            "12.00 WIB",
            "14.00 WIB",
            "16.00 WIB",
            "18.00 WIB",
            "20.00 WIB",
            "22.00 WIB" };

    private ListView JamMandalaListView;
    private ArrayAdapter arrayAdapter;

    /** Called when the activity is first created. */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandala);

        JamMandalaListView = (ListView) findViewById(R.id.jamMandalaView);

        // this-The current activity context.
        // Second param is the resource Id for list layout row item
        // Third param is input array
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mandalaArray);
        JamMandalaListView.setAdapter(arrayAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mandala, menu);
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

    //ini buat back tok, belum yang lain
    public void onButtonBackMandala(View view){

        Intent intent = new Intent(this, Jadwal.class);
        startActivity(intent);

    }
}