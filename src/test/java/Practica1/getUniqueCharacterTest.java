package Practica1;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

public class getUniqueCharacterTest {

    private List<String> getUniqueCharacter(String wordToTest){
        List<String> uniqueCharacters = new ArrayList<>();
        wordToTest = wordToTest.toLowerCase(Locale.ROOT);

        for (int i = 0; i < wordToTest.length(); i++) {
        String character = StringUtils.substring(wordToTest, 1, 1 +1 );

    }
}
