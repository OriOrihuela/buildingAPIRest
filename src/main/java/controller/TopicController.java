package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import topics.Topic;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    /* ---- Requests ---- */
    @RequestMapping(path = "/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "JavaScript", "JavaScript Description"));
    }
}
