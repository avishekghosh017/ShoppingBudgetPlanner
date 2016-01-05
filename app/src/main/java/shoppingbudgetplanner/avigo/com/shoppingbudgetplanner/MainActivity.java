package shoppingbudgetplanner.avigo.com.shoppingbudgetplanner;

import android.app.ListActivity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context ctx = getApplicationContext();
        Resources res = ctx.getResources();

        String[] options = res.getStringArray(R.array.item_text);
        TypedArray icons = res.obtainTypedArray(R.array.item_image);
        String[] price = res.getStringArray(R.array.item_price);
        String[] scale= res.getStringArray(R.array.item_scale);

        setListAdapter(new ImageTextAdapter(ctx, R.layout.main_list_item, options, icons, price, scale));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("About");
        menu.add("Help");
        menu.add("Setting");
        menu.add("Exit");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getTitle()=="About"){

        }

        if(item.getTitle()=="Exit"){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
