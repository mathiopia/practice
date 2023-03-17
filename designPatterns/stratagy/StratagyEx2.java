public class StratagyEx2{
  public static void main(String args[]){
    Simulate car = new Simulate();
    String carDisplay = car.display();
    Writer w = new Writer();
    w.write(carDisplay);
  }
}
public class Simulate{
  void calculate(){
    System.out.println("calculating something");
  }
  public String display(){
    return "display this";
  }
}
public class Writer{
  public void write(String data){
    System.out.println(data);
  }
}

