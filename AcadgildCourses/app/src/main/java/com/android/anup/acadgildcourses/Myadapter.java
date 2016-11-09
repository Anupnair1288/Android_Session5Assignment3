package com.android.anup.acadgildcourses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class Myadapter extends BaseAdapter {
    private LayoutInflater inflater;
    private Context context;
    Dataclass data = new Dataclass();
    public Myadapter(Context c){
        this.context = c;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {return data.courses.length;}

    @Override
    public Object getItem(int position) {return null;    }

    @Override
    public long getItemId(int position) {
        return 0;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.rowview, parent, false);
            holder = new ViewHolder();
            holder.bindView(convertView);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder)convertView.getTag();
        }
        String text = data.courses[position];
        holder.coursename.setText(text);

        return convertView;
    }


    private class ViewHolder {
        TextView coursename;
        void bindView(View convertView){
            coursename = (TextView)convertView.findViewById(R.id.listtextview);
        }
    }
}
