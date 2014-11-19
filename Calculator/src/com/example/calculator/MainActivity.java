package com.example.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity 
{

	boolean decimal = false;
	boolean suma = false;
	boolean resta = false;
	boolean mult = false;
	boolean div = false;
	boolean exp = false;
	Double[] numero = new Double[20] ;
	Double resultado;
	TextView pantalla;
	String actual;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        pantalla = (TextView)findViewById(R.id.texto);
    }
    
    public void btn0(View v)
    {
    	actual = pantalla.getText().toString();
    	pantalla.setText(actual+"0");
    }
    public void btn1(View v)
    {
    	actual = pantalla.getText().toString();
    	pantalla.setText(actual+"1");
    }
    public void btn2(View v)
    {
    	actual = pantalla.getText().toString();
    	pantalla.setText(actual+"2");
    }
    public void btn3(View v)
    {
    	actual = pantalla.getText().toString();
    	pantalla.setText(actual+"3");
    }
    public void btn4(View v)
    {
    	actual = pantalla.getText().toString();
    	pantalla.setText(actual+"4");
    }
    public void btn5(View v)
    {
    	actual = pantalla.getText().toString();
    	pantalla.setText(actual+"5");
    }
    public void btn6(View v)
    {
    	actual = pantalla.getText().toString();
    	pantalla.setText(actual+"6");
    }
    public void btn7(View v)
    {
    	actual = pantalla.getText().toString();
    	pantalla.setText(actual+"7");
    }
    public void btn8(View v)
    {
    	actual = pantalla.getText().toString();
    	pantalla.setText(actual+"0");
    }
    public void btn9(View v)
    {
    	actual = pantalla.getText().toString();
    	pantalla.setText(actual+"0");
    }
    public void btnPunto(View v)
    {
    	actual = pantalla.getText().toString();
    	
    	if(decimal==false)
    	{
			pantalla.setText(actual+".");
			decimal = true;
	    }else{
	    	return;
	    }
    }
    public void btnSuma(View v)
    {
    	suma =true;
		numero[0] = Double.parseDouble(actual);
		pantalla.setText("");
		decimal =false;
    }
    public void btnResta(View v)
    {
    	numero[0] = Double.parseDouble(actual);
		resta =true;
		pantalla.setText("");
		decimal =false;
    }
    public void btnMultiplicacion(View v)
    {
    	numero[0] = Double.parseDouble(actual);
		mult =true;
		pantalla.setText("");
		decimal =false;
    }
    public void btnDivicion(View v)
    {
    	numero[0] = Double.parseDouble(actual);
		div = true;
		pantalla.setText("");
		decimal =false;
    }
    public void btnIgual(View v)
    {
    	numero[1] = Double.parseDouble(actual);
		
		if(suma == true){
		resultado = numero[0] + numero[1];	
		    pantalla.setText(String.valueOf(resultado));	
		}else if(resta ==true){
			resultado = numero[0] - numero[1];	
			pantalla.setText(String.valueOf(resultado));	
		}else if(div ==true){
			resultado = numero[0] / numero[1];	
			pantalla.setText(String.valueOf(resultado));
		}else if(mult ==true){
			resultado = numero[0] * numero[1];	
			pantalla.setText(String.valueOf(resultado));
		}else if(div ==true){
			resultado = numero[0] / numero[1];	
			pantalla.setText(String.valueOf(resultado));
		}else if(exp ==true){
			resultado = numero[0] * numero[0];	
			pantalla.setText(String.valueOf(resultado));
		}
		decimal =false;
		suma =false;
		resta =false;
		mult =false;
		div =false;
		exp = false;
    }
    
    public void btnAc(View v)
    {
    	pantalla.setText("");
		decimal = false;
    }
    
    
}
