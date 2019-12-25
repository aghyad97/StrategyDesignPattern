package lab13;

import java.util.Random;

public class Medium implements Speed{

	@Override
	public void Position(Ghost G) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int X = 101 + rand.nextInt(101);
		int Y = 101 + rand.nextInt(101);
		G.setX(G.getX() + X);
		G.setY(G.getY() + Y);
	}

}
