package it.nttdata.springjsp.repository;

import it.nttdata.springjsp.model.WebSiteInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebSiteInfoRepository extends JpaRepository<WebSiteInfo, Long> {

    WebSiteInfo findFirstByOrderByIdDesc();


}