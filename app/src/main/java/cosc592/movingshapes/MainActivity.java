package cosc592.movingshapes;

import android.app.Activity;
import android.os.Bundle;

import java.util.Timer;

public class MainActivity extends Activity {

    private ShapesView shapesView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        shapesView = new ShapesView(this);

        setContentView(shapesView);

        Timer timer = new Timer();
        MoveTimerTask task = new MoveTimerTask(shapesView);
        timer.schedule(task, 1000, 20);

    }
}
