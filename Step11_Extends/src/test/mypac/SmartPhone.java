package test.mypac;

public class SmartPhone extends HandPhone {//Java ������ ���ϻ�Ӹ� �����ϴ�!
	public SmartPhone() {
		System.out.println("SmartPhone() ������ ȣ���");
	}
	
	public void doInternet() {
		System.out.println("���ͳ��� �ؿ�!");
	}
	
	//���� ��� �޼ҵ� ������ �ϱ�
	@Override
		public void takePicture() {
			super.takePicture();//�θ� ��ü�� takePicture �޼ҵ� ȣ��
			System.out.println("1000 �� ȭ���� ������ ����");
		}
}
