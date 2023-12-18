public class CookOperation {
  private Recipe recipe;

  public CookOperation(int recipeType) {
    this.recipe = new Recipe(recipeType);
  }

  public void start() {
    recipe.prepareIngredients();
    recipe.displayRecipeSummary();
    recipe.reset();
  }
}
