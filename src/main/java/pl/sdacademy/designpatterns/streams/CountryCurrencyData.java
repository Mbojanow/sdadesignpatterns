package pl.sdacademy.designpatterns.streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryCurrencyData {
    private String country;
    private String currencyShortname;
    private String currencyName;
}
