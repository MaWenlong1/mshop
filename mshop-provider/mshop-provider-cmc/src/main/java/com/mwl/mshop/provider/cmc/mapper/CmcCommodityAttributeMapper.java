package com.mwl.mshop.provider.cmc.mapper;

import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityAttribute;

public interface CmcCommodityAttributeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_commodity_attribute
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_commodity_attribute
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int insert(CmcCommodityAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_commodity_attribute
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int insertSelective(CmcCommodityAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_commodity_attribute
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    CmcCommodityAttribute selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_commodity_attribute
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int updateByPrimaryKeySelective(CmcCommodityAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_commodity_attribute
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int updateByPrimaryKey(CmcCommodityAttribute record);
}