package com.epam;

import java.util.HashMap;

public class Translator {
    private HashMap<String, String> vocabulary;

    public Translator(){
        this.vocabulary = new HashMap<String, String>();
    }

    public void addWord(String english, String ukrainian){
        vocabulary.put(english.trim(),ukrainian.trim());
    }

    public void showVocabularly(){
        System.out.println(vocabulary);
    }

    public String getTranslation(String text){
        String result = "";
        String[] data = text.split("[_]");
        for (String item:data){
            if (vocabulary.containsKey(item)){
                result+=vocabulary.get(item) + " ";
            } else {
                result+="??? ";
            }
        }
        return result;
    }

    public void start(){
        boolean flag = true;
        System.out.println("Choose the command: \n" +
                "1. Add word \n" +
                "2. Show vocabulary\n" +
                "3. Translate phrase \n" +
                "4. Exit\n");

        while (flag){
            System.out.println("Commands: 1,2,3,4");
            String message = InputData.scan();
            switch (message){
                case "4":{
                    flag = false;
                    break;
                }
                case "1": {
                    System.out.println("Enter English word -> ");
                    String english = InputData.scan();
                    System.out.println("Enter Ukrainian word -> ");
                    String ukrainian = InputData.scan();
                    addWord(english,ukrainian);
                    break;
                }
                case "2":{
                    showVocabularly();
                    break;
                }
                case "3":{
                    System.out.println("Enter phrase in English -> ");
                    String text = InputData.scan();
                    System.out.println(getTranslation(text));
                }
            }
        }
    }
}
