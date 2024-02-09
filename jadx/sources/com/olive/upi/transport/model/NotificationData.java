package com.olive.upi.transport.model;

import java.util.ArrayList;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class NotificationData {
    private ArrayList<NotificationAction> actionableItems;
    private String bigImage;
    private String body;
    private String clickAction;
    private Boolean isLoggedInRequired = Boolean.FALSE;
    private Object notificationData;
    public String notificationType;
    public boolean notificationVisibe;
    private String title;

    public ArrayList<NotificationAction> getActionableItems() {
        return this.actionableItems;
    }

    public String getBigImage() {
        return this.bigImage;
    }

    public String getBody() {
        return this.body;
    }

    public String getClickAction() {
        return this.clickAction;
    }

    public Boolean getLoggedInRequired() {
        return this.isLoggedInRequired;
    }

    public Object getNotificationData() {
        return this.notificationData;
    }

    public String getNotificationType() {
        return this.notificationType;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isNotificationVisibe() {
        return this.notificationVisibe;
    }

    public void setActionableItems(ArrayList<NotificationAction> arrayList) {
        this.actionableItems = arrayList;
    }

    public void setBigImage(String str) {
        this.bigImage = str;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setClickAction(String str) {
        this.clickAction = str;
    }

    public void setLoggedInRequired(Boolean bool) {
        this.isLoggedInRequired = bool;
    }

    public void setNotificationData(Object obj) {
        this.notificationData = obj;
    }

    public void setNotificationType(String str) {
        this.notificationType = str;
    }

    public void setNotificationVisibe(boolean z) {
        this.notificationVisibe = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
