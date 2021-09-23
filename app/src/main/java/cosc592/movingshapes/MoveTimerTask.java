package cosc592.movingshapes;


public class MoveTimerTask extends java.util.TimerTask {

    private ShapesView shapesView;

    public MoveTimerTask(ShapesView shapesView)
    {
        this.shapesView=shapesView;
    }
    public void run()
    {
        shapesView.refrsh();
        shapesView.postInvalidate();
    }
}
