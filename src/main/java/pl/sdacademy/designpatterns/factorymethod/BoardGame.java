package pl.sdacademy.designpatterns.factorymethod;

public class BoardGame implements Game {

  private String name;
  private String type;
  private String publisher;
  private Requirements requirements;

  public BoardGame(final String name, final String type, final String publisher, final Requirements requirements) {
    this.name = name;
    this.type = type;
    this.publisher = publisher;
    this.requirements = requirements;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getType() {
    return "Board Game: " + type;
  }

  @Override
  public String getProducer() {
    return publisher;
  }

  @Override
  public Requirements getRequirements() {
    return requirements;
  }

  @Override
  public void describe() {
    System.out.println("Board game " + name + " for minimum " + requirements.getMinimumNumberOfPlayers() + " players.");
  }
}
