package org.mw.kafka.consumer.sync;

import org.mw.kafka.common.IMessageListener;
import org.mw.kafka.consumer.async.KafkaAsyncConsumer;
import org.mw.kafka.consumer.common.KafkaConsumerConfig;
import org.mw.kafka.proxy.AbstrctReceiveStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
*
*@author Devonmusa
*@date   2017年4月27日
*/
public class KafkaSyncConsumer extends AbstrctReceiveStrategy {
	private static final Logger LOG = LoggerFactory.getLogger(KafkaAsyncConsumer.class);
	
	private KafkaSyncRecevier kafkaSyncRecevier;
	
	public KafkaSyncConsumer(KafkaConsumerConfig consumerConfig) {
		kafkaSyncRecevier = new KafkaSyncRecevier(consumerConfig);
		LOG.info(" init finshed");
	}
	
	@Override
	public void receive() {
		
		kafkaSyncRecevier.receive();
	}

	@Override
	public void close() {

	}

	@Override
	public void receive(IMessageListener imessageListener) {
		// TODO Auto-generated method stub
		
	}
	
}
