/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pushan.spring.boot.config.controllers;

import com.pushan.spring.boot.config.services.impl.TopicService;
import com.pushan.spring.boot.entitities.impl.Topic;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pushan
 */
@RestController
@RequestMapping(path = "/topics")
public class TopicsController {

    @Autowired
    private TopicService topicService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Topic> getTopics() {
        return topicService.getAll();
    }

    @RequestMapping(path = "/{id}",
                    method = RequestMethod.GET)
    public Topic getTopic(@PathVariable int id) {
        return topicService.getOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic) {
        topicService.add(topic);
    }

    @RequestMapping(path = "/{id}",
                    method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic, @PathVariable int id) {
        topicService.update(id, topic);
    }

    @RequestMapping(path = "/{id}",
                    method = RequestMethod.DELETE)
    public void updateTopic(@PathVariable int id) {
        topicService.delete(id);
    }
}
