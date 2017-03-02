package comsci.kamonlphop.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Initial view ผูกตัวแปรกับ id ของ view
        TextView titleTextView = (TextView) findViewById(R.id.txtTitleDetail);
        ImageView imageView = (ImageView) findViewById(R.id.imvImageDetail);
        TextView detailscrollTextView = (TextView) findViewById(R.id.txtDetailScroll);
        Button button = (Button) findViewById(R.id.btnBack);

        //show data from mainactivity รับข้อมูลจาก main activity มาเเสดงผลบนdetail
        titleTextView.setText(getIntent().getStringExtra("Title"));// รับจาก intent มา
        detailscrollTextView.setText(getIntent().getStringExtra("Detail"));
        imageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.traffic_01));


    }// end method oncreate

    public void clickBack(View view){// ปุ่ม click back กลับไป หน้า main activity
        finish();
    }
}// end main class
