package com.eale.right.bean;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 水果品种
 */
@Entity
@Table(name = "fsms_fruitvarieties")
public class FruitVarieties {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="varieties_id")
    private Long varietiesId;//水果品种id

    @Column(name = "varieties_name")
    private String varietiesName;//水果品种名

    @Column(name = "varieties_addr")
    private String varietiesAddr;//品种盛产地

    @Column(name = "varieties_date")
    private Date varietiesDate;//成熟时间

    @Column(name = "varieties_price")
    private float varietiesPrice;//品种价格

    @ManyToOne
    @JoinColumn(name = "type_id")
    private FruitType typeId;//水果类型

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public FruitVarieties() {
    }

    public float getVarietiesPrice() {
        return varietiesPrice;
    }

    public void setVarietiesPrice(float varietiesPrice) {
        this.varietiesPrice = varietiesPrice;
    }

    public Long getVarietiesId() {
        return varietiesId;
    }

    public void setVarietiesId(Long varietiesId) {
        this.varietiesId = varietiesId;
    }

    public String getVarietiesName() {
        return varietiesName;
    }

    public void setVarietiesName(String varietiesName) {
        this.varietiesName = varietiesName;
    }

    public String getVarietiesAddr() {
        return varietiesAddr;
    }

    public void setVarietiesAddr(String varietiesAddr) {
        this.varietiesAddr = varietiesAddr;
    }

    public Date getVarietiesDate() {
        return varietiesDate;
    }

    public void setVarietiesDate(Date varietiesDate) {
        this.varietiesDate = varietiesDate;
    }

    public FruitType getTypeId() {
        return typeId;
    }

    public void setTypeId(FruitType typeId) {
        this.typeId = typeId;
    }

    public Long getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(Long createUserid) {
        this.createUserid = createUserid;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateUserid() {
        return updateUserid;
    }

    public void setUpdateUserid(Long updateUserid) {
        this.updateUserid = updateUserid;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "FruitVarieties{" +
                "varietiesId=" + varietiesId +
                ", varietiesName='" + varietiesName + '\'' +
                ", varietiesAddr='" + varietiesAddr + '\'' +
                ", varietiesDate=" + varietiesDate +
                ", typeId=" + typeId +
                '}';
    }
}
