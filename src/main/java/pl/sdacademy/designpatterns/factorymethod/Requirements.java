package pl.sdacademy.designpatterns.factorymethod;


public class Requirements {
  private boolean isOneTime;
  private Integer lengthInHours;
  private Integer minimumNumberOfPlayers;
  private Integer maximumNumberOfPlayers;

  public Requirements(final boolean isOneTime, final Integer lengthInHours, final Integer minimumNumberOfPlayers, final Integer maximumNumberOfPlayers) {
    this.isOneTime = isOneTime;
    this.lengthInHours = lengthInHours;
    this.minimumNumberOfPlayers = minimumNumberOfPlayers;
    this.maximumNumberOfPlayers = maximumNumberOfPlayers;
  }

  public boolean isOneTime() {
    return isOneTime;
  }

  public Integer getLengthInHours() {
    return lengthInHours;
  }

  public Integer getMinimumNumberOfPlayers() {
    return minimumNumberOfPlayers;
  }

  public Integer getMaximumNumberOfPlayers() {
    return maximumNumberOfPlayers;
  }
}
