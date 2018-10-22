package com.charlezz.a012activity_communication.menu2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.charlezz.a012activity_communication.R;

public class ReceiverActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        textView = findViewById(R.id.tv);
        Button goToInput = findViewById(R.id.move);
        goToInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(ReceiverActivity.this, InputActivity2.class)); // InputActivity2를 호출하기만 함.
                startActivityForResult(new Intent(ReceiverActivity.this, InputActivity2.class), 1234);
                /** startActivityForResult(Intent, int)는 어떠한 액티비티를 호출하고 그 액티비티로부터 어떠한 결과값을 기대할 때 사용하는 메소드
                 * requestCode의 경우 원하는 int값을 유니크 하게 넣어주면 됩니다.
                 * 그러므로 위의 메소드는 requestCode 1234를 갖는 InputActivity2를 호출하고 InputActivity2로부터 어떠한 결과값을 리턴받게 됩니다.
                 * 결과값을 받는 콜백 메소드는 onActivityResult입니다.
                 */
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1234 && resultCode == RESULT_OK){//내가 요청한 requestCode와 resultCode가 일치하는지 확인
            String myData = data.getStringExtra("my_data");
            textView.setText(myData);
        }else{
            textView.setText("No Data");
        }
    }
}
