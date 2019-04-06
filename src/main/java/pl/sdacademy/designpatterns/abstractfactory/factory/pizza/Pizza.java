package pl.sdacademy.designpatterns.abstractfactory.factory.pizza;

import java.util.List;

public interface Pizza {
  //String getName(); Base getBaseType(); Double getWidth(); int getCheeseTypesNum(); List<String> getIngredients();
  String getName();
  Base getBaseType();
  Double getWidth();
  int getCheeseTypesNum();
  List<String> getIngredients();
}
