
public class Consumer {
	
	private static String food = "麦辣鸡腿堡";//消费者希望购买的食物
	private static String drink = "柠檬汽水";//消费者希望购买的饮料
	
	public static void main(String args[]){
		
		KFCWaiter waiter = new KFCWaiter(new MealBuilderA());//服务员是指挥者
	   
	    Meal meal=waiter.construct(); //客户获得套餐
	    
        
        System.out.println("套餐组成A：");
        System.out.println(meal.getfood());
        System.out.println(meal.getdrink());
        
        waiter = new KFCWaiter(new MealBuilderC(food,drink));//以消费者想要的食物和饮料构造建造者C
        
        System.out.println("套餐组成C：");
        System.out.println(meal.getfood());
        System.out.println(meal.getdrink());
	}
}
