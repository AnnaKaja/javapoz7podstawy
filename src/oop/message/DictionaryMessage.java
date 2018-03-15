package oop.message;

import java.util.Random;

public class DictionaryMessage implements Message{
    public void setDictionary(String[] dictionary) {
        this.dictionary = dictionary;
    }

    private String [] dictionary;
    private Random random;

    public DictionaryMessage(){
       this(new String[]{"Adam", "Ewa", "Jan"});

    }

    public DictionaryMessage (String[] dictionary){
        this.dictionary = dictionary;
        this.random = new Random();
    }

    @Override
    public String getMessage() {
        return null;
    }
    private String getRandomMessage(){
        int index = random.nextInt(dictionary.length);
        return dictionary[index];
    }
}

