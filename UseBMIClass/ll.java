public class  ll{
 public static final double KILOGRAMS_PER_POUND = 0.45359237;
 public static final double METERS_PER_INCH = 0.0254;
 public static double height = 11;
 public static double weight = 12;
 public static void main(String[] args){
  double bmi = weight * KILOGRAMS_PER_POUND /
  ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
  System.out.print(Math.round(bmi * 100) / 100.0);
 }
 }