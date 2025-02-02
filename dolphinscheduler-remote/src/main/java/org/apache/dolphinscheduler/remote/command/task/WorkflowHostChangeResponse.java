/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.remote.command.task;

import org.apache.dolphinscheduler.remote.command.MessageType;
import org.apache.dolphinscheduler.remote.command.ResponseMessageBuilder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkflowHostChangeResponse implements ResponseMessageBuilder {

    boolean success;

    public static WorkflowHostChangeResponse success() {
        WorkflowHostChangeResponse response = new WorkflowHostChangeResponse();
        response.setSuccess(true);
        return response;
    }

    public static WorkflowHostChangeResponse failed() {
        WorkflowHostChangeResponse response = new WorkflowHostChangeResponse();
        response.setSuccess(false);
        return response;
    }

    @Override
    public MessageType getCommandType() {
        return MessageType.WORKFLOW_HOST_CHANGE_RESPONSE;
    }
}
