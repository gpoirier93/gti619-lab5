package com.tp5.core.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "security_parameter")
public class SecurityParameterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_security_parameter")
    private Integer idSecurityParameter;

    @Column(name = "max_connect_attempt")
    private Integer maxConnectAttempt;

    @Column(name = "max_connect_attempt_delay")
    private Integer maxConnectAttemptDelay;

    @Column(name = "max_connect_attempt_block")
    private Integer maxConnectAttemptBlock;

    @Column(name = "time_change_password")
    private Integer timeChangePassword;

    @Column(name = "can_recover_password")
    private Integer canRecoverPassword;

    @Column(name = "password_complexity_check")
    private Integer passwordComplexityCheck;

    @Column(name = "can_use_past_password")
    private Integer canUsePastPassword;

    @Column(name = "last_modification_date")
    private Date lastModificationDate;

    @Column(name = "creation_date")
    private Date creationDate;

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

    public Integer getCanUsePastPassword() {
        return canUsePastPassword;
    }

    public void setCanUsePastPassword(Integer canUsePastPassword) {
        this.canUsePastPassword = canUsePastPassword;
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
