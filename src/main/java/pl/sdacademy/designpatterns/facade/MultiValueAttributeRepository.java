package pl.sdacademy.designpatterns.facade;

import java.util.List;

public interface MultiValueAttributeRepository {
  MultiValueAttribute create(MultiValueAttribute mva);
  MultiValueAttribute getById(Long id);
  List<MultiValueAttribute> findAll();
}
