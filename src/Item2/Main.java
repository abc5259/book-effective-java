package Item2;

import Item2.NyPizza.Builder;
import Item2.NyPizza.Size;
import Item2.Pizza.Topping;

public class Main {
    public static void main(String[] args) {
        NyPizza nyPizza = new Builder(Size.LARGE).addTopping(Topping.HAM).build();
    }
}
