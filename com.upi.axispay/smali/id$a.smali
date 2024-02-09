.class public final Lid$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljd$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lid;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd$a<",
        "Llc;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    check-cast p1, Llc;

    invoke-virtual {p0, p1, p2}, Lid$a;->b(Llc;Landroid/graphics/Rect;)V

    return-void
.end method

.method public b(Llc;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Llc;->m(Landroid/graphics/Rect;)V

    return-void
.end method
