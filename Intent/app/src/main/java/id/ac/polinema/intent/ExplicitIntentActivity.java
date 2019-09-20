package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
    }

    public void handleSubmit(View view) {
        EditText inputNama = findViewById(R.id.input_name);
        String nama = inputNama.getText().toString();

        TextView lihatNama = findViewById(R.id.text_output);
        lihatNama.setText("Hello " + nama + " Congratulations!");
//        lihatNama.setText(inputNama.getText().toString());
    }
}
