package ru.gozerov.login;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import ru.gozerov.login.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    public static final String KEY = "KEY";

    private final ActivityResultLauncher<Person> activityResultContract = registerForActivityResult(
            new SuccessLoginContract(),
            result -> {}
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityResultContract.launch(
                    new Person(
                        binding.loginEditText.getText().toString(),
                        binding.passwordEditText.getText().toString()
                    )
                );
            }
        });
    }
}