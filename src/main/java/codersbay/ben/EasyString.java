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
    public void remove(int length) throws IllegalArgumentException {
        int listSize = this.getCharacterList().size();
        if (listSize >= length) {
            for (int i = 0; i < length; i++) {
                this.getCharacterList().remove(listSize - 1 - i);
            }
        } else {
            throw new IllegalArgumentException("You want to delete more characters than are contained in the list!");
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
    public void trimMiddle() {
        // TODO find first letter
        for (int i = 0; i < characterList.size(); i++) {
            if (!characterList.get(i).equals(' ')) {
                indexList.add(i);
                break;
            }
        }

        // TODO find last letter
        for (int i = characterList.size() - 1; i > 0; i--) {
            if (!characterList.get(i).equals(' ')) {
                indexList.add(i);
                break;
            }
        }

        // TODO delete blank spaces between first letter and last letter
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
            stringBuilder.append(c);
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
