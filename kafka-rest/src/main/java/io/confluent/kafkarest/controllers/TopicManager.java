package io.confluent.kafkarest.controllers;

import io.confluent.kafkarest.entities.Topic;
import io.confluent.kafkarest.entities.TopicsMap;
import org.apache.kafka.clients.admin.TopicListing;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * A service to manage Kafka {@link Topic Topics}.
 */
public interface TopicManager {
    /**
    Returns the list of Kafka {@link Topic Topics} known.
     */
    CompletableFuture<TopicsMap> listTopics(String clusterId) throws ExecutionException, InterruptedException;

    CompletableFuture<List<Topic>> getTopic(String clusterId, String topicName);
}
