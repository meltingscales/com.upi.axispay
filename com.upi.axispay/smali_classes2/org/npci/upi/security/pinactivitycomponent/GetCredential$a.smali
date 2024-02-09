.class public Lorg/npci/upi/security/pinactivitycomponent/GetCredential$a;
.super Landroid/content/BroadcastReceiver;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/npci/upi/security/pinactivitycomponent/GetCredential;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lorg/npci/upi/security/pinactivitycomponent/GetCredential;


# direct methods
.method public constructor <init>(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)V
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$a;->a:Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;Lorg/npci/upi/security/pinactivitycomponent/GetCredential$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$a;-><init>(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;)V
    .locals 8

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    const v0, 0x10f2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    array-length v0, p1

    new-array v1, v0, [Landroid/telephony/SmsMessage;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    check-cast v3, [B

    invoke-static {v3}, Landroid/telephony/SmsMessage;->createFromPdu([B)Landroid/telephony/SmsMessage;

    move-result-object v3

    aput-object v3, v1, v2

    aget-object v3, v1, v2

    invoke-virtual {v3}, Landroid/telephony/SmsMessage;->getOriginatingAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    aget-object v4, v1, v2

    invoke-virtual {v4}, Landroid/telephony/SmsMessage;->getMessageBody()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/util/Date;

    aget-object v6, v1, v2

    invoke-virtual {v6}, Landroid/telephony/SmsMessage;->getTimestampMillis()J

    move-result-wide v6

    invoke-direct {v5, v6, v7}, Ljava/util/Date;-><init>(J)V

    new-instance v5, Lorg/npci/upi/security/pinactivitycomponent/o;

    iget-object v6, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$a;->a:Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-static {v6}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->Y(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/npci/upi/security/pinactivitycomponent/o;-><init>(Landroid/content/Context;)V

    iget-object v6, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$a;->a:Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-static {v6}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->a0(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)I

    move-result v6

    invoke-virtual {v5, v6, v3, v4}, Lorg/npci/upi/security/pinactivitycomponent/o;->d(ILjava/lang/String;Ljava/lang/String;)Lorg/npci/upi/security/pinactivitycomponent/n;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v4, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$a;->a:Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-static {v4}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->b0(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)Lorg/npci/upi/security/pinactivitycomponent/m;

    move-result-object v4

    invoke-virtual {v4, v3}, Lorg/npci/upi/security/pinactivitycomponent/m;->u(Lorg/npci/upi/security/pinactivitycomponent/n;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const v0, 0x10f3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$a;->a(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->h0()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lorg/npci/upi/security/pinactivitycomponent/l;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_0
    :goto_0
    return-void
.end method
