package comsci.kamonlphop.myfirstapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class aboutme extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    int soundID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);


        //Toast onclick การคลิ๊กที่รูปเเล้วมีข้อความขึ้น
        ImageView clickImageView = (ImageView) findViewById(R.id.imgpro);
        clickImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"!!Hello!!,My name is kamonlphop",Toast.LENGTH_SHORT).show();//lenght ขะขึ้นshow 2วิ
                soundID=R.raw.hellomynameis;
                playSound(soundID);
            }
        });//end metboh ToastonCllick
        ImageView longImageView= (ImageView) findViewById(R.id.imgpro);
        longImageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(),"Thank Guy",Toast.LENGTH_SHORT).show();
                soundID=R.raw.thankguy;
                playSound(soundID);
                return true;
            }
        });//end metboh long
        //phone on Clickโทรศัพท์
        TextView phoneTextView = (TextView) findViewById(R.id.txttel);
        phoneTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneintent = new Intent(Intent.ACTION_VIEW);
                phoneintent.setData(Uri.parse("tel:0922623315"));
                startActivity(phoneintent);
            }
        });
    }//end main metboh


    private void playSound(int soundID) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(),soundID);
        mediaPlayer.start();
    }

    public void clickface(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/kamonlphop.august"));// connect กับ ลิ้ง เว๊ป
        startActivity(intent);
    }
    public void clickBack(View view) {
        finish();
    }
}
