package org.riwi.persistence.crud;

import java.util.List;

public interface ReadAllModel<Entity> {
    public List<Entity> getAllModel();
}
