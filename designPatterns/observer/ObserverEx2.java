import java.util.ArrayList;
public class ObserverEx2{
  public static void main(String []args){
    character queen   = new Queen(); 
    Observer display  = new DisplayOnConsule(); 

    queen.makeVisible(display);//adding an observer
    queen.setWeapon(new Sword());
    queen.setWeapon(new Knife());
  }
}

public interface character{

  public void makeVisible(Observer d);
  public void makeHidden(Observer d);
  public void setWeapon(WeaponType w);
}

public class Queen implements character{
  ArrayList<Observer> Observers;
  WeaponType weaponType; //Strategies  
  public Queen(){
    Observers = new ArrayList<Observer>();
    weaponType = new Knife(); 
  }

  public void setWeapon(WeaponType weaponType){
    this.weaponType=weaponType;
    weaponTypeChanged();
  }
  public void  weaponTypeChanged(){
     notifyObserver();
  }

  public void makeVisible(Observer d){
    Observers.add(d);
  }
  public void makeHidden(Observer d){
    int i = Observers.indexOf(d);
    if (i>0)
      Observers.remove(i);
  }
  public void notifyObserver(){
    for(int i=0; i<Observers.size(); i++){
      Observer observer = (Observer)Observers.get(i);
      observer.update(weaponType);
    }
  }

}

//algorithms we can implement
public interface WeaponType {
  public String getNameOfWeapon();
}

public class Sword implements WeaponType{
  public String getNameOfWeapon(){
    return "Sword";
  }
}
public class Knife implements WeaponType{
  public String getNameOfWeapon(){
    return "Knife";
  }
}

//Observers
public interface Observer{
  public void update(WeaponType w);
}

public class DisplayOnConsule implements Observer{
  WeaponType weapon;

  public void update(WeaponType weapon){
    this.weapon = weapon;
    display(); 
  }
  public void display(){
    System.out.println("i am queen fighting with "+ weapon);
  }
}
