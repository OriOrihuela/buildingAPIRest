package org.lasencinas.apirest.controllers;

import org.lasencinas.apirest.resources.Topic;
import org.lasencinas.apirest.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(path = "/topics", method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(path = "/topics/{id}", method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(topic, id);
    }

    @RequestMapping(path = "/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic( id);
    }
}
