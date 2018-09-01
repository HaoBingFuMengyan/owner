package com.owner.master.web.sys;

import com.owner.heart.jpa.BaseService;
import com.owner.master.web.BaseController;
import com.owner.po.entity.sys.Operator;
import com.owner.service.sys.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/operator")
public class OperatorController extends BaseController<Operator,Operator> {

    @Autowired
    private OperatorService operatorService;

    @Override
    protected BaseService<Operator> getBaseService() {
        return operatorService;
    }

    @Override
    protected String getPackName() {
        return "sys";
    }

    @Override
    protected String getObjectName() {
        return "operator-list";
    }
}
