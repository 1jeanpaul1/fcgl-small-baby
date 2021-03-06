package com.fcgl.MessageQueue;

import com.fcgl.Listing.Response.IResponse;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public interface IMessageQueueReceiver {

  /**
   * Processes the messages from the message queue and maps it to an Object
   */
  IResponse processMessages();

  /**
   * Receive messages from the message queue
   */
  void receive(Channel channel, Connection connection);
}
