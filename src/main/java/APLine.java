public class APLine
{
  public APLine(int a, int b, int c){}
  public double getSlope(){
    return -a/b;
  } 
  public boolean isOnLine(int x, int y){
    if(a*x+b*y+c==0)
        return true;
    return false;
  }
}
