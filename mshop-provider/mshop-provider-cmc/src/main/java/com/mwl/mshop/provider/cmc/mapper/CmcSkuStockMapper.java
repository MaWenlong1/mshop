package com.mwl.mshop.provider.cmc.mapper;

import com.mwl.mshop.provider.cmc.model.bean.CmcSkuStock;
import com.mwl.mshop.provider.cmc.model.bean.CmcSkuStockExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmcSkuStockMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_sku_stock
     *
     * @mbg.generated Sun Mar 10 18:58:01 CST 2019
     */
    long countByExample(CmcSkuStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_sku_stock
     *
     * @mbg.generated Sun Mar 10 18:58:01 CST 2019
     */
    int deleteByExample(CmcSkuStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_sku_stock
     *
     * @mbg.generated Sun Mar 10 18:58:01 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_sku_stock
     *
     * @mbg.generated Sun Mar 10 18:58:01 CST 2019
     */
    int insert(CmcSkuStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_sku_stock
     *
     * @mbg.generated Sun Mar 10 18:58:01 CST 2019
     */
    int insertSelective(CmcSkuStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_sku_stock
     *
     * @mbg.generated Sun Mar 10 18:58:01 CST 2019
     */
    List<CmcSkuStock> selectByExample(CmcSkuStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_sku_stock
     *
     * @mbg.generated Sun Mar 10 18:58:01 CST 2019
     */
    CmcSkuStock selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_sku_stock
     *
     * @mbg.generated Sun Mar 10 18:58:01 CST 2019
     */
    int updateByExampleSelective(@Param("record") CmcSkuStock record, @Param("example") CmcSkuStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_sku_stock
     *
     * @mbg.generated Sun Mar 10 18:58:01 CST 2019
     */
    int updateByExample(@Param("record") CmcSkuStock record, @Param("example") CmcSkuStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_sku_stock
     *
     * @mbg.generated Sun Mar 10 18:58:01 CST 2019
     */
    int updateByPrimaryKeySelective(CmcSkuStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_sku_stock
     *
     * @mbg.generated Sun Mar 10 18:58:01 CST 2019
     */
    int updateByPrimaryKey(CmcSkuStock record);
}