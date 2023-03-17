public class Stratagy{
  public static void main (String args[]){
    
    RubberDuck toy =new RubberDuck();
    NormalDuck real =new NormalDuck();

     toy.performFly();
     toy.performQuack();

     real.performFly();
     real.performQuack();
  } 
}

public abstract class Duck{
    FlyBehavior flybehavior;
    QuackBehavior quackbehavior;

    public abstract void display();
    public void swim(){
      System.out.println(" Duck is swimming");
    }
    public void performFly(){
      flybehavior.fly();
    }
    public void performQuack(){
      quackbehavior.quack();
    }
}

// sub-classes of the duck class
public class RubberDuck extends Duck{
    public RubberDuck(){
      flybehavior = new canNotFly();
      quackbehavior = new normalQuack();
    }
    public void display(){
      System.out.println("Rubber Duck");
    }

} 
public class DecoyDuck extends Duck{
    public  DecoyDuck(){
      flybehavior = new canNotFly();
      quackbehavior = new muteQuack();
    }
    public void display(){
      System.out.println("Rubber Duck");
    }
}

public class NormalDuck extends Duck {
    public NormalDuck(){
       flybehavior = new flyWithWing();
       quackbehavior = new normalQuack();
    }
    public void display(){
       System.out.println("Rubber Duck");
    }
}

// we separated what varies and encapsulate it down

interface FlyBehavior{
  public void fly();
}
class flyWithWing implements FlyBehavior{
  public void fly(){
    System.out.println("Fly with wings");
  }
}
class canNotFly implements FlyBehavior{
  public void fly(){System.out.println("sorry i can't fly");}
}

interface QuackBehavior{
  public void quack();
}
class normalQuack implements QuackBehavior{
  public void quack(){System.out.println("quack normally");}
}
class muteQuack implements QuackBehavior{
  public void quack(){System.out.println("sorry i can't quack I'm muted ");}
}
