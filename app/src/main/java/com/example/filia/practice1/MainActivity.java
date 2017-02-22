package com.example.filia.practice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btpunto, btsuma, btresta, btmulti, btdivi, btigual, btborrar;
    EditText eNumero;
    TextView eNumero2;

    double resultado=0,num1,num2,acount=0;
    int numero1;
    String ope,ope2;
    boolean decimal = false;
    boolean suma=false;
    boolean resta=false;
    boolean multi=false;
    boolean divi=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btborrar = (Button) findViewById(R.id.btborrar);
        btborrar.setOnClickListener(this);
        btigual = (Button) findViewById(R.id.btigual);
        btigual.setOnClickListener(this);
        btdivi = (Button) findViewById(R.id.btdivi);
        btdivi.setOnClickListener(this);
        btmulti = (Button) findViewById(R.id.btmulti);
        btmulti.setOnClickListener(this);
        btresta = (Button) findViewById(R.id.btresta);
        btresta.setOnClickListener(this);
        btsuma = (Button) findViewById(R.id.btsuma);
        btsuma.setOnClickListener(this);
        btpunto = (Button) findViewById(R.id.btpunto);
        btpunto.setOnClickListener(this);
        bt9 = (Button) findViewById(R.id.bt9);
        bt9.setOnClickListener(this);
        bt8 = (Button) findViewById(R.id.bt8);
        bt8.setOnClickListener(this);
        bt7 = (Button) findViewById(R.id.bt7);
        bt7.setOnClickListener(this);
        bt6 = (Button) findViewById(R.id.bt6);
        bt6.setOnClickListener(this);
        bt5 = (Button) findViewById(R.id.bt5);
        bt5.setOnClickListener(this);
        bt4 = (Button) findViewById(R.id.bt4);
        bt4.setOnClickListener(this);
        bt3 = (Button) findViewById(R.id.bt3);
        bt3.setOnClickListener(this);
        bt2 = (Button) findViewById(R.id.bt2);
        bt2.setOnClickListener(this);
        bt1 = (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(this);
        bt0 = (Button) findViewById(R.id.bt0);
        bt0.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        eNumero = (EditText) findViewById(R.id.eNumero);
        eNumero2 = (TextView)findViewById(R.id.eNumero2);
        ope=eNumero.getText().toString();
        ope2=eNumero2.getText().toString();

        numero1 = v.getId();
        try {
            switch (numero1) {

                case R.id.bt0:
                    eNumero.setText(ope+"0");
                    eNumero2.setText(ope2+"0");

                    break;
                case R.id.bt1:
                    eNumero.setText(ope+"1");
                    eNumero2.setText(ope2+"1");

                    break;
                case R.id.bt2:
                    eNumero.setText(ope+"2");
                    eNumero2.setText(ope2+"2");

                    break;
                case R.id.bt3:
                    eNumero.setText(ope+"3");
                    eNumero2.setText(ope2+"3");

                    break;
                case R.id.bt4:
                    eNumero.setText(ope+"4");
                    eNumero2.setText(ope2+"4");

                    break;
                case R.id.bt5:
                    eNumero.setText(ope+"5");
                    eNumero2.setText(ope2+"5");

                    break;
                case R.id.bt6:
                    eNumero.setText(ope+"6");
                    eNumero2.setText(ope2+"6");

                    break;
                case R.id.bt7:
                    eNumero.setText(ope+"7");
                    eNumero2.setText(ope2+"7");

                    break;
                case R.id.bt8:
                    eNumero.setText(ope+"8");
                        eNumero2.setText(ope2+"8");

                    break;
                case R.id.bt9:
                    eNumero.setText(ope+"9");
                    eNumero2.setText(ope2+"9");
                    break;
                case R.id.btsuma:
                    eNumero2.setText(ope2+" + ");
                    suma=true;
                    eNumero.setText("");
                    num1 = Double.parseDouble(ope);
                    acount=acount+num1;
                    break;
                case R.id.btresta:
                    eNumero2.setText(ope2+" - ");


                    num1 = Double.parseDouble(ope);
                    eNumero.setText("");
                    acount=num1-acount;
                    resta=true;
                    decimal=false;
                    break;
                case R.id.btmulti:
                    eNumero2.setText(ope2+" * ");

                    multi=true;
                    num1 = Double.parseDouble(ope);
                    eNumero.setText("");
                    acount=num1;
                    decimal=false;
                    break;
                case R.id.btdivi:
                    eNumero2.setText(ope2+" / ");

                    divi=true;
                    num1 = Double.parseDouble(ope);
                    eNumero.setText("");
                    acount=num1;

                    decimal=false;
                    break;
                case R.id.btpunto:
                    if (decimal==false){
                        eNumero.setText(ope+".");
                        eNumero2.setText(ope2+".");

                        decimal=true;
                    }else{return;}
                    break;
                case R.id.btigual:

                      num2=Double.parseDouble(ope);
                    if(suma==true){
                        acount=acount+num2;
                    }
                     if (resta==true){
                    acount=acount-num2;
                }
                if (multi==true){
                    acount=acount*num2;
                }
                if (divi==true){
                    acount=acount/num2;
                }
                      eNumero.setText(String.valueOf(acount));
                        acount=0;
                  suma=false;
                    resta=false;
                    multi=false;
                    divi=false;
                    eNumero2.setText("");
                    break;


                case R.id.btborrar:
                    eNumero.setText("");
                    eNumero2.setText("");
                    decimal=false;
                    acount=0;
                    break;


            }
        } catch (Exception e) {
            eNumero.setText("error");
        }
    }
}