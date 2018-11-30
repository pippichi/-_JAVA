public class Circle2{
 double radius;
 static int numberOfObjects = 0;
 Circle2(){
  this(1.0);/*radius=1.0*/
  numberOfObjects++;
 }
 Circle2(double newRadius){
  if(newRadius>0)
   this.radius=newRadius;
   numberOfObjects++;
 }
 static int getNumberOfObjects(){
  return numberOfObjects;
 }
 double getArea(){
  return this.radius*this.radius*Math.PI;
 }
}