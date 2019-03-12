package com.eale.right.bean;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 销售
 */
@Entity
@Table(name = "fsms_sale")
public class Sale {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="sale_id")
    private Long saleId;//销售id

    @OneToOne
    @JoinColumn(name = "varieties_id")
    private FruitVarieties fruitVarieties;//销售品种

    @Column(name = "sale_number")
    private float saleNumber;//销售数量

    @Column(name = "sale_price")
    private float salePrice;// 销售价格（单价）

    @Column(name = "sale_toral")
    private float saleTotal;//销售总金额

    @Column(name = "create_userid")
    private Long createUserid;//创建人

    @Column(name = "create_date")
    private Timestamp createDate;//创建时间

    @Column(name = "update_userid")
    private Long updateUserid;//修改人

    @Column(name = "update_date")
    private Timestamp updateDate;//修改时间

    public Sale() {
    }

    public Long getSaleId() {
        return saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public FruitVarieties getFruitVarieties() {
        return fruitVarieties;
    }

    public void setFruitVarieties(FruitVarieties fruitVarieties) {
        this.fruitVarieties = fruitVarieties;
    }

    public float getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(float saleNumber) {
        this.saleNumber = saleNumber;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public float getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(float saleTotal) {
        this.saleTotal = saleTotal;
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
        return "Sale{" +
                "saleId=" + saleId +
                ", fruitVarieties=" + fruitVarieties +
                ", saleNumber=" + saleNumber +
                ", salePrice=" + salePrice +
                ", saleTotal=" + saleTotal +
                ", createUserid=" + createUserid +
                ", createDate=" + createDate +
                ", updateUserid=" + updateUserid +
                ", updateDate=" + updateDate +
                '}';
    }
}
