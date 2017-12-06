//1. Make an interger variable to keep track of the dot's x position
void setup() {
    size(800, 200);
}
int r2d2 = 10;


void draw() {
 background(220);
    //3. make it a nice color
   fill(#13309D);
    //4. if the mouse is pressed...
   if(mousePressed){

     //5. ... change the X coordinate so that the dot moves to the right
     r2d2 = r2d2 + 100;
   
    ellipse(r2d2,100,100,100);
    
   }
}