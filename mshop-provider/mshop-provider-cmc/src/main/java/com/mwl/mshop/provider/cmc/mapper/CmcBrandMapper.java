package com.mwl.mshop.provider.cmc.mapper;

import com.mwl.mshop.provider.cmc.model.bean.CmcBrand;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmcBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int insert(CmcBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int insertSelective(CmcBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    CmcBrand selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int updateByPrimaryKeySelective(CmcBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(CmcBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cmc_brand
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    int updateByPrimaryKey(CmcBrand record);
}