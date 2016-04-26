/*******************************************************************************
 * Copyright  (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 *  
 *  WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.custom.hostobjects.util;

// TODO: Auto-generated Javadoc
/**
 * The Enum ChargingPlanType.
 */
public enum ChargingPlanType {

	/** The unlimited. */
	UNLIMITED("Unlimited"), /** The gold. */
 GOLD("Gold"), /** The silver. */
 SILVER("Silver"), /** The bronze. */
 BRONZE("Bronze"),/** The premium. */
PREMIUM("Premium"),/** The subscription. */
SUBSCRIPTION("Subscription"),/** The request based. */
REQUEST_BASED("Requestbased");

	/** The value. */
	private String value;

	/**
	 * Instantiates a new charging plan type.
	 *
	 * @param value the value
	 */
	private ChargingPlanType(String value) {
		this.value = value;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
}