package org.launchcode.models.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.launchcode.models.Category;


import javax.transaction.Transactional;

/**
 * Created by berryburge on 4/10/17.
 */
@Repository
@Transactional
public interface CategoryDao extends CrudRepository<Category, Integer>{
}
