.class public final Lbh$e;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lyh$i;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lbh$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lbh$e;

    invoke-direct {v0}, Lbh$e;-><init>()V

    sput-object v0, Lbh$e;->b:Lbh$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lyh$i;Lyh$i;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Lyh$i;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lyh$i;->l()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lyh$i;

    check-cast p2, Lyh$i;

    invoke-virtual {p0, p1, p2}, Lbh$e;->a(Lyh$i;Lyh$i;)I

    move-result p1

    return p1
.end method
