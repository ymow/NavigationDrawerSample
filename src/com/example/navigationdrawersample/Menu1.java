package com.example.navigationdrawersample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Menu1 extends Fragment {
 	//public static final String ARG_PAGER_NUMBER = "page_number";
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saBundle){
		View rootView = inflater.inflate(R.layout.menu1, container, false);
				TextView dummyTextView = (TextView) rootView.findViewById(R.id.FuseName);
	 
		return rootView;
		
	}
}
