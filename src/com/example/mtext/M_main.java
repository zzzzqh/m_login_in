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
			/*���������Ϣ��ť,���������Ϣ�������*/
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(M_main.this,M_reset.class);
                M_main.this.startActivity(intent);
			}
		});

		cs_guanli.setOnClickListener(new OnClickListener() {
			/*���ѡ�ι���ť,����γ̹������*/
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(M_main.this,M_csmanage.class);
                M_main.this.startActivity(intent);
			}
		});
		
	}


}
