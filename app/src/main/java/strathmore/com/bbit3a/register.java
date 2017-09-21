package strathmore.com.bbit3a;

import android.content.Intent;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnregister= (Button) findViewById(R.id.button);
        final EditText txtFname= (EditText)findViewById(R.id.firstname);
        final EditText txtLname= (EditText)findViewById(R.id.lastname);
        final EditText txtPhone= (EditText)findViewById(R.id.phone);
        final EditText txtEmail= (EditText)findViewById(R.id.email);
        final EditText txtPassword= (EditText)findViewById(R.id.password);

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fnamevalue = txtFname.getText().toString();
                String Lnamevalue = txtLname.getText().toString();
                String phonevalue = txtPhone.getText().toString();
                String emailvalue = txtEmail.getText().toString();
                String passwordvalue = txtPassword.getText().toString();

                Intent homeintent = new Intent(register.this, home.class);
                startActivity(homeintent);
            }
        });
    }
    }
