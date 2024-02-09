.class public final synthetic Lnj;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lb4;


# static fields
.field public static final synthetic a:Lnj;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lnj;

    invoke-direct {v0}, Lnj;-><init>()V

    sput-object v0, Lnj;->a:Lnj;

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

    invoke-static {p1}, Ljk$a;->j(Lbm;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
