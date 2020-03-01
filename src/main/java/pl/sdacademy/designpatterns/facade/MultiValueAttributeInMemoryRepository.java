package pl.sdacademy.designpatterns.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MultiValueAttributeInMemoryRepository implements MultiValueAttributeRepository {

  private static long currentId = 0;

  private List<MultiValueAttribute> attributes = new ArrayList<>();

  @Override
  public MultiValueAttribute create(final MultiValueAttribute mva) {
    mva.setId(++currentId);
    attributes.add(mva);
    return mva;
  }

  @Override
  public MultiValueAttribute getById(final Long id) {
    final Optional<MultiValueAttribute> firstMVA = attributes.stream()
        .filter(mva -> mva.getId().equals(id))
        .findFirst();
    if (firstMVA.isPresent()) {
      return firstMVA.get();
    }
    return null;
  }

  @Override
  public List<MultiValueAttribute> findAll() {
    return attributes;
  }
}
