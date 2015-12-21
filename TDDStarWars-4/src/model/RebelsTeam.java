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
	public int getTotalPoint() throws MissingFighterException
	{
		if(currentPoint==0)
			throw new MissingFighterException();

		return currentPoint;
	}




}
