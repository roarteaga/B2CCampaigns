package com.touresBalon.b2c.B2Cbusinesscampaigns.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "Campaign", schema = "G_USUARIO")
public class Campaign {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
 	@Column(name = "idCampaign")
    private Long id;
	@Column(name = "name")
    private String name;
 	@Column(name = "idStateCampaign")
    private Long idStateCampaign;
 	@Column(name = "urlImage")
    private String urlImage;
 	@Column(name = "description")
 	private String description;
 	@Column(name = "idProduct")
 	private Long idProduct;
 	@Column(name = "startDate")
 	private String startDate;
 	@Column(name = "endDate")
 	private String endDate;
 	
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
	public String getStartDate() {
		// TODO Auto-generated method stub
		return this.startDate;
	}
	public void setStartDate(String startDate) 
	{
		this.startDate=startDate;		
	}
	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate=endDate;
	}
}
