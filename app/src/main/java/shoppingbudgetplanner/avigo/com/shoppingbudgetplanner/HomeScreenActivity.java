package shoppingbudgetplanner.avigo.com.shoppingbudgetplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void shopping(View view){
        switch (view.getId()){
            case R.id.btnVege:
                Intent vege= new Intent(getBaseContext(),MainActivity.class);
                startActivity(vege);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("About App");
        menu.add("Help");
        menu.add("Settings");
        menu.add("Feedback");
        menu.add("Exit");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getTitle()=="Exit"){
            finish();
        }
        if (item.getTitle()=="About App"){
            Intent about= new Intent(getBaseContext(),AboutAppActivity.class);
            startActivity(about);
        }

        return super.onOptionsItemSelected(item);
    }
}
