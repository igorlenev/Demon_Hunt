package com.example.demonhunt;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class Screen {
    public void setPowersText(TextView powerFar, TextView powerMedium, TextView powerClose, int[] approximatelyPowers){
        if (approximatelyPowers[0] == 1){powerFar.setText("На дальней дистанции: низкая");}
        else if (approximatelyPowers[0] == 2){powerFar.setText("На дальней дистанции: средняя");}
        else if (approximatelyPowers[0] == 3){powerFar.setText("На дальней дистанции: высокая");}

        if (approximatelyPowers[1] == 1){powerMedium.setText("На средней дистанции: низкая");}
        else if (approximatelyPowers[1] == 2){powerMedium.setText("На средней дистанции: средняя");}
        else if (approximatelyPowers[1] == 3){powerMedium.setText("На средней дистанции: высокая");}

        if (approximatelyPowers[2] == 1){powerClose.setText("На ближней дистанции: низкая");}
        else if (approximatelyPowers[2] == 2){powerClose.setText("На ближней дистанции: средняя");}
        else if (approximatelyPowers[2] == 3){powerClose.setText("На ближней дистанции: высокая");}
    }

    public void setWeaponImages(ImageView imagePlayerWeapon1, ImageView imagePlayerWeapon2, ImageView imageFriendly1Weapon1, ImageView imageFriendly1Weapon2, ImageView imageFriendly2Weapon1, ImageView imageFriendly2Weapon2, int[] weapons){
        if (weapons[0] == 0){imagePlayerWeapon1.setImageResource(R.drawable.auto_5);}
        else if (weapons[0] == 1){imagePlayerWeapon1.setImageResource(R.drawable.crossbow);}
        else if (weapons[0] == 2){imagePlayerWeapon1.setImageResource(R.drawable.mosin);}
        else if (weapons[0] == 3){imagePlayerWeapon1.setImageResource(R.drawable.rival);}
        else if (weapons[0] == 4){imagePlayerWeapon1.setImageResource(R.drawable.sparks);}
        else if (weapons[0] == 5){imagePlayerWeapon1.setImageResource(R.drawable.sparks_sniper);}
        else if (weapons[0] == 6){imagePlayerWeapon1.setImageResource(R.drawable.springfield);}
        else if (weapons[0] == 7){imagePlayerWeapon1.setImageResource(R.drawable.vitterli);}
        else if (weapons[0] == 8){imagePlayerWeapon1.setImageResource(R.drawable.winfield);}

        if (weapons[1] == 10){imagePlayerWeapon2.setImageResource(R.drawable.axe);}
        else if (weapons[1] == 11){imagePlayerWeapon2.setImageResource(R.drawable.conversion);}
        else if (weapons[1] == 12){imagePlayerWeapon2.setImageResource(R.drawable.dolch);}
        else if (weapons[1] == 13){imagePlayerWeapon2.setImageResource(R.drawable.machete);}
        else if (weapons[1] == 14){imagePlayerWeapon2.setImageResource(R.drawable.nagant);}
        else if (weapons[1] == 15){imagePlayerWeapon2.setImageResource(R.drawable.rival_short);}

        if (weapons[2] == 0){imageFriendly1Weapon1.setImageResource(R.drawable.auto_5);}
        else if (weapons[2] == 1){imageFriendly1Weapon1.setImageResource(R.drawable.crossbow);}
        else if (weapons[2] == 2){imageFriendly1Weapon1.setImageResource(R.drawable.mosin);}
        else if (weapons[2] == 3){imageFriendly1Weapon1.setImageResource(R.drawable.rival);}
        else if (weapons[2] == 4){imageFriendly1Weapon1.setImageResource(R.drawable.sparks);}
        else if (weapons[2] == 5){imageFriendly1Weapon1.setImageResource(R.drawable.sparks_sniper);}
        else if (weapons[2] == 6){imageFriendly1Weapon1.setImageResource(R.drawable.springfield);}
        else if (weapons[2] == 7){imageFriendly1Weapon1.setImageResource(R.drawable.vitterli);}
        else if (weapons[2] == 8){imageFriendly1Weapon1.setImageResource(R.drawable.winfield);}

        if (weapons[3] == 10){imageFriendly1Weapon2.setImageResource(R.drawable.axe);}
        else if (weapons[3] == 11){imageFriendly1Weapon2.setImageResource(R.drawable.conversion);}
        else if (weapons[3] == 12){imageFriendly1Weapon2.setImageResource(R.drawable.dolch);}
        else if (weapons[3] == 13){imageFriendly1Weapon2.setImageResource(R.drawable.machete);}
        else if (weapons[3] == 14){imageFriendly1Weapon2.setImageResource(R.drawable.nagant);}
        else if (weapons[3] == 15){imageFriendly1Weapon2.setImageResource(R.drawable.rival_short);}

        if (weapons[4] == 0){imageFriendly2Weapon1.setImageResource(R.drawable.auto_5);}
        else if (weapons[4] == 1){imageFriendly2Weapon1.setImageResource(R.drawable.crossbow);}
        else if (weapons[4] == 2){imageFriendly2Weapon1.setImageResource(R.drawable.mosin);}
        else if (weapons[4] == 3){imageFriendly2Weapon1.setImageResource(R.drawable.rival);}
        else if (weapons[4] == 4){imageFriendly2Weapon1.setImageResource(R.drawable.sparks);}
        else if (weapons[4] == 5){imageFriendly2Weapon1.setImageResource(R.drawable.sparks_sniper);}
        else if (weapons[4] == 6){imageFriendly2Weapon1.setImageResource(R.drawable.springfield);}
        else if (weapons[4] == 7){imageFriendly2Weapon1.setImageResource(R.drawable.vitterli);}
        else if (weapons[4] == 8){imageFriendly2Weapon1.setImageResource(R.drawable.winfield);}

        if (weapons[5] == 10){imageFriendly2Weapon2.setImageResource(R.drawable.axe);}
        else if (weapons[5] == 11){imageFriendly2Weapon2.setImageResource(R.drawable.conversion);}
        else if (weapons[5] == 12){imageFriendly2Weapon2.setImageResource(R.drawable.dolch);}
        else if (weapons[5] == 13){imageFriendly2Weapon2.setImageResource(R.drawable.machete);}
        else if (weapons[5] == 14){imageFriendly2Weapon2.setImageResource(R.drawable.nagant);}
        else if (weapons[5] == 15){imageFriendly2Weapon2.setImageResource(R.drawable.rival_short);}
    }

    public void setScreen(ImageView backgroundImage, ImageView friendly1Image, ImageView friendly2Image, ConstraintLayout mapBox, int musicID, boolean isSoundOn, Music music, ConstraintLayout buttonTop, ConstraintLayout buttonMiddle, ConstraintLayout buttonBottom, TextView storyText, TextView choiceTextTop, TextView choiceTextMiddle, TextView choiceTextBottom, Button choiceButtonTop, Button choiceButtonMiddle, Button choiceButtonBottom){

    }
}