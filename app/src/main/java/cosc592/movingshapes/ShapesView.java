package cosc592.movingshapes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.util.Random;


public class ShapesView extends View {

    private double x1,x2,y1;
    private double birdY;
    private double squarex1,squarey1,squarex2,squarey2;
    private double shapeSpeed,x2Speed,squareSpeed1,sqSpeed2;
    private double radius,radius2,square1Length,squareLength2,x3,y3,x4,y4,radius4,x3Speed,x4speed,radius3,
            x5,y5,x6,y6,radius5,x5Speed,x6speed,radius6,x7,y7,x8,y8,radius7,
            x7Speed,x8speed,radius8,x9,y9,x10,y10,radius9,x9Speed,x10speed,radius10;

    private double squarex3,squarey3,squarex4,squarey4,squareSpeed4,squareSpeed3;
    private double squareLen3,squareLen4;
    private double squarex5,squarey5,squarex6,squarey6,squareSpeed5,squareSpeed6;
    private double squareLen5,squareLen6;
    private double squarex7,squarey7,squarex8,squarey8,squareSpeed7,squareSpeed8;
    private double squareLen7,squareLen8;
    private double squarex9,squarey9,squarex10,squarey10,squareSpeed9,squareSpeed10;
    private double squareLen9,squareLen10;
    double sceneWidth = 1500;
    double sceneHeight = 4000;

    public int rndR(int i)
    {
        Random rndnum = new Random();
        i=rndnum.nextInt(255);
        return i;
    }
    public int rndG(int i)
    {
        Random rndnum = new Random();
        i=rndnum.nextInt(255);
        return i;
    }
    public int rndB(int i)
    {
        Random rndnum = new Random();
        i=rndnum.nextInt(255);
        return i;
    }
    int i;
    int red=rndR(i),green=rndG(i),blue=rndB(i);
    int red1=rndR(i),green1=rndG(i),blue1=rndB(i);
    int red2=rndR(i),green2=rndG(i),blue2=rndB(i);
    int red3=rndR(i),green3=rndG(i),blue3=rndB(i);
    int red4=rndR(i),green4=rndG(i),blue4=rndB(i);
    int red5=rndR(i),green5=rndG(i),blue5=rndB(i);
    int red6=rndR(i),green6=rndG(i),blue6=rndB(i);
    int red7=rndR(i),green7=rndG(i),blue7=rndB(i);
    int red8=rndR(i),green8=rndG(i),blue8=rndB(i);
    int red9=rndR(i),green9=rndG(i),blue9=rndB(i);
    int red10=rndR(i),green10=rndG(i),blue10=rndB(i);
    int red11=rndR(i),green11=rndG(i),blue11=rndB(i);
    int red12=rndR(i),green12=rndG(i),blue12=rndB(i);
    int red13=rndR(i),green13=rndG(i),blue13=rndB(i);
    int red14=rndR(i),green14=rndG(i),blue14=rndB(i);
    int red15=rndR(i),green15=rndG(i),blue15=rndB(i);
    int red16=rndR(i),green16=rndG(i),blue16=rndB(i);
    int red17=rndR(i),green17=rndG(i),blue17=rndB(i);
    int red18=rndR(i),green18=rndG(i),blue18=rndB(i);
    int red19=rndR(i),green19=rndG(i),blue19=rndB(i);

    public ShapesView(Context context)
    {
        super(context);

        this.sceneWidth=1500;
        this.sceneHeight=4000;

        initSquare1();
        initSquare2();
        initSquare3();
        initSquare4();
        initSquare5();
        initSquare6();
        initSquare7();
        initSquare8();
        initSquare9();
        initSquare10();
        initCircle11();
        initCircle12();
        initCircle13();
        initCircle14();
        initCircle15();
        initCircle16();
        initCircle17();
        initCircle18();
        initCircle19();
        initCircle20();
    }

    public void onDraw(Canvas canvas)
    {
        double x1 = getBirdX();
        double birdY = getBirdY();
        double x2=getx2();
        double y1=getY1();
        double squareX1=getSquarex1();
        double squarey1=getSquarey1();
        double squaLength1=getSqr1Length();
        double squareX2=getSquarex2();
        double squarey2=getSquarey2();
        double squaLength2=getSqr1Length2();

        double squareX3=getSquarex3();
        double squarey3=getSquarey3();
        double squaLength3=getSquareLen3();
        double squareX4=getSquarex4();
        double squarey4=getSquarey4();
        double squaLength4=getSquareLen4();

        double squareX5=getSquarex5();
        double squarey5=getSquarey5();
        double squaLength5=getSquareLen5();
        double squareX6=getSquarex6();
        double squarey6=getSquarey6();
        double squaLength6=getSquareLen6();

        double squareX7=getSquarex7();
        double squarey7=getSquarey7();
        double squaLength7=getSquareLen7();
        double squareX8=getSquarex8();
        double squarey8=getSquarey8();
        double squaLength8=getSquareLen8();

        double squareX9=getSquarex9();
        double squarey9=getSquarey9();
        double squaLength9=getSquareLen9();
        double squareX10=getSquarex10();
        double squarey10=getSquarey10();
        double squaLength10=getSquareLen10();

        double x9=getx9();
        double y9=getY9();
        double x10=getx10();
        double y10=getY10();
        double x9rad=getRadius9();
        double x10rad=getRadius10();

        double x3=getx3();
        double y3=getY3();
        double x4=getx4();
        double y4=getY4();
        double x3rad=getRadius3();
        double x4rad=getRadius4();

        double x5=getx5();
        double y5=getY5();
        double x6=getx6();
        double y6=getY6();
        double x5rad=getRadius5();
        double x6rad=getRadius6();

        double x7=getx7();
        double y7=getY7();
        double x8=getx8();
        double y8=getY8();
        double x7rad=getRadius7();
        double x8rad=getRadius8();

        double radius = getRadius();
        double radius2=getRadius2();

        Paint paint = new Paint();


        paint.setColor(Color.parseColor("#000000"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(0, 0, (float)sceneWidth, (float)sceneHeight, paint);

        paint.setColor(Color.rgb(red,green, blue));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)x1, (float)birdY, (float)radius, paint);

        paint.setColor(Color.rgb(red1, green1, blue1));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)y1, (float)x2, (float)radius2, paint);

        paint.setColor(Color.rgb(red2, green2, blue2));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squareX1, (float)squarey1, (float)(squaLength1+squareX1),(float)(squaLength1+squarey1), paint);

        paint.setColor(Color.rgb(red3, green3, blue3));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squareX2, (float)squarey2, (float)(squaLength2+squareX2),(float)(squaLength2+squarey2), paint);

        paint.setColor(Color.rgb(red4,green4, blue4));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)y3, (float)x3, (float)x3rad, paint);

        paint.setColor(Color.rgb(red5,green5, blue5));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)y4, (float)x4, (float)x4rad, paint);

        paint.setColor(Color.rgb(red6,green6, blue6));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)x5, (float)y5, (float)x5rad, paint);

        paint.setColor(Color.rgb(red7,green7, blue7));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)x6, (float)y6, (float)x6rad, paint);

        paint.setColor(Color.rgb(red8, green8, blue8));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squarey3, (float)squareX3, (float)(squaLength3+squarey3),(float)(squaLength3+squareX3), paint);

        paint.setColor(Color.rgb(red9, green9, blue9));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squarey4, (float)squareX4, (float)(squaLength4+squarey4),(float)(squaLength4+squareX4), paint);

        paint.setColor(Color.rgb(red10, green10, blue10));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squareX5, (float)squarey5, (float)(squaLength5+squareX5),(float)(squaLength5+squarey5), paint);

        paint.setColor(Color.rgb(red11, green11, blue11));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squareX6, (float)squarey6, (float)(squaLength6+squareX6),(float)(squaLength6+squarey6), paint);

        paint.setColor(Color.rgb(red12,green12, blue12));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)x7, (float)y7, (float)x7rad, paint);

        paint.setColor(Color.rgb(red13,green13, blue13));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)x8, (float)y8, (float)x8rad, paint);

        paint.setColor(Color.rgb(red14, green14, blue14));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squareX7, (float)squarey7, (float)(squaLength7+squareX7),(float)(squaLength7+squarey7), paint);

        paint.setColor(Color.rgb(red15, green15, blue15));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squareX8, (float)squarey8, (float)(squaLength8+squareX8),(float)(squaLength8+squarey8), paint);

        paint.setColor(Color.rgb(red16, green16, blue16));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squareX9, (float)squarey9, (float)(squaLength9+squareX9),(float)(squaLength9+squarey9), paint);

        paint.setColor(Color.rgb(red17, green17, blue17));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect((float)squareX10, (float)squarey10, (float)(squaLength10+squareX10),(float)(squaLength10+squarey10), paint);

        paint.setColor(Color.rgb(red18,green18, blue18));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)y9, (float)x9, (float)x9rad, paint);

        paint.setColor(Color.rgb(red19,green19, blue19));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((float)y10, (float)x10, (float)x10rad, paint);


    }

    public void refrsh()
    {

        moveSquare2();
        if(reMove2())
            initSquare2();

        moveSquare3();
        if(reMove3())
            initSquare3();

        moveSquare4();
        if(reMove4())
            initSquare4();

        moveSquare5();
        if(reMove5())
            initSquare5();

        moveSquare6();
        if(reMove6())
            initSquare6();

        moveSquare7();
        if(reMove7())
            initSquare7();

        moveSquare8();
        if(reMove8())
            initSquare8();

        moveSquare9();
        if(reMove9())
            initSquare9();

        moveSquare10();
        if(reMove10())
            initSquare10();

        moveCircle11();
        if(reMove11())
            initCircle11();

        moveCircle12();
        if(reMove12())
            initCircle12();

        moveCircle13();
        if(reMove13())
            initCircle13();

        moveCircle14();
        if(reMove14())
            initCircle14();

        moveCircle15();
        if(reMove15())
            initCircle15();

        moveCircle16();
        if(reMove16())
            initCircle16();

        moveCircle17();
        if(reMove17())
            initCircle17();

        moveCircle18();
        if(reMove18())
            initCircle18();

        moveCircle19();
        if(reMove19())
            initCircle19();

        moveCircle20();
        if(reMove20())
            initCircle20();


    }


    private void moveSquare2() {
        squarex2 = squarex2 - sqSpeed2;
    }
    private void moveSquare3() {
        squarex3 = squarex3 - squareSpeed3;
    }
    private void moveSquare4() {
        squarex4 = squarex4 - squareSpeed4;
    }
    private void moveSquare5() {
        squarex5 = squarex5 + squareSpeed5;
    }
    private void moveSquare6() {
        squarex6 = squarex6 + squareSpeed6;
    }
    private void moveSquare7() {
        squarey7 = squarey7 + squareSpeed5;
    }
    private void moveSquare8() {
        squarey8 = squarey8 + squareSpeed6;
    }
    private void moveSquare9() {
        squarex9 = squarex9 + squareSpeed9;
    }
    private void moveSquare10() {
        squarey10=squarey10+squareSpeed10;

    }
    public double getBirdX()
    {
        return x1;
    }
    public double getBirdY()
    {
        return birdY;
    }
    public double getSquarex1(){return squarex1;}
    public double getSquarey1(){return squarey1;}
    public double getSqr1Length(){return square1Length;}
    public double getSquarex2(){return squarex2;}
    public double getSquarey2(){return squarey2;}
    public double getSqr1Length2(){return squareLength2;}
    public double getx3(){return x3;}
    public double getY3(){return y3;}
    public double getRadius3(){return radius3;}
    public double getx4(){return x4;}
    public double getY4(){return y4;}
    public double getRadius4(){return radius4;}

    public double getx9(){return x9;}
    public double getY9(){return y9;}
    public double getRadius9(){return radius9;}
    public double getx10(){return x10;}
    public double getY10(){return y10;}
    public double getRadius10(){return radius10;}

    public double getSquarex3(){return squarex3;}
    public double getSquarex4(){return squarex4;}
    public double getSquarey3(){return squarey3;}
    public double getSquarey4(){return squarey4;}
    public double getSquareLen3(){return squareLen3;}
    public double getSquareLen4(){return squareLen4;}

    public double getSquarex5(){return squarex5;}
    public double getSquarex6(){return squarex6;}
    public double getSquarey5(){return squarey5;}
    public double getSquarey6(){return squarey6;}
    public double getSquareLen5(){return squareLen5;}
    public double getSquareLen6(){return squareLen6;}

    public double getSquarex7(){return squarex7;}
    public double getSquarex8(){return squarex8;}
    public double getSquarey7(){return squarey7;}
    public double getSquarey8(){return squarey8;}
    public double getSquareLen7(){return squareLen7;}
    public double getSquareLen8(){return squareLen8;}

    public double getSquarex9(){return squarex9;}
    public double getSquarex10(){return squarex10;}
    public double getSquarey9(){return squarey9;}
    public double getSquarey10(){return squarey10;}
    public double getSquareLen9(){return squareLen9;}
    public double getSquareLen10(){return squareLen10;}

    public double getx5(){return x5;}
    public double getY5(){return y5;}
    public double getRadius5(){return radius5;}
    public double getx6(){return x6;}
    public double getY6(){return y6;}
    public double getRadius6(){return radius6;}

    public double getx7(){return x7;}
    public double getY7(){return y7;}
    public double getRadius7(){return radius7;}
    public double getx8(){return x8;}
    public double getY8(){return y8;}
    public double getRadius8(){return radius8;}

    public double getRadius()
    {
        return radius;
    }
    public double getRadius2(){return radius2;}
    public double getx2(){return x2;}
    public double getY1(){return  y1;}


    private void moveCircle11() {
        x1 = x1 - shapeSpeed;
    }
    private void moveCircle12() {
        y1 = y1 - x2Speed;
    }
    private void moveCircle13() {

        x3 = x3 - x3Speed;
    }
    private void moveCircle14() {
        x4 = x4 - x4speed;
    }
    private void moveCircle15() {

        x5 = x5 + x5Speed;
    }
    private void moveCircle16() {
        x6 = x6 + x6speed;
    }
    private void moveCircle17() {
        y7 = y7 + x7Speed;
    }
    private void moveCircle18() {
        y8 = y8 + x8speed;
    }

    private void moveCircle19() {
        x9 = x9 - x9Speed;
    }
    private void moveCircle20() {
        x10 = x10 - x10speed;
    }




    private boolean reMove1()
    {
        return (squarex1<0 || squarey1<0 );
    }
    private boolean reMove2()
    {
        return (squarex2<0 || squarey2<0 );
    }
    private boolean reMove3()
    {
        return (squarex3<0 || squarey3<0 );
    }
    private boolean reMove4()
    {
        return (squarex4<0 || squarey4<0 );
    }
    private boolean reMove5()
    {
        return (squarex5>1810 );
    }
    private boolean reMove6()
    {
        return (squarex6>1810);
    }
    private boolean reMove7()
    {
        return (squarey7>1020 );
    }
    private boolean reMove8()
    {
        return (squarey8>1020 );
    }
    private boolean reMove9()
    {
        return (squarex9>1810 );
    }
    private boolean reMove10()
    {
        return (squarey10>1020 );
    }
    private boolean reMove11()

    {
        return (x1<0 || birdY<0);
    }
    private boolean reMove12()
    {
        return (y1<0 || x2<0 );
    }
    private boolean reMove13()
    {
        return (y3<0 || x3<0);
    }
    private boolean reMove14()
    {
        return (y4<0 || x4<0);
    }
    private boolean reMove15()
    {
        return (x5>1810);
    }
    private boolean reMove16()
    {
        return (x6>1810 );
    }
    private boolean reMove17()
    {
        return (y7>1020 );
    }
    private boolean reMove18()
    {
        return (y8>1020);
    }
    private boolean reMove19()
    {
        return (x9<0 || y9<0 );
    }
    private boolean reMove20()
    {
        return (x10<0 || y10<0 );
    }




    public int randomPosRight(int i){
        Random randnum = new Random();
        i=randnum.nextInt(720)+128;
        return i;
    }
    public int randomPosTop(int i)
    {
        Random randnum = new Random();
        i=randnum.nextInt(1500)+128;
        return i;
    }
    public int randomRadius(int i)
    {
        Random randnum = new Random();
        i=randnum.nextInt(65)+50;
        return i;

    }
    public int randomSpeed(int i)
    {
        Random randnum = new Random();
        i=randnum.nextInt(10)+5;
        return i;
    }
    public int randomLengthSquare(int i)
    {
        Random randnum = new Random();
        i=randnum.nextInt(100)+75;
        return i;

    }


    int a=randomPosRight(i);
    int square1Pos =randomPosRight(i);
    int b=randomPosRight(i);
    int r=randomRadius(i);
    int r1=randomRadius(i);
    int square1Length1=randomLengthSquare(i);
    int s=randomSpeed(i);
    int square1Speed=randomSpeed(i);
    int s1=randomSpeed(i);
    int square2Pos=randomPosRight(i);
    int square2Length=randomLengthSquare(i);
    int square2Speed=randomSpeed(i);

    int square3Pos=randomPosTop(i);
    int square3Length=randomLengthSquare(i);
    int square3Speed=randomSpeed(i);

    int square5Pos=randomPosRight(i);
    int square5Length=randomLengthSquare(i);
    int square5Speed=randomSpeed(i);
    int square6Pos=randomPosRight(i);
    int square6Length=randomLengthSquare(i);
    int square6Speed=randomSpeed(i);
    int square9Pos=randomPosRight(i);
    int square9Length=randomLengthSquare(i);
    int square9Speed=randomSpeed(i);


    int square7Pos=randomPosTop(i);
    int square7Length=randomLengthSquare(i);
    int square7Speed=randomSpeed(i);
    int square8Pos=randomPosTop(i);
    int square8Length=randomLengthSquare(i);
    int square8Speed=randomSpeed(i);
    int square10Pos=randomPosTop(i);
    int square10Length=randomLengthSquare(i);
    int square10Speed=randomSpeed(i);


    int square4Pos=randomPosTop(i);
    int square4Length=randomLengthSquare(i);
    int square4Speed=randomSpeed(i);


    int x3Pos=randomPosTop(i);
    int x4Pos=randomPosTop(i);
    int x3rad=randomRadius(i);
    int x4rad=randomRadius(i);
    int x3Spe=randomSpeed(i);
    int x4Spe=randomSpeed(i);

    int x9Pos=randomPosTop(i);
    int x10Pos=randomPosTop(i);
    int x9rad=randomRadius(i);
    int x10rad=randomRadius(i);
    int x9Spe=randomSpeed(i);
    int x10Spe=randomSpeed(i);

    int x6Pos=randomPosRight(i);
    int x5Pos=randomPosRight(i);
    int x6rad=randomRadius(i);
    int x5rad=randomRadius(i);
    int x6Spe=randomSpeed(i);
    int x5Spe=randomSpeed(i);

    int x7Pos=randomPosTop(i);
    int x8Pos=randomPosTop(i);
    int x7rad=randomRadius(i);
    int x8rad=randomRadius(i);
    int x7Spe=randomSpeed(i);
    int x8Spe=randomSpeed(i);


    private void initSquare1() {

        this.squarex1 = sceneWidth ;
        this.squarey1 = square1Pos;
        this.squareSpeed1 = square1Speed;
        this.square1Length = square1Length1;
    }
    private void initSquare2() {

        this.squarex2 = sceneWidth ;
        this.squarey2 = square2Pos;
        this.sqSpeed2 = square2Speed;
        this.squareLength2 = square2Length;
    }

    private void initSquare3() {
        this.squarex3 = sceneHeight ;
        this.squarey3 = square3Pos;
        this.squareSpeed3 = square3Speed;
        this.squareLen3 = square3Length;
    }
    private void initSquare4() {

        this.squarex4 = sceneHeight ;
        this.squarey4 = square4Pos;
        this.squareSpeed4 = square4Speed;
        this.squareLen4 = square4Length;
    }
    private void initSquare5() {
        this.squarex5 = sceneHeight ;
     //   this.squarex5 = 50;
        this.squarey5 = square5Pos;
        this.squareSpeed5 = square5Speed;
        this.squareLen5 = square5Length;
    }
    private void initSquare6() {
        this.squarex6 = sceneHeight ;
   //     this.squarex6 = 50;
        this.squarey6 = square6Pos;
        this.squareSpeed6 = square6Speed;
        this.squareLen6 = square6Length;
    }
    private void initSquare7() {
        this.squarex7 = sceneHeight ;
        this.squarex7 = square7Pos;
 //       this.squarey7 = 50;
        this.squareSpeed7 = square7Speed;
        this.squareLen7 = square7Length;
    }
    private void initSquare8() {
        this.squarex8 = sceneHeight ;
        this.squarex8 = square8Pos;
    //    this.squarey8 = 50;
        this.squareSpeed8 = square8Speed;
        this.squareLen8 = square8Length;
    }
    private void initSquare9() {
        this.squarex9 = sceneHeight ;
      //  this.squarex9 = 50;
        this.squarey9 = square9Pos;
        this.squareSpeed9 = square9Speed;
        this.squareLen9 = square9Length;
    }
    private void initSquare10() {
        this.squarex10 = sceneHeight ;
        this.squarex10 = square10Pos;
   //     this.squarey10 = 50;
        this.squareSpeed10 = square10Speed;
        this.squareLen10 = square10Length;
    }
    private void initCircle11() {


        this.x1 = sceneWidth ;
        this.birdY = a;
        this.shapeSpeed = s;
        this.radius = r;
    }
    private void initCircle12() {

        this.x2 = b;
        this.x2Speed = s1;
        this.radius2 = r1;
        this.y1 = sceneWidth ;
    }
    private void initCircle13() {

        this.x3Speed = x3Spe;
        this.x3 = sceneHeight ;
        this.y3 = x3Pos;
        this.radius3 = x3rad;
    }
    private void initCircle14() {

        this.x4speed = x4Spe;
        this.radius4 = x4rad;
        this.x4 = sceneHeight ;
        this.y4 = x4Pos;
    }
    private void initCircle15() {
        this.x5 = sceneHeight ;
        this.x5Speed = x5Spe;
      //  this.x5 = 50;
        this.y5 = x5Pos;
        this.radius5 = x5rad;
    }
    private void initCircle16() {
        this.x6 = sceneHeight ;
        this.x6speed = x6Spe;
        this.radius6 = x6rad;
      //  this.x6 = 50;
        this.y6 = x6Pos;
    }
    private void initCircle17() {
        this.x7 = sceneHeight ;
        this.x7Speed = x7Spe;
        this.x7 = x7Pos;
      //  this.y7 = 50;
        this.radius7 = x7rad;
    }
    private void initCircle18() {
        this.x8 = sceneHeight ;
        this.x8speed = x8Spe;
        this.radius8 = x8rad;
        this.x8 = x8Pos;
      //  this.y8 = 50;
    }
    private void initCircle19() {
        this.x9Speed = x9Spe;
        this.x9 = sceneHeight ;
        this.y9 = x9Pos;
        this.radius9 = x9rad;
    }
    private void initCircle20() {

        this.x10speed=x10Spe;
        this.radius10=x10rad;
        this.x10=sceneHeight;
        this.y10=x10Pos;


    }
}
