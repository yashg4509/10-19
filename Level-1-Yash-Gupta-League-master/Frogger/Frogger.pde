int x = 200; 
int y = 350;
int hop = 5;

Car c1 = new Car(230, 250 , 40, 10);
Car c2 = new Car(300, 70, 80, 13);
Car c3 = new Car(10, 10, 20, 16);
Car c4 = new Car(80, 120, 100, 3);


void setup() {
 size(400, 400);
}
void draw() {
  boundaries();
  background(0, 0, 0);
  fill(0, 255, 0);
  ellipse(x, y, 30, 40);
  c1.display();
  c1.moveRight();
  c2.display();
  c2.moveLeft();
  c3.display();
  c3.moveLeft();
  c4.display();
  c4.moveRight();
}

void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
      y -= hop;
      }
      else if(keyCode == DOWN)
      {
        y += hop;
      }
      else if(keyCode == RIGHT)
      {
       x += hop;
      }
      else if(keyCode == LEFT)
      {
        x -= hop;
      }
   }
}

void boundaries() {
if(x > 385) {
  x = 385;
}
if (x < 25) {
  x = 25;
}
if(y > 385) {
 y = 385; 
}
if(y < 25) {
  y = 25;
}

}