package com.revenge_luigi.utils;

import java.awt.Component;

public class Utils {
	
	public static Component getAncestor( Component component, Class clazz ){
		Component component2 = component;
		
		while( (component2 = component2.getParent()) != null ){
			if( component2.getClass() == clazz ){
				return component2;
			}
		}
		
		return null;
	}

}
