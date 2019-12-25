package lab13;

import java.util.Random;

public class Slow implements Speed {
	@Override
	public void Position(Ghost G) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int X =  21 + rand.nextInt(21);
		int Y =  21 + rand.nextInt(21);
		G.setX(G.getX() + X);
		G.setY(G.getY() + Y);
	}
}
