package com.mycompany.mockitodemo.business;

public class SomeBusinessImpl {
	
	private DataService dataservice;	
	
	public SomeBusinessImpl(DataService dataservice) {
		super();
		this.dataservice = dataservice;
	}

	public int findTheGreatestFromAllData() {
		int[] data=dataservice.retriveAllData();
		
		int greatestValue=Integer.MIN_VALUE;
		for(int value:data) {
			if(value>greatestValue) {
				greatestValue=value;
			}
		}
		return greatestValue;
		
	}
}


interface DataService{
	int[] retriveAllData();
}