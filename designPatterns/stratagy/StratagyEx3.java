public class StratagyEx3{
  public static void main (String args[]){
    Queen testQueeen = new Queen();
    testQueeen.fight();
    testQueeen.MyWeapon();
    testQueeen.SetWeapon(new Sword());
    testQueeen.MyWeapon();
    System.out.println("  end ");

    Soldier testSoldier = new Soldier();
    testSoldier.fight();
    testSoldier.MyWeapon();

    King testKing = new King();
    testKing.fight();
    testKing.MyWeapon();

  }
}
public abstract class Charactor{
  WeaponBehavior weaponBehavior;
  abstract void fight();
  public void SetWeapon(WeaponBehavior wb){
    weaponBehavior =wb;
  }
  public void MyWeapon(){
    weaponBehavior.myWeapon();
  }
  
}
public class Queen extends Charactor{
  public Queen (){
    weaponBehavior = new Knife() ;
  }
  void fight (){
    System.out.println("i fight like a queen");
  }
} 
public class King extends Charactor{
  public King (){
    weaponBehavior = new Sword() ;
  }
  void fight (){
    System.out.println("i fight like a King");
  }
} 
public class Soldier extends Charactor{
  public Soldier (){
    weaponBehavior = new BowAndArrow() ;
  }
  void fight (){
    System.out.println("i fight like a soldier");
  }
} 

// encapsulated family of algorithms 
interface WeaponBehavior{
  void myWeapon();
}

class Knife implements WeaponBehavior{
  public void myWeapon(){System.out.println("i use knife");}
}
class Sword implements WeaponBehavior{
 public void myWeapon(){System.out.println("i use Sword");}
}
class BowAndArrow implements WeaponBehavior{
  public void myWeapon(){System.out.println("i use Bow And Arrow");}
}

