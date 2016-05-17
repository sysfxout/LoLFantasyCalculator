package org.ysc.calculator.mapping;

import org.ysc.calculator.key.ConversionKey;

public class DKConversionMap extends ConversionMap {

	public DKConversionMap() {
		initPlayerConversions();
		initTeamConversions();

	}

	@Override
	protected void initPlayerConversions() {

		conversionMap.put(ConversionKey.K, 3.0);
		conversionMap.put(ConversionKey.D, -1.0);
		conversionMap.put(ConversionKey.A, 2.0);
		conversionMap.put(ConversionKey.CS, .02);
		conversionMap.put(ConversionKey.KA10, 2.0);

	}

	@Override
	protected void initTeamConversions() {
		conversionMap.put(ConversionKey.TURRET, 1.0);
		conversionMap.put(ConversionKey.DRAGON, 2.0);
		conversionMap.put(ConversionKey.BARON, 3.0);
		conversionMap.put(ConversionKey.WIN, 2.0);
		conversionMap.put(ConversionKey.W30, 2.0);
	}
}
