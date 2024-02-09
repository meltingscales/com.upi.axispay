.class public final Lrn0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lhn0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhn0<",
        "Lrm0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:I

.field public final c:I

.field public final d:Lhl0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhl0<",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/Integer;",
            "Lgi0<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILhl0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "II",
            "Lhl0<",
            "-",
            "Ljava/lang/CharSequence;",
            "-",
            "Ljava/lang/Integer;",
            "Lgi0<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    const v0, 0x2c3c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x2c3d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p4, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lrn0;->a:Ljava/lang/CharSequence;

    .line 3
    iput p2, p0, Lrn0;->b:I

    .line 4
    iput p3, p0, Lrn0;->c:I

    .line 5
    iput-object p4, p0, Lrn0;->d:Lhl0;

    return-void
.end method

.method public static final synthetic b(Lrn0;)Lhl0;
    .locals 0

    .line 1
    iget-object p0, p0, Lrn0;->d:Lhl0;

    return-object p0
.end method

.method public static final synthetic c(Lrn0;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lrn0;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static final synthetic d(Lrn0;)I
    .locals 0

    .line 1
    iget p0, p0, Lrn0;->c:I

    return p0
.end method

.method public static final synthetic e(Lrn0;)I
    .locals 0

    .line 1
    iget p0, p0, Lrn0;->b:I

    return p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lrm0;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lrn0$a;

    invoke-direct {v0, p0}, Lrn0$a;-><init>(Lrn0;)V

    return-object v0
.end method
