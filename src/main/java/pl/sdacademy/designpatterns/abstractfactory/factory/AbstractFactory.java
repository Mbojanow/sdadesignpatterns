package pl.sdacademy.designpatterns.abstractfactory.factory;

public interface AbstractFactory<T> {
  T create(String type);
}
