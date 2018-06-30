/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pushan.spring.boot.config.services.impl;

import com.pushan.spring.boot.config.services.AbstractService;
import com.pushan.spring.boot.entitities.impl.Topic;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author pusha
 */
@Service
public class TopicService
        implements AbstractService<Topic, Integer> {

    private final List<Topic> ALL_TOPICS = new ArrayList<Topic>() {
        private static final long serialVersionUID = 1L;

        {
            add(new Topic(1, "Spring", "Spring Boot"));
            add(new Topic(2, "Java", "Core Java"));
        }
    };

    @Override
    public Collection<Topic> getAll() {
        return Collections.unmodifiableList(ALL_TOPICS);
    }

    @Override
    public Topic getOne(Integer id) {
        return ALL_TOPICS
                .stream()
                .filter(element -> element.getId() == id)
                .findFirst()
                .get();
    }

    @Override
    public void add(Topic topic) {
        ALL_TOPICS.add(topic);

    }

    @Override
    public void update(Integer id, Topic topic) {
        ALL_TOPICS.set(
                ALL_TOPICS.indexOf(getOne(id)),
                topic);
    }

    @Override
    public void delete(Integer id) {
        ALL_TOPICS.removeIf(element -> element.getId() == id);
    }
}
