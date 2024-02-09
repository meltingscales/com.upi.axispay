.class public final synthetic Loj;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lb4;


# static fields
.field public static final synthetic a:Loj;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Loj;

    invoke-direct {v0}, Loj;-><init>()V

    sput-object v0, Loj;->a:Loj;

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

    invoke-static {p1}, Ljk$a;->k(Lbm;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
