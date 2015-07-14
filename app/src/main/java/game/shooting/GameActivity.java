package game.shooting;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

import com.study.graphic0714.R;

public class GameActivity extends Activity{
    GameView gameView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        gameView =(GameView)findViewById(R.id.gameView);
    }

    public void moveShip(){
        int x=gameView.getPosX();
        x+=10;
        gameView.setPosX(x);
        gameView.invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        moveShip();
        return super.onTouchEvent(event);
    }
}
