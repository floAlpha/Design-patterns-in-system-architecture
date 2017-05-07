
public class MealBuilderC extends MealBuilder{

	
	public MealBuilderC(String food,String drink){
		meal.setfood(food);
		meal.setdrink(drink);
	}
	
	@Override
	public void buildFood() {
		// TODO Auto-generated method stub
		meal.setfood("两个鸡翅加一份鸡腿堡");
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		meal.setdrink("小杯可乐一份");
	}


}
