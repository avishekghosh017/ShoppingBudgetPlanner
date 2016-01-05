package shoppingbudgetplanner.avigo.com.shoppingbudgetplanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageTextAdapter extends ArrayAdapter<String> {

    private LayoutInflater mInflater;

    private String[] mStrings;
    private TypedArray mIcons;
    private String[] mPrice;
    private String[] mScale;

    private int mViewResourceId;

    public ImageTextAdapter(Context ctx, int viewResourceId,
                               String[] strings, TypedArray icons, String[] price, String[] scale) {
        super(ctx, viewResourceId, strings);

        mInflater = (LayoutInflater)ctx.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        mStrings = strings;
        mIcons = icons;
        mPrice = price;
        mScale= scale;

        mViewResourceId = viewResourceId;
    }

    @Override
    public int getCount() {
        return mStrings.length;
    }

    @Override
    public String getItem(int position) {
        return mStrings[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        EditText etQuantity=(EditText)convertView.findViewById(R.id.etQuantity);
        //double i= Double.parseDouble(etQuantity.getText().toString());

        ImageView ivItems = (ImageView)convertView.findViewById(R.id.ivItems);
        ivItems.setImageDrawable(mIcons.getDrawable(position));

        TextView tvItems = (TextView)convertView.findViewById(R.id.tvItems);
        tvItems.setText(mStrings[position]);

        TextView price= (TextView)convertView.findViewById(R.id.tvPrice);
        price.setText(mPrice[position]);
        //Integer p= Integer.parseInt(price.getText().toString());

        TextView scale=(TextView)convertView.findViewById(R.id.tvScale);
        scale.setText(mScale[position]);

        TextView estCost=(TextView)convertView.findViewById(R.id.tvEstCost);
        //estCost.setText((mPrice[position]));

        return convertView;
    }
}
