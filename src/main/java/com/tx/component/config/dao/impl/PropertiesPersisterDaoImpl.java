/*
 * 描          述:  <描述>
 * 修  改   人:  PengQingyang
 * 修改时间:  2012-10-24
 * <修改描述:>
 */
package com.tx.component.config.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.embedded.ConnectionProperties;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;

/**
 * <属性持久类>
 * <功能详细描述>
 * 
 * @author  PengQingyang
 * @version  [版本号, 2012-10-24]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class PropertiesPersisterDaoImpl {
    
    /** datasource Map */
    private Map<String, DataSource> datasourceMap = new HashMap<String, DataSource>();
    
    private boolean isSupportP6spy = false;
    
    
}
