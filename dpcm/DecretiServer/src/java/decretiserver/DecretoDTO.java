package decretiserver;

import java.io.Serializable;

public class DecretoDTO implements Serializable{
    private int id;
    private int numPresentazioni;

    public DecretoDTO() {
    }

    public DecretoDTO(int id, int numPresentazioni) {
        this.id = id;
        this.numPresentazioni = numPresentazioni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumPresentazioni() {
        return numPresentazioni;
    }

    public void setNumPresentazioni(int numPresentazioni) {
        this.numPresentazioni = numPresentazioni;
    }  
}
