package id.ac.unsyiah.elektro.mobile.aplikasi3minibus;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.view.View.OnClickListener;

import java.util.ArrayList;
import java.util.List;


public class Tarif extends Activity implements OnItemSelectedListener {

    private Spinner jurusan;
    private Spinner kotaTujuan;
    private Button btnPesanSekarang;
    private TextView harga;
    String[] kotaAsl={"Pilih Kota", "Banda Aceh-Sigli", "Banda Aceh-Bireun", "Banda Aceh-Lhokseumawe", "Banda Aceh-Calang", "Banda Aceh-Meulaboh", "Banda Aceh-Lhoksukon", "Banda Aceh-Langsa", "Banda Aceh-Takengon", "Banda Aceh-Subulussalam", "Banda Aceh-Tamiang", "Banda Aceh-Kutacane", "Banda Aceh-Blang Pidie", "Banda Aceh-Simeulue"};
    // String[] kotaTjn={"Pilih Kota", "Banda Aceh", "Sigli", "Bireun", "Lhokseumawe", "Calang", "Meulaboh", "Lhoksukon", "Langsa", "Takengon", "Subulussalam", "Tamiang", "Kutacane", "Blang Pidie", "Simeulue"};
    private ArrayAdapter arrayAdapter;
    String kotaAsl1, kotaTjn1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarif);

        jurusan = (Spinner) findViewById(R.id.spinner);
        harga = (TextView) findViewById(R.id.harga);
        // cekHarga = (Button) findViewById(R.id.cekHarga);
        btnPesanSekarang = (Button)findViewById(R.id.btnPesanSekarang);
       /* List<String> list = new ArrayList<String>();
        list.add("Banda Aceh");
        list.add("Sigli");
        list.add("Bireun");
        list.add("Lhokseumawe");
        list.add("Calang");
        list.add("Meulaboh");
        list.add("Lhoksukon");
        list.add("Langsa");
        list.add("Takengon");
        list.add("Subulussalam");
        list.add("Tamiang");
        list.add("Blang Pidie");
        list.add("Kutacane");
        list.add("Simeulue"); */

        ArrayAdapter<String> tarifAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, kotaAsl);
        tarifAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        jurusan.setAdapter(tarifAdapter);
        //kotaTujuan.setAdapter(tarifAdapter);
        jurusan.setOnItemSelectedListener(this);
        // kotaTujuan.setOnItemSelectedListener(this);


        // Spinner item selection Listener
        //addListenerOnSpinnerItemSelection();
    }
   /* public void addListenerOnSpinnerItemSelection(){

        kotaAsal.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        kotaTujuan.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    } */

    public void onItemSelected (AdapterView<?> p,View v,int position,long id) {
        kotaAsl1=kotaAsl[position].toString();

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
        // harga.setText("Harga " + kotaAsl1);
    }
    public void onNothingSelected(AdapterView<?> p) {
        harga.setText("Please select city");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tarif, menu);
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
    public void onButtonKembalid(View view){


        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }

}