package com.owner.web.dao.sys;


import com.owner.heart.jpa.BaseDao;
import com.owner.web.po.entity.sys.Operator;

public interface OperatorDao extends BaseDao<Operator, String> {

	Operator findBySusername(String susername);
	
}
