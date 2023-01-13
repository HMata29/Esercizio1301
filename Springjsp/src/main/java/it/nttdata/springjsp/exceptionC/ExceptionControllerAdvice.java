package it.nttdata.springjsp.exceptionC;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(Exception.class)
    public ModelAndView exception(Exception e){
        ModelAndView modelAndView = new ModelAndView("/jsp/error.jsp");
        return  modelAndView.addObject("Errore" , e.getClass().getName());
    }
}
