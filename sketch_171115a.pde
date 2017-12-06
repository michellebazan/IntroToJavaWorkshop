PImage rainbow;
PImage unicorn;
void setup(){
  size(900,900);
  rainbow = loadImage("rainbow.jpeg");
  rainbow.resize(width,height);
  
  background(rainbow);
  
  unicorn = loadImage("unicorn.png");
}

void draw(){
  image(unicorn,300,300,500,500);
  
  
  
}