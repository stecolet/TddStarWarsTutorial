package model;

public class RebelsTeam {

	private int currentPoint=0;


	public void addFighter(AWing aWing) {

		currentPoint+=aWing.getPoint();
	}

	public void addFighter(XWing xWing) {

		currentPoint+=xWing.getPoint();
	}

	public void addFighter(YWing yWing) {

		currentPoint+=yWing.getPoint();
	}


	//DEVELOPER METHOD
	public int getTotalPoint()
	{
		return currentPoint;
	}




}
