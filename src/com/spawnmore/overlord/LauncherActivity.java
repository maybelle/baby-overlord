package com.spawnmore.overlord;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import com.spawnmore.overlord.feeding.MainFeedingActivity;

public class LauncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.launcher, menu);
        return true;
    }
    
    public void onFeedingButtonClicked(View view) {
    	Toast.makeText(this, "Feeding button clicked!", Toast.LENGTH_SHORT).show();
    	Intent intent = new Intent(this, MainFeedingActivity.class);
    	startActivity(intent);
    }
}
