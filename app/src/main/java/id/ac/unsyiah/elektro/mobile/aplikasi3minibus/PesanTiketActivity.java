package id.ac.unsyiah.elektro.mobile.aplikasi3minibus;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class PesanTiketActivity extends ActionBarActivity {
    private TextView jurusan1;
    private TextView harga1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_tiket);

        Bundle b = getIntent().getExtras();
       // TextView jurusan = (TextView) findViewById(R.id.jurusan1);
       // TextView harga = (TextView)findViewById(R.id.harga1);
       // jurusan.setText(b.getCharSequence("jurusan"));
        //CharSequence jurusan1 = jurusan.getText();


        /*if(jurusan1=="Banda Aceh-Sigli"){

            harga.setText("40.000");
        }else{harga.setText("0");}*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pesan_tiket, menu);
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
}
