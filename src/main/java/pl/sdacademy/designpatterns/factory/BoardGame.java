package pl.sdacademy.designpatterns.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardGame implements Game {

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
        System.out.println("Board game " + name + " of type " + type + " is produced by " + producer +"." +
                "Requirements are: " + requirements);
    }
}
