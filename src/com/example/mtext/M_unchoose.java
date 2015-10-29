package com.example.mtext;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class M_unchoose extends Activity{
	private Button back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		back=(Button) findViewById(R.id.back); 
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.m_unchoose_t_view);
		
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent =new Intent(M_unchoose.this,M_csmanage.class);
				M_unchoose.this.startActivity(intent);
				
			}
		});
	}

}
