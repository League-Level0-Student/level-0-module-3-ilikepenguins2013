
void setup() {
 size(800,800);
  // set the size of your sketch
  
}

void draw() {
 
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int y = 800, x = 100; y>0;y-=50, x--){
  if(x%2==1) {
    fill(#000000);
  }else{
    fill(#FF0000);
  }
    
  ellipse(400,400,y,y);
  //Use an if statement and remainder to alternate the color of your rings.
  
  }
  
}
