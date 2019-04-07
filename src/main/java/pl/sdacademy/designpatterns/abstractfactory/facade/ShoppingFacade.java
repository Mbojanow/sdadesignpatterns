package pl.sdacademy.designpatterns.abstractfactory.facade;

import java.util.List;
import java.util.stream.Collectors;

import com.sun.tools.corba.se.idl.toJavaPortable.InterfaceGen;

public class ShoppingFacade {

  private AvailabilityService availabilityService;
  private PaymentService paymentService;
  private ProductSearchService productSearchService;

  public ShoppingFacade(final AvailabilityService availabilityService, final PaymentService paymentService,
                        final ProductSearchService productSearchService) {
    this.availabilityService = availabilityService;
    this.paymentService = paymentService;
    this.productSearchService = productSearchService;
  }

  public void shop(List<Integer> ids) {
    List<Integer> filteredIds = ids.stream()
        .filter(id -> productSearchService.findById(id).isPresent())
        .collect(Collectors.toList());

    filteredIds = filteredIds.stream()
        .filter(id -> availabilityService.isAvailable(id))
        .collect(Collectors.toList());

    final List<Product> products = filteredIds.stream()
        .map(id -> productSearchService.findById(id).get())
        .collect(Collectors.toList());
    final double sum = paymentService.pay(products);
    System.out.println("You need to pay " + sum);
  }
}
