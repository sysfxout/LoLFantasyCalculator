package org.ysc.calculator;

import java.util.Map.Entry;

import org.ysc.calculator.key.ConversionKey;
import org.ysc.calculator.mapping.ConversionMap;
import org.ysc.calculator.model.Stats;

public class Calculator {

	private ConversionMap conversionMap;
	private Stats stats;
	
	public Calculator(ConversionMap conversionMap){
		this.conversionMap = conversionMap;
	}
	
	public Calculator(ConversionMap conversionMap, Stats stats) {
		this.conversionMap = conversionMap;
		this.stats = stats;
	}

	public double calcluate() {
		double points = 0.0;
		for (Entry<ConversionKey, Double> entry : conversionMap.getConversionMap().entrySet()) {
			switch (entry.getKey()) {
			case K:
				points += stats.getK() * entry.getValue();
				break;
			case D:
				points += stats.getD() * entry.getValue();
				break;
			case A:
				points += stats.getA() * entry.getValue();
				break;
			case CS:
				points += stats.getCs() * entry.getValue();
				break;
			case BARON:
				points += stats.getBaron() * entry.getValue();
				break;
			case DRAGON:
				points += stats.getDragon() * entry.getValue();
				break;
			case FB:
				if (stats.isFb())
					points += 1 * entry.getValue();
				break;
			case KA10:
				if (stats.isKa10())
					points += 1 * entry.getValue();
				break;
			case PENTA:
				points += stats.getPenta() * entry.getValue();
				break;
			case QUADRA:
				points += stats.getQuadra() * entry.getValue();
				break;
			case TRIPLE:
				points += stats.getTriple() * entry.getValue();
				break;
			case TURRET:
				points += stats.getTurret() * entry.getValue();
				break;
			case W30:
				if (stats.isWin30())
					points += 1 * entry.getValue();
				break;
			case WIN:
				if (stats.isWin())
					points += 1 * entry.getValue();
				break;
			default:
				break;
			}
		}
		return points;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}
	
	public void setConversionMap(ConversionMap conversionMap){
		this.conversionMap = conversionMap;
	}
	
}
