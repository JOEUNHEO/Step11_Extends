package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		
		// 원래 HandPhone 객체의 참조값 이기 때문에
		// SmartPhone 으로 casting 은 실행시에 오류가 발생한다. 부모가 자식객체 메소드 접근 x
		SmartPhone p2 = (SmartPhone)p1; 
		p2.doInternet();
		
		// 자식객체가 부모객체의 메소드 접근 가능!
		SmartPhone p3 = new SmartPhone();
		
		HandPhone p4 = (HandPhone)p3;
		p4.mobileCall();
	}
}
