package it.nttdata.springjsp.business.impl;

import it.nttdata.springjsp.business.interfaces.WebSiteInfoBO;
import it.nttdata.springjsp.model.WebSiteInfo;
import it.nttdata.springjsp.repository.WebSiteInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WebSiteInfoBOImpl implements WebSiteInfoBO {

    @Autowired
    WebSiteInfoRepository webSiteInfoRepository;

    @Override
    public WebSiteInfo getWebSiteInfo() throws DataAccessException{
        return webSiteInfoRepository.findFirstByOrderByIdDesc();
    }
    @Override
    public List<WebSiteInfo> getAll() throws DataAccessException{
        List<WebSiteInfo> ciao = webSiteInfoRepository.findAll();
        return ciao;
    }

    @Override
    public void insertWebSiteInfo(WebSiteInfo webSiteInfo) throws DataAccessException{
        webSiteInfoRepository.save(webSiteInfo);
    }

    @Override
    public void deleteWebSiteInfo(long id) throws DataAccessException{
        webSiteInfoRepository.deleteById(id);
    }

    @Override
    public void update(long id, String n , String d) throws DataAccessException {
        WebSiteInfo w = webSiteInfoRepository.findById(id).orElseThrow();
        w.setName(n);
        w.setDescription(d);
        webSiteInfoRepository.save(w);
    }

    @Override
    public WebSiteInfo getWebSiteInfoById(long id) throws DataAccessException {
        return webSiteInfoRepository.findById(id).orElseThrow();
    }

}
