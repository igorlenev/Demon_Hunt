package com.example.demonhunt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {
    private ConstraintLayout inventoryBox;
    private Button inventoryButton;
    private boolean isInventoryVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        inventoryBox = findViewById(R.id.inventoryBox);
        inventoryButton = findViewById(R.id.inventoryButton);

        Screen screen = new Screen();
        Stats stats = new Stats();

        inventoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isInventoryVisible){
                    isInventoryVisible = false;
                    inventoryBox.setVisibility(View.INVISIBLE);
                }
                else {
                    isInventoryVisible = true;
                    inventoryBox.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}