package pl.sdacademy.designpatterns;

public class SOLIDDemo {
  public static void main(String[] args) {
    final ClassA classA = new ClassA();
    final ClassB classB = new ClassB();
    final ClassD classD = new ClassD();
    final ClassC classC = new ClassC(classD, classB);//new ClassC(classA, classB);
  }
}
