package it.saimao.sharedpreference;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import it.saimao.sharedpreference.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initUi();
    }

    private void initUi() {
        binding.btGo.setOnClickListener(v -> {
            String value = binding.etValue.getText().toString();
            if (!value.isEmpty()) {
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("key", value);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(this, "Please include some text before going to main", Toast.LENGTH_SHORT).show();
            }
        });
    }
}