.class public Lin/org/npci/commonlibrary/i;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static a:Ljava/security/cert/Certificate;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    :try_start_0
    const v1, 0x1893

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lin/org/npci/commonlibrary/e;->a(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v0

    sput-object v0, Lin/org/npci/commonlibrary/i;->a:Ljava/security/cert/Certificate;
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/security/cert/CertificateException;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a()Ljava/security/PublicKey;
    .locals 1

    sget-object v0, Lin/org/npci/commonlibrary/i;->a:Ljava/security/cert/Certificate;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
