package com.olive.upi.transport.model;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Rechargeplan {
    private Circle circle;
    private Operator operator;
    private Response response;

    public Circle getCircle() {
        return this.circle;
    }

    public Operator getOperator() {
        return this.operator;
    }

    public Response getResponse() {
        return this.response;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
