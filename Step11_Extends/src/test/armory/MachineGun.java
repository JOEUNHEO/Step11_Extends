package test.armory;

public class MachineGun extends Gun {
	//Gun 생성자가 받아야 할 인자 Bullet type 이 없기 때문에 
	//하위클래스인 MachineGun 생성자에서 상위클래스인 Gun 생성자에게 Bullet type 을 전달해야 한다.
	
	//자식 생성자에서 부모 생성자에 필요한 값을 전달 받아서
	public MachineGun(Bullet bullet) {
		//부모 생성자에 넘겨 준다.
		//부모 생성자를 호출하는 코드는 가장 첫줄에 와야한다.(안그럼 오류남)
		super(bullet);
		
	}
	
	//메소드
	public void autoFire() {
		if(this.bullet == null) {
			System.out.println("총알 객체가 없어서 발사불가!");
		}
		
		System.out.println("빵~ 빵~ 빵~");
	}
}
