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
import android.widget.Toast;

public class ParaActivity extends AppCompatActivity {
    DrawerLayout cekmece;
    String islem="";
    TextView display;
    private String[] para={"DOLAR","TL","EURO"};
    private String[] para0={"DOLAR","TL","EURO"};
    private Spinner spinnerPara;
    private Spinner spinnerPara0;
    private ArrayAdapter<String> dataAdapterForPara;
    private ArrayAdapter<String> dataAdapterForPara0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para);
        cekmece=findViewById(R.id.cekmece_arkaplan);
        display=findViewById(R.id.txtsayigiris);
        spinnerPara = (Spinner) findViewById(R.id.spnpara);
        spinnerPara0 = (Spinner) findViewById(R.id.spnpara0);
        dataAdapterForPara = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, para);
        dataAdapterForPara0 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,para0);
        dataAdapterForPara.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterForPara0.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPara.setAdapter(dataAdapterForPara);
        spinnerPara0.setAdapter(dataAdapterForPara0);
        spinnerPara.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if(parent.getSelectedItem().toString().equals(para[0]))
                    dataAdapterForPara = new ArrayAdapter<String>(ParaActivity.this, android.R.layout.simple_spinner_item,para);
                dataAdapterForPara.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerPara0.setAdapter(dataAdapterForPara);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinnerPara0.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                //Se??ilen il ve il??eyi ekranda g??steriyoruz.
                Toast.makeText(getBaseContext(), ""+spinnerPara.getSelectedItem().toString()+"n"+parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }
    public void onClickYazdir(View v) {
        Button btn=(Button) v ;
        islem+=btn.getText().toString();
        display.setText(islem);

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
        MainActivity.cekmeceKapat(cekmece);
        recreate();
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