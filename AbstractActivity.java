package com.ttt.abstracts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Created by huangxy on 2016/3/4.
 */
public abstract class AbstractActivity extends Activity implements OnClickListener{

	public abstract void initView();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		BeforeCreate();
		super.onCreate(savedInstanceState);
		AfterCreate();
		initView();
		getData();
		Other();
	}
	
	public View setClick(int id){
		View view = findViewById(id);
		try {
			view.setOnClickListener(this);
		}catch (RuntimeException e){

		}
		return view;
	}
	
	public void BeforeCreate() {}
	public void AfterCreate() {}
	public void getData() {}
	public void Other() {}

}
