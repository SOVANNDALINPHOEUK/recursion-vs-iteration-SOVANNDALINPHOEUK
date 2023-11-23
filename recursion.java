public class recursion {
  public static void main(String[] args) {

    System.out.println("5 to the power 2 is " + power(5,2));
    System.out.println("6 to the power 3 is " + power(6,3));
    System.out.println("7 to the power 4 is " + power(7,4));
    System.out.println("8 to the power 5 is " + power(8,5));
  
    static double power(double x, int n) {
      if (n != 0)
         return (x * power(x, n - 1));
      else
         return 1;
    }
  
}
}    
