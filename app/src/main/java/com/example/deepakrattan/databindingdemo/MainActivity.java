package com.example.deepakrattan.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.deepakrattan.databindingdemo.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        /*To bind the data in UI, you need to inflate the binding layout
        first using the generated binding classes.
        ActivityMainBinding inflates the layout first and binding.setUser()
        binds the User object to layout.*/

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Deepak", "mca.deepakrattan@gmail.com");
        binding.setUser(user);
    }
}
