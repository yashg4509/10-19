class Car {
 int xPos;
 int yPos;
 int speed;
 int w;
 
  public Car(int x, int y, int w, int speed) {
   this.xPos = x;
   this.yPos = y;
   this.speed = speed;
   this.w = w;
  }
  
    void display() 
  {
    fill(255, 255, 255);
    rect(xPos , yPos,  w, 50);
  }
void moveLeft() {
   xPos += speed;
   
   if (xPos > 400) {
     xPos = -385;
}
}

void moveRight() {
  xPos -= speed;
  
  if(xPos > 400) {
   xPos = 385; 
  }
}
}