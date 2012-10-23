/*
 * 描          述:  <描述>
 * 修  改   人:  PengQingyang
 * 修改时间:  2012-10-24
 * <修改描述:>
 */
package com.tx.component.config.dao;

import java.util.List;
import java.util.Map;

import com.tx.component.config.model.ConfigProperty;


 /**
  * <功能简述>
  * <功能详细描述>
  * 
  * @author  PengQingyang
  * @version  [版本号, 2012-10-24]
  * @see  [相关类/方法]
  * @since  [产品/模块版本]
  */
public interface PropertiesPersisterDao {
    
    public List<Map<String, String>> queryPropertiesMapList();
    
    public void insertProperty(ConfigProperty configProperty);
    
    public void updateProperty(ConfigProperty configProperty);
    
    public void deleteProperty(ConfigProperty configProperty);
}
