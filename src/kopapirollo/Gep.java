package kopapirollo;

import java.io.Serializable;

public class Gep extends Jatekos implements Serializable{
    private int mod;
    public Gep(int mod) {
        super();
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }
    
    
}
