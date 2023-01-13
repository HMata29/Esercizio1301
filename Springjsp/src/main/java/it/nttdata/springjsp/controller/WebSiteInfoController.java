package it.nttdata.springjsp.controller;

import it.nttdata.springjsp.business.impl.WebSiteInfoBOImpl;
import it.nttdata.springjsp.model.WebSiteInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WebSiteInfoController {
    @Autowired
    WebSiteInfoBOImpl webSiteInfoBO;

    @GetMapping(path = {"/", "/index"})
    public ModelAndView home(){
        WebSiteInfo webSiteInfo = webSiteInfoBO.getWebSiteInfo();
        return new ModelAndView("/jsp/index.jsp", "Info", webSiteInfo); //view il nome jsp model name è il nome sulla jsp da usare e il 3 è l'oggetto usato
    }

    @GetMapping( "/details")
    public ModelAndView details(){
        WebSiteInfo webSiteInfo = webSiteInfoBO.getWebSiteInfo();
        //String a = "Dettaglio a caso messo";

        return new ModelAndView("/jsp/dettagli.jsp", "Dettagli" , webSiteInfo.getDescription() /*a*/);
    }

    @GetMapping("/getAll")
    public ModelAndView getAll(){
        List <WebSiteInfo> lista = webSiteInfoBO.getAll();
        return new ModelAndView("/jsp/lista.jsp" , "Lista", lista);
    }

}
