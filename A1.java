
public class A1{
		public static void main(String[] args){
				student a=new student();
				teacher b=new teacher();
				parenter c=new parenter();
				a.eat();
				a.sleep();
				
				b.eat();
				b.sleep();
				
				c.eat();
				c.sleep();
				
		}
}
class teacher{
	public void eat() {
		System.out.println("��ʦȥ�̹�ʳ�óԷ�");
	}
	public void sleep() {
		System.out.println("��ʦ�ؽ̹�����˯��");
	}
}
class student{
	public void eat() {
		System.out.println("ѧ��ȥѧУʳ�óԷ�");
	}
	public void sleep() {
		System.out.println("ѧ����ѧ����Ԣ˯��");
	}
}
class parenter{
	public void eat() {
		System.out.println("�ҳ�ȥѧϰ���ݳԷ�");
	}
	public void sleep() {
		System.out.println("�ҳ�ȥ�д����Է�");
	}
}