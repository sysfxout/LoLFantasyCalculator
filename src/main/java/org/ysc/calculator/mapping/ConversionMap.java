package org.ysc.calculator.mapping;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import org.ysc.calculator.key.ConversionKey;

public abstract class ConversionMap {
	protected Map<ConversionKey, Double> conversionMap = new EnumMap<ConversionKey, Double>(ConversionKey.class);


	protected abstract void initPlayerConversions();
	protected abstract void initTeamConversions();
	
	public Map<ConversionKey, Double> getConversionMap() {
		return conversionMap;
	}

	public void setConversionMap(Map<ConversionKey, Double> conversionMap) {
		this.conversionMap = conversionMap;
	}
	
	public Double getValue(ConversionKey key){
		return conversionMap.get(key);
	}
	
	
}
