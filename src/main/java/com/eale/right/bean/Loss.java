package com.eale.right.bean;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 报损（损失）
 */
@Entity
@Table(name = "fsms_loss")
public class Loss {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="loss_id")
    private Long lossId;//损失id

    @ManyToOne
    @JoinColumn(name = "varieties_id")
    private FruitVarieties varieties;//损失品种

    @Column(name = "loss_number")
    private float lossNumber;//损失数量

    @Column(name = "loss_total")
    private float lossTotal;//损失金额

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public Loss() {
    }

    public Long getLossId() {
        return lossId;
    }

    public void setLossId(Long lossId) {
        this.lossId = lossId;
    }

    public FruitVarieties getVarieties() {
        return varieties;
    }

    public void setVarieties(FruitVarieties varieties) {
        this.varieties = varieties;
    }

    public float getLossNumber() {
        return lossNumber;
    }

    public void setLossNumber(float lossNumber) {
        this.lossNumber = lossNumber;
    }

    public float getLossTotal() {
        return lossTotal;
    }

    public void setLossTotal(float lossTotal) {
        this.lossTotal = lossTotal;
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
        return "Loss{" +
                "lossId=" + lossId +
                ", varieties=" + varieties +
                ", lossNumber=" + lossNumber +
                ", lossTotal=" + lossTotal +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
