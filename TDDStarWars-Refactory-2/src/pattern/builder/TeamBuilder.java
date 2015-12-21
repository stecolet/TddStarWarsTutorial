package pattern.builder;

import model.emperials.EmperialTeam;
import model.emperials.Tie;
import model.emperials.TieBomber;
import model.emperials.TieInterceptor;
import model.rebels.AWing;
import model.rebels.BWing;
import model.rebels.RebelsTeam;
import model.rebels.XWing;
import model.rebels.YWing;

public class TeamBuilder {

	public RebelsTeam makeRebelsTeam(int aWingesNumber, int bWingesNumber, int xWingesNumber, int yWingseNumber)
	{
		RebelsTeam team=new RebelsTeam();

		for (int i=0;i<aWingesNumber;i++)
			team.addFighter(new AWing());

		for (int i=0;i<bWingesNumber;i++)
			team.addFighter(new BWing());


		for (int i=0;i<xWingesNumber;i++)
			team.addFighter(new XWing());


		for (int i=0;i<yWingseNumber;i++)
			team.addFighter(new YWing());

		return team;

	}

	public EmperialTeam makeEmperialsTeam(int tiesNumber, int tieBombersNumber, int tieInterceptorsNumber)
	{
		EmperialTeam team=new EmperialTeam();

		for (int i=0;i<tiesNumber;i++)
			team.addFighter(new Tie());

		for (int i=0;i<tieBombersNumber;i++)
			team.addFighter(new TieBomber());


		for (int i=0;i<tieInterceptorsNumber;i++)
			team.addFighter(new TieInterceptor());

		return team;

	}
}
