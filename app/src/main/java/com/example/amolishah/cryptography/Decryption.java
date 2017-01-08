package com.example.amolishah.cryptography;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.EditText;

public class Decryption extends Activity {

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decryption);
    }
    public void DT (View view)
    {
        EditText et = (EditText) findViewById(R.id.editText6);
        String s2 = et.getText().toString();
        EditText et1 = (EditText) findViewById(R.id.editText5);
        String s4 = et1.getText().toString();
        Intent m = new Intent(this,DecryptTechniques.class);
        m.putExtra("key",s4);
        m.putExtra("text",s2);
        startActivity(m);
    }
}
