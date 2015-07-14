package game.shooting;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.study.graphic0714.R;

/**
 * Created by juwon on 2015-07-14.
 */
public class GameView extends View {
    Bitmap bitmap;
    private int posX;
    private int posY;
    Paint paint;
    /*조이스틱, 총알버튼의크기*/
    RectF[] control=new RectF[5];
    int controlWidth=150;
    int controlHeight=100;
    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);

        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ship);
        paint=new Paint();
        paint.setColor(Color.GREEN);
        control[0]=new RectF(200,450,200+controlWidth,450+controlHeight);//위
        control[1]=new RectF(200,600,200+controlWidth,600+controlHeight);//아래
        control[2]=new RectF(100,200,100+controlWidth,200+controlHeight);//왼
        control[3]=new RectF(100,200,100+controlWidth,200+controlHeight);//오른
        control[4]=new RectF(100,200,100+controlWidth,200+controlHeight);//총알
       // ship=Bitmap.createBitmap(bitmap, 0 , 0, 100,100);
    }

    /*조이스틱그리기*/
    public void paintJoyStick(Canvas canvas){
        /*위*/
       // for(int i=0;i<control.length;i++) {
            canvas.drawRect(control[0] , paint);
            canvas.drawRect(control[1] , paint);
       // }

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(bitmap, posX, posY, null);

        paintJoyStick(canvas);

    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }
}
