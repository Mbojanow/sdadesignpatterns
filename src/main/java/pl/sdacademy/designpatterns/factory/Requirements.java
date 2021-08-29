package pl.sdacademy.designpatterns.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // konstruktor bezargumentowy
@AllArgsConstructor // tworzy konstruktor ze wszystkim pól
public class Requirements {
    private Integer lengthInMinutes;
    private Integer maxNumberOfPlayers;
    private Boolean isOneTime;
}
