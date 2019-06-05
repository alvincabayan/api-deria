package com.alvincabayan.repository;

import org.springframework.data.repository.CrudRepository;
import com.alvincabayan.model.MenuOrder;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete
public interface OrderRepository extends CrudRepository<MenuOrder, Integer> {

}
