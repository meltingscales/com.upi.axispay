.class public Lig0;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/olive/upi/transport/model/MandateTransactionData;)Ljava/lang/String;
    .locals 7

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const v1, 0x38ea

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 3
    invoke-virtual {p0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const v2, 0x38eb

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_1

    const v1, 0x38ec

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 5
    :cond_1
    invoke-virtual {p0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmpl-double v1, v3, v5

    const v3, 0x38ed

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v1, :cond_2

    .line 6
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const v1, 0x38ee

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 7
    :cond_2
    invoke-virtual {p0}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 8
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const v1, 0x38ef

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 9
    :cond_3
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const v1, 0x38f0

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const v1, 0x38f1

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const v1, 0x38f2

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lcom/olive/upi/transport/model/TransactionData;->getPayeeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const v1, 0x38f3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const v1, 0x38f4

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const v1, 0x38f5

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const v1, 0x38f6

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const v1, 0x38f7

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const v1, 0x38f8

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getAmountRule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const v1, 0x38f9

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const v1, 0x38fa

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const v1, 0x38fb

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    :try_start_0
    const v0, 0x38fc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-static {p0, v1}, Lcom/upi/axispay/custom/CustomURLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const v0, 0x38fd

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x38fe

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const v0, 0x38ff

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x3900

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const v0, 0x3901

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Ljava/util/Hashtable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lih0;

    invoke-direct {v0}, Lih0;-><init>()V

    .line 2
    invoke-virtual {v0, p1}, Lih0;->c(Ljava/lang/String;)V

    .line 3
    new-instance p1, Ljava/util/Hashtable;

    invoke-direct {p1}, Ljava/util/Hashtable;-><init>()V

    const v1, 0x3902

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Lih0;->b(Ljava/lang/String;)Z

    move-result v2

    const v3, 0x3903

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x3904

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x3905

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    if-eqz v2, :cond_1

    .line 5
    new-instance v2, Lih0;

    invoke-direct {v2}, Lih0;-><init>()V

    .line 6
    invoke-virtual {v0, v1}, Lih0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lih0;->c(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v2, v5}, Lih0;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 8
    invoke-virtual {v2, v5}, Lih0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v4, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    :cond_0
    invoke-virtual {v2, v3}, Lih0;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 10
    invoke-virtual {v2, v3}, Lih0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x3906

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const v1, 0x3907

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lih0;->b(Ljava/lang/String;)Z

    move-result v2

    const v6, 0x3908

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v2, :cond_3

    .line 12
    new-instance v2, Lih0;

    invoke-direct {v2}, Lih0;-><init>()V

    .line 13
    invoke-virtual {v0, v1}, Lih0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lih0;->c(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v2, v5}, Lih0;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 15
    invoke-virtual {v2, v5}, Lih0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v6, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    :cond_2
    invoke-virtual {v2, v3}, Lih0;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 17
    invoke-virtual {v2, v3}, Lih0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x3909

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const v1, 0x390a

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Lih0;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 19
    invoke-virtual {v0, v1}, Lih0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x390b

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    const v1, 0x390c

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Lih0;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 21
    invoke-virtual {v0, v1}, Lih0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x390d

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    const v1, 0x390e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Lih0;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 23
    invoke-virtual {v0, v1}, Lih0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x390f

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    const v1, 0x3910

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Lih0;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 25
    invoke-virtual {v0, v1}, Lih0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x3911

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    const v1, 0x3912

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Lih0;->b(Ljava/lang/String;)Z

    move-result v2

    const v3, 0x3913

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v2, :cond_a

    .line 27
    new-instance v2, Lih0;

    invoke-direct {v2}, Lih0;-><init>()V

    .line 28
    invoke-virtual {v0, v1}, Lih0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lih0;->c(Ljava/lang/String;)V

    .line 29
    invoke-virtual {v2, v3}, Lih0;->b(Ljava/lang/String;)Z

    move-result v1

    const v7, 0x3914

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x3915

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    if-eqz v1, :cond_9

    .line 30
    invoke-virtual {v2, v3}, Lih0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 31
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_a

    const v2, 0x3916

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_0

    :cond_8
    move-object v7, v1

    .line 33
    :goto_0
    invoke-virtual {p1, v8, v7}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 34
    :cond_9
    invoke-virtual {p1, v8, v7}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    :cond_a
    :goto_1
    invoke-virtual {p1, v4}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 36
    invoke-virtual {p1, v6}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_b

    return-object p1

    .line 37
    :cond_b
    invoke-virtual {v0, v3}, Lih0;->b(Ljava/lang/String;)Z

    move-result v1

    const v2, 0x3917

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_c

    .line 38
    invoke-virtual {v0, v3}, Lih0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 39
    invoke-virtual {p1, v4}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_c

    const/4 v3, 0x0

    const/16 v6, 0xb

    .line 40
    invoke-virtual {v1, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 41
    invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 42
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x3918

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-virtual {p1, v4, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    const v1, 0x3919

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Lih0;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 45
    invoke-virtual {v0, v1}, Lih0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 46
    new-instance v1, Lih0;

    invoke-direct {v1}, Lih0;-><init>()V

    .line 47
    invoke-virtual {v1, v0}, Lih0;->c(Ljava/lang/String;)V

    .line 48
    invoke-virtual {v1, v5}, Lih0;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 49
    invoke-virtual {v1, v5}, Lih0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 50
    invoke-virtual {p1, v4}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x391a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 52
    invoke-virtual {p1, v4, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    return-object p1
.end method

.method public final c(Ljava/lang/String;)Ljava/util/Hashtable;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    const v1, 0x391b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 4
    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p1, v3

    const v5, 0x391c

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 5
    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 6
    array-length v5, v4

    const/4 v6, 0x1

    if-le v5, v6, :cond_0

    .line 7
    aget-object v5, v4, v2

    aget-object v4, v4, v6

    invoke-virtual {v0, v5, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public d(Ljava/lang/String;I)Lqg0;
    .locals 9

    const v0, 0x391d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x391e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v0, 0x391f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 1
    new-instance v4, Lcom/olive/upi/transport/model/TransactionData;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/TransactionData;-><init>()V

    .line 2
    invoke-virtual {v4, p1}, Lcom/olive/upi/transport/model/TransactionData;->setIntentData(Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v5

    invoke-virtual {v5, v4}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 4
    invoke-static {p1}, Lig0;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const v4, 0x7f120213

    const/4 v5, 0x0

    if-nez p1, :cond_0

    .line 5
    new-instance p1, Lqg0;

    invoke-direct {p1, v5, v4}, Lqg0;-><init>(ZI)V

    return-object p1

    .line 6
    :cond_0
    :try_start_0
    new-instance v6, Ljava/util/Hashtable;

    invoke-direct {v6}, Ljava/util/Hashtable;-><init>()V

    .line 7
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 8
    invoke-virtual {p0, p1}, Lig0;->b(Ljava/lang/String;)Ljava/util/Hashtable;

    move-result-object v1

    .line 9
    invoke-virtual {p0, v1, p1, v2, p2}, Lig0;->f(Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/String;I)Lqg0;

    move-result-object p1

    return-object p1

    .line 10
    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0xa

    .line 11
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 12
    invoke-virtual {p0, p1}, Lig0;->c(Ljava/lang/String;)Ljava/util/Hashtable;

    move-result-object v2

    .line 13
    invoke-virtual {p0, v2, p1, v1, p2}, Lig0;->f(Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/String;I)Lqg0;

    move-result-object p1

    return-object p1

    .line 14
    :cond_2
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v0, 0x3920

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x3921

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    if-nez p2, :cond_4

    :try_start_1
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_0

    .line 15
    :cond_3
    new-instance p1, Lqg0;

    invoke-direct {p1, v5, v4}, Lqg0;-><init>(ZI)V

    return-object p1

    .line 16
    :cond_4
    :goto_0
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    const/16 v4, 0xe

    if-eqz p2, :cond_5

    .line 17
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 18
    :cond_5
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 19
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    move-object v3, v2

    goto :goto_1

    :cond_6
    const/16 p2, 0x10

    .line 20
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    move-object v3, v1

    :goto_1
    const v0, 0x3922

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 21
    invoke-virtual {p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    .line 22
    invoke-virtual {v6}, Ljava/util/Hashtable;->clear()V

    .line 23
    array-length v1, p2

    move v2, v5

    :goto_2
    if-ge v2, v1, :cond_8

    aget-object v4, p2, v2

    const v0, 0x3923

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 24
    invoke-virtual {v4, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 25
    array-length v7, v4

    const/4 v8, 0x1

    if-le v7, v8, :cond_7

    .line 26
    aget-object v7, v4, v5

    aget-object v4, v4, v8

    invoke-virtual {v6, v7, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 27
    :cond_8
    invoke-virtual {p0, v6, p1, v3}, Lig0;->g(Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/String;)Lqg0;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    .line 28
    :catch_0
    new-instance p1, Lqg0;

    const p2, 0x7f120375

    invoke-direct {p1, v5, p2}, Lqg0;-><init>(ZI)V

    return-object p1
.end method

.method public final f(Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/String;I)Lqg0;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Lqg0;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v2

    invoke-virtual {v2}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v2

    const v16, 0x3924

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const v16, 0x3925

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 3
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    .line 4
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    const v16, 0x3926

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const v16, 0x3927

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    if-nez v6, :cond_1

    if-eqz v4, :cond_0

    const v16, 0x3928

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1

    :cond_0
    const v16, 0x3929

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 5
    :cond_1
    invoke-virtual {v0, v7}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const v6, 0x7f1201ff

    if-eqz v5, :cond_2

    .line 6
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_2

    const v16, 0x392a

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 7
    new-instance v0, Lqg0;

    invoke-direct {v0, v8, v6}, Lqg0;-><init>(ZI)V

    return-object v0

    .line 8
    :cond_2
    invoke-virtual {v0, v9}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v5, :cond_3

    .line 9
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 10
    new-instance v0, Lqg0;

    invoke-direct {v0, v8, v6}, Lqg0;-><init>(ZI)V

    return-object v0

    .line 11
    :cond_3
    new-instance v4, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 12
    new-instance v6, Lcom/olive/upi/transport/model/Account;

    invoke-direct {v6}, Lcom/olive/upi/transport/model/Account;-><init>()V

    const v16, 0x392b

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 13
    invoke-virtual {v0, v6}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    const-wide/16 v11, 0x0

    if-nez v10, :cond_4

    .line 14
    :try_start_0
    invoke-virtual {v0, v6}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v13
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_4
    move-wide v13, v11

    :goto_0
    const v16, 0x392c

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 15
    invoke-virtual {v0, v6}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_5

    .line 16
    :try_start_1
    invoke-virtual {v0, v6}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v11
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_5
    const v16, 0x392d

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 17
    invoke-virtual {v0, v6}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ljg0;->R(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeAppName(Ljava/lang/String;)V

    const v16, 0x392e

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 18
    invoke-virtual {v0, v6}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v2, v6}, Lcom/olive/upi/transport/model/TransactionData;->setPayAppId(Ljava/lang/String;)V

    const v16, 0x392f

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 19
    invoke-virtual {v0, v6}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Ljg0;->R(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    const v16, 0x3930

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 20
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setPayCurrency(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v0, v9}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v0, v9}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setOrderId(Ljava/lang/String;)V

    .line 23
    invoke-virtual {v0, v7}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v2, v7}, Lcom/olive/upi/transport/model/TransactionData;->setMcc(Ljava/lang/String;)V

    const/4 v7, 0x1

    .line 24
    invoke-virtual {v2, v7}, Lcom/olive/upi/transport/model/TransactionData;->setIsThroughNotification(Z)V

    .line 25
    sget v10, Lcom/olive/upi/transport/model/TransactionData;->MODE_QR_PAY:I

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    const v16, 0x3931

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 26
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Ljg0;->R(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    const v16, 0x3932

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 27
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setInvoiceDate(Ljava/lang/String;)V

    const v16, 0x3933

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 28
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setInvoiceName(Ljava/lang/String;)V

    const v16, 0x3934

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 29
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v2, v15}, Lcom/olive/upi/transport/model/TransactionData;->setQRexpire(Ljava/lang/String;)V

    const v16, 0x3935

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    .line 30
    invoke-virtual {v0, v15}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v2, v15}, Lcom/olive/upi/transport/model/TransactionData;->setInvoiceNo(Ljava/lang/String;)V

    const v16, 0x3936

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    .line 31
    invoke-virtual {v0, v15}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v2, v15}, Lcom/olive/upi/transport/model/TransactionData;->setEnTips(Ljava/lang/String;)V

    const v16, 0x3937

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    .line 32
    invoke-virtual {v0, v15}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v2, v15}, Lcom/olive/upi/transport/model/TransactionData;->setVer(Ljava/lang/String;)V

    const v16, 0x3938

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    .line 33
    invoke-virtual {v0, v15}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v2, v15}, Lcom/olive/upi/transport/model/TransactionData;->setQRts(Ljava/lang/String;)V

    const v16, 0x3939

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    .line 34
    invoke-virtual {v0, v15}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v2, v15}, Lcom/olive/upi/transport/model/TransactionData;->setQrMedium(Ljava/lang/String;)V

    .line 35
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setQRexpire(Ljava/lang/String;)V

    const v16, 0x393a

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 36
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setSGST(Ljava/lang/String;)V

    const v16, 0x393b

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 37
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setCGST(Ljava/lang/String;)V

    const v16, 0x393c

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 38
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setGST(Ljava/lang/String;)V

    const v16, 0x393d

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 39
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setIGST(Ljava/lang/String;)V

    const v16, 0x393e

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 40
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setCESS(Ljava/lang/String;)V

    const v16, 0x393f

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 41
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setGstIn(Ljava/lang/String;)V

    const v16, 0x3940

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 42
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setIsGSTEnabled(Ljava/lang/String;)V

    const v16, 0x3941

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 43
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setGstBrkUp(Ljava/lang/String;)V

    const v16, 0x3942

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 44
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setConsentName(Ljava/lang/String;)V

    const v16, 0x3943

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 45
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setConsentType(Ljava/lang/String;)V

    const v16, 0x3944

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 46
    invoke-virtual {v0, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/olive/upi/transport/model/TransactionData;->setIsConsentEnabled(Ljava/lang/String;)V

    .line 47
    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    const v16, 0x3945

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_6

    .line 48
    new-instance v0, Lqg0;

    const v1, 0x7f120213

    invoke-direct {v0, v8, v1}, Lqg0;-><init>(ZI)V

    return-object v0

    .line 49
    :cond_6
    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v4, v10}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 50
    invoke-virtual {v0, v6}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ljg0;->R(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 51
    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/BeneVpa;->setNickname(Ljava/lang/String;)V

    .line 52
    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    .line 53
    invoke-virtual {v2, v4}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 54
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 55
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/olive/upi/transport/model/TransactionData;->setMinimumAmount(Ljava/lang/Double;)V

    .line 56
    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setRemitterVpa(Ljava/lang/String;)V

    const v16, 0x3946

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 57
    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 58
    invoke-virtual {v0, v9}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    const v16, 0x3947

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 59
    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setRefUrl(Ljava/lang/String;)V

    const v16, 0x3948

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 60
    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_7

    const v16, 0x3949

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_7
    const v16, 0x394a

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setRefCategory(Ljava/lang/String;)V

    .line 61
    sget v3, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    move/from16 v4, p4

    if-ne v4, v3, :cond_8

    .line 62
    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    goto :goto_3

    :cond_8
    if-eqz v5, :cond_9

    .line 63
    sget v3, Lcom/olive/upi/transport/model/TransactionData;->MODE_BHARAT_QR_PAY:I

    goto :goto_2

    :cond_9
    sget v3, Lcom/olive/upi/transport/model/TransactionData;->MODE_QR_PAY:I

    :goto_2
    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    :goto_3
    const v16, 0x394b

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 64
    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setMode(Ljava/lang/String;)V

    const v16, 0x394c

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 65
    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setPurpose(Ljava/lang/String;)V

    const v16, 0x394d

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 66
    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setSign(Ljava/lang/String;)V

    const v16, 0x394e

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 67
    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setOrgid(Ljava/lang/String;)V

    const v16, 0x394f

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 68
    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setMid(Ljava/lang/String;)V

    const v16, 0x3950

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 69
    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setMsid(Ljava/lang/String;)V

    const v16, 0x3951

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 70
    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setMtid(Ljava/lang/String;)V

    const v16, 0x3952

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 71
    invoke-virtual {v0, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setQuery(Ljava/lang/String;)V

    .line 72
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, v2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 73
    new-instance v0, Lqg0;

    const v2, 0x7f12031e

    invoke-direct {v0, v7, v2, v8, v1}, Lqg0;-><init>(ZIILjava/lang/String;)V

    return-object v0
.end method

.method public final g(Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/String;)Lqg0;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lqg0;"
        }
    .end annotation

    move-object/from16 v1, p1

    const v18, 0x3953

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const v18, 0x3954

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-virtual {v1, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const v18, 0x3955

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 3
    invoke-virtual {v1, v5}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const v18, 0x3956

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 4
    invoke-virtual {v1, v7}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const v18, 0x3957

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    .line 5
    invoke-virtual {v1, v9}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    const v18, 0x3958

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 6
    invoke-virtual {v1, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const v18, 0x3959

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    .line 7
    invoke-virtual {v1, v12}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    const v18, 0x395a

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    .line 8
    invoke-virtual {v1, v14}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    .line 9
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v16

    move-object/from16 p2, v9

    if-nez v16, :cond_8

    if-eqz v2, :cond_0

    const v18, 0x395b

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_8

    :cond_0
    const v18, 0x395c

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 10
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_8

    if-eqz v4, :cond_8

    if-eqz v6, :cond_8

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_8

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 11
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_8

    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_4

    .line 12
    :cond_1
    new-instance v2, Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;-><init>()V

    .line 13
    new-instance v4, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {v4}, Lcom/olive/upi/transport/model/BeneVpa;-><init>()V

    .line 14
    new-instance v6, Lcom/olive/upi/transport/model/Account;

    invoke-direct {v6}, Lcom/olive/upi/transport/model/Account;-><init>()V

    .line 15
    invoke-virtual {v1, v7}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    const-wide/16 v8, 0x0

    if-nez v6, :cond_2

    .line 16
    :try_start_0
    invoke-virtual {v1, v7}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_2
    move-wide v6, v8

    :goto_0
    const v18, 0x395d

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    .line 17
    invoke-virtual {v1, v11}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/CharSequence;

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_3

    .line 18
    :try_start_1
    invoke-virtual {v1, v11}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v8
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_3
    const v18, 0x395e

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    .line 19
    invoke-virtual {v1, v11}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Ljg0;->R(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2, v11}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeAppName(Ljava/lang/String;)V

    const v18, 0x395f

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    .line 20
    invoke-virtual {v1, v11}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v2, v11}, Lcom/olive/upi/transport/model/TransactionData;->setPayAppId(Ljava/lang/String;)V

    const v18, 0x3960

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    .line 21
    invoke-virtual {v1, v11}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-static {v13}, Ljg0;->R(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    const v18, 0x3961

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    .line 22
    invoke-virtual {v1, v13}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v2, v13}, Lcom/olive/upi/transport/model/TransactionData;->setPayCurrency(Ljava/lang/String;)V

    const v18, 0x3962

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    .line 23
    invoke-virtual {v1, v13}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v2, v15}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 24
    invoke-virtual {v1, v13}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v2, v13}, Lcom/olive/upi/transport/model/TransactionData;->setOrderId(Ljava/lang/String;)V

    const v18, 0x3963

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    .line 25
    invoke-virtual {v1, v13}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v2, v13}, Lcom/olive/upi/transport/model/TransactionData;->setMcc(Ljava/lang/String;)V

    const v18, 0x3964

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    .line 26
    invoke-virtual {v1, v13}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v2, v15}, Lcom/olive/upi/transport/model/TransactionData;->setSign(Ljava/lang/String;)V

    const/4 v15, 0x1

    .line 27
    invoke-virtual {v2, v15}, Lcom/olive/upi/transport/model/TransactionData;->setIsThroughNotification(Z)V

    .line 28
    sget v15, Lcom/olive/upi/transport/model/TransactionData;->MODE_QR_PAY:I

    invoke-virtual {v2, v15}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    const v18, 0x3965

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    .line 29
    invoke-virtual {v1, v15}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-static {v15}, Ljg0;->R(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v2, v15}, Lcom/olive/upi/transport/model/TransactionData;->setRemarks(Ljava/lang/String;)V

    const v18, 0x3966

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    .line 30
    invoke-virtual {v1, v15}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v2, v15}, Lcom/olive/upi/transport/model/MandateTransactionData;->setAmountRule(Ljava/lang/String;)V

    .line 31
    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    move-object/from16 v17, v14

    const v18, 0x3967

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v15, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_4

    .line 32
    new-instance v0, Lqg0;

    const v1, 0x7f120213

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lqg0;-><init>(ZI)V

    return-object v0

    .line 33
    :cond_4
    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v4, v14}, Lcom/olive/upi/transport/model/BeneVpa;->setVpa(Ljava/lang/String;)V

    .line 34
    invoke-virtual {v1, v11}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-static {v14}, Ljg0;->R(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 35
    invoke-virtual {v4, v14}, Lcom/olive/upi/transport/model/BeneVpa;->setNickname(Ljava/lang/String;)V

    .line 36
    invoke-virtual {v4, v14}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    .line 37
    invoke-virtual {v2, v4}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    .line 38
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/olive/upi/transport/model/TransactionData;->setAmount(Ljava/lang/Double;)V

    .line 39
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/olive/upi/transport/model/TransactionData;->setMinimumAmount(Ljava/lang/Double;)V

    .line 40
    invoke-virtual {v1, v11}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    .line 41
    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRemitterVpa(Ljava/lang/String;)V

    const v18, 0x3968

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    const v18, 0x3969

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 43
    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRefUrl(Ljava/lang/String;)V

    .line 44
    sget v0, Lcom/olive/upi/transport/model/TransactionData;->MODE_QR_MANDATE:I

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionMode(I)V

    .line 45
    invoke-virtual {v1, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setStartMandate(Ljava/lang/String;)V

    .line 46
    invoke-virtual {v1, v5}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljg0;->N(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setEndmandate(Ljava/lang/String;)V

    .line 47
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 48
    new-instance v0, Ljava/text/SimpleDateFormat;

    const v18, 0x396a

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 49
    invoke-virtual {v0, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    const/4 v4, 0x0

    .line 50
    :try_start_2
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v4
    :try_end_2
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    move-exception v0

    .line 51
    invoke-virtual {v0}, Ljava/text/ParseException;->printStackTrace()V

    .line 52
    :goto_1
    invoke-virtual {v3, v4}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 53
    new-instance v0, Lqg0;

    const v1, 0x7f12000c

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lqg0;-><init>(ZI)V

    return-object v0

    :cond_5
    const v18, 0x396b

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 54
    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 55
    invoke-virtual {v1, v10}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setMode(Ljava/lang/String;)V

    .line 56
    invoke-virtual {v1, v12}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setPurpose(Ljava/lang/String;)V

    .line 57
    invoke-virtual {v1, v13}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setSign(Ljava/lang/String;)V

    move-object/from16 v3, v17

    .line 58
    invoke-virtual {v1, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setOrgid(Ljava/lang/String;)V

    const v18, 0x396c

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 59
    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setMid(Ljava/lang/String;)V

    const v18, 0x396d

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 60
    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setMsid(Ljava/lang/String;)V

    const v18, 0x396e

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 61
    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setMtid(Ljava/lang/String;)V

    move-object/from16 v3, p2

    .line 62
    invoke-virtual {v1, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setOccurence(Ljava/lang/String;)V

    const v18, 0x396f

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 63
    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setQuery(Ljava/lang/String;)V

    const v18, 0x3970

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 64
    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    const v18, 0x3971

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_6
    const v18, 0x3972

    invoke-static/range {v18 .. v18}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v2, v0}, Lcom/olive/upi/transport/model/TransactionData;->setRefCategory(Ljava/lang/String;)V

    .line 65
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, v2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 66
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, v2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 67
    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    const/16 v0, 0x6a

    goto :goto_3

    :cond_7
    const/16 v0, 0x83

    .line 68
    :goto_3
    new-instance v1, Lqg0;

    const v2, 0x7f12031e

    move-object/from16 v3, p3

    const/4 v4, 0x1

    invoke-direct {v1, v4, v2, v0, v3}, Lqg0;-><init>(ZIILjava/lang/String;)V

    return-object v1

    .line 69
    :cond_8
    :goto_4
    new-instance v0, Lqg0;

    const v1, 0x7f1201ff

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lqg0;-><init>(ZI)V

    return-object v0
.end method
