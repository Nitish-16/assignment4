class Overloading
{
  public void display(String s)
  {
    System.out.println(s);
  }
  public void display(int s)
  {
    System.out.println("integer no: "+s);
  }
  public void display(float s)
  {
    System.out.println("float no: "+s);
  }
}
class over {
  public static void main(String[] args) {
    Overloading a=new Overloading();
    a.display(null);
    a.display(16);
    a.display(16.2f);
  }
}