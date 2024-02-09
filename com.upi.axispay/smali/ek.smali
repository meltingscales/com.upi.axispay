.class public final synthetic Lek;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lb4;


# static fields
.field public static final synthetic a:Lek;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lek;

    invoke-direct {v0}, Lek;-><init>()V

    sput-object v0, Lek;->a:Lek;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lfm;

    invoke-interface {p1}, Lfm;->L()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
