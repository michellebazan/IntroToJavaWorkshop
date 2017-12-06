int x = 50;
String name= "Word2";
PImage egg;
PImage Naruto;
void setup() {
  size(400,300);
  egg = loadImage("egg.jpg");
  Naruto = loadImage("Unknown.jpeg");
  ellipse(200,150,200,50);
  image(egg, 0, 0, 300, 200);
  image(Naruto, mouseX, mouseY,100,50);
  text("HUEVOS ESCONDIO AND NARUTO", 100, 100, 500,500);
  print("Word " + name);
}

void draw(){
  image(egg,0,0,300,200);
  image(Naruto, mouseX, mouseY,100,50);
}