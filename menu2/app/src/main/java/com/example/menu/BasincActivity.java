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

public class BasincActivity extends AppCompatActivity {
    DrawerLayout cekmece;
    TextView display;
    String islem="";
    private String[] basinc={"Atmosfer","Bar","Kilopaskal","Pascal"};
    private String[] basinc0={"Atmosfer","Bar","Kilopaskal","Pascal"};
    private Spinner spinnerBasinc;
    private Spinner spinnerBasinc0;
    private ArrayAdapter<String> dataAdapterForBasinc;
    private ArrayAdapter<String> dataAdapterForBasinc0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basinc);
        cekmece=findViewById(R.id.cekmece_arkaplan);
        display=findViewById(R.id.txtsayigiris);
        spinnerBasinc = (Spinner) findViewById(R.id.spnbasinc);
        spinnerBasinc0 = (Spinner) findViewById(R.id.spnbasinc0);
        dataAdapterForBasinc = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, basinc);
        dataAdapterForBasinc0 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,basinc0);
        dataAdapterForBasinc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterForBasinc0.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerBasinc.setAdapter(dataAdapterForBasinc);
        spinnerBasinc0.setAdapter(dataAdapterForBasinc0);
        spinnerBasinc.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if(parent.getSelectedItem().toString().equals(basinc[0]))
                    dataAdapterForBasinc = new ArrayAdapter<String>(BasincActivity.this, android.R.layout.simple_spinner_item,basinc);
                dataAdapterForBasinc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerBasinc0.setAdapter(dataAdapterForBasinc);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinnerBasinc0.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Toast.makeText(getBaseContext(), ""+spinnerBasinc.getSelectedItem().toString()+"n"+parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }
    public void onClickYazdir(View v)
    {
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
        MainActivity.cekmeceKapat(cekmece);
        recreate();
    }
    public void AciTiklama(View view){
        Intent aci = new Intent(getApplicationContext(),AciActivity.class);
        startActivity(aci);
        finish();
    }
}