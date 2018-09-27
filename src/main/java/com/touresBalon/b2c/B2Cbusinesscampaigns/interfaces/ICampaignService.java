package com.touresBalon.b2c.B2Cbusinesscampaigns.interfaces;

import java.util.List;

import com.touresBalon.b2c.B2Cbusinesscampaigns.dto.BaseCampaignResponse;
import com.touresBalon.b2c.B2Cbusinesscampaigns.dto.FindCampaignRequest;

public interface ICampaignService {
	List<BaseCampaignResponse> findAll();
	
}
