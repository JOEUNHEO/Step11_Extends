package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		
		// ���� HandPhone ��ü�� ������ �̱� ������
		// SmartPhone ���� casting �� ����ÿ� ������ �߻��Ѵ�. �θ� �ڽİ�ü �޼ҵ� ���� x
		SmartPhone p2 = (SmartPhone)p1; 
		p2.doInternet();
		
		// �ڽİ�ü�� �θ�ü�� �޼ҵ� ���� ����!
		SmartPhone p3 = new SmartPhone();
		
		HandPhone p4 = (HandPhone)p3;
		p4.mobileCall();
	}
}
