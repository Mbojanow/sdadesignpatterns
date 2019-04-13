package pl.sdacademy.designpatterns.abstractfactory.factory.car;

class FordFocus implements Car {

    private EngineType type;
    private Double engineVolume;
    private int cylinderNum;
    private BodyType bodyType;

    public FordFocus(final EngineType type, final Double engineVolume, final int cylinderNum, final BodyType bodyType) {
        this.type = type;
        this.engineVolume = engineVolume;
        this.cylinderNum = cylinderNum;
        this.bodyType = bodyType;
    }

    @Override
    public String getModelName() {
        return "Focus";
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
        return cylinderNum;
    }

    @Override
    public BodyType getBodyType() {
        return bodyType;
    }
}
