package org.ysc.calculator.mapping;

import org.ysc.calculator.key.ConversionKey;

public class ESportsConversionMap extends ConversionMap {

	public ESportsConversionMap() {
		initPlayerConversions();
		initTeamConversions();

	}

	@Override
	protected void initPlayerConversions() {

		conversionMap.put(ConversionKey.K, 2.0);
		conversionMap.put(ConversionKey.D, -.5);
		conversionMap.put(ConversionKey.A, 1.5);
		conversionMap.put(ConversionKey.CS, .01);
		conversionMap.put(ConversionKey.KA10, 2.0);
		conversionMap.put(ConversionKey.TRIPLE, 2.0);
		conversionMap.put(ConversionKey.QUADRA, 5.0);
		conversionMap.put(ConversionKey.PENTA, 10.0);

	}

	@Override
	protected void initTeamConversions() {

		conversionMap.put(ConversionKey.TURRET, 1.0);
		conversionMap.put(ConversionKey.DRAGON, 1.0);
		conversionMap.put(ConversionKey.BARON, 2.0);
		conversionMap.put(ConversionKey.WIN, 2.0);
		conversionMap.put(ConversionKey.W30, 2.0);
		conversionMap.put(ConversionKey.FB, 2.0);

	}

}
