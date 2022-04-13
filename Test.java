
public class Test {

  public static void main(String[] args) {
    Shape s = new  Shape(5,5,0);

    if(!(s.getY() == 5))
      fail("test failed");
    if(!(s.getX() == 5))
      fail("test failed");
    if(!(s.getOr() == 0))
      fail("test failed");
    s.command(1);
    if(!(s.getY() == 4))
      fail("test failed");
    s.command(2);
    if(!(s.getY() == 5))
      fail("test failed");
    s.command(3);
    if(!(s.getOr() == 1))
      fail("test failed");
    s.command(3);
    if(!(s.getOr() == 2))
      fail("test failed");
    s.command(3);
    if(!(s.getOr() == 3))
      fail("test failed");
    s.command(3);
    if(!(s.getOr() == 0))
      fail("test failed");
    s.command(4);
    if(!(s.getOr() == 3))
      fail("test failed");
    s.command(4);
    if(!(s.getOr() == 2))
      fail("test failed");
    s.command(4);
    if(!(s.getOr() == 1))
      fail("test failed");
    s.command(4);
    if(!(s.getOr() == 0))
      fail("test failed");
    s.command(3);
    s.command(1);
    if(!(s.getX() == 6))
      fail("test failed");
    s.command(2);
    if(!(s.getX() == 5))
      fail("test failed");

    System.out.println("ALL TEST COMPLETED SUCCESSFULLY");

  }
  private static void fail(String str){
    System.out.println(str); 
    System.exit(0);
  }
}
