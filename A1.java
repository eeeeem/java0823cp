
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
		System.out.println("老师去教工食堂吃饭");
	}
	public void sleep() {
		System.out.println("老师回教工宿舍睡觉");
	}
}
class student{
	public void eat() {
		System.out.println("学生去学校食堂吃饭");
	}
	public void sleep() {
		System.out.println("学生是学生公寓睡觉");
	}
}
class parenter{
	public void eat() {
		System.out.println("家长去学习饭馆吃饭");
	}
	public void sleep() {
		System.out.println("家长去招待所吃饭");
	}
}