.class public final synthetic Lr70;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic b:Lr70;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lr70;

    invoke-direct {v0}, Lr70;-><init>()V

    sput-object v0, Lr70;->b:Lr70;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/olive/upi/transport/model/Bank;

    check-cast p2, Lcom/olive/upi/transport/model/Bank;

    invoke-static {p1, p2}, Lcom/olive/upi/transport/model/Bank;->a(Lcom/olive/upi/transport/model/Bank;Lcom/olive/upi/transport/model/Bank;)I

    move-result p1

    return p1
.end method
