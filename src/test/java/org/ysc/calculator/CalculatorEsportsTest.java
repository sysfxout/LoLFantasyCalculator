package org.ysc.calculator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.ysc.calculator.mapping.ConversionMap;
import org.ysc.calculator.mapping.ESportsConversionMap;
import org.ysc.calculator.model.Stats;

public class CalculatorEsportsTest {

	private static final double DELTA = .000000001;// For assertEquals delta
													// value
	private ConversionMap conversionMap = new ESportsConversionMap();

	@Test
	public void testCalculateEmpty() {
		Calculator calculator = new Calculator(conversionMap, new Stats());
		assertEquals(0.0, calculator.calcluate(), DELTA);
	}

	@Test
	public void testCalculateKills() {

		Stats stats = new Stats();

		stats.setK(1);

		Calculator calculator = new Calculator(conversionMap, stats);
		assertEquals(2.0, calculator.calcluate(), DELTA);

		stats.setK(10);
		assertEquals(20.0, calculator.calcluate(), DELTA);
	}

	@Test
	public void testCalculateDeaths() {

		Stats stats = new Stats();
		stats.setD(1);

		Calculator calculator = new Calculator(conversionMap, stats);
		assertEquals(-.5, calculator.calcluate(), DELTA);

		stats.setD(10);
		assertEquals(-5.0, calculator.calcluate(), DELTA);
	}

	@Test
	public void testCalculateAssists() {

		Stats stats = new Stats();
		stats.setA(1);

		Calculator calculator = new Calculator(conversionMap, stats);
		assertEquals(1.5, calculator.calcluate(), DELTA);

		stats.setA(10);
		assertEquals(15.0, calculator.calcluate(), DELTA);
	}

	@Test
	public void testCalculateCs() {

		Stats stats = new Stats();
		stats.setCs(1);

		Calculator calculator = new Calculator(conversionMap, stats);
		assertEquals(.01, calculator.calcluate(), DELTA);

		stats.setCs(10);
		assertEquals(.1, calculator.calcluate(), DELTA);
	}

	@Test
	public void testCalculateKa10() {

		Stats stats = new Stats();
		stats.setKa10(false);

		Calculator calculator = new Calculator(conversionMap, stats);
		assertEquals(0, calculator.calcluate(), DELTA);

		stats.setKa10(true);
		assertEquals(2.0, calculator.calcluate(), DELTA);
	}

	@Test
	public void testCalculateTriple() {

		Stats stats = new Stats();
		stats.setTriple(1);

		Calculator calculator = new Calculator(conversionMap, stats);
		assertEquals(2.0, calculator.calcluate(), DELTA);

		stats.setTriple(10);
		assertEquals(20.0, calculator.calcluate(), DELTA);
	}

	@Test
	public void testCalculateQuadra() {

		Stats stats = new Stats();
		stats.setQuadra(1);

		Calculator calculator = new Calculator(conversionMap, stats);
		assertEquals(5.0, calculator.calcluate(), DELTA);

		stats.setQuadra(10);
		assertEquals(50.0, calculator.calcluate(), DELTA);
	}

	@Test
	public void testCalculatePenta() {

		Stats stats = new Stats();
		stats.setPenta(1);

		Calculator calculator = new Calculator(conversionMap, stats);
		assertEquals(10.0, calculator.calcluate(), DELTA);

		stats.setPenta(10);
		assertEquals(100.0, calculator.calcluate(), DELTA);
	}

	@Test
	public void testCalculateTurret() {

		Stats stats = new Stats();
		stats.setTurret(1);

		Calculator calculator = new Calculator(conversionMap, stats);
		assertEquals(1.0, calculator.calcluate(), DELTA);

		stats.setTurret(10);
		assertEquals(10.0, calculator.calcluate(), DELTA);
	}

	@Test
	public void testCalculateDragon() {

		Stats stats = new Stats();
		stats.setDragon(1);

		Calculator calculator = new Calculator(conversionMap, stats);
		assertEquals(1.0, calculator.calcluate(), DELTA);

		stats.setDragon(10);
		assertEquals(10.0, calculator.calcluate(), DELTA);
	}

	@Test
	public void testCalculateBaron() {

		Stats stats = new Stats();
		stats.setBaron(1);

		Calculator calculator = new Calculator(conversionMap, stats);
		assertEquals(2.0, calculator.calcluate(), DELTA);

		stats.setBaron(10);
		assertEquals(20.0, calculator.calcluate(), DELTA);
	}

	@Test
	public void testCalculateWin() {

		Stats stats = new Stats();
		stats.setWin(false);

		Calculator calculator = new Calculator(conversionMap, stats);
		assertEquals(0.0, calculator.calcluate(), DELTA);

		stats.setWin(true);
		assertEquals(2.0, calculator.calcluate(), DELTA);
	}

	@Test
	public void testCalculateWin30() {

		Stats stats = new Stats();
		stats.setWin30(false);

		Calculator calculator = new Calculator(conversionMap, stats);
		assertEquals(0, calculator.calcluate(), DELTA);

		stats.setWin30(true);
		assertEquals(2.0, calculator.calcluate(), DELTA);
	}

	@Test
	public void testCalculateFB() {

		Stats stats = new Stats();
		stats.setFb(false);

		Calculator calculator = new Calculator(conversionMap, stats);
		assertEquals(0, calculator.calcluate(), DELTA);

		stats.setFb(true);
		assertEquals(2.0, calculator.calcluate(), DELTA);
	}

	/*
	 * Data from Froggen
	 * http://matchhistory.na.leagueoflegends.com/en/#match-details/TRLH1/
	 * 1001520119?gameHash=44d0e53ce9d31537&tab=overview
	 */
	@Test
	public void testCalculatePlayerStats() {

		Stats stats = new Stats();
		stats.setKDA(3, 2, 7);
		stats.setCs(324);

		Calculator calculator = new Calculator(conversionMap, stats);
		assertEquals(18.74, calculator.calcluate(), DELTA);
	}

	/*
	 * Data from Echo Fox
	 * http://matchhistory.na.leagueoflegends.com/en/#match-details/TRLH1/
	 * 1001520119?gameHash=44d0e53ce9d31537&tab=overview
	 */
	@Test
	public void testCalculateTeamStats() {

		Stats stats = new Stats();
		stats.setTurret(9);
		stats.setDragon(2);
		stats.setBaron(1);
		stats.setWin(true);
		stats.setWin30(false);
		stats.setFb(true);

		Calculator calculator = new Calculator(conversionMap, stats);
		assertEquals(17.00, calculator.calcluate(), DELTA);

	}

}
