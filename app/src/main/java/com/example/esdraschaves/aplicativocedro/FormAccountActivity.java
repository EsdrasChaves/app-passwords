package com.example.esdraschaves.aplicativocedro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.esdraschaves.aplicativocedro.DAO.AccountDAO;
import com.example.esdraschaves.aplicativocedro.Helper.FormHelper;
import com.example.esdraschaves.aplicativocedro.Model.Account;

public class FormAccountActivity extends AppCompatActivity {

    Button buttonDone;
    FormHelper helper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_account);

        helper = new FormHelper(this);

    }

    public void finishedForm(View view) {

        Account account = helper.getAccount();

        AccountDAO dao = new AccountDAO(FormAccountActivity.this);

        dao.register(account);

        dao.close();

        finish();
    }
}
