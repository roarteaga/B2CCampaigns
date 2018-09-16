package com.touresBalon.b2c.B2Cbusinesscampaigns.interfaces;

import java.util.List;

import com.touresBalon.b2c.B2Cbusinesscampaigns.dto.BaseCampaignResponse;
import com.touresBalon.b2c.B2Cbusinesscampaigns.entities.Campaign;

public interface ICampaignMapper {
	BaseCampaignResponse buildCampaignResponse(Campaign campaignInfoResponse);

	List<BaseCampaignResponse> buildCampaignListResponse(List<Campaign> campaignsList);
}
