package test.armory;

public class SniperGun extends Gun{

	//������
	public SniperGun(Bullet bullet) {
		super(bullet);
		
	}
	//fire() �޼ҵ� �������ϱ�(Ŀ���� ���� ���� ctrl+space ������ �޼ҵ� ����)
	@Override
	public void fire() {
		/*
		 *  super �� �θ�ü�� �������� ����Ű�� ����� �̴�.
		 *  super.fire() �������� ����̵� �θ� �޼ҵ带
		 *  ȣ���ϴ� ǥ�����̴�.
		 */
		//super.fire(); � ��쿡�� �θ��� �޼ҵ带 ȣ�� ����� �ϴ� ��찡 �ִ�.(�θ��� �޼ҵ忡 �߿��� ������ ���� ��쿡 or �θ��� �޼ҵ尡 return �ϴ� ���� return �ؾ� �� ��쿡 ���..)
		
		System.out.println("�� �� �ָ� �����ϰ� ��~");
	}
}
