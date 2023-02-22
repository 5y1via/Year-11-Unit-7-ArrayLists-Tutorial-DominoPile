import java.util.ArrayList;
public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile(){
        pile = new ArrayList();
    }
    public ArrayList<Domino> getPile(){
        return pile;
    }
    public void newStack6(){
        for (int i = 0; i<=36; i++){
            for (int l = i; l<=6; l++){
                Domino domino = new Domino();
                domino.setTop(i);
                domino.setBottom(l);
                pile.add(domino);
            }
        }
    }

    public void shuffleOptionOne(){

    }
    public void shuffleOptionTwo(){
        int min = 0;
        int max = pile.size()-1;
        for (int i = 0; i<1000; i++){
            int switchIndex1 = (int) Math.floor(Math.random() *(max - min + 1) + min);
            int switchIndex2 = (int) Math.floor(Math.random() *(max - min + 1) + min);
            Domino domino = pile.get(switchIndex1);
            pile.set(switchIndex1, pile.get(switchIndex2));
            pile.set(switchIndex2, domino);
        }
    }
}
