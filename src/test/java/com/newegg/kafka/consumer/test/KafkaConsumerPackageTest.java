/**
 * 
 */
package com.newegg.kafka.consumer.test;

import org.junit.Assert;
import org.junit.Test;

import com.newegg.kafka.consumer.KafkaConsumerPackage;

/**
 * @company Newegg Tech (China) Co, Ltd
 * @author zicat
 * @date 2015
 * 
 */
public class KafkaConsumerPackageTest {
	
	public static final String name = "com.newegg.kafka.consumer";
	
	@Test
	public void testGet() {
		
		Package packageName = KafkaConsumerPackage.get();
		Assert.assertTrue(packageName.getName().equals(name));
	}
}
