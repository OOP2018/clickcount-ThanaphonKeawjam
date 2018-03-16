package counter;

import java.util.Scanner;

import javax.sound.midi.ControllerEventListener;

/**
 * Test the Observer Observable behavior for Counter object.
 * @author Thanaphon Keawjam
 *
 */
public class ObserverTest {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		// 1. create the subject (Observable)
		Counter counter = new Counter();
		// 2. create the observer with reference to subject
		ConsoleView view = new ConsoleView(counter);
		// 3. add observer to subject
		counter.addObserver(view);
		
		// Create another observer
		//CounterView view2 = new CounterView(counter);
		//view2.run();
		
		// 4. run the app
		while(true) {
			System.out.print("how much? ");
			int howmuch = console.nextInt();
			counter.add(howmuch);
		}
	}

}
