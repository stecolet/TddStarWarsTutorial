package model;

public class EmperialTeam {

	private int currentPoint=0;

	public void addFighter(Tie tie) {

		currentPoint+=tie.getPoint();
	}

	public void addFighter(TieInterceptor tieInterceptor) {

		currentPoint+=tieInterceptor.getPoint();

	}

	public void addFighter(TieBomber tieBomber) {

		currentPoint+=tieBomber.getPoint();
	}

	public int getTotalPoint()
	{
		return currentPoint;
	}

}
