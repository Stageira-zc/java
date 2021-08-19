package com.example.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//public class MainActivity extends AppCompatActivity {
//
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//		Button button = (Button) findViewById(R.id.button);
//		button.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View view) {
//			//
//			}
//		});
//	}
//}
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(this);
	}
	@Override
	public void onClick(View v){
		switch (v.getId()){
			case R.id.button:
				Toast.makeText(MainActivity.this,"You click Button1",Toast.LENGTH_SHORT).show();
				break;
			default:
				break;
		}
	}
}