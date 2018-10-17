package com.crosscode.groovy

import com.crosscode.associates.Crosscode_Groovy

class DemoClass {
	static def DisplayName() {
	   println("This is how methods work in groovy");
	   println("This is an example of a simple method");
	}
	 
	public static void main(String[] args) {
		Crosscode_Groovy.adminDepartment();
	   DisplayName();
	   Crosscode_Groovy.hrDepartment()
	}
 }