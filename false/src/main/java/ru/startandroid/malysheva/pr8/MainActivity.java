package ru.startandroid.malysheva.pr8;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bgButton;
    public RelativeLayout relativeLayout;
    MainActivity context = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bgButton = (Button)findViewById(R.id.background_button);
        bgButton.setOnClickListener(this);
        relativeLayout = (RelativeLayout)findViewById(R.id.relativelayout);
    }

    @Override
    public void onClick(View v) {

    }

    final CharSequence[] items = {getText(R.string.redColor) , getText(R.string.yellowColor) ,getText(R.string.greenColor)

        };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);
        builder.setItems(items, new DialogInterface.OnClickListener()

    {
        public void onClick (DialogInterface dialod,int item){
        switch (item) {
            case 0: {
                relativeLayout.setBackgroundResource(R.color.redColor);
                Toast.makeText(context, R.string.redColor, Toast.LENGTH_LONG).show();

                break;
            }
            case 1: {
                relativeLayout.setBackgroundResource(R.color.yellowColor);
                Toast.makeText(context, R.string.yellowColor, Toast.LENGTH_LONG).show();

                break;
            }
            case 2: {
                relativeLayout.setBackgroundResource(R.color.greenColor);
                Toast.makeText(context, R.string.greenColor, Toast.LENGTH_LONG).show();

                break;
            }
        }
    });
    AlertDialog alert = builder.create();
    alert.show();
    }

}