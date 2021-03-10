import animals.Animal;
import animals.Cow;
import food.Food;
import food.Meat;

/**
 * Hello world!
 *
 */
public class Zoo
{
    public static void main( String[] args )
    {
        Animal cow = new Cow("Mumu", 10, 2000);
        Food meat = new Meat();
        cow.eat(meat);
    }
}
