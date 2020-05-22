package com.example.demonhunt;

public class Stats {
    private int playerWeapon1ID, playerWeapon2ID, friendly1Weapon1ID, friendly1Weapon2ID, friendly2Weapon1ID, friendly2Weapon2ID;
    private int[] weapons = new int[6];
    private int[] powers = new int[3];
    private int[] approximatelyPowers = new int[3];
    private int[][] enemyPowers = new int[3][3];
    private int[][] enemyApproximatelyPowers = new int[3][3];

    public void generateWeapons(){
        playerWeapon1ID = (int)(Math.random()*9);
        weapons[0] = playerWeapon1ID;
        playerWeapon2ID = 10 + (int)(Math.random()*6);
        weapons[1] = playerWeapon2ID;
        friendly1Weapon1ID = (int)(Math.random()*9);
        weapons[2] = friendly1Weapon1ID;
        friendly1Weapon2ID = 10 + (int)(Math.random()*6);
        weapons[3] = friendly1Weapon2ID;
        friendly2Weapon1ID = (int)(Math.random()*9);
        weapons[4] = friendly2Weapon1ID;
        friendly2Weapon2ID = 10 + (int)(Math.random()*6);
        weapons[5] = friendly2Weapon2ID;
    }

    public int[] getWeapons(){
        return weapons;
    }

    public int[] getPowers(){
        for(int i = 0; i<6; i++){
            if (weapons[i] < 10){
                if (weapons[i] == 0){powers[0]+=0; powers[1]+=1; powers[2]+=5;}
                else if (weapons[i] == 1){powers[0]+=0; powers[1]+=2; powers[2]+=2;}
                else if (weapons[i] == 2){powers[0]+=4; powers[1]+=5; powers[2]+=1;}
                else if (weapons[i] == 3){powers[0]+=1; powers[1]+=3; powers[2]+=3;}
                else if (weapons[i] == 4){powers[0]+=3; powers[1]+=3; powers[2]+=1;}
                else if (weapons[i] == 5){powers[0]+=5; powers[1]+=2; powers[2]+=0;}
                else if (weapons[i] == 6){powers[0]+=4; powers[1]+=3; powers[2]+=0;}
                else if (weapons[i] == 7){powers[0]+=3; powers[1]+=3; powers[2]+=3;}
                else if (weapons[i] == 8){powers[0]+=2; powers[1]+=3; powers[2]+=3;}
            }
            if (weapons[i] >= 10){
                if (weapons[i] == 10){powers[0]+=0; powers[1]+=0; powers[2]+=6;}
                else if (weapons[i] == 11){powers[0]+=1; powers[1]+=2; powers[2]+=3;}
                else if (weapons[i] == 12){powers[0]+=1; powers[1]+=4; powers[2]+=4;}
                else if (weapons[i] == 13){powers[0]+=0; powers[1]+=0; powers[2]+=4;}
                else if (weapons[i] == 14){powers[0]+=1; powers[1]+=3; powers[2]+=2;}
                else if (weapons[i] == 15){powers[0]+=0; powers[1]+=1; powers[2]+=4;}
            }
        }
        return powers;
    }

    public int[] getApproximatelyPowers(){
        getPowers();

        if (powers[0]>=12){approximatelyPowers[0]=3;}
        else if (powers[0]>=7 && powers[0]<=11){approximatelyPowers[0]=2;}
        else if (powers[0]<=6){approximatelyPowers[0]=1;}

        if (powers[1]>=17){approximatelyPowers[1]=3;}
        else if (powers[1]>=10 && powers[1]<=16){approximatelyPowers[1]=2;}
        else if (powers[1]<=9){approximatelyPowers[1]=1;}

        if (powers[2]>=20){approximatelyPowers[2]=3;}
        else if (powers[2]>=15 && powers[0]<=19){approximatelyPowers[2]=2;}
        else if (powers[2]<=14){approximatelyPowers[2]=1;}

        return approximatelyPowers;
    }

    public int[][] getEnemyPowers(){
        for (int i = 0; i < 3; i++){
            enemyPowers[i][0] = (int)(Math.random()*16);
            enemyPowers[i][1] = (int)(Math.random()*25);
            enemyPowers[i][2] = (int)(Math.random()*25);
        }

        return enemyPowers;
    }

    public boolean hasChances(int[] enemy, int[] player){
        if (enemy[0] < player[0] || enemy [1] < player[1] || enemy[2] <player[2]){return true;}
        else {return false;}
    }

    public int[][] getEnemyApproximatelyPowers(){
        getEnemyPowers();

        for (int i = 0; i<3; i++) {
            if (enemyPowers[i][0] >= 12) {
                enemyApproximatelyPowers[i][0] = 3;
            } else if (enemyPowers[i][0] >= 7 && enemyPowers[i][0] <= 11) {
                enemyApproximatelyPowers[i][0] = 2;
            } else if (enemyPowers[i][0] <= 6) {
                enemyApproximatelyPowers[i][0] = 1;
            }

            if (enemyPowers[i][1] >= 17) {
                enemyApproximatelyPowers[i][1] = 3;
            } else if (enemyPowers[i][1] >= 10 && enemyPowers[i][1] <= 16) {
                enemyApproximatelyPowers[i][1] = 2;
            } else if (enemyPowers[i][1] <= 9) {
                enemyApproximatelyPowers[i][1] = 1;
            }

            if (enemyPowers[i][2] >= 20) {
                enemyApproximatelyPowers[i][2] = 3;
            } else if (enemyPowers[i][2] >= 15 && enemyPowers[i][0] <= 19) {
                enemyApproximatelyPowers[i][2] = 2;
            } else if (enemyPowers[i][2] <= 14) {
                enemyApproximatelyPowers[i][2] = 1;
            }
        }

        return enemyApproximatelyPowers;
    }
}