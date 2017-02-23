package comsci.kamonlphop.myfirstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by USER on 23/2/2560.
 */
//activity นี้ทำเพื่อสร้างทำ layout เสมือนเพื่อนำไปเเสดงผลหน้า activity
public class MyAdapter extends BaseAdapter {
    //Explicit(ประกาศตัวแปร)
    private Context context;
    private int[] ints;
    private String[] titleStrings,detailStrings;

//constructor เพื่อ implement context มา
    public MyAdapter(Context context,int[] ints , String[] titleStrings, String[] detailStrings) {
        this.ints = ints;
        this.context = context;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }//end constructor



    @Override
    public int getCount() { //ใช้นับจำนวนข้อมูล เเล้วส่งต่อไปยัง metboh getview
        return ints.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {//รับจำนวนข้อมูลเเล้วเเสดงผลหน้าapp
        //cast to คือการแปลงชิดตัวแปร
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.my_listview,parent,false);

        //initial view ผูกชื่อของไอดี view กับตัวแปร
        ImageView imageView = (ImageView) view.findViewById(R.id.imvIcon);
        TextView titltetextView = (TextView) view.findViewById(R.id.txtDetailLiv);
        TextView detailtextView = (TextView) view.findViewById(R.id.textView2);

        //show view เอาข้อมูลไปเเสดงผลบนหน้า App
        imageView.setImageResource(ints[position]);
        titltetextView.setText(titleStrings[position]);
        detailtextView.setText(detailStrings[position]);
        return view;
    }
}//end class
