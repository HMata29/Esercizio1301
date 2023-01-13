package it.nttdata.springjsp.controller;

import it.nttdata.springjsp.business.impl.WebSiteInfoBOImpl;
import it.nttdata.springjsp.model.WebSiteInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WebSiteInfoController {
    @Autowired
    WebSiteInfoBOImpl webSiteInfoBO;

    @GetMapping(path = {"/", "/index"})
    public ModelAndView home(){
        return new ModelAndView("/jsp/index.jsp"); //view il nome jsp model name è il nome sulla jsp da usare e il 3 è l'oggetto usato
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

    @GetMapping("/createInfo")
    public ModelAndView createInfo(){
        return new ModelAndView("jsp/createInfo.jsp");
    }

    @PostMapping("createInfo")
    public ModelAndView createInfo(@RequestParam String description, @RequestParam String name){
        WebSiteInfo webSiteInfo = new WebSiteInfo();
        webSiteInfo.setName(name);
        webSiteInfo.setDescription(description);
        webSiteInfoBO.insertWebSiteInfo(webSiteInfo);
        return new ModelAndView("/jsp/createInfo.jsp","operation",true);
    }

    @GetMapping("deleteViewInfo")
    public ModelAndView deleteInfo(){
        return new ModelAndView("/jsp/deleteInfo.jsp");
    }

    @GetMapping("deleteInfo")
    public ModelAndView deleteInfo(@RequestParam String id){
        if(!id.isEmpty()) {
            webSiteInfoBO.deleteWebSiteInfo(Long.parseLong(id));
            return new ModelAndView("/jsp/deleteInfo.jsp","operation",true);
        }
        return new ModelAndView("/jsp/deleteInfo.jsp","id_not_found",true);
    }

    @GetMapping("deleteDaLista")
    public ModelAndView deleteDaLista(@RequestParam String id){
        if (!id.isEmpty()){
            webSiteInfoBO.deleteWebSiteInfo(Long.parseLong(id));
            return new ModelAndView("/jsp/index.jsp");
        }
        return new ModelAndView("/jsp/lista.jsp");
    }
    @GetMapping("updateDaLista")
    public ModelAndView updateDaLista(@RequestParam String id){
        return new ModelAndView("/jsp/update.jsp", "id", id);
    }
}
