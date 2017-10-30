package com.example.admin.edamamapiapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @BindView(R.id.tvQuery)
    EditText tvQuery;
    @BindView(R.id.btnSearch)
    Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvQuery.setText( "chicken" );
    }

    public void buttonPressed(View view) {
        String q = tvQuery.getText().toString();

        if( !q.isEmpty() ) {
            Intent intent = new Intent(this, GridActivity.class);
            intent.putExtra(getString(R.string.intent_query_key), tvQuery.getText().toString());
            startActivity(intent);
        }
    }
}