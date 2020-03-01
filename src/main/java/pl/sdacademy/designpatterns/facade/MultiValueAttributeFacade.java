package pl.sdacademy.designpatterns.facade;

import java.util.List;
import java.util.stream.Collectors;

public class MultiValueAttributeFacade {
  private final MVAMapper mapper;
  private final MultiValueAttributeRepository repository;

  public MultiValueAttributeFacade(final MVAMapper mapper, final MultiValueAttributeRepository repository) {
    this.mapper = mapper;
    this.repository = repository;
  }

  public MultiValueAttributeDto getById(final Long id) {
    final MultiValueAttribute mva = repository.getById(id);
    return mapper.objectToDto(mva);
  }

  public List<MultiValueAttributeDto> getAll() {
    return repository.findAll().stream()
        .map(mva -> mapper.objectToDto(mva))
        .collect(Collectors.toList());
  }

  public MultiValueAttributeDto create(final MultiValueAttributeDto dto) {
    final MultiValueAttribute mva = mapper.dtoToObject(dto);
    final MultiValueAttribute createdMva = repository.create(mva);
    return mapper.objectToDto(createdMva);
  }
}
