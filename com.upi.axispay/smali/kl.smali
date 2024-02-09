.class public abstract Lkl;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lmyunmn/z;->a()V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lkl;->a:I

    .line 3
    iput p2, p0, Lkl;->b:I

    return-void
.end method


# virtual methods
.method public abstract a(Lbm;)V
.end method
