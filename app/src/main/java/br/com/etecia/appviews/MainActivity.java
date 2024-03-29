package br.com.etecia.appviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   EditText txtNum1, txtNum2;
   Button btnSomar;
   TextView lblResposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = (EditText)findViewById(R.id.txtNum1);
        txtNum2 = (EditText)findViewById(R.id.txtNum2);
        lblResposta = (TextView)findViewById(R.id.lblresultado);

        btnSomar = (Button)findViewById(R.id.btnsomar);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resp = 0;

                String txtN1 = txtNum1.getText().toString();
                String txtN2 = txtNum2.getText().toString();

                resp = Double.parseDouble(txtN1)+Double.parseDouble(txtN2);

                lblResposta.setText(String.valueOf(resp));
            }
        });

    }
}
