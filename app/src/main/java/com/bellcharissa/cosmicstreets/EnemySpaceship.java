package com.bellcharissa.cosmicstreets;

import static android.graphics.BitmapFactory.decodeResource;
import static com.bellcharissa.cosmicstreets.R.drawable.heli_2;


import android.content.Context;
import android.graphics.Bitmap;


import java.util.Random;

public class EnemySpaceship {
    Context context;
    Bitmap enemySpaceship;
    int ex, ey;
    int enemyVelocity;
    Random random;

    public EnemySpaceship(Context context){
        this.context = context;
        enemySpaceship = decodeResource(context.getResources(), heli_2);
        random = new Random();
        resetEnemySpaceship();
    }

    public Bitmap getEnemySpaceship(){
        return enemySpaceship;
    }

    int getEnemySpaceshipWidth(){
        return enemySpaceship.getWidth();
    }
    int getEnemySpaceshipHeight(){
        return enemySpaceship.getHeight();
    }
    private void resetEnemySpaceship() {
        ex = 200 + random.nextInt(400);
        ey = 0;
        enemyVelocity = 14 + random.nextInt(10);
    }
}
