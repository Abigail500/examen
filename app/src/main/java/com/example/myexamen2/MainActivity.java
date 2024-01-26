package com.example.myexamen2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    private AlertDialog dialog;
    private AlertDialog.Builder builder;
    @BindView(R.id.txtPrimero) EditText txtPrimero;
    @BindView(R.id.txtSegundo) EditText txtSegundo;
    @BindView(R.id.txtViewPromedio)
    TextView txtPromedio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        builder = new AlertDialog.Builder(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
    @OnClick(R.id.bnCalcular)
    void submit() {

        String value1=txtPrimero.getText().toString();
        String value2=txtSegundo.getText().toString();
        txtPromedio.setText(""+calcularPromedio(Double.parseDouble(value1), Double.parseDouble(value2)));
        /**
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.dialog_confirmation, null);
        TextView titulo=view.findViewById(R.id.txtTitulo);
        TextView descripcion=view.findViewById(R.id.txtDescripcion);
        titulo.setText("MENSAJE");
        descripcion.setText( "TU PROMEDIO ES: "+ calcularPromedio(Double.parseDouble(value1), Double.parseDouble(value2)));
        ImageButton bnSalir=view.findViewById(R.id.bnSalir);
        bnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        builder.setCancelable(false); //configuramos para que no pueda quitar
        builder.setView(view); //agregamos el dialogo
        dialog = builder.create();
        dialog.show();
    **/
    }

    public static double calcularPromedio(double a, double b) {
        return (a + b) / 2.0;
    }

}