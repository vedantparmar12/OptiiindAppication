package com.example.optimind;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.optimind.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private lateinit var binding: ActivityMainBinding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(LayoutInflater);
        setContentView(binding.root);
        replaceFragment(Home());
        binding.bottomNavigationView.setOnItemSelectedlistener{
            when(it.itemId){
                R.id.home -> ReplaceFragment(Home());
                R.id.setting -> ReplaceFragment(Setting());
                R.id.quiz -> ReplaceFragment(Quiz());

                else ->{

                }
            )
            true
        }
    }
    private fun replacefragment(fragment : fragment){
        val fragmentManager = getSupportFragmentManager();
        val fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}
