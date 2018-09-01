/** 
 * Filename IParameterService.java
 * Create on 2014-1-3
 * Copyright 2011 Frogsing All Rights Reserved.
 */
package com.owner.heart.service;

import java.util.Date;


/**
 * Description: 
 * 
 * @author <a href="mailto:service@frogsing.com">Sandy</a>
 * @since version1.0
 */
public interface IParameterService {

	String genarateSeqNo(String name);
	Date getServerTime();
}
