package it.nttdata.springjsp.business.impl;

import it.nttdata.springjsp.business.interfaces.WebSiteInfoBO;
import it.nttdata.springjsp.model.WebSiteInfo;
import it.nttdata.springjsp.repository.WebSiteInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebSiteInfoBOImpl implements WebSiteInfoBO {

    @Autowired
    WebSiteInfoRepository webSiteInfoRepository;


    public WebSiteInfo getWebSiteInfo() throws DataAccessException{
        return webSiteInfoRepository.findFirstByOrderByIdDesc();
    }

    public List<WebSiteInfo> getAll() throws DataAccessException{
        return webSiteInfoRepository.findAll();
    }
}
