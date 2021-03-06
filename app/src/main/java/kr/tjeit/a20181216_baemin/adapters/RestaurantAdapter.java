package kr.tjeit.a20181216_baemin.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.List;

import kr.tjeit.a20181216_baemin.R;
import kr.tjeit.a20181216_baemin.datas.Restaurant;

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {

    Context mContext;
    List<Restaurant> mList;
    LayoutInflater inf;

    public RestaurantAdapter(Context mContext, List<Restaurant> mList){
        super(mContext, R.layout.restaurant_list_item,mList);

        this.mContext = mContext;
        this.mList = mList;
        this.inf = LayoutInflater.from(mContext);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View row = convertView;
        if(row == null){
            row = inf.inflate(R.layout.restaurant_list_item,null);
        }
        TextView nameTxt = row.findViewById(R.id.nameTxt);
        TextView addressTxt = row.findViewById(R.id.addressTxt);
        TextView openTimeTxt = row.findViewById(R.id.openTimeTxt);
        ImageView logoImgView = row.findViewById(R.id.logoImgView);

        Restaurant data = mList.get(position);
        nameTxt.setText(data.getName());
        addressTxt.setText(data.getAddress());
        openTimeTxt.setText(data.getOpenTime());

        Glide.with(mContext).load(data.getLogoURL()).into(logoImgView);
        return row;
    }
}
