package com.example.m_chick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import com.example.m_chick.R;

public class symptoms extends AppCompatActivity {
    TextView display;
    Button diagonize;
    ArrayList<String> selection = new ArrayList<String>();
    WebView webView;
    private String GoogleAPI = "AIzaSyDn9sTIpoBxPx5cGhp0X7Tyk0kPBz8Fvys";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        diagonize = (Button) findViewById(R.id.diagonize);
        display = (TextView) findViewById(R.id.display);

        if (getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    public void SelectSymptoms(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.Palebeak:
                if(checked){
                    selection.add("Pale beak");
                    display.setText("Disease: Coccidiosis \n \n Causes: caused by coccidian,  usually occurs at 8 to 10 weeks of age\n" +
                            "and normally expresses itself in acute and chronic forms \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter  ");
                } else {
                    selection.remove("Pale beak");
                }
                break;

            case R.id.bloodyd:
                if(checked){
                    selection.add("Bloody droppings");
                    display.setText("Disease: Coccidiosis \n \n Causes: caused by coccidian,  usually occurs at 8 to 10 weeks of age\n" +
                            "and normally expresses itself in acute and chronic forms \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter  ");
                } else {
                    selection.remove("Bloody droppings");
                }
                break;
            case R.id.ygdiarrhoea:
                if(checked){
                    selection.add("Yellowish/Greenish diarrhoea");
                    display.setText("Disease: Fowl Cholera \n \n Causes: caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
                } else {
                    selection.remove("Yellowish/Greenish diarrhoea");
                }
                break;


            case R.id.sleepy:
                if(checked){
                    selection.add("Sleepy");
                    display.setText( "Disease: Fowl Cholera \n \n Causes: caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
                } else {
                    selection.remove("Sleepy");
                }
                break;

            case R.id.coughing:
                if(checked){
                    selection.add("Coughing and Sneezing");
                    display.setText( "Disease: New Castle \n \n Causes: virus that infects respiratory and nervous system  \n \n Control: Vaccinate chicks at 3 to 4 weeks of age. Repeat at 16 weeks of age and at the 24th week. ");
                } else {
                    selection.remove("Coughing and Sneezing");
                }
                break;

            case R.id.feathers:
                if(checked){
                    selection.add("Ruffled feathers");
                    display.setText( "Disease: Fowl Typhoid \n \n Causes: caused by microorganism called salomonella gallinarum or shigella gallinarum  \n \n Control: Vaccinate the birds at 7 weeks of age, Destroy all dead birds by burning, House should be thoroughly cleaned and disinfectedDo not allow visitors to enter into the poultry unit without being disinfected  ");
                } else {
                    selection.remove("Ruffled feathers");
                }
                break;

            case R.id.drowsyruffle:
                if(checked){
                    selection.add("Drowsy and Ruffle");
                    display.setText( "Disease: Pullurum \n \n Causes: caused by a microorganism called Salomonella Pullurum  \n \n Control: Destroy all confirmed carriers of the disease,Clean and disinfect all the premises and incubators, Get chicks from hatcheries with good disease control programme  ");
                } else {
                    selection.remove("Drowsy and Ruffle");
                }
                break;

            case R.id.lesions:
                if(checked){
                    selection.add("Pox lesions on face");
                    display.setText( "Disease: Fowl Pox \n \n Causes: highly infectious skin disease  \n \n Control: Provide footbath with disinfectant, Limit visitors to the unit, Workers should move from young to old flock in the units,Clean and disinfect the house and equipments ");
                } else {
                    selection.remove("Pox lesions on face");
                }
                break;

            case R.id.feverishsleepy:
                if(checked){
                    selection.add("Feverish and Sleepy");
                    display.setText( "Disease: Fowl Cholera \n \n Causes: caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
                } else {
                    selection.remove("Feverish and Sleepy");
                }
                break;
            case R.id.droopy:
                if(checked){
                    selection.add("Droopy");
                    display.setText("Disease: Coccidiosis \n \n Causes: caused by coccidian,  usually occurs at 8 to 10 weeks of age\n" +
                            "and normally expresses itself in acute and chronic forms \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter  ");
                } else {
                    selection.remove("Droopy");
                }
                break;
        }
    }

    public void symptomsaction(View view) {
        String final_symptoms = "";

        if(selection.contains("Pale beak"))
        {
            display.setText("Disease: Coccidiosis \n \n Causes: caused by coccidian,  usually occurs at 8 to 10 weeks of age\n" +
                    "and normally expresses itself in acute and chronic forms \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter  ");
        }
        if(selection.contains("Bloody droppings"))
        {
            display.setText("Disease: Coccidiosis \n \n Causes: caused by coccidian,  usually occurs at 8 to 10 weeks of age\n" +
                    "and normally expresses itself in acute and chronic forms \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter  ");
        }
        if(selection.contains("Yellowish/Greenish diarrhoea"))
        {
            display.setText("Disease: Fowl Cholera \n \n Causes: caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
        }
        if(selection.contains("Sleepy"))
        {
            display.setText( "Disease: Fowl Cholera \n \n Causes: caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
        }
        if(selection.contains("Coughing and Sneezing"))
        {
            display.setText( "Disease: New Castle \n \n Causes: virus that infects respiratory and nervous system  \n \n Control: Vaccinate chicks at 3 to 4 weeks of age. Repeat at 16 weeks of age and at the 24th week. ");
        }
        if(selection.contains("Ruffled feathers"))
        {
            display.setText( "Disease: Fowl Typhoid \n \n Causes: caused by microorganism called salomonella gallinarum or shigella gallinarum  \n \n Control: Vaccinate the birds at 7 weeks of age, Destroy all dead birds by burning, House should be thoroughly cleaned and disinfectedDo not allow visitors to enter into the poultry unit without being disinfected  ");
        }
        if(selection.contains("Drowsy and Ruffle"))
        {
            display.setText( "Disease: Pullurum \n \n Causes: caused by a microorganism called Salomonella Pullurum  \n \n Control: Destroy all confirmed carriers of the disease,Clean and disinfect all the premises and incubators, Get chicks from hatcheries with good disease control programme  ");
        }
        if(selection.contains("Pox lesions on face"))
        {
            display.setText( "Disease: Fowl Pox \n \n Causes: highly infectious skin disease  \n \n Control: Provide footbath with disinfectant, Limit visitors to the unit, Workers should move from young to old flock in the units,Clean and disinfect the house and equipments ");
        }
        if(selection.contains("Feverish and Sleepy"))
        {
            display.setText( "Disease: Fowl Cholera \n \n Causes: caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
        }
        if(selection.contains("Droopy"))
        {
            display.setText("Disease: Coccidiosis \n \n Causes: caused by coccidian,  usually occurs at 8 to 10 weeks of age\n" +
                    "and normally expresses itself in acute and chronic forms \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter  ");
        }

        if(selection.contains("Ruffled feathers") && selection.contains("Pale beak"))
        {
            display.setText("Disease: Coccidiosis \n \n Causes: caused by coccidian,  usually occurs at 8 to 10 weeks of age\n" +
                    "and normally expresses itself in acute and chronic forms \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter  ");
        }


        if(selection.contains("Droopy") && selection.contains("Pale beak") && selection.contains("Ruffled feathers"))
            {
                display.setText("Disease: Coccidiosis \n \n Causes: caused by coccidian,  usually occurs at 8 to 10 weeks of age\n" +
                        "and normally expresses itself in acute and chronic forms \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter  ");
            }
        if(selection.contains("Droopy") && selection.contains("Feverish and Sleepy"))
        {
            display.setText( "Disease: Fowl Cholera \n \n Causes: caused by pasteurella avicida microorganism  \n \n Control: Use of sulphur drugs, use of coccidiostat in feed, ensuring dry litter,Birds with acute type should be destroyed and burned,House should be thoroughly cleaned and disinfected  ");
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()== android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);
    }
}