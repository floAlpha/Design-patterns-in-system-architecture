
public class KFCWaiter {

	private MealBuilder mealBuilder;
	KFCWaiter(MealBuilder mb){
		this.mealBuilder = mb;
	}
	
	private void setMealBuilder(MealBuilder mb){
		this.mealBuilder = mb;
	}
	
	public Meal construct(){
		mealBuilder.buildDrink();
		mealBuilder.buildFood();
		return mealBuilder.getMeal();
	}
	
	
	
}
