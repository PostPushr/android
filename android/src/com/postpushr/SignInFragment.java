package com.postpushr;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class SignInFragment extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_signin, parent, false);

		Button loginButton = (Button) view.findViewById(R.id.signin_login_button);
		Button registerButton = (Button) view.findViewById(R.id.signin_register_button);

		loginButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				((SignInListener) getActivity()).onLoginButton();
			}
		});
		registerButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				((SignInListener) getActivity()).onRegisterButton();
			}	
		});

		return view;
	}

	public interface SignInListener {
		public void onLoginButton();
		public void onRegisterButton();
	}
}
