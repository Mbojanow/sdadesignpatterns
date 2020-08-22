package pl.sdacademy.designpatterns.factorymethod;

public class PCGame implements Game {

  private String name;
  private String type;
  private String producer;
  private Requirements requirements;

  public PCGame(final String name, final String type, final String producer, final Requirements requirements) {
    this.name = name;
    this.type = type;
    this.producer = producer;
    this.requirements = requirements;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getType() {
    return type + " on PC";
  }

  @Override
  public String getProducer() {
    return producer;
  }

  @Override
  public Requirements getRequirements() {
    return requirements;
  }

  @Override
  public void describe() {
    System.out.println("PC GAME produced by " + getProducer());
  }
}
