import processing.core.PApplet;

public class Appv2 extends PApplet {
    int red,green, blue, rectx;
    double radius, mass, lifetime;
    public void settings(){
        size(600,600);
    }
    public void setup(){
        radius = 2;
        red = 180;
        green = 180;
        blue = 180;
        rectx = 300;
    }
    public void draw(){
        background(0);
        fill(red,green,blue);
        ellipse(300,300, (float)(radius*100), (float)(radius*100));
        rect(100, 505, 400, 5);
        rect(rectx,487, 10, 40);
        if (keyPressed){
            if (key == CODED){
                if (keyCode == LEFT){
                    rectx--;
                    if (rectx > 100){
                        radius--;
                    }
                }
                if (keyCode == RIGHT){
                    rectx++;
                    if (rectx < 490){
                        radius++;
                    }
                }
            }
        }
        if (rectx <= 100){
            rectx = 100;
        }
        if (rectx >= 490){
            rectx = 490;
        }

        // Calculations
        mass = getMass(radius);
        lifetime = getLifetime(mass);
        System.out.println("For Main-Sequence Stars (like our Sun) with the radius of "+radius+" R<target_symbol>\nAn Estimated mass of: "+mass+" M<target_symbol>\nEstimated Lifetime: "+lifetime+ "years");

    }

    public static double getMass(double radius){
        return Math.pow(radius, 1.25);
    }

    public static double getLifetime(double mass){
        return 1e10/Math.pow(mass,2.5);
    }

    public static void main(String[] args){
        PApplet.main("Appv2");
    }
}
