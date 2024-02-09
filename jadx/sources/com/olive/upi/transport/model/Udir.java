package com.olive.upi.transport.model;

import java.util.List;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class Udir {
    public String amtCredit;
    public String amtDebited;
    public List<UdirReasons> reasons;
    public String txnComplete;
    public String txnInitiated;
    public boolean isComplaintRaised = false;
    public boolean isChkTxnInitiated = false;
    public boolean complaintInProcess = false;
    public boolean complaintResolved = false;
}
