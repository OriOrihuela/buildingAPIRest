package org.lasencinas.apirest.services;

import org.lasencinas.apirest.resources.Topic;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    /* ---- Properties ---- */
    private List<Topic> topics = new ArrayList<>();


    /* ---- PostConstruct ---- */
    @PostConstruct
    public void __init__() {
        getTopics().add(new Topic("spring", "Spring Framework", "Spring Framework Description"));
        getTopics().add(new Topic("java", "Core Java", "Core Java Description"));
        getTopics().add(new Topic("javascript", "JavaScript", "JavaScript Description"));
    }


    /* ---- Getters ---- */
    public List<Topic> getTopics() {
        return topics;
    }


    /* ---- Behaviours ---- */
    public int getNumberOfTopics() {
        return getTopics().size();
    }

    public Topic getTopic(String id) {
        return getTopics().stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        getTopics().add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for (int index = 0; index < getNumberOfTopics(); index++) {
            Topic topic1 = getTopics().get(index);
            if (topic1.getId().equals(id)) {
                getTopics().set(index, topic);
            }
        }
    }

    public void deleteTopic(String id) {
        getTopics().removeIf(topic -> topic.getId().equals(id));
    }
}
