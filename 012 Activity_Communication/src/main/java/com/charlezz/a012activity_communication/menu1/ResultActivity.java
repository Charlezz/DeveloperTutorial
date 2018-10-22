package com.charlezz.a012activity_communication.menu1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.charlezz.a012activity_communication.R;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Button finishBtn = findViewById(R.id.btn_finish);
        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView resultView = findViewById(R.id.result_text);

        Intent intent = getIntent();// getIntent()를 호출하여 이 액티비티가 호출되는데 쓰인 인텐트를 가져옴
        String myData = intent.getStringExtra("my_data"); //InputActivity로부터 입력된 텍스트를 가져옴
        resultView.setText(myData); // 출력
    }
}
