public class StratagyEx2{
  public static void main(String args[]){
    Writer w = new consoleWriter();
    Simulate car = new Simulate(w);
    car.display();
		car.calculate();
  }
}


public class Simulate{
	private Writer writer;
	public Simulate(Writer w){
		this.writer = w;	
	}
  void calculate(){
		writer.write("calculated result");
  }
  public void display(){
		String s = "displaying";
		writer.write(s);
  }
}


public interface Writer{
  public void write(String data);
}
public class consoleWriter implements Writer{
	public void write(String data){
		System.out.println(data);
	}
}

