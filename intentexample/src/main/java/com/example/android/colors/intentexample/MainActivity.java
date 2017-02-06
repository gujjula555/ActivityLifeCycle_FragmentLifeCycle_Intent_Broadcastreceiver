package com.example.android.colors.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button bn=(Button)findViewById(R.id.intent);
bn.setOnClickListener(this);
        Button bn1=(Button)findViewById(R.id.implicitIntent);
        bn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.intent){
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            //startActivity(intent);
            startActivityForResult(intent,2);


        }
        if(v.getId()==R.id.implicitIntent){
           /* Intent i = new Intent(android.content.Intent.ACTION_VIEW,
                    Uri.parse("http://www.fb.com"));
            startActivity(i);*/
            Intent read1=new Intent();
            read1.setAction(android.content.Intent.ACTION_VIEW);
            read1.setData(ContactsContract.Contacts.CONTENT_URI);
            startActivity(read1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==2)
        {
            String message=data.getStringExtra("MESSAGE");
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
    }
}
