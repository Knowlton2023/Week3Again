package com.coderscampus.objects;

public class Human {

	String gender;
	String height;
	String weight;
	String eyeColor;
	
	// (visibility modifier), return type, method name, params, scope
	String getInfo () {
		return "Gender: " + gender + ", Height: " + height + ", Weight: " + weight +
				", EyeColor: " + eyeColor;
	}
}
