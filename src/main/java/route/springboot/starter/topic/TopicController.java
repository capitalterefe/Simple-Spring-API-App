package route.springboot.starter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAlltopics();
		}
	
	@RequestMapping("/topic/{topic}")
	public Topic getTopic(@PathVariable String topic) {
		return topicService.getTopic(topic);
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topic")
	public void addTopic(@RequestBody Topic topic) {
		 topicService.addTopic(topic);
		}
	@RequestMapping(method=RequestMethod.PUT,value="/topic/{id}")
	public void editTopic(@RequestBody Topic topic, @PathVariable Integer id) {
		topicService.editTopic(topic,id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topic/{id}")
	public void editTopic(@PathVariable Integer id) {
		topicService.deleteTopic(id);
	}

}
