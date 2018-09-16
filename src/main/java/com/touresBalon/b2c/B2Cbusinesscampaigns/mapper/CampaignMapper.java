package com.touresBalon.b2c.B2Cbusinesscampaigns.mapper;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.touresBalon.b2c.B2Cbusinesscampaigns.dto.BaseCampaignResponse;
import com.touresBalon.b2c.B2Cbusinesscampaigns.entities.Campaign;
import com.touresBalon.b2c.B2Cbusinesscampaigns.interfaces.ICampaignMapper;
@Service
public class CampaignMapper implements ICampaignMapper {
	@Override
	public BaseCampaignResponse buildCampaignResponse(Campaign campaignInfoResponse) {
		BaseCampaignResponse campaignResponse = new BaseCampaignResponse();
		campaignResponse.setIdCampaign(campaignInfoResponse.getId());
		campaignResponse.setName(campaignInfoResponse.getName());
		campaignResponse.setIdStateCampaign(campaignInfoResponse.getIdStateCampaign());
		campaignResponse.setStartDate(campaignInfoResponse.getStartDate());
		campaignResponse.setEndDate(campaignInfoResponse.getEndDate());
		campaignResponse.setDescription(campaignInfoResponse.getDescription());
		campaignResponse.setIdProduct(campaignInfoResponse.getIdProduct());
		campaignResponse.setUrlImage(campaignInfoResponse.getUrlImage());
		return campaignResponse;
	}

	@Override
	public List<BaseCampaignResponse> buildCampaignListResponse(List<Campaign> productsList) {
		List<BaseCampaignResponse> response=new ArrayList<BaseCampaignResponse>();
		for (Campaign campaignInfoResponse:productsList) {
			BaseCampaignResponse campaignResponse = new BaseCampaignResponse();
			campaignResponse.setIdCampaign(campaignInfoResponse.getId());
			campaignResponse.setName(campaignInfoResponse.getName());
			campaignResponse.setIdStateCampaign(campaignInfoResponse.getIdStateCampaign());
			campaignResponse.setStartDate(campaignInfoResponse.getStartDate());
			campaignResponse.setEndDate(campaignInfoResponse.getEndDate());
			campaignResponse.setDescription(campaignInfoResponse.getDescription());
			campaignResponse.setIdProduct(campaignInfoResponse.getIdProduct());
			campaignResponse.setUrlImage(campaignInfoResponse.getUrlImage());
			response.add(campaignResponse);
		}
		return response;
	}

}
