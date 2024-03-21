/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.fin.austro.model;

/**
 *
 * @author ba0100068f
 */
public class Propiedad {

    private String key;

    private String value;

    private String character;

    public Propiedad(String key, String value, String character) {
        this.key = key;
        this.value = value;
        this.character = character;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCharacter() {
        return this.character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String toString() {
        return this.key + this.character.toString() + this.value;
    }
}
