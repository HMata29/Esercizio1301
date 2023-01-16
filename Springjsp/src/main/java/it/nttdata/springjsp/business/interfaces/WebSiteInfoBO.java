package it.nttdata.springjsp.business.interfaces;

import it.nttdata.springjsp.model.WebSiteInfo;
import org.springframework.dao.DataAccessException;

import java.util.List;
import java.util.Optional;

public interface WebSiteInfoBO {
    WebSiteInfo getWebSiteInfo() throws DataAccessException;

    List<WebSiteInfo> getAll();

    void insertWebSiteInfo(WebSiteInfo webSiteInfo);

    void deleteWebSiteInfo(long id) throws DataAccessException;

    void update(long id, String n, String d) throws DataAccessException;

    WebSiteInfo getWebSiteInfoById(long id) throws DataAccessException;
}
