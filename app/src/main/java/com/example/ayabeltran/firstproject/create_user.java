package com.example.ayabeltran.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class create_user extends AppCompatActivity {

    dbhelper mydb;

    EditText etemail, etuname, etpword,etcpword, etfname, etlname;
    Button btnreg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);
        mydb = new dbhelper(this);


        etemail =  findViewById(R.id.etEmail);
        etuname =  findViewById(R.id.etUname);
        etpword =  findViewById(R.id.etPword);
        etcpword = findViewById(R.id.etCpword);
        etfname =  findViewById(R.id.etFname);
        etlname =  findViewById(R.id.etLname);
        btnreg2 =  findViewById(R.id.btnReg2);

        Register();
    }

    public void Register() {
        btnreg2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted =  mydb.insertData(etemail.getText().toString(),
                                etuname.getText().toString(),
                                etpword.getText().toString(),
                                etfname.getText().toString(),
                                etlname.getText().toString());
                        if (isInserted = true){
                            Toast.makeText(create_user.this, "you are now registered.", Toast.LENGTH_LONG).show();

                            etemail.setText("");
                            etuname.setText("");
                            etpword.setText("");
                            etcpword.setText("");
                            etfname.setText("");
                            etlname.setText("");

<<<<<<< HEAD
                            
=======
                            btnreg2.setOnClickListener(
                                    new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent = new Intent("android.intent.action.MAIN");
                                            startActivity(intent);
                                        }
                                    }
                            );
>>>>>>> ad344fbb954c876a699a371fdc28a09d81c2731f

                        }

                        else{
                            Toast.makeText(create_user.this, "your email or username is already in use.", Toast.LENGTH_LONG).show();
                        }

                    }
                });
    }
}
