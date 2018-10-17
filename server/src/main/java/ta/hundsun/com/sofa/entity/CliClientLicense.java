package ta.hundsun.com.sofa.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`cli_client_license`")
public class CliClientLicense {
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "`client_id`")
    private Long clientId;

    @Column(name = "`license_key`")
    private String licenseKey;

    @Column(name = "`product_id`")
    private Long productId;

    @Column(name = "`delete_flag`")
    private Boolean deleteFlag;

    @Column(name = "`creator_id`")
    private Long creatorId;

    @Column(name = "`create_time`")
    private Date createTime;

    @Column(name = "`updator_id`")
    private Long updatorId;

    @Column(name = "`update_time`")
    private Date updateTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return client_id
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * @param clientId
     */
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**
     * @return license_key
     */
    public String getLicenseKey() {
        return licenseKey;
    }

    /**
     * @param licenseKey
     */
    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    /**
     * @return product_id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * @return delete_flag
     */
    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * @param deleteFlag
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * @return creator_id
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * @param creatorId
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return updator_id
     */
    public Long getUpdatorId() {
        return updatorId;
    }

    /**
     * @param updatorId
     */
    public void setUpdatorId(Long updatorId) {
        this.updatorId = updatorId;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}