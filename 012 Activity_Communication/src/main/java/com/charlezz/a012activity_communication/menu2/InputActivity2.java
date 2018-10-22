package com.charlezz.a012activity_communication.menu2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.charlezz.a012activity_communication.R;

public class InputActivity2 extends AppCompatActivity {

    Button send;
    EditText input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input2);
        send = findViewById(R.id.send);
        input = findViewById(R.id.input);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = input.getText().toString(); //EditText에 입력한 내용을 String으로 받는다.
                Intent intent = new Intent(); // ReceiverActivity에 data를 전달하기위한 인텐트를 만든다.
                intent.putExtra("my_data",data); // my_data라는 key로 data를 인텐트에 넣는다.
                setResult(RESULT_OK,intent); //InputActivity2가 종료되면 Result코드와 함께 intent를 이전 액티비티로 전달한다.
                //Result코드는 액티비티에 상수로 선언되어있으며 RESULT_OK, RESULT_CANCELED, RESULT_FIRST_USER가 있습니다.
                //일반적으로 성공 또는 이상없음을 전달할때는 RESULT_OK, 실패 또는 강제종료시 RESULT_CANCEL을 넣어 이전 액티비티에게 전달 할 수 있습니다.
                finish(); //InputActivity2를 종료한다.

            }
        });
    }
}
