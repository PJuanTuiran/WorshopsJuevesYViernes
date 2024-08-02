package org.riwi.persistence.crud;

public interface ReadModel<Entity, ID> {
    public Entity read(ID id, Entity request);

}
