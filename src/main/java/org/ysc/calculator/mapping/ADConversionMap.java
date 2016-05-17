package org.ysc.calculator.mapping;

import org.ysc.calculator.key.ConversionKey;

public class ADConversionMap extends ConversionMap {

	public ADConversionMap() {
		initPlayerConversions();
		initTeamConversions();

	}
	
	@Override
	protected void initPlayerConversions() {

		conversionMap.put(ConversionKey.K, 3.0);
		conversionMap.put(ConversionKey.D, -1.0);
		conversionMap.put(ConversionKey.A, 2.0);
		conversionMap.put(ConversionKey.CS, .01);
		conversionMap.put(ConversionKey.KA10, 2.0);
		conversionMap.put(ConversionKey.TRIPLE, 2.0);
		conversionMap.put(ConversionKey.QUADRA, 5.0);
		conversionMap.put(ConversionKey.PENTA, 10.0);

	}

	@Override
	protected void initTeamConversions() {

		conversionMap.put(ConversionKey.TURRET, 1.0);
		conversionMap.put(ConversionKey.DRAGON, 2.0);
		conversionMap.put(ConversionKey.BARON, 3.0);

	}
}
