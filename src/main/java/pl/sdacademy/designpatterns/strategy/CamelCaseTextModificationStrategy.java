package pl.sdacademy.designpatterns.strategy;

public class CamelCaseTextModificationStrategy implements TextModificationService {
    // asd ewq sa eqw -> AsdEwqSaEqw -> camelCase
    // aSd eWq sA eQw -> AsdEwqSaEqw

    // snake case -> asd_ewq_sa_eqw
    @Override
    public String modify(String toModify) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = toModify.split(" ");
        for (String word: words) {
            String trimmedWord = word.trim();
            String lowerCasedWord = trimmedWord.toLowerCase();
            String targetWord = toFirstLetterUppercase(lowerCasedWord);
            stringBuilder.append(targetWord);
        }
        return stringBuilder.toString();
    }

    private String toFirstLetterUppercase(String lowerCasedWord) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lowerCasedWord.length(); i++) {
            if (i == 0) {
                stringBuilder.append(Character.toUpperCase(lowerCasedWord.charAt(i)));
            } else {
                stringBuilder.append(lowerCasedWord.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
