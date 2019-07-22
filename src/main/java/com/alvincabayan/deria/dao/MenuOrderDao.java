package com.alvincabayan.deria.dao;

import org.springframework.data.repository.CrudRepository;

import com.alvincabayan.deria.model.MenuOrder;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete
public interface MenuOrderDao extends CrudRepository<MenuOrder, Integer> {

}
