package com.example.mtext;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.TextView;

public class M_csmanage extends Activity {
	private Button unchoose;
	private Button submit;
	private TextView cs_message1;
	protected void onCreate(Bundle savedInstanceState) {
		unchoose=(Button) findViewById(R.id.unchoose);
		submit=(Button)findViewById(R.id.submit);
		cs_message1=(Button)findViewById(R.id.cs_message);
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.m_csmanage_view);
		unchoose.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(M_csmanage.this,M_unchoose.class);
				M_csmanage.this.startActivity(intent);
				
				
			}
		});
			
		submit.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(M_csmanage.this,M_submit.class);
					M_csmanage.this.startActivity(intent);
					
					
				}
		});
		
        cs_message1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(M_csmanage.this,cs_message.class);
				M_csmanage.this.startActivity(intent);
				
			}

	});
        
	}
}
