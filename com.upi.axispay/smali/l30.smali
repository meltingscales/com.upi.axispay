.class public abstract Ll30;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final b:Ll30;


# instance fields
.field public final a:Ll30;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lj30;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lj30;-><init>(Ll30;II)V

    sput-object v0, Ll30;->b:Ll30;

    return-void
.end method

.method public constructor <init>(Ll30;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ll30;->a:Ll30;

    return-void
.end method


# virtual methods
.method public final a(II)Ll30;
    .locals 1

    .line 1
    new-instance v0, Lj30;

    invoke-direct {v0, p0, p1, p2}, Lj30;-><init>(Ll30;II)V

    return-object v0
.end method

.method public final b(II)Ll30;
    .locals 1

    .line 1
    new-instance v0, Lg30;

    invoke-direct {v0, p0, p1, p2}, Lg30;-><init>(Ll30;II)V

    return-object v0
.end method

.method public abstract c(Lm30;[B)V
.end method

.method public final d()Ll30;
    .locals 1

    .line 1
    iget-object v0, p0, Ll30;->a:Ll30;

    return-object v0
.end method
