
public class MealBuilderC extends MealBuilder{

	
	public MealBuilderC(String food,String drink){
		meal.setfood(food);
		meal.setdrink(drink);
	}
	
	@Override
	public void buildFood() {
		// TODO Auto-generated method stub
		meal.setfood("���������һ�ݼ��ȱ�");
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		meal.setdrink("С������һ��");
	}


}
