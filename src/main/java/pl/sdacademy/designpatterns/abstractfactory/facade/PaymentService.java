package pl.sdacademy.designpatterns.abstractfactory.facade;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PaymentService {

  public double pay(final List<Product> productsToBuy) {
    return productsToBuy.stream()
        .mapToDouble(Product::getPrice).sum();
        //.map(product -> product.getPrice())
        //.collect(Collectors.summingDouble(x -> x));
  }
}
