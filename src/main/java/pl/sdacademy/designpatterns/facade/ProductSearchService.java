package pl.sdacademy.designpatterns.facade;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProductSearchService {

    private static final List<Product> PRODUCTS = Arrays.asList(
            new Product("1", "TeddyBear", 2.3),
            new Product("2", "JavaProgrammingBook", 2.6),
            new Product("3", "Computer Mouse", 4.2),
            new Product("4", "Keyboard", 3.9),
            new Product("5", "Mouse Bungie", 1.0));

    public Optional<Product> searchById(final String id) {
        return PRODUCTS.stream().filter(product -> product.getId().equals(id)).findFirst();
    }
}
