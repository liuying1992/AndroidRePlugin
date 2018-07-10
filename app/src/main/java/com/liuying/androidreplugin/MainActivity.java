package com.liuying.androidreplugin;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.qihoo360.replugin.RePlugin;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView btn = findViewById(R.id.btn);
    btn.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        Intent intent = new Intent();
        intent.setComponent(
            new ComponentName("replugin", "com.liuying.repluginchild.MainActivity"));
        RePlugin.startActivityForResult(MainActivity.this, intent, 0x11, null);
      }
    });
  }
}
