package sg.edu.np.madapplication.madapplication.madpractical.s10203319;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ListActivity extends AppCompatActivity {

    private ImageView clickActivity;

    public void rdr(){
        Intent redirect = new Intent(ListActivity.this, MainActivity.class);
        redirect.putExtra("Key", "Value");
        startActivity(redirect);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        this.clickActivity = findViewById(R.id.vlivkImage);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Profile");
        builder.setMessage("MADness");
        builder.setCancelable(true);
        builder.setNegativeButton("CANCEL",null);
        builder.setPositiveButton("VIEW", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id){
                rdr();
            }
        });


        this.clickActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                AlertDialog alert = builder.create();
                alert.show();


            }
        });
    }
}