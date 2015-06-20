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
import android.widget.Toast;
import id.ac.unsyiah.elektro.mobile.aplikasi3minibus.LoginDataBaseAdapter;


public class MainActivity extends ActionBarActivity {

    private EditText editUsr;
    private EditText editPass;
    private Button btnLogin;
    private TextView textView4;
    String username,pass;
   // LoginDataBaseAdapter loginDataBaseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        final LoginDataBaseAdapter loginDataBaseAdapter = new LoginDataBaseAdapter(this);
    }
     /*   editUsr = (EditText) findViewById(R.id.editUsr);
        editPass = (EditText) findViewById(R.id.editPass);
        btnLogin = (Button) findViewById(R.id.button);

        final String username = editUsr.getText().toString();
        final String password = editPass.getText().toString();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String storedPassword = loginDataBaseAdapter.getSinlgeEntry(username);
                if (v == btnLogin) {
                    if (password != null && password.equals(storedPassword)) {
                        Toast.makeText(MainActivity.this, "Login ", Toast.LENGTH_LONG).show();
                        Intent utm = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(utm);
                        finish();

                    } else {
                        Toast.makeText(MainActivity.this, "User Name/Password Salah!", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }*/


    private void initUI(){
        editUsr = (EditText)findViewById(R.id.editUsr);
        editUsr.getText();
        editPass = (EditText)findViewById(R.id.editPass);
        editPass.getText();
        btnLogin = (Button) findViewById(R.id.button);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(v == btnLogin){
                    if(editUsr.getText().toString().equals(username) && editPass.getText().toString().equals(pass)){
                        Intent intent1 = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent1);

                    }else{
                        textView4.setText("Login Gagal!");
                    }
                }
            }
        })
        ;
        textView4 = (TextView) findViewById(R.id.textView4);

        username = "admin";
        pass = "admin";
    }

    /*@Override
    protected void onDestroy() {
        super.onDestroy();
        LoginDataBaseAdapter loginDataBaseAdapter = new LoginDataBaseAdapter(this);
        loginDataBaseAdapter.close();
    } */


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void doBack (View view){
        Intent intent = new Intent (this, SecondActivity.class);
        startActivity(intent);
    }

    public void onButtonDaftar (View view){
        Intent intent = new Intent (this, DaftarActivity.class);
        startActivity(intent);
    }
}