package com.tp5.clientapi.dto;

import java.io.Serializable;
import java.util.Date;

public class SecurityParameter implements Serializable {

    private Integer idSecurityParameter;
    private Integer maxConnectAttempt;
    private Integer maxConnectAttemptDelay;
    private Integer maxConnectAttemptBlock;
    private Integer timeChangePassword;
    private Integer canRecoverPassword;
    private Integer passwordComplexityCheck;
    private Integer canUsePastPassword;
    private Date lastModificationDate;
    private Date creationDate;

    public Integer getCanUsePastPassword() {
        return canUsePastPassword;
    }

    public void setCanUsePastPassword(Integer canUsePastPassword) {
        this.canUsePastPassword = canUsePastPassword;
    }

    public Integer getIdSecurityParameter() {
        return idSecurityParameter;
    }

    public void setIdSecurityParameter(Integer idSecurityParameter) {
        this.idSecurityParameter = idSecurityParameter;
    }

    public Integer getMaxConnectAttempt() {
        return maxConnectAttempt;
    }

    public void setMaxConnectAttempt(Integer maxConnectAttempt) {
        this.maxConnectAttempt = maxConnectAttempt;
    }

    public Integer getMaxConnectAttemptDelay() {
        return maxConnectAttemptDelay;
    }

    public void setMaxConnectAttemptDelay(Integer maxConnectAttemptDelay) {
        this.maxConnectAttemptDelay = maxConnectAttemptDelay;
    }

    public Integer getMaxConnectAttemptBlock() {
        return maxConnectAttemptBlock;
    }

    public void setMaxConnectAttemptBlock(Integer maxConnectAttemptBlock) {
        this.maxConnectAttemptBlock = maxConnectAttemptBlock;
    }

    public Integer getTimeChangePassword() {
        return timeChangePassword;
    }

    public void setTimeChangePassword(Integer timeChangePassword) {
        this.timeChangePassword = timeChangePassword;
    }

    public Integer getCanRecoverPassword() {
        return canRecoverPassword;
    }

    public void setCanRecoverPassword(Integer canRecoverPassword) {
        this.canRecoverPassword = canRecoverPassword;
    }

    public Integer getPasswordComplexityCheck() {
        return passwordComplexityCheck;
    }

    public void setPasswordComplexityCheck(Integer passwordComplexityCheck) {
        this.passwordComplexityCheck = passwordComplexityCheck;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }
}
