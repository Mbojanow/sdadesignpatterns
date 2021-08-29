package pl.sdacademy.designpatterns.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PcGame implements Game {

    private String name;
    private String type;
    private String producer;
    private Requirements requirements;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
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
        System.out.println("PC game " + name + " of type " + type + " was produced by " + producer + "." +
                "Game requirements are: " + requirements);
    }
}
