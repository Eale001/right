package com.eale.right.bean;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 进货实体
 */
@Entity
@Table(name = "fsms_pruchase")
public class Purchase {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="purchase_id")
    private Long purchaseId;//进货单号

    @ManyToOne
    @JoinColumn(name = "varieties_id")
    private FruitVarieties varietiesId;//进货品种

    @Column(name = "purchase_number")
    private Float purchaseNumber;//进货数量

    @Column(name = "purchase_time")
    private Date purchaseTime;//进货时间

    @Column(name = "purchase_price")
    private float purchasePrice;//进货价格(单价）

    @Column(name = "purchase_total")
    private float purchaseTotal;//进货总金额

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;//进货人

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public Purchase() {
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public float getPurchaseTotal() {
        return purchaseTotal;
    }

    public void setPurchaseTotal(float purchaseTotal) {
        this.purchaseTotal = purchaseTotal;
    }

    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public FruitVarieties getVarietiesId() {
        return varietiesId;
    }

    public void setVarietiesId(FruitVarieties varietiesId) {
        this.varietiesId = varietiesId;
    }

    public Float getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(Float purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
        return "Purchase{" +
                "purchaseId=" + purchaseId +
                ", varietiesId=" + varietiesId +
                ", purchaseNumber=" + purchaseNumber +
                ", purchaseTime=" + purchaseTime +
                ", user=" + user +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
