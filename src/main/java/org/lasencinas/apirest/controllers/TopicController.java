package org.lasencinas.apirest.controllers;

import org.lasencinas.apirest.resources.Topic;
import org.lasencinas.apirest.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {

    /* ----- Properties ---- */
    @Autowired
    private TopicService topicService = null;


    /* ---- Requests ---- */
    @RequestMapping(path = "/number")
    public int numberOfTopics() {
        return topicService.getNumberOfTopics();
    }

    @RequestMapping(path = "/topics")
    public List<Topic> getAllTopics() {
        return topicService.getTopics();
    }

    @RequestMapping(path = "/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }
}
