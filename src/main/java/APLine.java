public class APLine
{
  private int aa=0;
  private int bb=0;
  private int cc=0;
  public APLine(int a, int b, int c){
    int aa = a;
    int bb = b;
    int cc = c;
  }
  public double getSlope(){
    return (double)-(aa/bb);
  } 
  public boolean isOnLine(int x, int y){
    if(((aa*x)+(bb*y)+cc)==0)
        return true;
    return false;
  }
}
