package com.test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.Log4JLogger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class ExceptionResolver implements HandlerExceptionResolver {

	private Log log = LogFactory.getLog(this.getClass());
	@Override
	public ModelAndView resolveException(HttpServletRequest req,
			HttpServletResponse res, Object obj,Exception ex) {
		log.info(ex);
		DifineException difineException = null;
		if(ex instanceof DifineException){
			difineException = (DifineException)ex;
		}else{
			difineException = new DifineException("未知异常，请与管理员联系");
		}
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("error1");
		mav.addObject("message", difineException);
		return mav;
	}

}
