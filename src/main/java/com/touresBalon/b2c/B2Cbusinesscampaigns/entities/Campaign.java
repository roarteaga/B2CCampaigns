package com.touresBalon.b2c.B2Cbusinesscampaigns.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "Campaign", schema = "dbo")
public class Campaign {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
 	@Column(name = "IDCAMPAIGN")
    private Long id;
	@Column(name = "NAME")
    private String name;
 	@Column(name = "IDSTATECAMPAIGN")
    private Long idStateCampaign;
 	@Column(name = "URLIMAGE")
    private String urlImage;
 	@Column(name = "DESCRIPTION")
 	private String description;
 	@Column(name = "IDPRODUCT")
 	private Long idProduct;
 	@Column(name = "STARTDATE")
 	private Date startDate;
 	@Column(name = "ENDDATE")
 	private Date endDate;
 	
 	public Campaign() {
 		
 	}
 	public Campaign (Long id, String name, String urlImage, String description, Long idProduct) {
 		this.id=id;
 		this.name=name;
 		this.urlImage=urlImage;
 		this.description=description;
 		this.idProduct=idProduct;
 	}
 	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getIdStateCampaign() {
		return idStateCampaign;
	}
	public void setIdStateCampaign(Long idStateCampaign) {
		this.idStateCampaign = idStateCampaign;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public Date getStartDate() {
		// TODO Auto-generated method stub
		return this.startDate;
	}
	public void setStartDate(Date startDate) 
	{
		this.startDate=startDate;		
	}
	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate=endDate;
	}
}
