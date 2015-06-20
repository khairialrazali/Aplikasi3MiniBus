package id.ac.unsyiah.elektro.mobile.aplikasi3minibus;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class DaftarActivity extends ActionBarActivity {
    EditText username, pwd;
    Button daftar;
    Context context = this;
    LoginDataBaseAdapter loginDataBaseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        loginDataBaseAdapter = new LoginDataBaseAdapter(this);
        //loginDataBaseAdapter = loginDataBaseAdapter.open();
        username = (EditText)findViewById(R.id.editUser);
        pwd = (EditText) findViewById(R.id.editPass);
        daftar = (Button) findViewById(R.id.daftar);
        daftar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                String userName = username.getText().toString();
                String pass = pwd.getText().toString();

                if (userName.equals("") || pass.equals("")) {
                    Toast.makeText(getApplicationContext(), "Username/Password tidak boleh kosong!", Toast.LENGTH_LONG).show();
                    return;
                } else {

                    loginDataBaseAdapter.insertEntry(userName, pass);
                    Toast.makeText(getApplicationContext(), "Informasi telah disimpan", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(DaftarActivity.this, MainActivity.class);
                    startActivity(i);
                    finish();

                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();

        loginDataBaseAdapter.close();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_daftar, menu);
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
    public void onTombolBalek (View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}
