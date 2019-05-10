package pl.sdacademy.designpatterns.facade;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ShoppingFacade {

    private final AvailabilityService availabilityService;
    private final PaymentService paymentService;
    private final ProductSearchService productSearchService;

    public ShoppingFacade(final AvailabilityService availabilityService, final PaymentService paymentService, final ProductSearchService productSearchService) {
        this.availabilityService = availabilityService;
        this.paymentService = paymentService;
        this.productSearchService = productSearchService;
    }

    public double buy(final List<String> productsIds) {
        return paymentService.pay(productsIds.stream()
                .map(productSearchService::searchById)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .filter(availabilityService::isAvailable).collect(Collectors.toList()));
    }
}
