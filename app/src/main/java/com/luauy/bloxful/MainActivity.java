package com.luauy.bloxful;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean isLoginState = false; 
    private Button btnHeaderAction;
    private Button btnSubmit;
    private EditText inputUsername;
    private EditText inputPassword;
    private TextView txtGuestSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHeaderAction = findViewById(R.id.btn_header_action);
        btnSubmit = findViewById(R.id.btn_submit);
        inputUsername = findViewById(R.id.input_username);
        inputPassword = findViewById(R.id.input_password);
        txtGuestSession = findViewById(R.id.txt_guest_session);

        // State toggling loop
        btnHeaderAction.setOnClickListener(v -> {
            isLoginState = !isLoginState;
            if (isLoginState) {
                btnHeaderAction.setText("SIGN UP");
                btnSubmit.setText("LOG IN");
                btnSubmit.setBackgroundTintList(android.content.res.ColorStateList.valueOf(0xFF0074BD)); 
            } else {
                btnHeaderAction.setText("LOG IN");
                btnSubmit.setText("SIGN UP");
                btnSubmit.setBackgroundTintList(android.content.res.ColorStateList.valueOf(0xFFE13C16)); 
            }
        });

        // Form submission targeting custom popup UI
        btnSubmit.setOnClickListener(v -> {
            String targetUser = inputUsername.getText().toString().trim();
            String targetPass = inputPassword.getText().toString().trim();

            if (targetUser.isEmpty() || targetPass.isEmpty()) {
                showLegacyAlert("System Notice", "Fields cannot be left empty.");
                return;
            }

            if (isLoginState) {
                showLegacyAlert("Authentication Status", "Logging in profile: " + targetUser);
            } else {
                showLegacyAlert("Registration Status", "Registering profile: " + targetUser);
            }
        });

        // Guest initialization custom popup UI
        txtGuestSession.setOnClickListener(v -> {
            showLegacyAlert("Engine Core", "Bypassing authentication...\nInitializing Guest Studio Workspace.");
        });
    }

    /**
     * Spawns a structured legacy Alert Dialog UI framework overlay
     */
    private void showLegacyAlert(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("OK", (dialog, which) -> dialog.dismiss());
        
        AlertDialog dialog = builder.create();
        dialog.show();
        
        // Custom styling to match the flat 2014 aesthetic post-show
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.white);
    }
}
