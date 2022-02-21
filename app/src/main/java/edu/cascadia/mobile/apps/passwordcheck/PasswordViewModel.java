package edu.cascadia.mobile.apps.passwordcheck;
// Adapted from https://www.bignerdranch.com/blog/two-way-data-binding-on-android-observing-your-view-with-xml/
import androidx.databinding.BaseObservable;

import androidx.databinding.Bindable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PasswordViewModel extends ViewModel {
    private MutableLiveData<String> password;
    private LiveData<String> passwordQuality;

    public PasswordViewModel(MutableLiveData<String> password, LiveData<String> passwordQuality) {
        this.password = password;
        this.passwordQuality = passwordQuality;
    }


    public MutableLiveData<String> getPassword() {
        return password;
    }
    public void setPassword(MutableLiveData<String> password) {
        if (this.password != password) {
            this.password = password;
            notifyPropertyChanged(passwordQuality);
            notifyPropertyChanged(password);
        }
    }
        public LiveData<String> getPasswordQuality () {
            if (password == null || password.isEmpty()) {
                return "Enter a password";
            } else if (password.equals("password")) {
                return "Very bad";
            } else if (password.length() < 6) {
                return "Short";
            } else {
                return "Okay";
            }
        }
    }
