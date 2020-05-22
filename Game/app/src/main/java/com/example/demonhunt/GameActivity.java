package com.example.demonhunt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    private ConstraintLayout inventoryBox;
    private Button inventoryButton;
    private boolean isInventoryVisible = false;
    private boolean isSoundOn;
    private Music music;
    private int musicID;
    private int[] weapons = new int[6];
    private int[] approximatelyPowers = new int[3];
    private TextView powerFar, powerMedium, powerClose;
    private ImageView imagePlayerWeapon1, imagePlayerWeapon2, imageFriendly1Weapon1, imageFriendly1Weapon2, imageFriendly2Weapon1, imageFriendly2Weapon2;
    private ImageView friendly1Image, friendly2Image;
    private ImageView backgroundImage;
    private Button musicSwitchButton;
    private TextView musicInstance;
    private ConstraintLayout mapBox, buttonTop, buttonMiddle, buttonBottom;
    private TextView storyText, choiceTextTop, choiceTextMiddle, choiceTextBottom;
    private Button choiceButtonTop, choiceButtonMiddle, choiceButtonBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Bundle arguments = getIntent().getExtras();
        isSoundOn = arguments.getBoolean("isSoundOn");
        musicSwitchButton = findViewById(R.id.musicSwitchButton);
        musicInstance = findViewById(R.id.musicInstance);
        music = new Music(isSoundOn);

        music.mediaPlayerCreate(this, musicID);
        music.play();

        backgroundImage = findViewById(R.id.backgroundImage);
        mapBox = findViewById(R.id.mapBox);

        inventoryBox = findViewById(R.id.inventoryBox);
        inventoryButton = findViewById(R.id.inventoryButton);

        storyText = findViewById(R.id.storyText);
        choiceTextTop = findViewById(R.id.choiceTextTop);
        choiceTextMiddle = findViewById(R.id.choiceTextMiddle);
        choiceTextBottom = findViewById(R.id.choiceTextBottom);
        choiceButtonTop = findViewById(R.id.choiceButtonTop);
        choiceButtonMiddle = findViewById(R.id.choiceButtonMiddle);
        choiceButtonBottom = findViewById(R.id.choiceButtonBottom);
        buttonTop = findViewById(R.id.buttonTop);
        buttonMiddle = findViewById(R.id.buttonMiddle);
        buttonBottom = findViewById(R.id.buttonBottom);

        friendly1Image = findViewById(R.id.friendly1Image);
        friendly2Image = findViewById(R.id.friendly2Image);

        powerFar = findViewById(R.id.powerFar);
        powerMedium = findViewById(R.id.powerMedium);
        powerClose = findViewById(R.id.powerClose);

        imagePlayerWeapon1 = findViewById(R.id.imagePlayerWeapon1);
        imagePlayerWeapon2 = findViewById(R.id.imagePlayerWeapon2);
        imageFriendly1Weapon1 = findViewById(R.id.imageFriendly1Weapon1);
        imageFriendly1Weapon2 = findViewById(R.id.imageFriendly1Weapon2);
        imageFriendly2Weapon1 = findViewById(R.id.imageFriendly2Weapon1);
        imageFriendly2Weapon2 = findViewById(R.id.imageFriendly2Weapon2);

        Screen screen = new Screen();
        Stats stats = new Stats();

        stats.generateWeapons();
        weapons = stats.getWeapons();
        approximatelyPowers = stats.getApproximatelyPowers();

        screen.setWeaponImages(imagePlayerWeapon1, imagePlayerWeapon2, imageFriendly1Weapon1, imageFriendly1Weapon2, imageFriendly2Weapon1, imageFriendly2Weapon2, weapons);

        screen.setPowersText(powerFar, powerMedium, powerClose, approximatelyPowers);

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

        musicSwitchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music.musicStateChange(musicInstance);
            }
        });
    }
}