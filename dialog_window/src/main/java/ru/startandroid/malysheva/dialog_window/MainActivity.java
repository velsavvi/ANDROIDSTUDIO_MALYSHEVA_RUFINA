package ru.startandroid.malysheva.dialog_window;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private Button bgButton;
    public RelativeLayout relativeLayout;
    Context context;

    bgButton = (Button)findViewByld(R.id.background_button);
    relativeLayout = (RelativeLayout)findViewByld(R.id.relativelayout);
    context = MainActivity.this;

    bgButton.setOnClickListener(this);
    AlertDialog.Bulder builder - new AlertDialog.Builder(this);
    builder.setTitle(R.string.message);
    AlertDialog alertDialog = builder.create();
    alertDialog.show();

    final CharSequence[] items = {getText(R.string.red),
            getText(R.string.yellow), getText(R.string.green)
    };
builder.setItems(items, new DialogInterface.OnClickListener){
    }

