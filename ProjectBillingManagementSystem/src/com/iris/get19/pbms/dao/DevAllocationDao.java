package com.iris.get19.pbms.dao;

import org.springframework.stereotype.Repository;

import com.iris.get19.pbms.dao.model.DevAllocation;

@Repository
public interface DevAllocationDao  {
	
	public boolean allocateDeveloper(DevAllocation da);

}
