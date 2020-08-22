package pl.sdacademy.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    List<IntWrapper> elements = new ArrayList<>();
    elements.add(new IntWrapper());
    elements.add(new IntWrapper());

    List<IntWrapper> shallowCopyElements = elements; // shallow copy
    shallowCopyElements.add(new IntWrapper());

    System.out.println(elements.size());

    List<IntWrapper> deepCopyElements = new ArrayList<>(elements); // deep copy
    deepCopyElements.add(new IntWrapper());

    System.out.println(elements.size());

  }
}

class IntWrapper {
  private int value;

  public int getValue() {
    return value;
  }

  public void setValue(final int value) {
    this.value = value;
  }
}
