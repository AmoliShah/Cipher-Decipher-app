package com.example.amolishah.cryptography;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

import static java.util.logging.Logger.global;

public class CipherText extends Activity {
    String ct="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cipher_text);
        Intent u = getIntent();
        if (u!= null)
        {
            ct = u.getStringExtra("cipher");
            TextView tv = (TextView) findViewById(R.id.textView7);
            SpannableString content = new SpannableString(ct);
            content.setSpan(new UnderlineSpan(), 0, ct.length(), 0);
            tv.setText(ct);
        }
    }
    public void share (View view)
    {
        String shareBody = ct + "\nShared using app..Cheers!!!";
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(sharingIntent);
    }
}
