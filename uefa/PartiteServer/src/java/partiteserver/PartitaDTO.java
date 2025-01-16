package partiteserver;

import java.io.Serializable;

public class PartitaDTO implements Serializable{
    private int id;
    private int golCasa;
    private int golOspite;

    public PartitaDTO() {
    }

    public PartitaDTO(int id, int golCasa, int golOspite) {
        this.id = id;
        this.golCasa = golCasa;
        this.golOspite = golOspite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGolCasa() {
        return golCasa;
    }

    public void setGolCasa(int golCasa) {
        this.golCasa = golCasa;
    }

    public int getGolOspite() {
        return golOspite;
    }

    public void setGolOspite(int golOspite) {
        this.golOspite = golOspite;
    }
}
