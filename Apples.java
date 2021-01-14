//this is a reference class
class Apple
{
  //instance variables
  private String type;
  private double size;
  private boolean isTart;

  //constructors
  public Apple()
  {
    type = null;
    size = 0;
    isTart = false;
  }

  //toString
  public String toString()
  {
    String output = "Type " + type +
                    "\nSize (inches diamater) " + size +
                    "\nIs It tart? " + isTart;
   return output;
  }
}