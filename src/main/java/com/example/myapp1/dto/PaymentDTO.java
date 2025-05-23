package com.example.myapp1.dto;

import java.math.BigDecimal;
import java.util.Date;

/************* ✨ Windsurf Command 🌟 *************/
public class PaymentDTO {
    private int paymentId;
    private int userId;
    private int cartId;
    private BigDecimal amount;
    private String qrCode;
    private String status;
    private Date paymentDate;

    public PaymentDTO() {

    }

    public PaymentDTO(int paymentId, int userId, int cartId, BigDecimal amount, String qrCode, String status,
            Date paymentDate) {
        super();
        this.amount = amount;
        this.cartId = cartId;
        this.paymentDate = paymentDate;
        this.qrCode = qrCode;
        this.userId = userId;
        this.paymentId = paymentId;
        this.userId = userId;
        this.cartId = cartId;
        this.amount = amount;
        this.qrCode = qrCode;
        this.status = status;
        this.paymentDate = paymentDate;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

}
/******* 50899235-a3a9-4e21-93d7-daa5962d08a8 *******/
