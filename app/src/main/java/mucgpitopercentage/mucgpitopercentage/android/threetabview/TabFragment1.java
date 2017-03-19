package mucgpitopercentage.mucgpitopercentage.android.threetabview;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mucgpitopercentage.android.threetabview.R;

public class TabFragment1 extends Fragment {
    EditText sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
    TextView cgpi,percentage,messege;
    Button calculate;
    double inputOfSem[]=new double[8];
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.tab_fragment_1, container, false);

        //i added
        sem1=(EditText) v.findViewById(R.id.sem1Edit);
        sem2=(EditText) v.findViewById(R.id.sem2Edit);
        sem3=(EditText) v.findViewById(R.id.sem3Edit);
        sem4=(EditText) v.findViewById(R.id.sem4Edit);
        sem5=(EditText) v.findViewById(R.id.sem5Edit);
        sem6=(EditText) v.findViewById(R.id.sem6Edit);
        sem7=(EditText) v.findViewById(R.id.sem7Edit);
        sem8=(EditText) v.findViewById(R.id.sem8Edit);
        cgpi=(TextView) v.findViewById(R.id.textView12);
        messege=(TextView) v.findViewById(R.id.msg);
        calculate=(Button) v.findViewById(R.id.calculate);
        percentage=(TextView) v.findViewById(R.id.textView13);

        sem1.addTextChangedListener(new TextWatcher(){

            public void afterTextChanged(Editable sem1) {}

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String num1 = ((EditText) v.findViewById(R.id.sem1Edit)).getText().toString();
                inputOfSem[0]=Double.parseDouble("0" + num1);
                if (inputOfSem[0] > 10.0)
                    sem1.setError("NOT MORE THAN 10");
            }
        });
        sem2.addTextChangedListener(new TextWatcher(){

            public void afterTextChanged(Editable sem2) {}

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String num2 = ((EditText) v.findViewById(R.id.sem2Edit)).getText().toString();
                inputOfSem[1]=Double.parseDouble("0" + num2);
                if (inputOfSem[1] > 10.0)
                    sem2.setError("NOT MORE THAN 10");
            }
        });

        sem3.addTextChangedListener(new TextWatcher(){

            public void afterTextChanged(Editable sem3) {}

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String num3 = ((EditText) v.findViewById(R.id.sem3Edit)).getText().toString();
                inputOfSem[2]=Double.parseDouble("0" + num3);
                if (inputOfSem[2] > 10.0)
                    sem3.setError("NOT MORE THAN 10");
            }
        });

        sem4.addTextChangedListener(new TextWatcher(){

            public void afterTextChanged(Editable sem4) {}

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String num4 = ((EditText) v.findViewById(R.id.sem4Edit)).getText().toString();
                inputOfSem[3]=Double.parseDouble("0" + num4);
                if (inputOfSem[3] > 10.0)
                    sem4.setError("NOT MORE THAN 10");
            }
        });

        sem5.addTextChangedListener(new TextWatcher(){
            public void afterTextChanged(Editable sem5) {}
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String num5 = ((EditText) v.findViewById(R.id.sem5Edit)).getText().toString();
                inputOfSem[4]=Double.parseDouble("0" + num5);
                if (inputOfSem[4] > 10.0)
                    sem5.setError("NOT MORE THAN 10");
            }
        });

        sem6.addTextChangedListener(new TextWatcher(){
            public void afterTextChanged(Editable sem6) {}
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String num6 = ((EditText) v.findViewById(R.id.sem6Edit)).getText().toString();
                inputOfSem[5]=Double.parseDouble("0" + num6);
                if (inputOfSem[5] > 10.0)
                    sem6.setError("NOT MORE THAN 10");

            }
        });

        sem7.addTextChangedListener(new TextWatcher(){
            public void afterTextChanged(Editable sem7) {}

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String num7 = ((EditText) v.findViewById(R.id.sem7Edit)).getText().toString();
                inputOfSem[6]=Double.parseDouble("0" + num7);
                if (inputOfSem[6] > 10.0)
                    sem7.setError("NOT MORE THAN 10");

            }
        });
        sem8.addTextChangedListener(new TextWatcher(){
            public void afterTextChanged(Editable sem8) {}
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String num8 = ((EditText) v.findViewById(R.id.sem8Edit)).getText().toString();
                inputOfSem[7]=Double.parseDouble("0" + num8);
                if (inputOfSem[7] > 10.0)
                    sem8.setError("NOT MORE THAN 10");
            }
        });

        calculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int count = 0;
                for (int i = 0; i < 8; i++) {
                    if (inputOfSem[i] > 0)
                        count++;
                }

                if (inputOfSem[0] > 10.0)
                    sem1.setError("NOT MORE THAN 10");
                else if (inputOfSem[1] > 10.0)
                    sem2.setError("NOT MORE THAN 10");
                else if (inputOfSem[2] > 10.0)
                    sem3.setError("NOT MORE THAN 10");
                else if (inputOfSem[3] > 10.0)
                    sem4.setError("NOT MORE THAN 10");
                else if (inputOfSem[4] > 10.0)
                    sem5.setError("NOT MORE THAN 10");
                else if (inputOfSem[5] > 10.0)
                    sem6.setError("NOT MORE THAN 10");
                else if (inputOfSem[6] > 10.0)
                    sem7.setError("NOT MORE THAN 10");
                else if (inputOfSem[7] > 10.0)
                    sem8.setError("NOT MORE THAN 10");
                else {
                    double avgOfCgpi = (inputOfSem[0] + inputOfSem[1] + inputOfSem[2] + inputOfSem[3] + inputOfSem[4] + inputOfSem[5] + inputOfSem[6] + inputOfSem[7]);
                    if (avgOfCgpi == 0.0) {
                        messege.setText("Please ENTER Something!");
                        messege.setBackgroundColor(Color.parseColor("#D50000"));
                    } else {
                        //avg calculation
                        double resultOfCgpi = (inputOfSem[0] + inputOfSem[1] + inputOfSem[2] + inputOfSem[3] + inputOfSem[4] + inputOfSem[5] + inputOfSem[6] + inputOfSem[7]) / count;
                        //DecimalFormat result = new DecimalFormat("##.00");
                        cgpi.setText(String.format("%.2f", resultOfCgpi));
                        messege.setText("0" + count);
                        messege.setBackgroundColor(Color.parseColor("#D50000"));
                        //university formula
                        if (resultOfCgpi >= 7) {
                            double resultOfpercent = (7.4 * resultOfCgpi + 12);
                            percentage.setText(String.format("%.2f", resultOfpercent));
                            messege.setText("YOU ARE DOING GREAT!");
                            messege.setBackgroundColor(Color.parseColor("#4CAF50"));
                        } else {
                            double resultofpercent = (7.1 * resultOfCgpi + 12);
                            percentage.setText(String.format("%.2f", resultofpercent));
                            messege.setText("NEED LIL BIT OF HARD WORK");
                            messege.setTextColor(Color.parseColor("#000000"));
                            messege.setBackgroundColor(Color.parseColor("#FFEB3B"));
                        }
                    }
                }

            }

        });

        Button reset = (Button) v.findViewById(R.id.clear);
        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sem1.setText(null);
                sem2.setText(null);
                sem3.setText(null);
                sem4.setText(null);
                sem5.setText(null);
                sem6.setText(null);
                sem7.setText(null);
                sem8.setText(null);
                cgpi.setText("0");
                percentage.setText("0%");
                messege.setText("I AM READY TO CALCULATE.");
                messege.setBackgroundColor(Color.parseColor("#FF9800"));
            }
        });

        return v;
    }
}
