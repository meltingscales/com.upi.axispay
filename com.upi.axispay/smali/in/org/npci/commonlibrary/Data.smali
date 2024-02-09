.class public Lin/org/npci/commonlibrary/Data;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J


# instance fields
.field private code:Ljava/lang/String;

.field private encryptedBase64String:Ljava/lang/String;

.field private hmac:Ljava/lang/String;

.field private ki:Ljava/lang/String;

.field private pid:Ljava/lang/String;

.field private skey:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lin/org/npci/commonlibrary/Data;

    const v1, 0x123

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lin/org/npci/commonlibrary/Data;->ki:Ljava/lang/String;

    iput-object p2, p0, Lin/org/npci/commonlibrary/Data;->code:Ljava/lang/String;

    iput-object p3, p0, Lin/org/npci/commonlibrary/Data;->encryptedBase64String:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lin/org/npci/commonlibrary/Data;->encryptedBase64String:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lin/org/npci/commonlibrary/Data;->encryptedBase64String:Ljava/lang/String;

    return-void
.end method
