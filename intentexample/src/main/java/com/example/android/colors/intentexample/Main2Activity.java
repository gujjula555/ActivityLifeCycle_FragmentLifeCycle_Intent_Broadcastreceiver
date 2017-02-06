package com.example.android.colors.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         editText=(EditText)findViewById(R.id.editText);
      // String name= editText.getText().toString();
        ((Button)findViewById(R.id.submit)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.submit){
            String message=editText.getText().toString();
            Intent intent=new Intent();
            intent.putExtra("MESSAGE",message);
            setResult(2,intent);
            finish();//finishing activity
        }
    }
}
