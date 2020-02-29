package pl.sdacademy.designpatterns;

public class ClassC {
  private ClassA classA;
  private ClassB classB;

  /// ZŁO! -10 za to
//  public ClassC() {
//    classA = new ClassA();
//    classB = new ClassB();
//  }


  public ClassC(final ClassA classA, final ClassB classB) {
    this.classA = classA;
    this.classB = classB;
  }
}
