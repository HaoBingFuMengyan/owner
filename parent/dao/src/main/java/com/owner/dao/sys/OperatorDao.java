package com.owner.dao.sys;


import com.owner.heart.jpa.BaseDao;
import com.owner.po.entity.sys.Operator;

public interface OperatorDao extends BaseDao<Operator, String> {

	Operator findBySusername(String susername);
	
}
