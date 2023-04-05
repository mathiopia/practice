import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;


public class Game extends Canvas implements Runnable{

	public static int width = 300;	
	public static int height = width/ 16*9;	
	public static int scale = 3;

	private JFrame frame;
	private Thread thread;
	private boolean running = false;

	//constructor
	public Game (){
		Dimension size = new Dimension( width*scale, height*scale);
		setPreferredSize(size);
		frame = new JFrame();
	}

	//creating a thread and starting and stoping the thread
	public synchronized void start(){
		running = true;
		thread = new Thread(this,"Display");
		thread.start();
	}
	public synchronized void stop(){
		running = false;
		try{
			thread.join();
		}
		catch(InterruptedException e){
				e.printStackTrace();	
		}
	}

	//Game loop
	public void run(){
		while (running){
		}
	}
	public void update(){

	}
	public void render(){
	}


	//main
	public static void main (String args[]){
		Game game = new Game();
		game.frame.setResizable(false);
		game.frame.setTitle("rain");
		game.frame.add(game);
		game.frame.pack(); // make the frame's window size the same as the game size
		game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.frame.setLocationRelativeTo(null);
		game.frame.setVisible(true);

		game.start();
	}
}

