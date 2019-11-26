import controlP5.*;
import de.fhpotsdam.unfolding.*;
import de.fhpotsdam.unfolding.geo.*;
import de.fhpotsdam.unfolding.utils.*;
import de.fhpotsdam.unfolding.providers.*;
import de.fhpotsdam.unfolding.mapdisplay.MapDisplayFactory;
//import de.fhpotsdam.unfolding.providers.StamenMapProvider.TonerLite;
import processing.opengl.*;


ControlP5 cp5;
UnfoldingMap map;

boolean loginComplete = false;

Location locationLondon = new Location(51.5f, 0f);
Location locationGlossop = new Location(53.4433f, -1.9489f);

int bg =  color (34,34,60);

void setup ()
{
    smooth();
    size(1600, 900,P2D);
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


void draw()
{
    background(bg);
    
    //map.draw();
    if (loginComplete = false)
    {
    loginPageDisplay();
    }
    else{   mainPageDisplay();  }


}
