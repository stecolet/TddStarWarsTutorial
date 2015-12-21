package model.common;

import model.exception.MissingFighterException;

public abstract class Team {

	protected int currentPoint = 0;

	public Team() {
		super();
	}

	public int getTotalPoint() throws MissingFighterException {
		if(currentPoint==0)
			throw new MissingFighterException();

		return currentPoint;
	}

	public abstract void addFighter(Fighter fighter);

}