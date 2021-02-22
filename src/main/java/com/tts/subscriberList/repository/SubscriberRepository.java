package com.tts.subscriberList.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.subscriberList.models.Subscriber;

@Repository
public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {
	
}
