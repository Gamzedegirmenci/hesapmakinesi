package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout cekmece;
    DrawerLayout cekmecehistory;
    TextView display;
    Double ilkSayi;
    String islemDurum;
    Button btntopla,btncikar,btnbol,btncarp,btnesit,btnkesir,btnplusminus,btnus,btnkok,btnyuzde,btnvirgul,btnce;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,btnc,bsil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        bsil=findViewById(R.id.bdelete);
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
        btnyuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {semboller("%"); }});
        btnvirgul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                semboller(",");
            }
        });
        btnus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String adana = (String) display.getText();
                display.setText(String.valueOf(Math.pow( Integer.parseInt(adana), 2)));

            }
        });
        btnkok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String deger = (String) display.getText();
                display.setText(String.valueOf(Math.sqrt( Integer.parseInt(deger))));
            }
        });
        btnkesir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        bsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

    }
    private void semboller(String sembol) {

        switch (sembol) {
            default: {
                if (display.getText().toString() == "+" || display.getText().toString() == "-" ||
                        display.getText().toString() == "×" || display.getText().toString() == "÷"
                        || display.getText().toString() == "%" ) {

                    if (islemDurum == "×" || islemDurum == "÷")
                        ilkSayi = -1 * ilkSayi;
                    display.setText(sembol);
                    islemDurum = sembol;


                } else {
                    ilkSayi = Double.parseDouble(display.getText().toString());
                    display.setText(sembol);
                    islemDurum = sembol;

                }
            }
            break;
            case "ce": {
                ilkSayi = 0.0;
                display.setText("0");
                islemDurum = "0";
            }
            break;
            case "=": {
                    if (display.getText().toString() == "+" || display.getText().toString() == "-" ||
                            display.getText().toString() == "×" || display.getText().toString() == "÷"
                            || display.getText().toString() == "%" || display.getText().toString() == "sqr") {
                    } else {
                        switch (islemDurum) {
                            default: {
                                display.setText(ilkSayi.toString());
                            }
                            break;
                            case "+": {
                                ilkSayi = ilkSayi + Double.parseDouble(display.getText().toString());
                                display.setText(ilkSayi.toString());

                            }

                            break;
                            case "-": {
                                ilkSayi = ilkSayi - Double.parseDouble(display.getText().toString());
                                display.setText(ilkSayi.toString());
                            }
                            break;
                            case "×": {
                                ilkSayi = ilkSayi * Double.parseDouble(display.getText().toString());
                                display.setText(ilkSayi.toString());
                            }
                            break;
                            case "÷": {
                                ilkSayi = ilkSayi / Double.parseDouble(display.getText().toString());
                                display.setText(ilkSayi.toString());
                            }
                            break;
                            case "%": {
                                ilkSayi = (ilkSayi * ilkSayi) / 100;
                                Double.parseDouble(display.getText().toString());
                                display.setText(ilkSayi.toString());
                            }
                            break;

                        }

                        break;
                    }
                }


        }

        }
    private  void numara (int sayi) {
        if (display.getText().toString() == "0") {
            display.setText("");
        } else if (
                display.getText().toString() == "+" ||
                        display.getText().toString() == "×" ||
                        display.getText().toString() == "÷" ||
                        display.getText().toString() == "-" ||
                        display.getText().toString()=="%"   ||
        display.getText().toString()==","
        ){
            display.setText("");
        }
        display.setText(display.getText() + String.valueOf(sayi));
    }
    public void MenuTik(View view){}
    public  static void GecmisTiklama(DrawerLayout cekmecehistory){cekmecehistory.openDrawer(GravityCompat.START);}
    public void MenuyeTiklama(View view){ cekmeceAc(cekmece); }
    public static void cekmeceAc(DrawerLayout cekmece) { cekmece.openDrawer(GravityCompat.START); }
    public static void cekmeceKapat(DrawerLayout cekmece){
        if(cekmece.isDrawerOpen(GravityCompat.START)){
            cekmece.closeDrawer(GravityCompat.START);
        }
    }
    public void StandartTiklama(View view){
        cekmeceKapat(cekmece);
        recreate();
    }
    public void menukapa(View view){
        MainActivity.cekmeceKapat(cekmece);
        recreate();
    }
    public void BilimselTiklama(View view){

        Intent bilimsel = new Intent(getApplicationContext(),BilimselActivity.class);
        startActivity(bilimsel);
        finish();
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
    public void AciTiklama(View view) {
        Intent aci = new Intent(getApplicationContext(), AciActivity.class);
        startActivity(aci);
        finish();
    }

}