package com.example.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] Images = {};
    String[] hoten = {"Khoa"};
    String[] mssv = {"16061651"};
    String[] monhoc = {"CNTT"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.ListView);

        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
    }

    public void btnSua(View view) {
    }

    public void btnThem(View view) {
    }

    public void btnXoa(View view) {
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return mssv.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customlistview,null);

            ImageView imageView=(ImageView)convertView.findViewById(R.id.imv_image);
            TextView textView_hoten=(TextView)convertView.findViewById(R.id.txt_hoten);
            TextView textView_mssv=(TextView)convertView.findViewById(R.id.txt_masv);
            TextView textView_monhoc=(TextView)convertView.findViewById(R.id.txt_monhoc);

            imageView.setImageResource(Images[position]);
            textView_hoten.setText(hoten[position]);
            textView_mssv.setText(mssv[position]);
            textView_monhoc.setText(monhoc[position]);

            return convertView;
        }
    }
}
