package sanremoserver;

import java.io.Serializable;

public class MessageDTO implements Serializable{
    private int id;
    private String incipit;

    public MessageDTO() {
    }

    public MessageDTO(int id, String incipit) {
        this.id = id;
        this.incipit = incipit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIncipit() {
        return incipit;
    }

    public void setIncipit(String incipit) {
        this.incipit = incipit;
    }  
}
