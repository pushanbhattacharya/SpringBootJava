/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pushan.spring.boot.config.services;

import com.pushan.spring.boot.entitities.AbstractEntity;
import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author Pushan
 * @param <E> The entity class
 */
public interface AbstractService<E extends AbstractEntity, U extends Serializable> {

    public Collection<E> getAll();

    public E getOne(U id);

    public void add(E e);

    public void update(U id, E e);

    public void delete(U id);
}
