package model.rebels;

import model.common.Fighter;
import model.common.Team;

public class RebelsTeam extends Team {


	/*
	 *
	 *	private int currentPoint=0;
	 *
	public void addFighter(AWing aWing) {

		currentPoint+=aWing.getPoint();
	}

	public void addFighter(XWing xWing) {

		currentPoint+=xWing.getPoint();
	}

	public void addFighter(YWing yWing) {

		currentPoint+=yWing.getPoint();
	}
	 */


	@Override
	public void addFighter(Fighter fighter) {

		currentPoint+=fighter.getPoint();
	}

}
