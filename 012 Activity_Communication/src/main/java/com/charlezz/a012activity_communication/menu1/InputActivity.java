package com.charlezz.a012activity_communication.menu1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.charlezz.a012activity_communication.R;

public class InputActivity extends AppCompatActivity {

    EditText input;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        input = findViewById(R.id.input);
        send = findViewById(R.id.btn_send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //1.EditText에 입력된 텍스트를 가져온다.
                String data = input.getText().toString();

                //2. 호출/전달 하고자 하는 액티비티를 위해 Intent를 만든다.
                Intent intent = new Intent(InputActivity.this, ResultActivity.class);

                //3. 해당 인텐트에 입력한 텍스트 데이터를 싣는다.
                intent.putExtra("my_data", data); //데이터를 여러개 싣을경우 구분하기 위해 key:value형식으로 입력, 이 예제에서는 my_data가 key가 된다.

                //4. ResultActivity 호출
                startActivity(intent);
            }
        });

    }
}
