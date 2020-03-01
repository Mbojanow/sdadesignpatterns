package pl.sdacademy.designpatterns.facade;

public interface MVAMapper {
  MultiValueAttribute dtoToObject(MultiValueAttributeDto dto);
  MultiValueAttributeDto objectToDto(MultiValueAttribute mva);
}
