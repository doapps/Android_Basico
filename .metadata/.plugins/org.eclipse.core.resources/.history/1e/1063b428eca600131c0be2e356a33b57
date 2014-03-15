package com.doapps.me.sesion01;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity{
	private Button btnLogin;
	private EditText editUser;
	private EditText editPass;
	private TextView editMostrar;

	private Context context2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_layout);

		context2 = Login.this;

		//conexion con elementos del layout
		btnLogin = (Button)findViewById(R.id.btnLogin);
		editUser = (EditText)findViewById(R.id.editUser);
		editPass = (EditText)findViewById(R.id.editPass);
		editMostrar = (TextView)findViewById(R.id.editMostrar);		
		
		
		
		btnLogin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				final String user_ = editUser.getText().toString();
				final String pass_ = editPass.getText().toString();

				editMostrar.setText(user_+"-"+pass_);

			}
		});

	}
}
