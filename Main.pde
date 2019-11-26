

void mainPageDisplay()
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

void menuBar()
{
    int xSize = 100;
    int ySize = 50;
    pushMatrix();
        translate(300,20);
        fill(255,255,255,150);
        rect(0,0,xSize,ySize,3);
    popMatrix();

}