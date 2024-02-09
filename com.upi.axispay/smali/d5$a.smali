.class public Ld5$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld5;->F(Le5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Le5;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ld5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le5;Le5;)I
    .locals 0

    .line 1
    iget p1, p1, Le5;->d:I

    iget p2, p2, Le5;->d:I

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Le5;

    check-cast p2, Le5;

    invoke-virtual {p0, p1, p2}, Ld5$a;->a(Le5;Le5;)I

    move-result p1

    return p1
.end method
