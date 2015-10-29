package com.example.mtext;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class M_reset  extends Activity {
	
	private Button change;
	private Button back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.m_reset_view);
		change=(Button) findViewById(R.id.change);
		back=(Button) findViewById(R.id.back);
		change.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(M_reset.this, "个人信息修改成功", 1).show();
				Intent intent=new Intent(M_reset.this,M_reset.class);
	            M_reset.this.startActivity(intent);
			}
		});
		
         back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(M_reset.this,M_main.class);
	            M_reset.this.startActivity(intent);
			}
		});
	}
	

}
