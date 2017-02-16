package comsci.kamonlphop.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//end method oncreate , view คือ หน้าที่เราออกเเบบ
    public void onClickMoreInfo(View view ){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dlt.go.th/th/dlt-knowledge/view.php?_did=111"));// connect กับ ลิ้ง เว๊ป
        startActivity(intent);
        }//intent คือ การโอนข้อมูลจากที่นึ่งไปสู้ที่นึ่ง

    }//main calss
