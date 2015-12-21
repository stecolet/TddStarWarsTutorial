package model;

public class BattleStart {

	private RebelsTeam rebels;
	private EmperialTeam emperials;


	private int rebelsPoint=0;
	private int emperialPoint=0;

	public BattleStart(RebelsTeam rebelsTeam, EmperialTeam emperialTeam) {
		rebels=rebelsTeam;
		emperials=emperialTeam;
	}

	public RebelsTeam getRebelTeam() {
		return rebels;
	}

	public EmperialTeam getEmpireTeam() {
		return emperials;
	}



	public void play() throws MissingFighterException,MissingTeamException {

		rebelsPoint=0;
		emperialPoint=0;
		rebelsPoint=rebels.getTotalPoint();
		emperialPoint=emperials.getTotalPoint();

	}

	public Boolean rebelsWin() {
		return rebelsPoint>=emperialPoint;
	}

	public Boolean empireWin() {
		return emperialPoint>rebelsPoint;
	}

}
