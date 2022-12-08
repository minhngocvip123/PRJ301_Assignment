/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Definitions {
    int wordID;
    int PartOfSpeech;
    String definition;
    String example;

    public Definitions() {
    }

    public Definitions(int wordID, int PartOfSpeech, String definition, String example) {
        this.wordID = wordID;
        this.PartOfSpeech = PartOfSpeech;
        this.definition = definition;
        this.example = example;
    }

    public int getWordID() {
        return wordID;
    }

    public void setWordID(int wordID) {
        this.wordID = wordID;
    }

    public int getPartOfSpeech() {
        return PartOfSpeech;
    }

    public void setPartOfSpeech(int PartOfSpeech) {
        this.PartOfSpeech = PartOfSpeech;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
    
}
