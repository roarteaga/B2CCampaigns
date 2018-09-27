package com.touresBalon.b2c.B2Cbusinesscampaigns.impl;

import java.util.List;

import org.hibernate.annotations.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.touresBalon.b2c.B2Cbusinesscampaigns.consumer.ICampaignRepositoryConsumer;
import com.touresBalon.b2c.B2Cbusinesscampaigns.dto.BaseCampaignResponse;
import com.touresBalon.b2c.B2Cbusinesscampaigns.dto.FindCampaignRequest;
import com.touresBalon.b2c.B2Cbusinesscampaigns.entities.Campaign;
import com.touresBalon.b2c.B2Cbusinesscampaigns.interfaces.ICampaignMapper;
import com.touresBalon.b2c.B2Cbusinesscampaigns.interfaces.ICampaignService;


@Service
public class CampaignServiceImpl implements ICampaignService {
	
	@Autowired
	private ICampaignRepositoryConsumer otpConsumer;

	@Autowired
	private ICampaignMapper otpMapper;

	@Override
	public List<BaseCampaignResponse> findAll() {
		List<Campaign> productsList;
		productsList = otpConsumer.findAll();
		return otpMapper.buildCampaignListResponse(productsList);
	}
	
	
}
