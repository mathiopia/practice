import java.util.ArrayList;

public class ObserverEx1{
  public static void  main(String []args){
    //observable (subject, watched)
    WeatherInstitute EWI = new WeatherInstitute();

    //observer (watcher)
    CurrentWeather tempDisplayer = new CurrentWeather();
    Averager averager = new Averager();
    
    EWI.addObserver(averager);
    EWI.addObserver(tempDisplayer);

    EWI.setData(30);
    EWI.setData(41);
    EWI.setData(-3);
  }
} 

public interface Subject{
  public void addObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObserver();
}


public class WeatherInstitute implements Subject{
  // initializing everything
  ArrayList Observers;
  float temprarture;
  public WeatherInstitute(){
    Observers = new ArrayList();
  }
  //add remove and notify
  public void addObserver(Observer observer){
    Observers.add(observer);
  }
  public void removeObserver(Observer observer){
    int i = Observers.indexOf(observer);
    if(i > 0)
      Observers.remove(i);
  }
  //notifies each observer by updating their data values
  //it's like saying hay observer update your data to my new data
  public void notifyObserver(){
    for(int i=0; i<Observers.size(); i++){
      Observer observer = (Observer)Observers.get(i);
      observer.update(temprarture);
    } 
  }
  //for knowing if the data have changed and notify the observer if it did
  public void dataChanged(){
    notifyObserver();
  }
  public void setData(float temp){
    this.temprarture = temp;
    dataChanged();
  }
  
}

// this observers the subject and every time the subject changes value it get an update
public  interface Observer{
  public void update(float temprarture);
}

//this just forces us to display what we observed
public interface Display{
  public void display();
}

// there are two implementation of display and observer which observer the subject 
public class CurrentWeather implements Display, Observer{
  float temprarture;

  public void update (float temprarture){
    this.temprarture = temprarture;
    display();
  }
  public void display (){
    System.out.println("current data is " + temprarture);
  }
}

public class Averager implements Display, Observer{
  float temprarture;
  float total=0;
  float numberOfData=0;
  float average;

  public void update(float temprarture){
    this.temprarture = temprarture;
    total+=temprarture;
    numberOfData++;
    display();
  }
  public float getAverage(){
    average = total / numberOfData;
    return average;
  }
  public void display(){
    System.out.println("Average is "+ getAverage());
  } 
}





