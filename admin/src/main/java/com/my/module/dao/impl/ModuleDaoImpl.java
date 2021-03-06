package com.my.module.dao.impl;

import org.springframework.stereotype.Repository;

import com.my.common.base.impl.BaseDaoImpl;
import com.my.module.dao.ModuleDao;
import com.my.module.model.SysModule;

@Repository("moduleDao")
public class ModuleDaoImpl extends BaseDaoImpl<SysModule> implements ModuleDao {

}
