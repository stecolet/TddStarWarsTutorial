package model.emperials;

import model.common.Fighter;
import model.common.Team;

public class EmperialTeam extends Team {


	/*
	public void addFighter(Tie tie) {

		currentPoint+=tie.getPoint();
	}

	public void addFighter(TieInterceptor tieInterceptor) {

		currentPoint+=tieInterceptor.getPoint();

	}

	public void addFighter(TieBomber tieBomber) {

		currentPoint+=tieBomber.getPoint();
	}
*/
	@Override
	public void addFighter(Fighter fighter) {

		currentPoint+=fighter.getPoint();
	}

}
