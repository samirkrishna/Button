package com.example.chsamirkrishna.button;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dial(View view) {

       /* Intent i = new Intent();
        EditText et =findViewById(R.id.et1);
        i.setAction(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:"+et.getText().toString()));
        startActivity(i);*/
        /*Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.facebook.com"));
        startActivity(i);*/
        Intent i =new Intent();
        i.setAction(Intent.ACTION_GET_CONTENT);
        i.setType("image/*");
        startActivity(i);
    }

    public void next(View view) {

        EditText et2 =findViewById(R.id.et2);
        EditText et3 =findViewById(R.id.et3);

      Intent i = new Intent(MainActivity.this,Next.class);
      i.putExtra("name",et2.getText().toString());
      i.putExtra("qual",et3.getText().toString());
      startActivity(i);
    }

    public void whatsapp(View view) {
        Intent i =getPackageManager().getLaunchIntentForPackage("cn.xender");
        if(i!=null)
        startActivity(i);
        else{
            Intent i1 =new Intent();
            i1.setAction(Intent.ACTION_VIEW);
            i1.setData(Uri.parse("https://play.google.com/store/apps/details?id=cn.xender"));
            startActivity(i1);
        }
    }
}
