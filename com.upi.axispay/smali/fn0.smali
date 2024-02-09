.class public final Lfn0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lhn0;
.implements Lgn0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lhn0<",
        "TT;>;",
        "Lgn0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lhn0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:I


# direct methods
.method public constructor <init>(Lhn0;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn0<",
            "+TT;>;I)V"
        }
    .end annotation

    const v0, 0x3d76

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lfn0;->a:Lhn0;

    .line 3
    iput p2, p0, Lfn0;->b:I

    if-ltz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    return-void

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x3d77

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static final synthetic b(Lfn0;)I
    .locals 0

    .line 1
    iget p0, p0, Lfn0;->b:I

    return p0
.end method

.method public static final synthetic c(Lfn0;)Lhn0;
    .locals 0

    .line 1
    iget-object p0, p0, Lfn0;->a:Lhn0;

    return-object p0
.end method


# virtual methods
.method public a(I)Lhn0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lhn0<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lfn0;->b:I

    add-int/2addr v0, p1

    if-gez v0, :cond_0

    new-instance v0, Lfn0;

    invoke-direct {v0, p0, p1}, Lfn0;-><init>(Lhn0;I)V

    goto :goto_0

    :cond_0
    new-instance p1, Lfn0;

    iget-object v1, p0, Lfn0;->a:Lhn0;

    invoke-direct {p1, v1, v0}, Lfn0;-><init>(Lhn0;I)V

    move-object v0, p1

    :goto_0
    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lfn0$a;

    invoke-direct {v0, p0}, Lfn0$a;-><init>(Lfn0;)V

    return-object v0
.end method
