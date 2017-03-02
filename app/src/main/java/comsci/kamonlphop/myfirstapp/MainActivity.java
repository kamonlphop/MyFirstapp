package comsci.kamonlphop.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //ประกาศตัวแปร
    ListView listView;
    private int[] ints = new int[]{ R.drawable.traffic_01,
                                    R.drawable.traffic_02,
                                    R.drawable.traffic_03,
                                    R.drawable.traffic_04,
                                    R.drawable.traffic_05,
                                    R.drawable.traffic_06,
                                    R.drawable.traffic_07,
                                    R.drawable.traffic_08,
                                    R.drawable.traffic_09,
                                    R.drawable.traffic_10,
                                    R.drawable.traffic_11,
                                    R.drawable.traffic_12,
                                    R.drawable.traffic_13,
                                    R.drawable.traffic_14,
                                    R.drawable.traffic_15,
                                    R.drawable.traffic_16,
                                    R.drawable.traffic_17,
                                    R.drawable.traffic_18,
                                    R.drawable.traffic_19,
                                    R.drawable.traffic_20};

    private String[] titlestrings,detailStrings,shortStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initial view ผูกตัวแปรกับ id ของ view
        listView = (ListView) findViewById(R.id.livtafic);

        //get values
        titlestrings = getResources().getStringArray(R.array.title);
        detailStrings = getResources().getStringArray(R.array.detail);

        //SudString detailString ตัดคำในdetailString เพื่อให้มีข้อความไม่เกิน 30 char
        shortStrings = new String[detailStrings.length];//จองพื้นที่หน่วยความจำ shorstring
        for (int i =0 ; i < detailStrings.length ; i++) {
            shortStrings[i]= detailStrings[i].substring(0,29)+"...";//substring=methob ตัดคำใน(ตัวเลขแรก , จำนวนที่เราต้องการ)


        }// end for

        //create ListView
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, ints, titlestrings, shortStrings);
        listView.setAdapter(myAdapter);
//ddd

    }//end method oncreate , view คือ หน้าที่เราออกเเบบ

    public void onClickMoreInfo(View view ){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dlt.go.th/th/dlt-knowledge/view.php?_did=111"));// connect กับ ลิ้ง เว๊ป
        startActivity(intent);
        }//intent คือ การโอนข้อมูลจากที่นึ่งไปสู้ที่นึ่ง


    }//main calss
