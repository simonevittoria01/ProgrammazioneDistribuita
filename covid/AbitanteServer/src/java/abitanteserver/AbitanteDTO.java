package abitanteserver;

import java.io.Serializable;


public class AbitanteDTO implements Serializable{
    private int id;
    private String interesse;

    public AbitanteDTO() {
    }

    public AbitanteDTO(int id, String interesse) {
        this.id = id;
        this.interesse = interesse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }
    
}
