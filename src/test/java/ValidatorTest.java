import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidatorTest {
  @Test
  public void testIsNonNegativeIntegerWithValidInput() {
    assertTrue(Validator.isNonNegativeInteger("123"));
    assertTrue(Validator.isNonNegativeInteger("5"));
  }

  @Test
  public void testIsNonNegativeIntegerWithInvalidInput() {
    assertFalse(Validator.isNonNegativeInteger("-1"));
    assertFalse(Validator.isNonNegativeInteger("abc"));
    assertFalse(Validator.isNonNegativeInteger(""));
  }
}
