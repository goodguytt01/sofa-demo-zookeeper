package ta.hundsun.com.sofa.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`cli_product`")
public class CliProduct {
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "`name`")
    private String name;

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

    @Column(name = "`origin_price`")
    private Long originPrice;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * @return origin_price
     */
    public Long getOriginPrice() {
        return originPrice;
    }

    /**
     * @param originPrice
     */
    public void setOriginPrice(Long originPrice) {
        this.originPrice = originPrice;
    }
}