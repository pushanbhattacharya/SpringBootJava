/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pushan.spring.boot.data;

import com.pushan.spring.boot.entitities.AbstractEntity;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Pushan
 */
public interface BaseRepository<T extends AbstractEntity, U extends Serializable>
        extends CrudRepository<T, U> {

}
