import org.junit.*;
import static org.junit.Assert.*;

public class RestaurantsTest {

  @Test
  public void Restaurants_instantiatesCorrectly_true() {
    Restaurants myRestaurants = new Restaurants("Pepe's", "Breakfast Burrito", "5");
    assertEquals(true, myRestaurants instanceof Restaurants);
  }

  @Test
  public void Task_instantiatesWithDescription_String() {
    Restaurants myRestaurants = new Restaurants("Pepe's", "Breakfast Burrito", "5 Stars");
    assertEquals("Pepe's", myRestaurants.getName());
    assertEquals("Breakfast Burrito", myRestaurants.getDish());
    assertEquals("5 Stars", myRestaurants.getRating());
  }
}
