/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.management;

import java.util.Set;

/**
 * Statistics for a JCA connection
 *
 * 
 */
public class JCAConnectionStatsImpl extends StatsImpl {
    private String connectionFactory;
    private String managedConnectionFactory;
    private TimeStatisticImpl waitTime;
    private TimeStatisticImpl useTime;

    public JCAConnectionStatsImpl(String connectionFactory, String managedConnectionFactory, TimeStatisticImpl waitTime, TimeStatisticImpl useTime) {
        this.connectionFactory = connectionFactory;
        this.managedConnectionFactory = managedConnectionFactory;
        this.waitTime = waitTime;
        this.useTime = useTime;

        // lets add named stats
        addStatistics(Set.of(waitTime, useTime));
    }

    public String getConnectionFactory() {
        return connectionFactory;
    }

    public String getManagedConnectionFactory() {
        return managedConnectionFactory;
    }

    public TimeStatisticImpl getWaitTime() {
        return waitTime;
    }

    public TimeStatisticImpl getUseTime() {
        return useTime;
    }

}
