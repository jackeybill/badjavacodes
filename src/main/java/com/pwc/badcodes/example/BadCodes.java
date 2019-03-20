package com.pwc.badcodes.example;

public class BadCodes {
	//2.1.1 Use meaningful and familiar names
	
	public void meaningfulNames(){
		//AVOID the following code:
		int a = 100, y = 200;
			if (a < 65) {           // what is the significance of 65 here?
					y = 65 - a;  // variable “a” does not adequately describe its purpose
				}
		//Better way is as follows:
		int age = 100, RETIREMENT_AGE = 100, yearsToRetirement = 200;
				if (age < RETIREMENT_AGE) {
					yearsToRetirement = RETIREMENT_AGE - age;
				}
		//Exception to the above rule is in the case of a temporary variable like the following loop:
		int numberOfStudents = 200;
		for (int i = 0; i < numberOfStudents; i++) {  //i is a temporary variable with no purpose 
				enrollStudent (i);
		}

	}
	
	public void enrollStudent(int value) {
		
	}

}
