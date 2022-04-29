package com.training.ifaces;

public interface AgeConditon<T> {
	
	default boolean negate(Double age) {
		
		return age<58;
	}

}
