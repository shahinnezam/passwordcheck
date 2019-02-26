package edu.cascadia.mobile.apps.passwordcheck;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.cascadia.mobile.apps.passwordcheck.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private PasswordViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        mViewModel = new PasswordViewModel();
        ActivityMainBinding binding
                = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(mViewModel);

    }
}
