package test.mypac;

public class Phone extends Object {//자동으로 Object 를 상속받는다. import 하지 않고 상속받은 클래스는 java.lang package 에 있다.
	
	//디폴트 생성자를 명시적으로 정의하기
	public Phone() {
		System.out.println("Phone() 생성자 호출됨");
	}
	
	//멤버 메소드
	public void call() {
		System.out.println("전화를 걸어요");
	}
}
