package com.example.lenovo.fengyue0102.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.fengyue0102.R;
import com.example.lenovo.fengyue0102.entity.User;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class MAdapter extends BaseAdapter {
    private Context context;
    private List<User.Data.TJ> list;

    public MAdapter(Context context) {
        this.context = context;
        list=new ArrayList<>();
    }

    public void setList(List<User.Data.TJ> list) {
        if(list!=null){
        this.list = list;
        }
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public User.Data.TJ getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       ViewHolder viewHolder=null;
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.linear, parent, false);
            viewHolder = new ViewHolder(convertView);
        }
       viewHolder.bindData(getItem(position));
        return convertView;
    }
    class ViewHolder{
        ImageView img;
        TextView title,price;
        public ViewHolder(View item) {
            this.img = item.findViewById(R.id.img);
            this.title = item.findViewById(R.id.title);
            this.price = item.findViewById(R.id.price);
            item.setTag(this);
        }

        public void bindData(User.Data.TJ item) {
            title.setText(item.getTitle());
            price.setText(item.getPrice()+"");
            DisplayImageOptions options=new DisplayImageOptions.Builder().build();
            ImageLoader.getInstance().displayImage(item.getImages(),this.img,options);
        }
    }
}
