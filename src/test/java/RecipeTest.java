import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RecipeTest {
  @Test
  public void testPrepareIngredients() {
    Recipe recipe = new Recipe(1);
    assertTrue(recipe.getIngredients().isEmpty());
  }
}
