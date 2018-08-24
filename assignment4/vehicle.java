class Vehicle
{
  public void Start()
  {
    System.out.println("push start ");
  }
  public void Stop()
  {
    System.out.println("push stop");
  }
}
  class Twowheeler extends Vehicle
  {
    public void Start()
  {
    System.out.println("apply self");
  }
  public void Stop()
  {
    System.out.println("apply brakes");
  }
  }
  class Fourwheeler extends Vehicle
  {
    public void Start()
  {
    System.out.println("Start by push");
  }
  public void Stop()
  {
    System.out.println("Stop by brakes");
  }
  }

class Main {
  public static void main(String[] args) {
    Vehicle v=new Twowheeler();
    v.Start();
    v.Stop();
    v=new Fourwheeler();
    v.Start();
    v.Stop();
    
    
  }
}