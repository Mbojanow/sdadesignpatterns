package pl.sdacademy.designpatterns.facade;

import java.util.List;

public class PaymentService {

    public double pay(final List<Product> products) {
        final double sum = products.stream()
                .map(Product::getPrice)
                .reduce(0.0, Double::sum);
        System.out.println("Sum is " + sum);
        return sum;
    }
}
