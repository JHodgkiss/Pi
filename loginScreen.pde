


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