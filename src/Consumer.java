
public class Consumer {
	
	private static String food = "�������ȱ�";//������ϣ�������ʳ��
	private static String drink = "������ˮ";//������ϣ�����������
	
	public static void main(String args[]){
		
		KFCWaiter waiter = new KFCWaiter(new MealBuilderA());//����Ա��ָ����
	   
	    Meal meal=waiter.construct(); //�ͻ�����ײ�
	    
        
        System.out.println("�ײ����A��");
        System.out.println(meal.getfood());
        System.out.println(meal.getdrink());
        
        waiter = new KFCWaiter(new MealBuilderC(food,drink));//����������Ҫ��ʳ������Ϲ��콨����C
        
        System.out.println("�ײ����C��");
        System.out.println(meal.getfood());
        System.out.println(meal.getdrink());
	}
}
