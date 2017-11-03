import ddf.minim.*;
PImage picOfRecord;
int imgAngle = 90;
Minim minim;
AudioPlayer song;

void setup() {
picOfRecord = loadImage("record.jpg");
size(228, 221);
minim = new Minim(this);
song = minim.loadFile("awesomeTrack.mp3", 512);
}
void draw() {
  image(picOfRecord, 1, 1);
  imgAngle++;
  if(mousePressed) {
  rotateImage(picOfRecord, imgAngle);
  imgAngle++;
  song.play();
  }
  else {
    song.pause();
  }
}
void rotateImage(PImage image, int amountToRotate) {
      translate(width/2, height/2);
      rotate(amountToRotate*TWO_PI/360);                              
      translate(-image.width/2, -image.height/2);
}