package com.olive.upi.transport;

import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class OliveRequest {
    public Object clInitData;
    public int clMode;
    public Object clTransportData;
    public Map<String, Object> hashMapData;
    public int initiator;
    public boolean isBackgroundCall;
    public int requestCount;
    public Object requestData;
    public int requestType;
    public Object tag;

    public OliveRequest(int i) {
        this.requestType = i;
    }

    public Object getClInitData() {
        return this.clInitData;
    }

    public int getClMode() {
        return this.clMode;
    }

    public Object getClTransportData() {
        return this.clTransportData;
    }

    public Map<String, Object> getHashMapData() {
        return this.hashMapData;
    }

    public int getInitiator() {
        return this.initiator;
    }

    public int getRequestCount() {
        return this.requestCount;
    }

    public Object getRequestData() {
        return this.requestData;
    }

    public int getRequestType() {
        return this.requestType;
    }

    public Object getTag() {
        return this.tag;
    }

    public void incrementRequestCount() {
        this.requestCount++;
    }

    public boolean isBackgroundCall() {
        return this.isBackgroundCall;
    }

    public void setBackgroundCall(boolean z) {
        this.isBackgroundCall = z;
    }

    public void setClInitData(Object obj) {
        this.clInitData = obj;
    }

    public void setClMode(int i) {
        this.clMode = i;
    }

    public void setClTransportData(Object obj) {
        this.clTransportData = obj;
    }

    public void setHashMapData(Map<String, Object> map) {
        this.hashMapData = map;
    }

    public void setInitiator(int i) {
        this.initiator = i;
    }

    public void setRequestCount(int i) {
        this.requestCount = i;
    }

    public void setRequestData(Object obj) {
        this.requestData = obj;
    }

    public void setRequestType(int i) {
        this.requestType = i;
    }

    public void setTag(Object obj) {
        this.tag = obj;
    }

    public String toString() {
        return C0059ao.a(11331) + this.initiator + C0059ao.a(11332) + this.requestType + C0059ao.a(11333) + this.requestData + C0059ao.a(11334) + this.hashMapData + C0059ao.a(11335) + this.tag;
    }

    public OliveRequest(int i, int i2, Object obj) {
        this.initiator = i;
        this.requestType = i2;
        this.requestData = obj;
    }

    public OliveRequest(int i, int i2, Object obj, boolean z) {
        this.initiator = i;
        this.requestType = i2;
        this.requestData = obj;
        this.isBackgroundCall = z;
    }

    public OliveRequest(int i, Object obj) {
        this.requestType = i;
        this.requestData = obj;
    }

    public OliveRequest(int i, int i2) {
        this.initiator = i;
        this.requestType = i2;
    }
}
