package org.udg.pds.springtodo.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class IdObject {

    public IdObject(){

    }

    public IdObject(Long n){
        id = n;
    }


    public Long getId() {
        return id;
    }

    @NonNull
    private Long id;

}
