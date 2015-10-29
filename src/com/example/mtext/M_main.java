package com.example.mtext;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class M_main extends Activity{
	
	private Button person_message;
	private Button cs_guanli;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		cs_guanli=(Button) findViewById(R.id.cs_guanli);
		person_message=(Button) findViewById(R.id.person_message);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.m_main_view);
		
		person_message.setOnClickListener(new OnClickListener() {
			/*点击个人信息按钮,进入个人信息管理界面*/
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(M_main.this,M_reset.class);
                M_main.this.startActivity(intent);
			}
		});

		cs_guanli.setOnClickListener(new OnClickListener() {
			/*点击选课管理按钮,进入课程管理界面*/
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(M_main.this,M_csmanage.class);
                M_main.this.startActivity(intent);
			}
		});
		
	}


}
