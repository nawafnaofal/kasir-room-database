package com.nawaf.tampilan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_pesan;
    private Button btn_history;
    private Button btn_perbarui;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        btn_pesan = (Button) findViewById(R.id.btn_pesan);
        btn_pesan.setOnClickListener(this);
        btn_history = (Button) findViewById(R.id.btn_history);
        btn_history.setOnClickListener(this);
        btn_perbarui = (Button) findViewById(R.id.btn_perbarui);
        btn_perbarui.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_pesan:
                Intent pemesanan = new Intent(this, Pemesanan.class);
                startActivity(pemesanan);
                break;
            case R.id.btn_history:
                Intent riwayatTransaksi = new Intent(this, RiwayatTransaksi.class);
                startActivity(riwayatTransaksi);
                break;
            case R.id.btn_perbarui:
                Intent ubahData = new Intent(this, Penyimpanan.class);
                startActivity(ubahData);
                break;

        }
    }
}
