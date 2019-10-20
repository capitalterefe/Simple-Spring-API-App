package route.springboot.starter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
private List<Topic>topics=new ArrayList<>(Arrays.asList(new Topic(2,"math","besti"),
		new Topic(3,"Pysics","hardi"),
		new Topic(4,"Chemist","inti"),
		new Topic(5,"Engli","lovli")));

public List<Topic>getAlltopics(){
	return this.topics;
}

public Topic getTopics(String topic) {
	for(Topic t:this.topics) {
		if(t.getName().equals(topic))
			return t;
	}
	return null;
	
}
public Topic getTopic(String topic) {
	return this.topics.stream().filter(k->k.getName().equals(topic)).findFirst().get();
}

public void addTopic(Topic topic) {
	this.topics.add(topic);
}
public void editTopic(Topic topic, Integer id) {
	for(Topic t:this.topics) {
		if(t.getId().equals(id)) {
			topics.remove(t);
			topics.add(topic);
		}
			
	}
}

public void deleteTopic(Integer id) {
	this.topics.removeIf(t->t.getId().equals(id));
	
}




}
