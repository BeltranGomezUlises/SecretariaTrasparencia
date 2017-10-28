/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.st.entities.commons;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import org.mongojack.ObjectId;

/**
 * clase padre de entidades de mongo
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 * @param <String> tipo de dato de la llave primaria de la entidad
 */
public class EntityMongo<String> extends IEntity<String> {

    @ObjectId
    @JsonProperty("_id")
    protected String id;
            
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EntityMongo other = (EntityMongo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String obtenIdEntidad() {
        return id;
    }

}
