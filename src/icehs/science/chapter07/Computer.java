package icehs.science.chapter07;

public class Computer {
	String model;
	String osVer;
	int production;
	int sales;
	
	Computer(String model, String osVer, int production){
		this.model = model;
		this.osVer = osVer;
		this.production = production;
	}
	
	Computer(String model, String osVer, int production, int sales){
		this(model, osVer, production);
		this.sales = sales;
	}
	
	void printComputerInfo() {
		System.out.println("=== " + model + " (" + osVer + ") ===");
		System.out.println("생산 : " + production + " / 판매 : " + sales);
	}
}
