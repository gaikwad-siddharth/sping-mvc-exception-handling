package in.siddharth.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import in.siddharth.controller.GreetController;

@ControllerAdvice
public class ExceprionHandler {
	
	private Logger logger = LoggerFactory.getLogger(GreetController.class);
	
	@ExceptionHandler(value = ArithmeticException.class)
	public String handleAE(ArithmeticException ae) {
		String msg = ae.getMessage();
		logger.error(msg);
		return "errorPage";
	}

}
