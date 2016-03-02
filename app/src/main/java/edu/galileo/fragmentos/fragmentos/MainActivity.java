package edu.galileo.fragmentos.fragmentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    Button boton1;
    TextView texto1frav;
    TextView texto1frbv;
    String[] datos = {"Min 15C   25C Max 20Feb2016","Min 14C  23C Max 21Feb2016","Min 19C  26C Max 22Feb2016","Min 19C  27C Max 23Feb2016","Min 20C  27C Max 24Feb2016","Min 19C  26C Max 25Feb2016","Min 14C  24C Max 26Feb2016","Min 12C  20C Max 27Feb2016"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (Button)findViewById(R.id.boton1);
        boton1.setOnClickListener(this);

        texto1frav = (TextView) findViewById(R.id.text1fra);
        texto1frav.setText("Fragmento A");

        texto1frbv = (TextView)findViewById(R.id.text1frb);
        texto1frbv.setText("Fragmento B");


        recyclerView = (RecyclerView) findViewById(R.id.listfrb);
        adapter = new RecyclerAdapter(datos);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);









    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton1:
                Intent intent = new Intent(this,Main2Activity.class);
                startActivity(intent);
                break;
            default:
                break;

        }
    }
}
