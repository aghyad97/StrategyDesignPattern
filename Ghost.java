package lab13;

public class Ghost implements Runnable {
	Speed S;
	int X;
	int Y;
	Ghost(){
		X = 0;
		Y = 0;
		S= new Slow();
		new Thread(this).start();
	}
	public void SpeedtoSlow() {
		System.out.println("Setting speed to Slow");
		S = new Slow();
	}
	public void SpeedtoMedium() {
		System.out.println("Setting speed to Medium");
		S = new Medium();
	}
	public void SpeedtoFast() {
		System.out.println("Setting speed to Fast");
		S = new Fast();
	}

	public Speed getS() {
		return S;
	}

	public void setS(Speed s) {
		S = s;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) 
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			S.Position(this);
			System.out.println("speed("+ X + "," + Y +")");
		}
	}


}
