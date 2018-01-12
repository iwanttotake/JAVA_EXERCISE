package icehs.science.chapter10.Interface;

import icehs.science.chapter10.Washer;

public class InterfaceTest {
	public static void main(String[] args) {
		IFlyable a = new Airplane();
		
		a.fly();
		if(a instanceof IEatable) {
			((IEatable)a).eat();			
		}
	}
}
