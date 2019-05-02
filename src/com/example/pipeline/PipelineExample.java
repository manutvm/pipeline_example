package com.example.pipeline;

import org.apache.log4j.Logger;

public class PipelineExample {
	final static Logger logger = Logger.getLogger(PipelineExample.class);

	public static void main(String[] args) {

		PipelineExample obj = new PipelineExample();
		obj.runMe("Test");

	}

	private void runMe(String parameter) {

		if (logger.isDebugEnabled()) {
			logger.debug("This is debug : " + parameter);
		}

		if (logger.isInfoEnabled()) {
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);

	}
}
