package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //안드로이드 개발을 하려면 핸드폰이 필요합니다.
    //가상 핸드폰 제공(설치)
    //웹 : html/css 리소스 + java 코드(기능부여)
    //모바일앱 : xml리소스 + java 코드(기능부여)
    //windows 프로그램 : rc리소스 + c#코드(기능부여)

    Button button1;
    TextView text1;
    EditText edit1;

    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //해당 화면이 실행되면  처음으로 실행될 메서드
        //여기에 코드를 넣어놓으면 화면이 처음 실행될때 동작할 코드가 됨
        super.onCreate(savedInstanceState);          //AppCompatActivity 부모 클래스의 onCreate 메서드를 실행
        setContentView(R.layout.activity_main);      //res 폴더 안에 layout 폴더 안에 activity_main.xml을 실행

        //화면 리소스와 자바변수를 연동
        button1 = findViewById(R.id.button1);
        text1 = findViewById(R.id.text1);
        edit1 = findViewById(R.id.edit1);

        //버튼 이벤트 추가(버튼이 눌렸을때 발생하는 코드 추가)
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //버튼 눌렸을때 동작할 코드
                String str = edit1.getText().toString();
                int year = -1;

                if(str.equals("") || str == null){

                }else{
                    year = Integer.parseInt(str);
                }

                if(year == -1){
                    text1.setText("잘못 입력하셨습니다.");
                }else if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    text1.setText(year+"년은 윤년입니다");
                }else{
                    text1.setText(year+"년은 윤년이 아닙니다.");
                }

            }
        });
    }
}