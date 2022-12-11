/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Word {
    int wordID;
    String word;
    String PartOfSpeech;
    String Definition;
    String Example;

    public Word() {
    }

    public Word(int wordID, String word, String PartOfSpeech, String Definition, String Example) {
        this.wordID = wordID;
        this.word = word;
        this.PartOfSpeech = PartOfSpeech;
        this.Definition = Definition;
        this.Example = Example;
    }

    public int getWordID() {
        return wordID;
    }

    public void setWordID(int wordID) {
        this.wordID = wordID;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPartOfSpeech() {
        return PartOfSpeech;
    }

    public void setPartOfSpeech(String PartOfSpeech) {
        this.PartOfSpeech = PartOfSpeech;
    }

    public String getDefinition() {
        return Definition;
    }

    public void setDefinition(String Definition) {
        this.Definition = Definition;
    }

    public String getExample() {
        return Example;
    }

    public void setExample(String Example) {
        this.Example = Example;
    }
    
}
