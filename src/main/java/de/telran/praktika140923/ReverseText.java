package de.telran.praktika140923;

public class ReverseText {

    /*
    написать класс в котором будет реализован метод который
    получает на вход текст и должен вернуть перевернутую строку

    - получили строку текста в качестве параметра метода
    - вычислили ее длину
    - в цикле проходим с конца до начала и "добавляем" к нашему результату каждый символ исходной строки

     */


        public String reverseUserText(String userText){

            String reverseResult = "";

            for (int i = userText.length()-1; i >= 0 ; i--) {
                reverseResult = reverseResult + userText.charAt(i);
            }

            return reverseResult;
        }

    }


