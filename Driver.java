package lab13;

public class Driver {
	public static void main(String[] main) throws InterruptedException {
		Ghost G = new Ghost();

		G.SpeedtoSlow();
		Thread.sleep(3000);
		G.SpeedtoMedium();
		Thread.sleep(3000);
		G.SpeedtoFast();
		Thread.sleep(3000);
	}
}
