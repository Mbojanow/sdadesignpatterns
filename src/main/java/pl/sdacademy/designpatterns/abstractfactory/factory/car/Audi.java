package pl.sdacademy.designpatterns.abstractfactory.factory.car;

public class Audi implements Car {

  private String modelName;
  private EngineType type;
  private double engineVolume;
  private int cylindersNum;
  private BodyType bodyType;

  public Audi(final String modelName, final EngineType type, final double engineVolume, final int cylindersNum, final BodyType bodyType) {
    this.modelName = modelName;
    this.type = type;
    this.engineVolume = engineVolume;
    this.cylindersNum = cylindersNum;
    this.bodyType = bodyType;
  }

  @Override
  public String getModelName() {
    return "Audi " + modelName;
  }

  @Override
  public EngineType getType() {
    return type;
  }

  @Override
  public Double getEngineVolume() {
    return engineVolume;
  }

  @Override
  public int getCylindersNum() {
    return cylindersNum;
  }

  @Override
  public BodyType getBodyType() {
    return bodyType;
  }
}
