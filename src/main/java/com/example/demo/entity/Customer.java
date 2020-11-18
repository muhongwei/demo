package com.example.demo.entity;

import java.util.Date;

public class Customer {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 
     */
    private String serial;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;

    /**
     * 删除时间
     */
    private Date deletedAt;

    /**
     * 0正常
     */
    private Integer status;

    /**
     * 客户名字
     */
    private String name;

    /**
     * 客户身份证号
     */
    private String idcard;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 身份证地址
     */
    private String address;

    /**
     * 现居住地址
     */
    private String currentAddress;

    /**
     * 名族
     */
    private String nation;

    /**
     * 工作单位
     */
    private String workUnit;

    /**
     * 经营地址(商户贷)
     */
    private String businessAddress;

    /**
     * 性别(1-男 2-女)
     */
    private Integer sex;

    /**
     * 创建人序列号
     */
    private String createrSerial;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return serial 
     */
    public String getSerial() {
        return serial;
    }

    /**
     * 
     * @param serial 
     */
    public void setSerial(String serial) {
        this.serial = serial == null ? null : serial.trim();
    }

    /**
     * 创建时间
     * @return created_at 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 创建时间
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 更新时间
     * @return updated_at 更新时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 更新时间
     * @param updatedAt 更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 删除时间
     * @return deleted_at 删除时间
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * 删除时间
     * @param deletedAt 删除时间
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * 0正常
     * @return status 0正常
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 0正常
     * @param status 0正常
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 客户名字
     * @return name 客户名字
     */
    public String getName() {
        return name;
    }

    /**
     * 客户名字
     * @param name 客户名字
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 客户身份证号
     * @return idcard 客户身份证号
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 客户身份证号
     * @param idcard 客户身份证号
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    /**
     * 手机号
     * @return phone 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 身份证地址
     * @return address 身份证地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 身份证地址
     * @param address 身份证地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 现居住地址
     * @return current_address 现居住地址
     */
    public String getCurrentAddress() {
        return currentAddress;
    }

    /**
     * 现居住地址
     * @param currentAddress 现居住地址
     */
    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress == null ? null : currentAddress.trim();
    }

    /**
     * 名族
     * @return nation 名族
     */
    public String getNation() {
        return nation;
    }

    /**
     * 名族
     * @param nation 名族
     */
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    /**
     * 工作单位
     * @return work_unit 工作单位
     */
    public String getWorkUnit() {
        return workUnit;
    }

    /**
     * 工作单位
     * @param workUnit 工作单位
     */
    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit == null ? null : workUnit.trim();
    }

    /**
     * 经营地址(商户贷)
     * @return business_address 经营地址(商户贷)
     */
    public String getBusinessAddress() {
        return businessAddress;
    }

    /**
     * 经营地址(商户贷)
     * @param businessAddress 经营地址(商户贷)
     */
    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress == null ? null : businessAddress.trim();
    }

    /**
     * 性别(1-男 2-女)
     * @return sex 性别(1-男 2-女)
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 性别(1-男 2-女)
     * @param sex 性别(1-男 2-女)
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 创建人序列号
     * @return creater_serial 创建人序列号
     */
    public String getCreaterSerial() {
        return createrSerial;
    }

    /**
     * 创建人序列号
     * @param createrSerial 创建人序列号
     */
    public void setCreaterSerial(String createrSerial) {
        this.createrSerial = createrSerial == null ? null : createrSerial.trim();
    }
}