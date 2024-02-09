.class public Lcom/olive/upi/transport/model/RegisterBiller;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public BILLER_CODE:Ljava/lang/String;

.field public CHNL_ID:Ljava/lang/String;

.field public CIF:Ljava/lang/String;

.field public CLIENT_CODE:Ljava/lang/String;

.field public CONSUMER_NO:Ljava/lang/String;

.field public CORP_CODE:Ljava/lang/String;

.field public CUST_CIF:Ljava/lang/String;

.field public EMAIL:Ljava/lang/String;

.field public IMEI:Ljava/lang/String;

.field public INITIATING_CHANNEL:Ljava/lang/String;

.field public IP:Ljava/lang/String;

.field public LEVEL1:Ljava/lang/String;

.field public LEVEL10:Ljava/lang/String;

.field public LEVEL11:Ljava/lang/String;

.field public LEVEL12:Ljava/lang/String;

.field public LEVEL2:Ljava/lang/String;

.field public LEVEL3:Ljava/lang/String;

.field public LEVEL4:Ljava/lang/String;

.field public LEVEL5:Ljava/lang/String;

.field public LEVEL6:Ljava/lang/String;

.field public LEVEL7:Ljava/lang/String;

.field public LEVEL8:Ljava/lang/String;

.field public LEVEL9:Ljava/lang/String;

.field public LVL_CODE_ACTL:Ljava/lang/String;

.field public MASTR_TYPE:Ljava/lang/String;

.field public MOB_NUM:Ljava/lang/String;

.field public STATUS:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x2117

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lcom/olive/upi/transport/model/RegisterBiller;->MOB_NUM:Ljava/lang/String;

    const v0, 0x2118

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    iput-object v0, p0, Lcom/olive/upi/transport/model/RegisterBiller;->IMEI:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getCHNL_ID()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RegisterBiller;->CHNL_ID:Ljava/lang/String;

    return-object v0
.end method

.method public getCONSUMER_NO()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RegisterBiller;->CONSUMER_NO:Ljava/lang/String;

    return-object v0
.end method

.method public getCUST_CIF()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RegisterBiller;->CUST_CIF:Ljava/lang/String;

    return-object v0
.end method

.method public getINITIATING_CHANNEL()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RegisterBiller;->INITIATING_CHANNEL:Ljava/lang/String;

    return-object v0
.end method

.method public getSTATUS()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/RegisterBiller;->STATUS:Ljava/lang/String;

    return-object v0
.end method

.method public setBILLER_CODE(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegisterBiller;->BILLER_CODE:Ljava/lang/String;

    return-void
.end method

.method public setCHNL_ID(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegisterBiller;->CHNL_ID:Ljava/lang/String;

    return-void
.end method

.method public setCIF_ID(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegisterBiller;->CIF:Ljava/lang/String;

    return-void
.end method

.method public setCLIENT_CODE(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegisterBiller;->CLIENT_CODE:Ljava/lang/String;

    return-void
.end method

.method public setCONSUMER_NO(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegisterBiller;->CONSUMER_NO:Ljava/lang/String;

    return-void
.end method

.method public setCUST_CIF(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegisterBiller;->CUST_CIF:Ljava/lang/String;

    return-void
.end method

.method public setEMAIL(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegisterBiller;->EMAIL:Ljava/lang/String;

    return-void
.end method

.method public setField(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x4bd80e9e

    if-eq v0, v1, :cond_1

    const v1, -0xa61e61f

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_0

    :pswitch_0
    const v0, 0x2119

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0xd

    goto/16 :goto_1

    :pswitch_1
    const v0, 0x211a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0xc

    goto/16 :goto_1

    :pswitch_2
    const v0, 0x211b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0xb

    goto/16 :goto_1

    :pswitch_3
    const v0, 0x211c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0xa

    goto/16 :goto_1

    :pswitch_4
    const v0, 0x211d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0x9

    goto/16 :goto_1

    :pswitch_5
    const v0, 0x211e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x7

    goto :goto_1

    :pswitch_6
    const v0, 0x211f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x6

    goto :goto_1

    :pswitch_7
    const v0, 0x2120

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x5

    goto :goto_1

    :pswitch_8
    const v0, 0x2121

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x4

    goto :goto_1

    :pswitch_9
    const v0, 0x2122

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x2

    goto :goto_1

    :pswitch_a
    const v0, 0x2123

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :pswitch_b
    const v0, 0x2124

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    const v0, 0x2125

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x3

    goto :goto_1

    :cond_1
    const v0, 0x2126

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0x8

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_2

    goto :goto_2

    .line 2
    :pswitch_c
    iput-object p2, p0, Lcom/olive/upi/transport/model/RegisterBiller;->LEVEL7:Ljava/lang/String;

    goto :goto_2

    .line 3
    :pswitch_d
    iput-object p2, p0, Lcom/olive/upi/transport/model/RegisterBiller;->LEVEL6:Ljava/lang/String;

    goto :goto_2

    .line 4
    :pswitch_e
    iput-object p2, p0, Lcom/olive/upi/transport/model/RegisterBiller;->LEVEL5:Ljava/lang/String;

    goto :goto_2

    .line 5
    :pswitch_f
    iput-object p2, p0, Lcom/olive/upi/transport/model/RegisterBiller;->LEVEL4:Ljava/lang/String;

    goto :goto_2

    .line 6
    :pswitch_10
    iput-object p2, p0, Lcom/olive/upi/transport/model/RegisterBiller;->CLIENT_CODE:Ljava/lang/String;

    goto :goto_2

    .line 7
    :pswitch_11
    iput-object p2, p0, Lcom/olive/upi/transport/model/RegisterBiller;->LEVEL2:Ljava/lang/String;

    .line 8
    :pswitch_12
    iput-object p2, p0, Lcom/olive/upi/transport/model/RegisterBiller;->LEVEL3:Ljava/lang/String;

    goto :goto_2

    .line 9
    :pswitch_13
    iput-object p2, p0, Lcom/olive/upi/transport/model/RegisterBiller;->LEVEL1:Ljava/lang/String;

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x41ee2ad3
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x428d0a3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_13
        :pswitch_11
        :pswitch_12
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch
.end method

.method public setIMEI(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegisterBiller;->IMEI:Ljava/lang/String;

    return-void
.end method

.method public setINITIATING_CHANNEL(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegisterBiller;->INITIATING_CHANNEL:Ljava/lang/String;

    return-void
.end method

.method public setIP(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegisterBiller;->IP:Ljava/lang/String;

    return-void
.end method

.method public setLVL_CODE_ACTL(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegisterBiller;->LVL_CODE_ACTL:Ljava/lang/String;

    return-void
.end method

.method public setMASTR_TYPE(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegisterBiller;->MASTR_TYPE:Ljava/lang/String;

    return-void
.end method

.method public setMOB_NUM(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegisterBiller;->MOB_NUM:Ljava/lang/String;

    return-void
.end method

.method public setSTATUS(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/RegisterBiller;->STATUS:Ljava/lang/String;

    return-void
.end method
