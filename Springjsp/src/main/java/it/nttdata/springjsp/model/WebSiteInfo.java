package it.nttdata.springjsp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "web_site_info")
@Getter
@Setter
public class WebSiteInfo extends BaseEntity {
    private String name;
    private String description;


}