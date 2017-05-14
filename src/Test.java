
public class Test implements Cloneable{
	
	String test = "test";
	public Test() {
		super();
	}
	
	public static void main (String args[]) {
		Test t1 = new Test();
		try {
			Test t2 = (Test) t1.clone();
			t2.test = "new test";
			System.out.println(t1.test);	//��ȫ��¡�����߻���Ӱ��
			if(t1 == t2)//��֤����� t1 ��= t2
			{
				System.out.println("t1 == t2");
				System.out.println(t1.toString());
				System.out.println(t2.toString());
			
			}
			else {
				System.out.println("t1 != t2");
				System.out.println(t1.toString());
				System.out.println(t2.toString());
			}
			if(t1.equals(t2))//��֤�����t1 do not equals t2
			{
				System.out.println("t1 equals t2");
				System.out.println(t1.toString());
				System.out.println(t2.toString());
			}
			else {
				System.out.println("t1 do not equals t2");
				System.out.println(t1.toString());
				System.out.println(t2.toString());
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
