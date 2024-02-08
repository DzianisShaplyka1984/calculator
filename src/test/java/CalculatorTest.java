import com.academy.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
  private Calculator calculator;

  @Before
  public void init() {
    calculator = new Calculator();
  }

  @After
  public void clean() {
    calculator.memory = 0;
  }

  @Test
  public void sum() {
    int expected = 4;

    int actual = calculator.sum(2, 2);

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void givenNumber_thenSumEqualSix() {
    int expected = 6;

    int actual = calculator.sum(3, 3);

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void substract() {
    int expected = 2;

    int actual = calculator.substract(4, 2);

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void divide() {
    int expected = 3;

    int actual = calculator.divide(6, 2);

    Assert.assertEquals(expected, actual);
  }

  @Test(expected = ArithmeticException.class)
  public void givenDivider_whenDividerZero_thenThrowArithmeticException() {
    calculator.divide(6, 0);
  }

//    if (2 == calculator.substract(4, 2)) {
//    System.out.println("true");
//  } else {
//    System.out.println("false");
//  }
//
//    if (15 == calculator.multiply(3, 5)) {
//    System.out.println("true");
//  } else {
//    System.out.println("false");
//  }
//
//    if (3 == calculator.divide(6, 2)) {
//    System.out.println("divide unit test true");
//  } else {
//    System.out.println("false");
//  }
//
//    try {
//    calculator.divide(3, 0);
//    System.out.println("false");
//  } catch (ArithmeticException e) {
//    System.out.println("true");
//  }
}
