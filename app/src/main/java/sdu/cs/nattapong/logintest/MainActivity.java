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
                else if (userString.equals("admin") && (passString.equals("1234"))){
                    Toast.makeText(getApplicationContext(),"Login Success", Toast.LENGTH_SHORT).show(); //คำสั่ง Toast เป็นคำสั่งที่ใช้แสดงข้อความที่แสดงออกมาครู่หนึ่งแล้วก็หายไป .makeText เป็นการสร้างข้อความ
                    Intent Me = new Intent(MainActivity.this,Menu.class); //Intent คือการเชื่อมต่อการส่งค่าระหว่าง Activity
                    Me.putExtra("Name",nameString); // ส่งข้อมูลผ่านทาง Name โดยรับค่ามาจาก nameString
                    startActivity(Me);
                } else { //ถ้าไม่ว่างให้มาทำการเช็ค Username , Password
                    Toast.makeText(getApplicationContext(),"กรอกข้อมูลไม่ถูกต้อง", Toast.LENGTH_SHORT).show(); //Toast.LENGTH_SHORT ใช่สำหรับแสดงข้อความ 1-2 วินาที
                }//Check username&password                                                                //Toast.LENGTH_LOND ใช้สำหรับแสดงข้อความ 4-5 วินาที
            }
        });//end setonClickListener
    }//end onCreate
}//end class
