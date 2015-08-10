/**
 * 
 */
package com.newegg.kafka.consumer;

/**
 * @company Newegg Tech (China) Co, Ltd
 * @author zicat
 * @date 2015
 * 
 */
public class KafkaConsumerPackage {

	private KafkaConsumerPackage() {
		// can't construct
	} 

	public static Package get() {
		return KafkaConsumerPackage.class.getPackage();
	}
}
