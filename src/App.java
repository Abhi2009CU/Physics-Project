import processing.core.PApplet;

public class App extends PApplet {
    int radius, red,green, blue, rectx;
    public void settings(){
        size(600,600);
    }
    public void setup(){
        radius = 200;
        red = 180;
        green = 180;
        blue = 180;
        rectx = 300;
    }
    public void draw(){
        background(0);
        fill(red,green,blue);
        ellipse(300,300, radius, radius);
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

    }

    public static void main(String[] args){
        PApplet.main("App");
    }
}
