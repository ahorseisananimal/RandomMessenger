package com.fuagra.randommessenger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by home on 24-Feb-17.
 */
public class LetterFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.new_letter_f, container, false);

    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.send_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = ((EditText) view.findViewById(R.id.new_letter_et)).getText().toString();
                Toast.makeText( getContext(), text, Toast.LENGTH_SHORT).show();
                ApiClient.getInstance().newLetter(text);
            }
        });
    }

    public static Fragment newInstance() {
        return new LetterFragment();
    }
}