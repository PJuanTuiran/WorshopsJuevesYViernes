package org.riwi.imodel;

import org.riwi.entities.AvionEntity;
import org.riwi.persistence.crud.CreateModel;
import org.riwi.persistence.crud.DeleteModel;
import org.riwi.persistence.crud.ReadModel;

public interface IAvionModel extends CreateModel<AvionEntity>, DeleteModel<Integer>, ReadModel<Integer, AvionEntity > {
}
