package com.doapps.me.sesion01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends Activity{
	private EditText txtUsername;
	private EditText txtEmail;
	private EditText txtPassword;
	private EditText txtPassword2;
	private Button btnRegistrar;
	private Button btnLimpiar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register_layout);
		
		//conectemos los elementos
		txtUsername = (EditText)findViewById(R.id.txtUsername);
		txtEmail = (EditText)findViewById(R.id.txtEmail);
		txtPassword = (EditText)findViewById(R.id.txtPassword);
		txtPassword2 = (EditText)findViewById(R.id.txtPassword2);
		
		btnRegistrar = (Button)findViewById(R.id.btnRegistrar);
		btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
		
		btnLimpiar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				txtUsername.setText("vacío");
				txtEmail.setText("");
				txtPassword.setText("");
				txtPassword2.setText("");
				
			}
		});
		
		btnRegistrar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				final String user_ = txtUsername.getText().toString();
				final String email_ = txtEmail.getText().toString();
				final String pass_ = txtPassword.getText().toString();
				final String pass2_ = txtPassword2.getText().toString();
				
				Toast.makeText(Register.this, user_+"-"+email_+"-"+pass_+"-"+pass2_, Toast.LENGTH_LONG).show();				
			}
		});
		
	}
	
}

