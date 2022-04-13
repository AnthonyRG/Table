public class Shape {
  int x;
  int y;
  int orientation;  //   0=NORTH, 1=EAST, 2=SOUTH, 3=WEST
  
  public Shape(int xx, int yy, int or){
    x = xx;
    y = yy;
    orientation = or;
  }
  
  public int getX() {  return x;  }
  
  public int getY() {  return y;  }
  
  public int getOr() { return orientation;  }

  public void command(int cmd) {
    switch(cmd) {
      case 0: printAndExit(true);                             break;
      case 1: move( 1);                                       break;
      case 2: move(-1);                                       break;
      case 3: orientation = (orientation+1)%4;                break;
      case 4: orientation = Math.floorMod(orientation-1, 4);  break;
      default: printAndExit(true);                            break;
    }
  }
  
  public void move(int forward) {
    switch(orientation) {
      case 0:  y -= forward; break;
      case 1:  x += forward; break;
      case 2:  y += forward; break;
      case 3:  x -= forward; break;
      default: y -= forward; break;
    }
  }
  
  public void printAndExit(boolean status) {
    if(status)
      System.out.println("["+x+", "+y+"]");
    else
      System.out.println("[-1, -1]");     
    System.exit(0);
  }
}
