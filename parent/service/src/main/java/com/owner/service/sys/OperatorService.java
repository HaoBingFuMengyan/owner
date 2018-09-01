package com.owner.service.sys;

import com.owner.dao.sys.OperatorDao;
import com.owner.heart.jpa.BaseDao;
import com.owner.heart.jpa.BaseService;
import com.owner.po.entity.sys.Operator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OperatorService extends BaseService<Operator> {

	@Autowired
	private OperatorDao operatorDao;

//	@Override
//	protected Class<Operator> getDomainClass() {
//		return Operator.class;
//	}

	@Override
	protected BaseDao<Operator, String> getBaseDao() {
		return operatorDao;
	}

	@Override
	protected void BaseSaveCheck(Operator obj) {

	}

	public Operator findBySusername(String susername){
		return this.operatorDao.findBySusername(susername);
	}

}