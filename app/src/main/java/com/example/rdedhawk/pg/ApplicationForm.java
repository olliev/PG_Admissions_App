package com.example.rdedhawk.pg;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.EditText;
import android.content.Intent;
import android.app.Activity;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RadioGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;import java.util.*;


public class ApplicationForm extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_form);

        EditText gate;
        gate= (EditText) findViewById(R.id.gate_sc);
        gate.setVisibility(View.GONE);

        RelativeLayout rlmtech;
        rlmtech= (RelativeLayout) findViewById(R.id.mtechrl);
        rlmtech.setVisibility(View.GONE);

        RelativeLayout rlphd;
        rlphd= (RelativeLayout) findViewById(R.id.phdrl);
        rlphd.setVisibility(View.GONE);

        RadioGroup groupRadio=(RadioGroup)findViewById(R.id.radioGroup);
        groupRadio.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                EditText gate;
                gate = (EditText) findViewById(R.id.gate_sc);
                gate.setVisibility(View.GONE);
                if (checkedId == R.id.radioButton) {
                    gate.setVisibility(View.VISIBLE);
                } else if (checkedId == R.id.radioButton2) {
                    gate.setVisibility(View.GONE);
                }
            }
        });

        RadioGroup branchrg=(RadioGroup)findViewById(R.id.branchrg);
        branchrg.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RelativeLayout rlmtech;
                rlmtech= (RelativeLayout) findViewById(R.id.mtechrl);
                rlmtech.setVisibility(View.GONE);

                RelativeLayout rlphd;
                rlphd= (RelativeLayout) findViewById(R.id.phdrl);
                rlphd.setVisibility(View.GONE);

                RadioGroup rgmtech;
                rgmtech = (RadioGroup) findViewById(R.id.mtechrg);

                RadioGroup rgphd;
                rgphd = (RadioGroup) findViewById(R.id.phdrg);

                if (checkedId == R.id.radioButton5) {
                    rlmtech.setVisibility(View.VISIBLE);
                    rgphd.clearCheck();

                } else if (checkedId == R.id.radioButton6) {
                    rlphd.setVisibility(View.VISIBLE);
                    rgmtech.clearCheck();
                }
            }
        });

    }

}
