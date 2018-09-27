
package com.touresBalon.b2c.B2Cbusinesscampaigns.dto;

import java.util.Date;

public class BaseCampaignResponse {
	private long idCampaign;
	private String name;
	private long idStateCampaign;
	private String urlImage;
	private String description;
	private long idProduct;
	private Date startDate;
	private Date endDate;
	public long getIdCampaign() {
		return idCampaign;
	}
	public void setIdCampaign(long idCampaign) {
		this.idCampaign = idCampaign;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getIdStateCampaign() {
		return idStateCampaign;
	}
	public void setIdStateCampaign(long idStateCampaign) {
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
	public long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
