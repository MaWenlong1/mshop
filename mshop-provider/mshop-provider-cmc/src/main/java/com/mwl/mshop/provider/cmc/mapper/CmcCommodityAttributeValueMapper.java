package com.mwl.mshop.provider.cmc.mapper;

import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityAttributeValue;

public interface CmcCommodityAttributeValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_commodity_attribute_value
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_commodity_attribute_value
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int insert(CmcCommodityAttributeValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_commodity_attribute_value
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int insertSelective(CmcCommodityAttributeValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_commodity_attribute_value
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    CmcCommodityAttributeValue selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_commodity_attribute_value
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int updateByPrimaryKeySelective(CmcCommodityAttributeValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_commodity_attribute_value
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int updateByPrimaryKey(CmcCommodityAttributeValue record);
}