package org.udg.pds.springtodo.entity;


import javax.persistence.*;

@Entity(name="usergroup")
public class Group {
    public Group(){
        name = "";
        descripcio = "";
    }

    public Group(String name, String descripcio) {
        this.name = name;
        this.descripcio = descripcio;
    }

    public String getName() {
        return name;
    }

    public String getDescripcio() {
        return descripcio;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_user")
    private User owner;

    @Id
    private String name;

    private String descripcio;
}
