/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.core.protocol.openwire.amq;

import java.util.List;
import java.util.Map;

import org.apache.activemq.command.ConnectionId;
import org.apache.activemq.command.ConsumerId;
import org.apache.activemq.command.ProducerId;
import org.apache.activemq.command.SessionId;

/**
 * What's the purpose of this?
 *
 * @author howard
 *
 */
public interface AMQTransportConnectionStateRegister
{
   AMQTransportConnectionState registerConnectionState(ConnectionId connectionId,
         AMQTransportConnectionState state);

   AMQTransportConnectionState unregisterConnectionState(ConnectionId connectionId);

   List<AMQTransportConnectionState> listConnectionStates();

   Map<ConnectionId, AMQTransportConnectionState> mapStates();

   AMQTransportConnectionState lookupConnectionState(String connectionId);

   AMQTransportConnectionState lookupConnectionState(ConsumerId id);

   AMQTransportConnectionState lookupConnectionState(ProducerId id);

   AMQTransportConnectionState lookupConnectionState(SessionId id);

   AMQTransportConnectionState lookupConnectionState(ConnectionId connectionId);

   boolean isEmpty();

   boolean doesHandleMultipleConnectionStates();

   void intialize(AMQTransportConnectionStateRegister other);

   void clear();

}