package com.ttt.abstracts;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;

/**
 * Created by huangxy on 2016/3/4.
 */
public abstract class AbstractFragment extends Fragment implements OnClickListener{

	public abstract int inflateView();
	public abstract void initView();
	private View view = null;
	
	@Override
	@Deprecated
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		BeforeInflate();
	}
	
	@Override
	@Nullable
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
 		view = inflater.inflate(inflateView(), container, false);
		initView();
		getData();
		Other();
		return view;
	}
	
	public View setClick(int id){
		if(view == null) return null;
		View v = view.findViewById(id);
		try {
			v.setOnClickListener(this);
		}catch (RuntimeException e){

		}
		return v;
	}
	
//	public void setTitle(int id, String text){
//		try {
//			TextView tv = (TextView) findViewById(id);
//			tv.setText(text);
//		}catch (Exception e){
//
//		}
//	}
//
//	public void setFinish(int id){
//		try {
//			findViewById(id).setOnClickListener(new OnClickListener() {
//				@Override
//				public void onClick(View v) {
//					BeforeFinish();
//					finish();
//				}
//			});
//		}catch (Exception e){
//
//		}
//	}
//
//	public void BeforeFinish() {}
	public void BeforeInflate() {}
	public void getData() {}
	public void Other() {}
}
