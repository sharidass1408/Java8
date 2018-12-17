package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class SumingAttributes {

	public static void main(String[] args) {
		
		List<Component> componentList = new ArrayList<>();
		
		componentList.add(new Component(2));
		componentList.add(new Component(6));
		componentList.add(new Component(8));
		componentList.add(new Component(4));
		
		double sum = componentList.stream().mapToDouble(com -> com.getPrice()).sum();
		System.out.println("Sum of all the component List: " + sum);
		
	}

}
