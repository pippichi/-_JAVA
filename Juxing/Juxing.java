class Juxing{
 double width=1.0,height=1.0;
 Juxing(){
 
 }
  Juxing(double newWidth,double newHeight){
  width=newWidth;
  height=newHeight;
  }
  double getWidth(){
  return width;
  }
  double getHeight(){
  return height;
  }
  double getArea(){
  return (double)((width*height*100.00)/100.00);
  }
  double getPerimeter(){
  return (width+height)*2;
  }
}