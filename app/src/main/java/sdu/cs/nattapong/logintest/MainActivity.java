package sdu.cs.nattapong.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Explicit
    String nameString,userString,passString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         //ผู้ตัวแปรบน java กับ xml
        final EditText nameEditText = findViewById(R.id.edtName);
        final EditText userEditText = findViewById(R.id.edtUsername);
        final EditText passEditText = findViewById(R.id.edtpassword);
        Button loginButton = findViewById(R.id.btnLogin);

        //onClick Login Button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameString = nameEditText.getText().toString().trim();
                userString = userEditText.getText().toString().trim();
                passString = passEditText.getText().toString().trim();

                //Check ค่าว่าง
                if ((nameString.length()== 0)||(userString.length()== 0)||(passString.length()== 0 )){
                    Toast.makeText(getApplicationContext(),"กรุณากรอกข้อมูลให้ครบทุกช่อง",Toast.LENGTH_SHORT).show();
                }

                //Check username&password
            }
        });//end setonClickListener
    }//end onCreate
}//end class
