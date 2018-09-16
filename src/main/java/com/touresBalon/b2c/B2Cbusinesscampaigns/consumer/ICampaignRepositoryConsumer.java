package com.touresBalon.b2c.B2Cbusinesscampaigns.consumer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.touresBalon.b2c.B2Cbusinesscampaigns.entities.Campaign;

@Repository("CAMPAIGN")
public interface ICampaignRepositoryConsumer extends JpaRepository<Campaign, String> {
	@Query("SELECT t FROM Campaign t where t.idStateCampaign =1")
    public List<Campaign>  findAll();
}
