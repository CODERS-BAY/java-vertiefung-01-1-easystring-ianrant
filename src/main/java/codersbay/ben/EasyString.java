package codersbay.ben;

import java.util.ArrayList;
import java.util.List;

public class EasyString {

    private List<Character> characterList;

    public EasyString() {
        characterList = new ArrayList<>();
    }

    public EasyString(String toAdd) {
        characterList = new ArrayList<>();
        this.add(toAdd);
    }

    public EasyString(String toAdd, boolean trimFrontBack) {
        characterList = new ArrayList<>();
        this.add(toAdd);
        this.trimFront();
        this.trimBack();
    }


    // DONE
    public int length() {
        return this.getCharacterList().size();
    }


    // DONE
    public void add(String text) {
        for (int i = 0; i < text.length(); i++) {
            Character c = text.charAt(i);
            this.characterList.add(c);
        }
    }


    // DONE
    public void remove(int length) {
        //shorten the element for the number in the parameter
        int listSize = this.getCharacterList().size();
        if (listSize >= length) {
            for (int i = 0; i < length; i++) {
                this.getCharacterList().remove(listSize - 1 - i);
            }
        }
    }


    public void trimFront() {
        //remove all blank spaces located before the characters

    }


    public void trimBack() {
        //remove all blank spaces located behind the characters
    }


    public void trimMiddle() {
        //remove all blank spaces that are not located before or behind the characters
    }


    // DONE
    @Override
    public String toString() {
        String temp = "";
        for (Character c : characterList) {
            temp += c.toString();
        }
        return temp;
    }


    public List<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
    }
}
