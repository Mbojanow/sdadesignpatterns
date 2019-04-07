package pl.sdacademy.designpatterns.abstractfactory.facade;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProductSearchService {

  private static List<Product> PRODUCTS = Arrays.asList(
      new Product(1, "TeddyBear", 10D),
      new Product(2, "Cookie", 2.5D),
      new Product(3, "Oshee", 3.5D)
  );

  public Optional<Product> findById(final int id) {
    return PRODUCTS.stream()
        .filter(product -> product.getId() == id)
        .findFirst();
  }
}
