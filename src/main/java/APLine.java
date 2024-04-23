public class APLine
{
  private double aa=0;
  private double bb=0;
  private double cc=0;
  public APLine(int a, int b, int c){
    aa = a;
    bb = b;
    cc = c;
  }
  public double getSlope(){
    return -(aa/bb);
  } 
  public boolean isOnLine(int x, int y){
    if(((aa*x)+(bb*y)+cc)==0)
        return true;
    return false;
  }
}
