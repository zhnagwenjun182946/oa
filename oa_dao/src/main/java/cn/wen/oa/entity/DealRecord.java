package cn.wen.oa.entity;

import java.util.Date;

public class DealRecord {
    private Integer id;

    private Integer claimVoucherId;

    private String dealSn;

    private Date dealTime;

    private String dealWay;

    private String dealResult;

    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClaimVoucherId() {
        return claimVoucherId;
    }

    public void setClaimVoucherId(Integer claimVoucherId) {
        this.claimVoucherId = claimVoucherId;
    }

    public String getDealSn() {
        return dealSn;
    }

    public void setDealSn(String dealSn) {
        this.dealSn = dealSn == null ? null : dealSn.trim();
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getDealWay() {
        return dealWay;
    }

    public void setDealWay(String dealWay) {
        this.dealWay = dealWay == null ? null : dealWay.trim();
    }

    public String getDealResult() {
        return dealResult;
    }

    public void setDealResult(String dealResult) {
        this.dealResult = dealResult == null ? null : dealResult.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}