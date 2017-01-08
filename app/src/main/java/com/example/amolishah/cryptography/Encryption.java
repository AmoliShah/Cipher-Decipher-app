package com.example.amolishah.cryptography;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.EditText;

public class Encryption extends Activity {

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encryption);

    }
    public void ET(View view)
    {
        EditText et = (EditText) findViewById(R.id.editText);
        String s2 = et.getText().toString();
        EditText et1 = (EditText) findViewById(R.id.editText3);
        String s4 = et1.getText().toString();
        Intent l = new Intent(this,EncryptTechniques.class);
        l.putExtra("key",s4);
        l.putExtra("text",s2);
        startActivity(l);
    }
}
