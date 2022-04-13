import java.util.Scanner;

public class Table {

  static int width  = 0;
  static int height = 0;
  
  public static void main(String[] args) {
    Scanner s   = new Scanner(System.in);
    width  = s.nextInt(); 
    height = s.nextInt();
    Shape shape = new Square(s.nextInt(), s.nextInt(), 0);
    if( shape.getX()>=width || shape.getX()<0 || shape.getY()>=height || shape.getY()<0 ) { shape.printAndExit(false); }
    while(s.hasNext()) {
      shape.command(s.nextInt());
      if( shape.getX()>=width || shape.getX()<0 || shape.getY()>=height || shape.getY()<0 ) { shape.printAndExit(false); }
    }
    s.close();
    shape.printAndExit(true);
  }
}
