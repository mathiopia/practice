public class StratagyT2{
  public static void main(String args[]){
    NewDuck newDuck = new NewDuck();
    newDuck.performFly();
    newDuck.performQuack();
    System.out.println("now i lost my wing"); 
    newDuck.setFlyBehavior(new cantFly());
    newDuck.performFly();
  }
}

public abstract class Duck{
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public abstract  void Display();
  public void performFly(){
      flyBehavior.fly();
  }
  public void performQuack(){
      quackBehavior.quack();
  }
  public void setFlyBehavior(FlyBehavior fb){
    flyBehavior = fb;
  }
  public void setQuackBehavior(QuackBehavior qb){
    quackBehavior = qb;
  }
}

// Stratagies for implementation 
public interface FlyBehavior{
  public void fly();
}
public interface QuackBehavior{
  public void quack();
}
public class FlyWithWing implements FlyBehavior{
  public void fly(){System.out.println("flying with wing");}
} 
public class cantFly implements FlyBehavior{
  public void fly(){System.out.println("i can't fly");}
} 
public class cantQuack implements QuackBehavior{
  public void quack(){System.out.println("i can't quack i'm mute");}
} 
public class normalQuacking implements QuackBehavior{
  public void quack(){System.out.println("quack quack");}
}


//sub classes

public class NewDuck extends Duck{
  public void Display(){System.out.println("this is how i look");}
  public NewDuck(){
    flyBehavior = new FlyWithWing();
    quackBehavior = new cantQuack();
  }
}

