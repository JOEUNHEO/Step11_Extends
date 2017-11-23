package test.armory;
/*
 * 	[ ���� ������ ]
 * 
 * 	class ���� ������
 * 
 * 	1. public	: ��ü ����(import �� �� �ִ�)
 *  2. default	: ���� �й��� �������� ���� ���� (���������� default) - import �� �� ����
 *  
 *  ������, �ʵ�, �޼ҵ� �� ���� ������
 *  
 *  1. public	: ��ü ����
 *  2. protected: ���� ��Ű�� Ȥ�� ��Ӱ����� �ڽĿ��� ���ٰ��� (package�� �޶� �������)
 *  3. default	: ���� ��Ű�� �������� ���ٰ��� (���������� default)
 *  4. private	: ���ǵ� Ŭ���� �ȿ����� ���� ����
 * 
 */
public class Gun {
	//����ʵ�
	protected Bullet bullet;
	//������
	public Gun(Bullet bullet) {
		this.bullet = bullet;
	}
	//�޼ҵ�
	public void fire() {
		if(bullet == null) {
			System.out.println("�Ѿ� ��ü�� ��� ���Ұ�");
			return; //�޼ҵ� ����
		}
		System.out.println("��~");
	}
}
