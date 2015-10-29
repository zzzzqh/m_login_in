package com.example.mtext;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class cs_message extends Activity {
		private Button add;
		private Button delete;
		private TextView cs_message;
		protected void onCreate(Bundle savedInstanceState) {
			add=(Button) findViewById(R.id.add);
			delete=(Button)findViewById(R.id.delete);
			cs_message=(TextView)findViewById(R.id.cs_message1);
			// TODO Auto-generated method stub
			
			super.onCreate(savedInstanceState);
			setContentView(R.layout.cs_message_view);
			
			add.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Toast.makeText(cs_message.this, "添加教师成功", 1).show();
					Intent intent = new Intent(cs_message.this,cs_message.class);
					cs_message.this.startActivity(intent);
					
					
				}
			});
				
			delete.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
							Toast.makeText(cs_message.this, "删除教师成功", 1).show();
							Intent intent = new Intent(cs_message.this,cs_message.class);
							cs_message.this.startActivity(intent);
						};
					
						
			});
			
	       cs_message.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(cs_message.this,M_csmanage.class);
					cs_message.this.startActivity(intent);
					
				}

		});
	        
	}

}
