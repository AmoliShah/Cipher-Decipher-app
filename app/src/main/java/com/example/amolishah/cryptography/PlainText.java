package com.example.amolishah.cryptography;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class PlainText extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plain_text);
        Intent u = getIntent();
        String ct="";
        if (u!= null)
        {
            ct = u.getStringExtra("plain text");
            TextView tv = (TextView) findViewById(R.id.textView5);
            SpannableString content = new SpannableString(ct);
            content.setSpan(new UnderlineSpan(), 0, ct.length(), 0);
            tv.setText(ct);
        }
    }

}
