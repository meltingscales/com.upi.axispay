.class public final synthetic Llj;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lb4;


# static fields
.field public static final synthetic a:Llj;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Llj;

    invoke-direct {v0}, Llj;-><init>()V

    sput-object v0, Llj;->a:Llj;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbm;

    invoke-interface {p1}, Lbm;->getPath()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
