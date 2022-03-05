package com.example.membuatevenandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edEmail, edPassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada Layout
        btnLogin = findViewById(R.id.btSignIn);

        //Menghubungkan variabel edEmail dengan componen button pada Layout
        edEmail = findViewById(R.id.edEmail);

        //Menghubungkan variabel edPassword dengan componen button pada Layout
        edPassword = findViewById(R.id.edPassword);

        //Membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(view -> {
            //Menyimpan input user di edittext email ke dalam variabel nama
            nama = edEmail.getText().toString();

            //Menyimpan input user di edittext password kedalam variabel password
            password = edPassword.getText().toString();

            if (nama.equals("") || password.equals("")){
                Toast.makeText( MainActivity.this, "User atau Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
            }
            else
            {
                if (nama.equals("Devina") && password.equals("Shifra")){
                    Toast.makeText(MainActivity.this,"Sukses", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "User atau password salah !", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}