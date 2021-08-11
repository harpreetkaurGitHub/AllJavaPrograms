//package com.company.Collectionss.ArrayListss.All.Kafka;
//
//import com.m83.analytics.config.ApplicationConfig;
//
//import org.apache.kafka.clients.producer.Callback;
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.ProducerRecord;
//import org.apache.kafka.clients.producer.RecordMetadata;
//import org.apache.log4j.Logger;
//
//import java.util.Objects;
//import java.util.Properties;
//
//public class KafkaPublisher {
//
//    private static final Logger logger = Logger.getLogger(KafkaPublisher.class);
//
//    private KafkaProducer<String, String> producer;
//    private static final String CLIENT_ID = "Spark_Metrics";
//    private Properties properties;
//
//
//    private static KafkaPublisher kafkaPublisher = null;
//
//    public static KafkaPublisher getInstance(Boolean isAsync) {
//        if (Objects.isNull(kafkaPublisher))
//            kafkaPublisher = new KafkaPublisher(isAsync);
//        return kafkaPublisher;
//    }
//
//    private KafkaPublisher(Boolean isAsync) {
//        properties = new Properties();
//        properties.put("bootstrap.servers", ApplicationConfig.getConfig().getKafkaBootstrapServers());
//        properties.put("client.id", CLIENT_ID);
//        properties.put("key.serializer", "org.apache.kafka.common.serialization.IntegerSerializer");
//        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        producer = new KafkaProducer<>(properties);
////        this.topic = topic;
//    }
//
//    public void send(String topic, String message) {
//        try {
//            producer.send(new ProducerRecord<>(topic, message), new OnSend());
//        } catch (Exception e) {
//            logger.error("KafkaPublisher for Spark Listener went down, creating a new one..\n"+e.getMessage());
//            if (Objects.nonNull(producer)) {
//                producer.close();
//                producer = null;
//            }
//            producer = new KafkaProducer<>(properties);
//            producer.send(new ProducerRecord<>(topic, message), new OnSend());
//            logger.error("KafkaPublisher for Spark Listener created, data publish done successfully..");
//        }
//    }
//
//}
//
//class OnSend implements Callback {
//    public void onCompletion(RecordMetadata metadata, Exception exception) {
//    }
//}
