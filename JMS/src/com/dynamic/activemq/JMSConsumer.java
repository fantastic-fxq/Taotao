package com.dynamic.activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * 消费消息
 * 
 * @author fxq
 *
 */
public class JMSConsumer {

	private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;// 默认连接用户
	private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;// 默认连密码
	private static final String BROKEURL = ActiveMQConnection.DEFAULT_BROKER_URL;// 默认连接地址;

	public static void main(String[] args) {

		ConnectionFactory connectionFactory;// 定义连接工厂;
		Connection connection = null;// 定义连接
		Session session;// 定义会话,接受或发送消息的线程
		Destination destination;// 消息目的地;
		MessageConsumer messageConsumer;// 消息的消费者;

		// 实例化连接工厂;
		connectionFactory = new ActiveMQConnectionFactory(JMSConsumer.USERNAME,
				JMSConsumer.PASSWORD, JMSConsumer.BROKEURL);

		try {
			connection = connectionFactory.createConnection();// 通过连接工厂创建连接;
			connection.start();// 启动连接
			// Boolean.FALSE :是否需要事务;
			session = connection.createSession(Boolean.FALSE,
					Session.AUTO_ACKNOWLEDGE);// 创建会话
			destination = session.createQueue("FirstQueue1");// 创建消息对列;
			messageConsumer = session.createConsumer(destination);// 创建消息消费者;
			while (true) {
				TextMessage textMessage = (TextMessage) messageConsumer
						.receive(1000);
				if (textMessage != null) {
					System.out.println("接收到的消息" + textMessage.getText());
				} else {
					break;
				}
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}

	}
}
