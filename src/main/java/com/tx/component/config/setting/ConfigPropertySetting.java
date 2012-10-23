/*
 * 描          述:  <描述>
 * 修  改   人:  PengQingyang
 * 修改时间:  2012-10-17
 * <修改描述:>
 */
package com.tx.component.config.setting;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.tx.core.tree.model.TreeAble;


 /**
  * <配置属性实体>
  * <功能详细描述>
  * 
  * @author  PengQingyang
  * @version  [版本号, 2012-10-17]
  * @see  [相关类/方法]
  * @since  [产品/模块版本]
  */
@XStreamAlias("property")
public class ConfigPropertySetting implements TreeAble<List<ConfigPropertySetting>, ConfigPropertySetting>{
    
    public static final String TYPE_NODE = "0";
    
    public static final String TYPE_LEAF = "1";
    
    /** 子级属性 */
    @XStreamImplicit(itemFieldName="property")
    private List<ConfigPropertySetting> childs;
    
    /** 配置属性所属资源 */
    private String resource;
    
    /** 配置资源名 */
    private String name;
    
    /** 配置类型  */
    private String type = TYPE_NODE;
    
    /** 父节点key */
    private String parentKey;
    
    /** 关键字 */
    private String key;
    
    /** 是否可编辑  */
    private boolean isEditAble = true;
    
    /** 是否可见 */
    private boolean isVisible = true;
    
    /** 是否为动态属性：即修改后是否立即生效,默认为false  */
    private boolean isDynamic = false;
    
    /** 配置资源描述信息 */
    private String description;
    
    /** 开发值 */
    private String developValue;
    
    /** 默认值 */
    private String defaultValue = "";
    
    /**
     * @return 返回 id
     */
    public String getId() {
        return this.key;
    }


    /**
     * @return 返回 parenId
     */
    public String getParentId() {
        return this.parentKey;
    }
    
    /**
     * @return 返回 resource
     */
    public String getResource() {
        return resource;
    }

    /**
     * @param 对resource进行赋值
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * @return 返回 name
     */
    public String getName() {
        return name;
    }

    /**
     * @param 对name进行赋值
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 返回 type
     */
    public String getType() {
        return type;
    }

    /**
     * @param 对type进行赋值
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return 返回 parentKey
     */
    public String getParentKey() {
        return parentKey;
    }

    /**
     * @param 对parentKey进行赋值
     */
    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
    }

    /**
     * @return 返回 key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param 对key进行赋值
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return 返回 isEditAble
     */
    public boolean isEditAble() {
        return isEditAble;
    }

    /**
     * @param 对isEditAble进行赋值
     */
    public void setEditAble(boolean isEditAble) {
        this.isEditAble = isEditAble;
    }

    /**
     * @return 返回 isVisible
     */
    public boolean isVisible() {
        return isVisible;
    }

    /**
     * @param 对isVisible进行赋值
     */
    public void setVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    /**
     * @return 返回 description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param 对description进行赋值
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return 返回 developValue
     */
    public String getDevelopValue() {
        return developValue;
    }

    /**
     * @param 对developValue进行赋值
     */
    public void setDevelopValue(String developValue) {
        this.developValue = developValue;
    }

    /**
     * @return 返回 defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * @param 对defaultValue进行赋值
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * @return 返回 childs
     */
    public List<ConfigPropertySetting> getChilds() {
        return childs;
    }

    /**
     * @param 对childs进行赋值
     */
    public void setChilds(List<ConfigPropertySetting> childs) {
        this.childs = childs;
    }

    /**
     * @return 返回 isDynamic
     */
    public boolean isDynamic() {
        return isDynamic;
    }

    /**
     * @param 对isDynamic进行赋值
     */
    public void setDynamic(boolean isDynamic) {
        this.isDynamic = isDynamic;
    }
    
    
}
