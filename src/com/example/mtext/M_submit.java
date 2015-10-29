package com.example.mtext;



import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class M_submit extends Activity {
	private Button submit;
	protected void onCreate(android.os.Bundle savedInstanceState) {
	
		submit=(Button)findViewById(R.id.submit);
		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(M_submit.this, "提交审核成功", 1).show();
				 Intent intent=new Intent(M_submit.this,M_submit.class);
	             M_submit.this.startActivity(intent);
			}
		});
		
	};
	

	

}
