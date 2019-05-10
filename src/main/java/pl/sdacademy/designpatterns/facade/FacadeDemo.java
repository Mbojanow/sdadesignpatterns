package pl.sdacademy.designpatterns.facade;

import java.util.Arrays;

public class FacadeDemo {

    public static void main(final String[] args) {
        final ShoppingFacade shoppingFacade = new ShoppingFacade(new AvailabilityService(), new PaymentService(), new ProductSearchService());

        final Double price = shoppingFacade.buy(Arrays.asList("2", "3"));
        System.out.println("You need to pay " + price);
    }
}
