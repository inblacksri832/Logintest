package sdu.cs.nattapong.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    //Explicit
    String getnameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //ผูกตัวแปร Java กับ Xml
        TextView nameTextView = findViewById(R.id.tvnamelogin);
        //รับค่าตัวแปร name จากการ Intent
        getnameString = getIntent().getStringExtra("Name");
        nameTextView.setText("Welcome " + getnameString + " เข้าสู่ระบบ" );
    }//end onCreate
}//end class
