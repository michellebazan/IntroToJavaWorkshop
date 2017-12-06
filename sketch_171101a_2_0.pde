int xposition = 10;
int speed = 10;
void setup(){
size(500,500);
}

void draw(){
  background(220);
  
fill(0,0,255);
  if(mousePressed){
    fill(255,0,0);
  }
  
  
ellipse(xposition,250,50,50);

xposition= xposition + speed;

if(xposition > width){
speed = -10;

}
if(xposition < 0){
 speed = 10; 
 }

}