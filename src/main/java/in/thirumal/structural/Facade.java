/**
 * 
 */
package in.thirumal.structural;

/**
 * The Facade Design Pattern is a structural design pattern that provides a simplified interface to a complex subsystem.

   It acts like a front-facing interface that hides all the inner workings of a system and exposes only what is necessary to the client.

   Think of it like a hotel reception — you don’t need to know how room booking, housekeeping, 
   and dining work internally. You just go to the reception (facade), and they take care of everything behind the scenes.
 */
public class Facade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new DVDPlayer(), new Monitor(), new Amplifier());
		homeTheaterFacade.watch();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homeTheaterFacade.stop();
	}

}

class HomeTheaterFacade {
	DVDPlayer dvdPlayer;
	Monitor monitor;
	Amplifier amplifier;
	public HomeTheaterFacade(DVDPlayer dvdPlayer, Monitor monitor, Amplifier amplifier) {
		super();
		this.dvdPlayer = dvdPlayer;
		this.monitor = monitor;
		this.amplifier = amplifier;
	}
	
	public void watch() {
		dvdPlayer.on();
		amplifier.on();
		monitor.on();
		System.out.println("Playing....");
	}
	
	public void stop() {
		System.out.println("Stop playing");
		dvdPlayer.off();
		amplifier.off();
		monitor.off();
		
	}
}

class DVDPlayer {
	void on() {
		System.out.println("DVD Player is ON...");
	}
	void off() {
		System.out.println("DVD player OFF...");
	}
}

class Monitor {
	void on() {
		System.out.println("Monitor is ON...");
	}
	void off() {
		System.out.println("Monitor OFF...");
	}
}

class Amplifier {
	void on() {
		System.out.println("Amplifier is ON...");
	}
	void off() {
		System.out.println("Amplifier OFF...");
	}
}