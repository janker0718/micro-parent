package top.janker.jmall.orm.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class OmsRefundOrder implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "订单id")
    private Integer orderId;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "退款订单编号")
    private String orderSn;

    @ApiModelProperty(value = "店铺id")
    private Integer shopId;

    @ApiModelProperty(value = "配送编号")
    private String deliverySn;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "发货省份")
    private String transferProvince;

    @ApiModelProperty(value = "发货城市")
    private String transferCity;

    @ApiModelProperty(value = "发货地区")
    private String transferArea;

    @ApiModelProperty(value = "发货详细地址")
    private String transferDetailAddress;

    @ApiModelProperty(value = "发货人手机号")
    private String transferName;

    @ApiModelProperty(value = "发货人手机号")
    private String transferPhone;

    @ApiModelProperty(value = "收货省份")
    private String receiveProvince;

    @ApiModelProperty(value = "收货城市")
    private String receiveCity;

    @ApiModelProperty(value = "收货地区")
    private String receiveArea;

    @ApiModelProperty(value = "收货详细地址")
    private String receiveDetailAddress;

    @ApiModelProperty(value = "收货人名字")
    private String receiveName;

    @ApiModelProperty(value = "收货人人手机号")
    private String receivePhone;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getDeliverySn() {
        return deliverySn;
    }

    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTransferProvince() {
        return transferProvince;
    }

    public void setTransferProvince(String transferProvince) {
        this.transferProvince = transferProvince;
    }

    public String getTransferCity() {
        return transferCity;
    }

    public void setTransferCity(String transferCity) {
        this.transferCity = transferCity;
    }

    public String getTransferArea() {
        return transferArea;
    }

    public void setTransferArea(String transferArea) {
        this.transferArea = transferArea;
    }

    public String getTransferDetailAddress() {
        return transferDetailAddress;
    }

    public void setTransferDetailAddress(String transferDetailAddress) {
        this.transferDetailAddress = transferDetailAddress;
    }

    public String getTransferName() {
        return transferName;
    }

    public void setTransferName(String transferName) {
        this.transferName = transferName;
    }

    public String getTransferPhone() {
        return transferPhone;
    }

    public void setTransferPhone(String transferPhone) {
        this.transferPhone = transferPhone;
    }

    public String getReceiveProvince() {
        return receiveProvince;
    }

    public void setReceiveProvince(String receiveProvince) {
        this.receiveProvince = receiveProvince;
    }

    public String getReceiveCity() {
        return receiveCity;
    }

    public void setReceiveCity(String receiveCity) {
        this.receiveCity = receiveCity;
    }

    public String getReceiveArea() {
        return receiveArea;
    }

    public void setReceiveArea(String receiveArea) {
        this.receiveArea = receiveArea;
    }

    public String getReceiveDetailAddress() {
        return receiveDetailAddress;
    }

    public void setReceiveDetailAddress(String receiveDetailAddress) {
        this.receiveDetailAddress = receiveDetailAddress;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", shopId=").append(shopId);
        sb.append(", deliverySn=").append(deliverySn);
        sb.append(", status=").append(status);
        sb.append(", transferProvince=").append(transferProvince);
        sb.append(", transferCity=").append(transferCity);
        sb.append(", transferArea=").append(transferArea);
        sb.append(", transferDetailAddress=").append(transferDetailAddress);
        sb.append(", transferName=").append(transferName);
        sb.append(", transferPhone=").append(transferPhone);
        sb.append(", receiveProvince=").append(receiveProvince);
        sb.append(", receiveCity=").append(receiveCity);
        sb.append(", receiveArea=").append(receiveArea);
        sb.append(", receiveDetailAddress=").append(receiveDetailAddress);
        sb.append(", receiveName=").append(receiveName);
        sb.append(", receivePhone=").append(receivePhone);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}