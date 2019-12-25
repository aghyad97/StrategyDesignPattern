package lab13;

import java.util.Random;

public class Fast implements Speed{

	@Override
	public void Position(Ghost G) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int X =  201 + rand.nextInt(201);
		int Y =  201 + rand.nextInt(201);
		G.setX(G.getX() + X);
		G.setY(G.getY() + Y);
	}

}
