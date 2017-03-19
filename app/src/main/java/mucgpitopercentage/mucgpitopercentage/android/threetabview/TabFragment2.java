package mucgpitopercentage.mucgpitopercentage.android.threetabview;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.mucgpitopercentage.android.threetabview.R;

public class TabFragment2 extends Fragment {

    EditText cgpiedit,percentedit,percenttext;
    TextView cgpitext,formluaview,disclaim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View v = inflater.inflate(R.layout.tab_fragment_2, container, false);

        AdView mAdView = (AdView) v.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        cgpiedit=(EditText) v.findViewById(R.id.tab2_cgpi);
        cgpitext=(TextView) v.findViewById(R.id.tab2_cgpi1);
        percentedit=(EditText) v.findViewById(R.id.tab2_percent1);
        percenttext=(EditText) v.findViewById(R.id.tab2_percent);
        formluaview=(TextView) v.findViewById(R.id.formula);
       // disclaim=(TextView) v.findViewById(R.id.disclaimer);


        cgpiedit.addTextChangedListener(new TextWatcher(){

            public void afterTextChanged(Editable cgpiedit) {


            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String inputcgpi = ((EditText) v.findViewById(R.id.tab2_cgpi)).getText().toString();
                double inputOfcgpi=Double.parseDouble("0" + inputcgpi);
                if(inputOfcgpi>10) {
                    cgpiedit.setError("NOT MORE THAN 10");
                    percenttext.setText("0.0");
                }
                else if (inputOfcgpi<7) {
                    double output=7.1*inputOfcgpi+12;
                    percenttext.setText(String.format("%.2f", output));
                }else if (inputOfcgpi>=7){
                    double output = 7.4 * inputOfcgpi + 12;
                    percenttext.setText(String.format("%.2f", output));
                }
                if (inputOfcgpi==0.0){
                    double output=0;
                    percenttext.setText("" + output);
                }

            }
        });

        percentedit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String inputpercent = ((EditText) v.findViewById(R.id.tab2_percent1)).getText().toString();
                double inputOfpercent=Double.parseDouble("0" + inputpercent);
                if (inputOfpercent>86.00) {
                    percentedit.setError("86 %=CGPI 10");
                    cgpitext.setText("0.0");
                }
                else if (inputOfpercent<63.80) {
                    double output=(inputOfpercent-12)/7.1;
                    cgpitext.setText(String.format("%.2f", output));
                }else if (inputOfpercent>=63.80){
                    double output = (inputOfpercent-12)/7.4;
                    cgpitext.setText(String.format("%.2f", output));
                }
                if (inputOfpercent==0){
                    double output=0;
                    cgpitext.setText("" + output);
                }


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

                // you can call or do what you want with your EditText here


            return v;
    }
}
