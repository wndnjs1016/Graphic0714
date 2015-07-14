/*
package com.study.graphic0714;

import android.app.Activity;
import android.graphics.Point;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {
    String TAG;
    MyView myView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TAG=this.getClass().getName();
        myView=(MyView)findViewById(R.id.myView);
    }

    public void printOval(List list){
        */
/*정해진좌표를이용하여 마이뷰다시그리기*//*

        myView.list;
        myView.invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG,"터치햇어???");
        */
/*터치가 발생하면 좌표를 컬랙션 객체에 담자*//*

        Point point=new Point((int)event.getX(), (int)event.getY());
        list.add(point);
        //printOval((int)event.getX(), (int)event.getY());
        return false;
    }
}
*/
