package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import model.common.BattleStart;
import model.emperials.EmperialTeam;
import model.emperials.Tie;
import model.emperials.TieBomber;
import model.emperials.TieInterceptor;
import model.exception.MissingFighterException;
import model.exception.MissingTeamException;
import model.rebels.AWing;
import model.rebels.BWing;
import model.rebels.RebelsTeam;
import model.rebels.XWing;
import model.rebels.YWing;
import pattern.builder.TeamBuilder;

public class StarWarsTest {

	/*
	 * Una flotta stellare pu� essere ribelle o imperiale.
	 * Le navicelle ribelle possono essere:
	 * 	- A Wing : 1pt
	 *	- X Wing : 2pt
	 *	- Y Wing : 3pt
	 *  - B Wing:  1pt
	 *
	 *Le navicelle imperiali invece:
	 *	- Tie: 1pt
	 *	- Tie-Interceptor: 2pt
	 *  - Tie- Bomber: 3 pt
	 *
	 *  In caso di parit� vincono i ribelli.
	 */



	/*
	 * Preconditions:
	 *  1) Each battlestar must refers one RebelTeam and one EmperialTeam before play the battle.
	 *  2) Each Team must contains at least one fighter.
	 *  3) Each fighter must be setted with a fighter points.
	 *
	 *
	 * Postcondition
	 *	1) After the battle, it will has one winner.
	 * @throws MissingFighterException
	 *
	 */


	/*	Refactory 1:
	 * - Gerarchie per le navicelle (Fighter)
	 * - Gerarchie per le flotte spaziali (Team)
	 * - Pattern Builder   AFTER TEST
	 * - Pattern Factory
	 */

/*
 *------------------- PRECONDITIONS TEST------------------------------------
 */
	@Test
	public void testBattleStarMissingTeamException() throws MissingFighterException
	{
		BattleStart battle=new BattleStart(new RebelsTeam(), null);
		battle.getRebelTeam().addFighter(new AWing());

		try
		{
			battle.play();
		}
		catch(MissingTeamException e)
		{
			Assert.assertTrue(true);
			return;
		}

		Assert.fail();

	}

	@Test
	public void testTeamMissingFighterException() throws MissingTeamException
	{
		BattleStart battle=new BattleStart(new RebelsTeam(), new EmperialTeam());

		battle.getRebelTeam().addFighter(new AWing());
		battle.getRebelTeam().addFighter(new AWing());
		battle.getRebelTeam().addFighter(new XWing());
		battle.getRebelTeam().addFighter(new YWing());


		try
		{
			battle.play();
		}
		catch(MissingFighterException e)
		{
			Assert.assertTrue(true);
			return;
		}

		Assert.fail();

	}


	@Test
	public void testFighterWithoutPointsException()
	{
		Assert.assertNotNull(new AWing().getPoint());
		Assert.assertNotNull(new BWing().getPoint());
		Assert.assertNotNull(new YWing().getPoint());
		Assert.assertNotNull(new XWing().getPoint());
		Assert.assertNotNull(new YWing().getPoint());
		Assert.assertNotNull(new Tie().getPoint());
		Assert.assertNotNull(new TieBomber().getPoint());
		Assert.assertNotNull(new TieInterceptor().getPoint());

		Assert.assertNotEquals(new AWing().getPoint().intValue(), 0);
		Assert.assertNotEquals(new BWing().getPoint().intValue(), 0);
		Assert.assertNotEquals(new YWing().getPoint().intValue(), 0);
		Assert.assertNotEquals(new Tie().getPoint().intValue(), 0);
		Assert.assertNotEquals(new TieBomber().getPoint().intValue(), 0);
		Assert.assertNotEquals(new TieInterceptor().getPoint().intValue(), 0);

	}

/*
 *------------------- POSTCONDITIONS TEST ------------------------------------
 */
	@Test
	public void testAfterBattletWinnerMustExist() throws MissingFighterException, MissingTeamException
	{
		BattleStart battle=new BattleStart(new RebelsTeam(), new EmperialTeam());

		battle.getRebelTeam().addFighter(new AWing());
		battle.getRebelTeam().addFighter(new AWing());
		battle.getRebelTeam().addFighter(new XWing());
		battle.getRebelTeam().addFighter(new YWing());

		battle.getEmpireTeam().addFighter(new Tie());
		battle.getEmpireTeam().addFighter(new TieBomber());

		battle.play();

		Assert.assertTrue(battle.rebelsWin());
		Assert.assertFalse(battle.empireWin());


		battle.getEmpireTeam().addFighter(new TieInterceptor());
		battle.getEmpireTeam().addFighter(new TieInterceptor());
		battle.getEmpireTeam().addFighter(new TieInterceptor());
		battle.getEmpireTeam().addFighter(new TieInterceptor());
		battle.getEmpireTeam().addFighter(new TieInterceptor());

		battle.play();

		Assert.assertFalse(battle.rebelsWin());
		Assert.assertTrue(battle.empireWin());


	}

/*
 * ------------------- BUSINESS TEST ------------------------------------------
 */

	@Test
	public void testRebelsWin() throws MissingFighterException, MissingTeamException {

		BattleStart battle=new BattleStart(new RebelsTeam(), new EmperialTeam());

		battle.getRebelTeam().addFighter(new AWing());
		battle.getRebelTeam().addFighter(new AWing());
		battle.getRebelTeam().addFighter(new XWing());
		battle.getRebelTeam().addFighter(new YWing());

		battle.getEmpireTeam().addFighter(new Tie());
		battle.getEmpireTeam().addFighter(new TieBomber());

		battle.play();

		Assert.assertTrue(battle.rebelsWin());
		Assert.assertFalse(battle.empireWin());
	}

	@Test
	public void testEmperialsWin() throws MissingFighterException, MissingTeamException
	{
		BattleStart battle=new BattleStart(new RebelsTeam(), new EmperialTeam());

		battle.getRebelTeam().addFighter(new AWing());

		battle.getEmpireTeam().addFighter(new Tie());
		battle.getEmpireTeam().addFighter(new TieBomber());
		battle.getEmpireTeam().addFighter(new TieBomber());

		battle.play();

		Assert.assertFalse(battle.rebelsWin());
		Assert.assertTrue(battle.empireWin());
	}

	@Test
	public void testRebelsWinWithTheSamePointsOfEmperials() throws MissingFighterException, MissingTeamException
	{
		BattleStart battle=new BattleStart(new RebelsTeam(), new EmperialTeam());

		battle.getRebelTeam().addFighter(new AWing());
		battle.getRebelTeam().addFighter(new YWing());

		battle.getEmpireTeam().addFighter(new Tie());
		battle.getEmpireTeam().addFighter(new TieBomber());

		battle.play();

		Assert.assertTrue(battle.rebelsWin());
		Assert.assertFalse(battle.empireWin());
	}

/*
 * ----------------- DEVELOPER TEST --------------------------------------------
 */

	@Test
	public void testGetTotalPointFromTeam() throws MissingFighterException
	{
		RebelsTeam rebelsWith7Points=new RebelsTeam();


		rebelsWith7Points.addFighter(new AWing());
		rebelsWith7Points.addFighter(new AWing());
		rebelsWith7Points.addFighter(new XWing());
		rebelsWith7Points.addFighter(new YWing());
		Assert.assertEquals(rebelsWith7Points.getTotalPoint(), 7);

		EmperialTeam emperialWith4Points=new EmperialTeam();
		emperialWith4Points.addFighter(new Tie());
		emperialWith4Points.addFighter(new TieBomber());
		Assert.assertEquals(emperialWith4Points.getTotalPoint(), 4);
	}


	@Test
	public void testTeamBuilder()
	{
		TeamBuilder builder=new TeamBuilder();

		 try {
			Assert.assertEquals(builder.makeRebelsTeam(1, 4, 3, 2).getTotalPoint(),1*1+4*1+3*2+2*3);
			Assert.assertEquals(builder.makeEmperialsTeam(2, 3, 1).getTotalPoint(),2*1+3*3+1*2);
		} catch (MissingFighterException e) {

			Assert.fail();
		}
	}


}
