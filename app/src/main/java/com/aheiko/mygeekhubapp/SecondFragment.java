package com.aheiko.mygeekhubapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.aheiko.mygeekhubapp.R;

/**
 * Created by andrey
 * on 13.10.2015
 */
public class SecondFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final TextView tvFib = (TextView) view.findViewById(R.id.textView2);
        final TextView tvFact = (TextView) view.findViewById(R.id.textView3);
        final EditText editFib = (EditText) view.findViewById(R.id.editText);
        final EditText editFact = (EditText) view.findViewById(R.id.editText2);
        final Button btnFib = (Button) view.findViewById(R.id.button);
        final Button btnFact = (Button) view.findViewById(R.id.button2);
        btnFib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvFib.setText(String.valueOf(fibonacci(Integer.parseInt(editFib.getText().toString()))));
            }
        });
        btnFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvFact.setText(String.valueOf(factorial(Integer.parseInt(editFact.getText().toString()))));
            }
        });
    }

    public static long factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n-1);
    }

    public static long fibonacci(int n){
            if (n == 1) return 1;
            if (n == 2) return 1;
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
