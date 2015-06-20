package id.ac.unsyiah.elektro.mobile.aplikasi3minibus;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MandalaTarifActivity extends Activity implements OnItemSelectedListener {
    private Spinner jurusan;
    private Spinner kotaTujuan;
    private Button btnPesanSekarang;
    private TextView harga;
    String[] kotaAsl={"Pilih Kota", "Banda Aceh-Sigli", "Banda Aceh-Bireun", "Banda Aceh-Lhokseumawe", "Banda Aceh-Calang", "Banda Aceh-Meulaboh", "Banda Aceh-Lhoksukon", "Banda Aceh-Langsa", "Banda Aceh-Takengon", "Banda Aceh-Subulussalam", "Banda Aceh-Tamiang", "Banda Aceh-Kutacane", "Banda Aceh-Blang Pidie", "Banda Aceh-Simeulue"};
    private ArrayAdapter arrayAdapter;
    String kotaAsl1, biaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandala_tarif);
        jurusan = (Spinner) findViewById(R.id.spinner);
        harga = (TextView) findViewById(R.id.harga);
        //btnPesanSekarang = (Button)findViewById(R.id.btnPesanSekarang);

        ArrayAdapter<String> tarifAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, kotaAsl);
        tarifAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        jurusan.setAdapter(tarifAdapter);
        jurusan.setOnItemSelectedListener(this);
    }

    public void onItemSelected (AdapterView<?> p,View v,int position,long id) {
        kotaAsl1=kotaAsl[position].toString();
        //final Bundle b = new Bundle();

        btnPesanSekarang = (Button) findViewById(R.id.btnPesanSekarang);
        btnPesanSekarang.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(btnPesanSekarang==v){
                    if(kotaAsl1=="Banda Aceh-Sigli"){
                        biaya = "40.000";
                    Toast.makeText(getApplicationContext(), "Tiket telah dipesan!" + "Tujuan: " + kotaAsl1 + " "+"Harga: " + biaya, Toast.LENGTH_LONG).show();}
                   else if(kotaAsl1=="Banda Aceh-Bireun"){
                        biaya = "50.000";
                        Toast.makeText(getApplicationContext(), "Tiket telah dipesan!" + "Tujuan: " + kotaAsl1 + " "+"Harga: " + biaya, Toast.LENGTH_LONG).show();
                    }else if(kotaAsl1=="Banda Aceh-Lhokseumawe"){
                        biaya = "55.000";
                        Toast.makeText(getApplicationContext(), "Tiket telah dipesan!" + "Tujuan: " + kotaAsl1 + " "+"Harga: " + biaya, Toast.LENGTH_LONG).show();
                    }else if(kotaAsl1=="Banda Aceh-Calang"){
                        biaya = "50.000";
                        Toast.makeText(getApplicationContext(), "Tiket telah dipesan!" + "Tujuan: " + kotaAsl1 + " "+"Harga: " + biaya, Toast.LENGTH_LONG).show();
                    }else if(kotaAsl1=="Banda Aceh-Meulaboh"){
                        biaya = "60.000";
                        Toast.makeText(getApplicationContext(), "Tiket telah dipesan!" + "Tujuan: " + kotaAsl1 + " "+"Harga: " + biaya, Toast.LENGTH_LONG).show();
                    }else if(kotaAsl1=="Banda Aceh-Lhoksukon"){
                        biaya = "65.000";
                        Toast.makeText(getApplicationContext(), "Tiket telah dipesan!" + "Tujuan: " + kotaAsl1 + " "+"Harga: " + biaya, Toast.LENGTH_LONG).show();
                    }else if(kotaAsl1=="Banda Aceh-Langsa"){
                        biaya = "100.000";
                        Toast.makeText(getApplicationContext(), "Tiket telah dipesan!" + "Tujuan: " + kotaAsl1 + " "+"Harga: " + biaya, Toast.LENGTH_LONG).show();
                    }else if(kotaAsl1=="Banda Aceh-Takengon"){
                        biaya = "100.000";
                        Toast.makeText(getApplicationContext(), "Tiket telah dipesan!" + "Tujuan: " + kotaAsl1 + " "+"Harga: " + biaya, Toast.LENGTH_LONG).show();
                    }else if(kotaAsl1=="Banda Aceh-Subulussalam"){
                        biaya = "110.000";
                        Toast.makeText(getApplicationContext(), "Tiket telah dipesan!" + "Tujuan: " + kotaAsl1 + " "+"Harga: " + biaya, Toast.LENGTH_LONG).show();
                    }else if(kotaAsl1=="Banda Aceh-Tamiang"){
                        biaya = "120.000";
                        Toast.makeText(getApplicationContext(), "Tiket telah dipesan!" + "Tujuan: " + kotaAsl1 + " "+"Harga: " + biaya, Toast.LENGTH_LONG).show();
                    }else if(kotaAsl1=="Banda Aceh-Kutacane"){
                        biaya = "120.000";
                        Toast.makeText(getApplicationContext(), "Tiket telah dipesan!" + "Tujuan: " + kotaAsl1 + " "+"Harga: " + biaya, Toast.LENGTH_LONG).show();
                    }else if(kotaAsl1=="Banda Aceh-Blang Pidie"){
                        biaya = "80.000";
                        Toast.makeText(getApplicationContext(), "Tiket telah dipesan!" + "Tujuan: " + kotaAsl1 + " "+"Harga: " + biaya, Toast.LENGTH_LONG).show();
                    }else if(kotaAsl1=="Banda Aceh-Simeulue"){
                        biaya = "140.000";
                        Toast.makeText(getApplicationContext(), "Tiket telah dipesan!" + "Tujuan: " + kotaAsl1 + " "+"Harga: " + biaya, Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(getApplicationContext(), "Pilih Kota Terlebih dahulu!", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        if(kotaAsl1=="Banda Aceh-Sigli") {
            harga.setText("40.000");
        } else if(kotaAsl1=="Banda Aceh-Bireun"){
            harga.setText("50.000");
        } else if(kotaAsl1=="Banda Aceh-Lhokseumawe"){
            harga.setText("55.000");
        } else if(kotaAsl1=="Banda Aceh-Calang"){
            harga.setText("50.000");
        } else if(kotaAsl1=="Banda Aceh-Meulaboh"){
            harga.setText("60.000");
        } else if(kotaAsl1=="Banda Aceh-Lhoksukon"){
            harga.setText("65.000");
        } else if(kotaAsl1=="Banda Aceh-Langsa"){
            harga.setText("100.000");
        } else if(kotaAsl1=="Banda Aceh-Takengon"){
            harga.setText("100.000");
        } else if(kotaAsl1=="Banda Aceh-Subulussalam"){
            harga.setText("110.000");
        } else if(kotaAsl1=="Banda Aceh-Tamiang"){
            harga.setText("120.000");
        } else if(kotaAsl1=="Banda Aceh-Kutacane"){
            harga.setText("120.000");
        } else if(kotaAsl1=="Banda Aceh-Blang Pidie"){
            harga.setText("80.000");
        } else if(kotaAsl1=="Banda Aceh-Simeulue"){
            harga.setText("140.000");
        }else{harga.setText("Pilih Kota!");}

    }
    public void onNothingSelected(AdapterView<?> p) {
        harga.setText("Pilih Kota!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mandala_tarif, menu);
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
    public void onTombolKembaliMnd(View view){


        Intent intent = new Intent(this, TarifAllActivity.class);
        startActivity(intent);

    }
}
