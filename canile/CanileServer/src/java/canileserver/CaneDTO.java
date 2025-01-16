package canileserver;

import java.io.Serializable;

public class CaneDTO implements Serializable{
    private int id;
    private boolean stato;

    public CaneDTO() {
    }  

    public CaneDTO(int id, boolean stato) {
        this.id = id;
        this.stato = stato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }
}
