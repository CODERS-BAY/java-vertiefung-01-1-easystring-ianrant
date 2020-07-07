package codersbay.ben;

import java.util.ArrayList;
import java.util.List;

public class EasyString {

    private List<Character> characterList;
    private List<Integer> indexList;


    public EasyString() {
        characterList = new ArrayList<>();
        indexList = new ArrayList<>();

    }

    public EasyString(String toAdd) {
        characterList = new ArrayList<>();
        indexList = new ArrayList<>();
        this.add(toAdd);
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
        int listSize = this.getCharacterList().size();
        if (listSize >= length) {
            for (int i = 0; i < length; i++) {
                this.getCharacterList().remove(listSize - 1 - i);
            }
        }
    }

    // DONE
    public void trimFront() {
        for (int i = 0; i < getCharacterList().size(); i++) {
            if (characterList.get(0).equals(' ')) {
                characterList.remove(0);
            } else {
                break;
            }
        }
    }

    // DONE
    public void trimBack() {
        for (int i = characterList.size() - 1; i > 0; i--) {
            if (characterList.get(characterList.size() - 1).equals(' ')) {
                characterList.remove(characterList.size() - 1);
            } else {
                break;
            }
        }
    }

    // DONE
    /*
    public void trimMiddle() {
        for (int i = 0; i < getCharacterList().size(); i++){
            if(characterList.get(i).equals(' ') && i > 0 && i < (getCharacterList().size() - 1)){
                getCharacterList().remove(i);
            }
        }
    }

     */

    public void trimMiddle() {
        // find first letter
        for (int i = 0; i < characterList.size(); i++) {
            if (!characterList.get(i).equals(' ')) {
                indexList.add(i);
                break;
            }
        }

        // find last letter
        for (int i = characterList.size() - 1; i > 0; i--) {
            if (!characterList.get(i).equals(' ')) {
                indexList.add(i);
                break;
            }
        }

        /*
        // STATUS: Programm kann feststellen, wann innerhalb des Strings der erste und der letzte Blank Space ist
        // DEBUGGING
        for (Integer i : indexList) {
            System.out.print(i + " ");
        }
        System.out.println();
        */

        int counterBegin = indexList.get(0);
        int counterEnd = indexList.get(1);
        int deletedBlanks = 0;

        for (int i = counterBegin; i < counterEnd - deletedBlanks; i++) {
            if (characterList.get(i).equals(' ')) {
                characterList.remove(i);
                deletedBlanks++;
                i--;
            }
        }
    }


    // DONE
    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        for (Character c : characterList) {
            stringBuilder.append(c.toString());
        }

        return stringBuilder.toString();
    }


    public List<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
    }

    public List<Integer> getIndexList() {
        return indexList;
    }

    public void setIndexList(List<Integer> indexList) {
        this.indexList = indexList;
    }
}
