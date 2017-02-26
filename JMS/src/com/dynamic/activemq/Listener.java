package com.dynamic.activemq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


/**
 *消息监听
 * @author fxq
 *
 */
public class Listener implements MessageListener {//实现消息监听

	@Override
	public void onMessage(Message message) {
		try {
			System.out.println("收到的消息Listener" + ((TextMessage)message).getText() );//接收消息
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
	
}