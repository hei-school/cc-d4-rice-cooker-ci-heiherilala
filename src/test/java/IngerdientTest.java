import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IngerdientTest {
  @Test
  public void testPrepareIngredients() {
    String name = "rice";
    int qantity = 50;
    Ingredient ingredient = new Ingredient(name, qantity);
    assertEquals(name, ingredient.getName());
    assertEquals(qantity, ingredient.getQuantity());
  }
}
