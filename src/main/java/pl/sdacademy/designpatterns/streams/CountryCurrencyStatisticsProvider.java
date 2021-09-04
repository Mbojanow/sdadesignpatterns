package pl.sdacademy.designpatterns.streams;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountryCurrencyStatisticsProvider {

    private static final String SPLIT_CHAR = " ";
    private static final String USD_CURRENCY_SHORT_NAME = "USD";

    // nazwy państw, których nazwa sklada się z 1 wyrazu
    public List<String> findSingleWordCountryNames(List<CountryCurrencyData> countryCurrencyDatas) {
        return countryCurrencyDatas.stream()
                .map(CountryCurrencyData::getCountry) // countryCurrencyData -> countryCurrencyData.getCountry()
                .filter(countryName -> !countryName.contains(SPLIT_CHAR))
                .collect(Collectors.toUnmodifiableList());
    }

    public Long countCountriesWithUsdCurrency(List<CountryCurrencyData> countryCurrencyDatas) {
        return countryCurrencyDatas.stream()
                .filter(countryCurrencyData -> countryCurrencyData.getCurrencyShortname().equals(USD_CURRENCY_SHORT_NAME))
                .count();
//                .collect(Collectors.toList()).size()
    }

    public List<String> findCountriesWithEurCurrency(List<CountryCurrencyData> countryCurrencyDatas) {
        return countryCurrencyDatas.stream()
                .filter(countryCurrencyData -> countryCurrencyData.getCurrencyShortname().equals("EUR"))
                .map(CountryCurrencyData::getCountry) // countryCurrencyData -> countryCurrencyData.getCountry()
                .collect(Collectors.toList());
    }

    public List<String> findCountriesWithOwnCurrency(List<CountryCurrencyData> countryCurrencyDatas) {
        return countryCurrencyDatas.stream()
                .collect(Collectors.groupingBy(CountryCurrencyData::getCurrencyShortname)) // countryCurrencyData -> countryCurrencyData.getCurrencyShortname()
                .values().stream()
                .filter(countryCurrencyData -> countryCurrencyData.size() == 1)
                .map(countryCurrencyData -> countryCurrencyData.get(0).getCountry())
                .collect(Collectors.toList());

        /*
        countryCurrencyDatas.stream()
                .collect(Collectors.groupingBy(CountryCurrencyData::getCurrencyShortname)) // countryCurrencyData -> countryCurrencyData.getCurrencyShortname()
                .entrySet().stream()
                .filter(entry -> entry.getValue().size() == 1)
                .map(entry -> entry.getValue().get(0).getCountry())
                .collect(Collectors.toList());
         */

    }

    public Map<String, Integer> calculateUsageStatistics(List<CountryCurrencyData> countryCurrencyDatas) {
        return countryCurrencyDatas.stream()
                .collect(Collectors.groupingBy(CountryCurrencyData::getCurrencyShortname))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().size())); // entry -> entry.getKey()
    }

    //metoda niekoniecznie pasuje do tej klasy
    // z listy list integerów - stwórzmy jedną listę wartości
    //[[1,2,3], [2,3,4], [4,5,6]] -> [1,2,3,2,3,4,4,5,6]
    public List<Integer> flatten(List<List<Integer>> listOfLists) {
        return listOfLists.stream()
                .flatMap(Collection::stream) // singleList -> singleList.stream(), zamiast tego referencja do metody
                .collect(Collectors.toList());
    }

    public String findFirstCountryWithEurCurrency(List<CountryCurrencyData> countryCurrencyDatas) {
        return countryCurrencyDatas.stream()
                .filter(countryCurrencyData -> countryCurrencyData.getCurrencyShortname().equals("EUR"))
                .map(CountryCurrencyData::getCountry)
                .findFirst().orElseThrow();
    }

}
