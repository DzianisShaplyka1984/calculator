import static org.mockito.Mockito.when;

import com.academy.service.DiscountService;
import com.academy.service.PriceService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class PriceServiceTest {
  final double discount = new Double(1);
  @Mock
  private DiscountService discountService;

  @Before
  public void init() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void givenProductId_whenProductExist_thenReturnPrice() {
    PriceService priceService = new PriceService(discountService);
    when(discountService.discount(1034)).thenReturn(new Double(1));

    double expected = 99;

    double actual = priceService.price(1034);

    Assert.assertEquals(expected, actual, 1e-15);

  }

  @Test
  public void givenProductId_whenConnectionBroken_thenReturnZeroDiscount() {
    PriceService priceService = new PriceService(discountService);
    when(discountService.discount(1134)).thenThrow(new RuntimeException());

    double expected = 100;

    double actual = priceService.price(1134);

    Assert.assertEquals(expected, actual, 1e-15);

  }
}
