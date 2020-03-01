package pl.sdacademy.designpatterns.facade;

import java.util.ArrayList;
import java.util.List;

public class MultiValueAttributeInMemoryRepository implements MultiValueAttributeRepository {

  private static int currentId = 0;

  private List<MultiValueAttribute> attributes = new ArrayList<>();

  @Override
  public MultiValueAttribute create(final MultiValueAttribute mva) {
    return null;
  }

  @Override
  public MultiValueAttribute getById(final Long id) {
    return null;
  }

  @Override
  public List<MultiValueAttribute> findAll() {
    return null;
  }
}
