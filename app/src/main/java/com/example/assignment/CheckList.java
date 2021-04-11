package com.example.assignment;

import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class CheckList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScrollView sv = new ScrollView(this);
        final LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        sv.addView(ll);

        TextView tv = new TextView(this);
        tv.setText("Dynamic layout");
        ll.addView(tv);

        EditText et = new EditText(this);
        et.setText("Today's run");
        ll.addView(et);

        Button b = new Button(this);
        b.setText("Display children checklist and locations");
        ll.addView(b);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < 20; i++) {
                    CheckBox cb = new CheckBox(getApplicationContext());
                    cb.setText("dynamically add users..");
                    ll.addView(cb);
                }
            }
        });


        this.setContentView(sv);

    }
}