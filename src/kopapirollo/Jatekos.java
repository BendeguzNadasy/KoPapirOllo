package kopapirollo;

import java.io.Serializable;

public class Jatekos implements Serializable{
    private int nyeresek;

    public Jatekos() {
        this.nyeresek = 0;
    }

    public int getNyeresek() {
        return nyeresek;
    }
  
    public void jatekosNyer() {
        nyeresek++;
    }
    
}
