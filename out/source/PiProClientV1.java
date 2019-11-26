import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import controlP5.*; 
import de.fhpotsdam.unfolding.*; 
import de.fhpotsdam.unfolding.geo.*; 
import de.fhpotsdam.unfolding.utils.*; 
import de.fhpotsdam.unfolding.providers.*; 
import de.fhpotsdam.unfolding.mapdisplay.MapDisplayFactory; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PiProClientV1 extends PApplet {







//import de.fhpotsdam.unfolding.providers.StamenMapProvider.TonerLite;



ControlP5 cp5;
UnfoldingMap map;

boolean loginComplete = false;

Location locationLondon = new Location(51.5f, 0f);
Location locationGlossop = new Location(53.4433f, -1.9489f);

int bg =  color (34,34,60);

public void setup ()
{
    
    
    String[] fontList = PFont.list();
printArray(fontList);

    PFont font = createFont("Arial",20);
    textFont(font);
    cp5 = new ControlP5(this);

    //map = new UnfoldingMap(this, 100, 100, 300, 300);
    //map = new UnfoldingMap(this);
     map = new UnfoldingMap(this, new Microsoft.RoadProvider());
    map.setTweening(true);
    map.zoomAndPanTo(10, new Location(53.4433f, -1.9489f));
    MapUtils.createDefaultEventDispatcher(this, map);



}


public void draw()
{
    background(bg);
    
    //map.draw();
    if (loginComplete = false)
    {
    loginPageDisplay();
    }
    else{   mainPageDisplay();  }


}


public void mainPageDisplay()
{
    //fill(bg);
   // rect(0,0,width,height);

    map.draw();

        ScreenPosition posGlossop = map.getScreenPosition(locationGlossop);
        fill(200, 0, 0, 100);
        float s = map.getZoom()/20;
        ellipse(posGlossop.x, posGlossop.y, s, s);


    noStroke();
    fill(bg);
    rect(0,0,width,110);
    //rect(width/2,0,width,height);
    //rect(0,height-50,width,height);
    //rect(0,0,100,height);
    fill(83, 84, 84);
    rect(0,75,width,30);

    fill(255);
    textSize(30);
    text("Pi Smart AutoMetrics",10,50);


  


    menuBar();
}

public void menuBar()
{
    int xSize = 100;
    int ySize = 50;
    pushMatrix();
        translate(300,20);
        fill(255,255,255,150);
        rect(0,0,xSize,ySize,3);
    popMatrix();

}



public void loginPageDisplay()
{
    pushMatrix();
        textAlign(CENTER);
        textSize(20);
   

        for (int i = 0; i <= 255; i = i+1)
        {
            
            background(bg);
            fill(255,255,255,i);
            text("Pi Smart AutoMetrics",width/2,height/2);
           
          

        }
        
    popMatrix();

    loginComplete = true;

}
  public void settings() {  size(1600, 900,P2D);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PiProClientV1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
