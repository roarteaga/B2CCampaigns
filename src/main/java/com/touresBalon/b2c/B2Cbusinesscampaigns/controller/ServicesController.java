package com.touresBalon.b2c.B2Cbusinesscampaigns.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.touresBalon.b2c.B2Cbusinesscampaigns.dto.BaseCampaignResponse;
import com.touresBalon.b2c.B2Cbusinesscampaigns.dto.FindCampaignRequest;
import com.touresBalon.b2c.B2Cbusinesscampaigns.interfaces.ICampaignService;

@RefreshScope
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ServicesController {

  @Autowired private ICampaignService campaignService;
	

  @RequestMapping(
	      value = "/getCampaignList",
	      method = RequestMethod.GET,
	      produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody ResponseEntity<Object> getAllOrFilterCampaigns()  {
	List<BaseCampaignResponse> campaignResponse = campaignService.findAll();
	return new ResponseEntity<Object>(campaignResponse, HttpStatus.OK);
}
 
  

}
