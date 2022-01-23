package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class BilimselActivity extends AppCompatActivity {
    DrawerLayout cekmece;
    TextView display,yazdir;
    Double ilkSayi;
    String islemDurum;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,btnc;
    Button btntopla,btncikar,btnbol,btncarp,btnesit,btnkesir,btnplusminus,btnus,btnkok,btnyuzde,btnvirgul,btnce
            ,btnmutlak,btne,btnpi,btnlog,btnontaban,btnmod,btnfaktor,btnparantezac,btnparantezkapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilimsel);
        cekmece=findViewById(R.id.cekmece_arkaplan);
        display=findViewById(R.id.txtsayigiris);
        btntopla=findViewById(R.id.btopla);
        btncikar=findViewById(R.id.bcikar);
        btncarp=findViewById(R.id.bcarp);
        btnbol=findViewById(R.id.bbol);
        btnesit=findViewById(R.id.besit);
        btnkesir=findViewById(R.id.bkesir);
        btnplusminus=findViewById(R.id.bplusMinus);
        btnus=findViewById(R.id.bus);
        btnkok=findViewById(R.id.bkok);
        btnyuzde=findViewById(R.id.byuzde);
        btnvirgul=findViewById(R.id.bvirgul);
        btnce=findViewById(R.id.bce);
        btnc=findViewById(R.id.bc);
        yazdir=findViewById(R.id.txtyazdir);
        btnmutlak=findViewById(R.id.bmutlak);
        btne=findViewById(R.id.be);
        btnpi=findViewById(R.id.bpi);
        btnlog=findViewById(R.id.blog);
        btnontaban=findViewById(R.id.bonusx);
        btnmod=findViewById(R.id.bmod);
        btnfaktor=findViewById(R.id.bfaktoriyel);
        btnparantezac=findViewById(R.id.bparantezac);
        btnparantezkapa=findViewById(R.id.bparantezkapa);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);

        display.setText("0");
        ilkSayi=0.0;
        islemDurum="0";
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numara(0);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numara(1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numara(2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numara(3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numara(4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numara(5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numara(6);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numara(7);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numara(8);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numara(9);
            }
        });
        btnce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                semboller("ce");
            }
        });
        btntopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                semboller("+");
            }
        });
        btncikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                semboller("-");
            }
        });
        btncarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                semboller("×");
            }
        });
        btnbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                semboller("÷");
            }
        });
        btnesit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                semboller("=");
            }
        });
        btnkesir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                semboller("¹/×");
            }
        });
        btnus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bus = (String) display.getText();
                display.setText(String.valueOf(Math.pow( Integer.parseInt(bus), 2)));
                yazdir.setText(bus);
            }
        });
        btnkok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String deger = (String) display.getText();
                display.setText(String.valueOf(Math.sqrt( Integer.parseInt(deger))));
                yazdir.setText(deger);
            }
        });
        btnmutlak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mutlak = (String) display.getText();
                display.setText(String.valueOf(Math.abs( Integer.parseInt(mutlak))));
                yazdir.setText(mutlak);
            }
        });
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(String.valueOf(Math.E));
                yazdir.setText(display.getText().toString());
            }
        });
        btnpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(String.valueOf(Math.PI));
                yazdir.setText(display.getText().toString());
            }
        });
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String log = (String) display.getText();
                display.setText( String.valueOf(Math.log( Integer.parseInt(log))));
                yazdir.setText(log);

            }
        });
        btnontaban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String log = (String) display.getText();
                display.setText( String.valueOf(Math.log10( Integer.parseInt(log))));
                yazdir.setText(log);
            }
        });
        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mod = (String) display.getText();
                String mod2=(String)display.getText();
                display.setText(String.valueOf(Math.IEEEremainder(Integer.parseInt(mod), (Integer.parseInt(mod)))));
                yazdir.setText(mod);
            }
        });
        btnfaktor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              semboller("!");
            }
        });
        btnparantezac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String displaytest=display.getText().toString();
                int deger=display.getSelectionStart();
                int degr=0;
                for(int i=0;i<displaytest.length();i++){
                    if(displaytest.substring(i,i+1).equalsIgnoreCase("(")) degr++;

                }
                display.setText(displaytest);
            }
        });
    }
    private void semboller(String sembol){

        switch (sembol){
            default:{
                if (display.getText().toString()=="+"|| display.getText().toString()=="-"||
                        display.getText().toString()==  "×"|| display.getText().toString()=="÷"
                        || display.getText().toString()=="¹/×" || display.getText().toString()=="!"){

                    if(islemDurum=="×"||islemDurum=="÷")
                        ilkSayi=-1*ilkSayi;
                    display.setText(sembol);
                    islemDurum=sembol;


                } else {
                    ilkSayi=Double.parseDouble(display.getText().toString());
                    display.setText(sembol);
                    islemDurum=sembol;

                }
            } break;
            case"ce":{
                ilkSayi=0.0;
                display.setText("0");
                yazdir.setText("");
                islemDurum="0";
            } break;



            case "=":{
                if(display.getText().toString()=="+"||display.getText().toString()=="-"||
                        display.getText().toString()=="×"||display.getText().toString()=="÷"){
                } else{
                    switch (islemDurum){
                        default:{
                            display.setText(ilkSayi.toString());
                        }
                        break;
                        case "+":{
                            ilkSayi=ilkSayi+Double.parseDouble(display.getText().toString());
                            display.setText(ilkSayi.toString());
                        }break;
                        case "-":{
                            ilkSayi=ilkSayi-Double.parseDouble(display.getText().toString());
                            display.setText(ilkSayi.toString());
                        }break;
                        case "×":{
                            ilkSayi=ilkSayi*Double.parseDouble(display.getText().toString());
                            display.setText(ilkSayi.toString());
                        }break;
                        case "÷":{
                            ilkSayi=ilkSayi/Double.parseDouble(display.getText().toString());
                            display.setText(ilkSayi.toString());
                        }break;
                        case "!":{
                            int toplam=1;
                            for(int i=1;i<=ilkSayi;i++){
                            Double.parseDouble(display.getText().toString());
                            display.setText(ilkSayi.toString());}
                        }
                    }
                }
                yazdir.setText(ilkSayi.toString());

            }break;
        }
    }
    private  void numara ( int sayi) {
        if (display.getText().toString() == "0") {
            display.setText("");
        } else if (
                display.getText().toString() == "+" ||
                        display.getText().toString() == "×" ||
                        display.getText().toString() == "÷" ||
                        display.getText().toString() == "-") {
            display.setText("");
        }
        display.setText(display.getText() + String.valueOf(sayi));
        yazdir.setText(String.valueOf(sayi));

    }

    public void MenuyeTiklama(View view){
        MainActivity.cekmeceAc(cekmece);
    }
    public void menukapa(View view){
        MainActivity.cekmeceKapat(cekmece);
        recreate();
    }
    public void StandartTiklama(View view){
        Intent standart = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(standart);
        finish();    }
    public void BilimselTiklama(View view){
       MainActivity.cekmeceKapat(cekmece);
       recreate();
    }
    public void ProgramlayiciTiklama(View view){
        Intent programlayici = new Intent(getApplicationContext(),ProgramlayiciActivity.class);
        startActivity(programlayici);
        finish();

    }
    public void TarihTiklama(View view){
        Intent tarih = new Intent(getApplicationContext(),TarihActivity.class);
        startActivity(tarih);
        finish();
    }
    public void ParaTiklama(View view){
        Intent para = new Intent(getApplicationContext(),ParaActivity.class);
        startActivity(para);
        finish();
    }
    public void HacimTiklama(View view){
        Intent hacim = new Intent(getApplicationContext(),HacimActivity.class);
        startActivity(hacim);
        finish();
    }
    public void UzunlukTiklama(View view){
        Intent uzunluk = new Intent(getApplicationContext(),UzunlukActivity.class);
        startActivity(uzunluk);
        finish();
    }
    public void KutleTiklama(View view){
        Intent agirlik = new Intent(getApplicationContext(),AgirlikActivity.class);
        startActivity(agirlik);
        finish();
    }
    public void SicaklikTiklama(View view){
        Intent sicaklik = new Intent(getApplicationContext(),SicaklikActivity.class);
        startActivity(sicaklik);
        finish();
    }
    public void EnerjiTiklama(View view){
        Intent enerji = new Intent(getApplicationContext(),EnerjiActivity.class);
        startActivity(enerji);
        finish();
    }
    public void AlanTiklama(View view){
        Intent alan = new Intent(getApplicationContext(),AlanActivity.class);
        startActivity(alan);
        finish();
    }
    public void HizTiklama(View view){
        Intent hiz = new Intent(getApplicationContext(),HizActivity.class);
        startActivity(hiz);
        finish();
    }
    public void ZamanTiklama(View view){
        Intent zaman = new Intent(getApplicationContext(),ZamanActivity.class);
        startActivity(zaman);
        finish();
    }
    public void GucTiklama(View view){
        Intent guc = new Intent(getApplicationContext(),GucActivity.class);
        startActivity(guc);
        finish();
    }
    public void VeriTiklama(View view){
        Intent veri = new Intent(getApplicationContext(),VeriActivity.class);
        startActivity(veri);
        finish();
    }
    public void BasincTiklama(View view){
        Intent basinc = new Intent(getApplicationContext(),BasincActivity.class);
        startActivity(basinc);
        finish();
    }
    public void AciTiklama(View view){
        Intent aci = new Intent(getApplicationContext(),AciActivity.class);
        startActivity(aci);
        finish();
    }
}