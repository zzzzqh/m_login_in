package com.example.mtext;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class M_xuanke extends Activity {
	private Button csmanage;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		csmanage=(Button) findViewById(R.id.csmanage);
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.m_xuanke_view);
		csmanage.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(M_xuanke.this,M_csmanage.class);
				M_xuanke.this.startActivity(intent);
				
				
			}
		});

	}

}
