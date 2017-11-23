package test.armory;

public class SniperGun extends Gun{

	//생성자
	public SniperGun(Bullet bullet) {
		super(bullet);
		
	}
	//fire() 메소드 재정의하기(커서를 갖다 놓고 ctrl+space 눌러서 메소드 선택)
	@Override
	public void fire() {
		/*
		 *  super 는 부모객체의 참조값을 가리키는 예약어 이다.
		 *  super.fire() 재정의의 대상이된 부모 메소드를
		 *  호출하는 표현식이다.
		 */
		//super.fire(); 어떤 경우에는 부모의 메소드를 호출 해줘야 하는 경우가 있다.(부모의 메소드에 중요한 정보가 있을 경우에 or 부모의 메소드가 return 하는 값을 return 해야 할 경우에 등등..)
		
		System.out.println("좀 더 멀리 정밀하게 빵~");
	}
}
