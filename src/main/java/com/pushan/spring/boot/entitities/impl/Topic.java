/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pushan.spring.boot.entitities.impl;

import com.pushan.spring.boot.entitities.AbstractEntity;

/**
 *
 * @author Pushan
 */
public class Topic
        extends AbstractEntity {

    public Topic() {
        super();
    }

    public Topic(int id, String name, String description) {
        super(id, name, description);
    }
}
