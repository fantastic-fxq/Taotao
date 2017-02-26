package com.dynamic.activemq2;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


/**
 *消息监听 订阅者1
 * @author fxq
 *
 */
public class Listener2 implements MessageListener {//实现消息监听

	@Override
	public void onMessage(Message message) {
		try {
			System.out.println(" 订阅者2--->>收到的消息" + ((TextMessage)message).getText() );//接收消息
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
	
}
