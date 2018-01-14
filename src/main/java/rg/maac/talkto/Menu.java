package rg.maac.talkto;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        }

    public void goToSuicidal (View view) {
        Intent intent = new Intent(this, Suicidal.class);
        startActivity(intent);
    }

    public void goToDepression (View view) {
        Intent intent = new Intent(this, Depression.class);
        startActivity(intent);
    }

    public void goToPTSD (View view) {
        Intent intent = new Intent(this, PTSD.class);
        startActivity(intent);
    }

    public void goToOther (View view){
        Intent intent = new Intent(this, Other.class);
        startActivity(intent);
    }

    public void goToTerminal (View view) {
        Intent intent = new Intent(this, Terminal.class);
        startActivity(intent);
    }

    public void goToLoss (View view) {
        Intent intent = new Intent(this, Loss.class);
        startActivity(intent);
    }

    public void goToCancer(View view) {
        Intent intent = new Intent(this, Cancer.class);
        startActivity(intent);

    }

}

