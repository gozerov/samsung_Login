package ru.gozerov.login;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ru.gozerov.login.databinding.ActivitySuccessLoginBinding;

public class SuccessLoginActivity extends AppCompatActivity {

    private ActivitySuccessLoginBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySuccessLoginBinding.inflate(getLayoutInflater());
        Person person = (Person) getIntent().getSerializableExtra(MainActivity.KEY);
        binding.txtName.setText("Name: " + person.getName());
        binding.txtSurname.setText("Surname: " + person.getSurname());

        setContentView(binding.getRoot());
    }
}
