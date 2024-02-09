.class public Lg80$a;
.super Landroid/util/LruCache;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg80;-><init>(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/LruCache<",
        "Ljava/lang/String;",
        "Lg80$b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lg80;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroid/util/LruCache;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lg80$b;)I
    .locals 0

    .line 1
    iget p1, p2, Lg80$b;->b:I

    return p1
.end method

.method public bridge synthetic sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lg80$b;

    invoke-virtual {p0, p1, p2}, Lg80$a;->a(Ljava/lang/String;Lg80$b;)I

    move-result p1

    return p1
.end method
