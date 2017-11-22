package test.main;

import test.armory.Bullet;
import test.armory.MachineGun;

public class MainClass10 {
	public static void main(String[] args) {
		//부모 Gun 생성자에 필요한 Bullet type 을 자식 MachineGun 생성자에서 전달 받은 것이다.
		MachineGun gun1 = new MachineGun(new Bullet());
		
		gun1.fire();
		gun1.autoFire();
			
	}
}
