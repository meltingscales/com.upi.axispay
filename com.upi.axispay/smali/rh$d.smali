.class public Lrh$d;
.super Luh$e;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lrh$c;


# direct methods
.method public constructor <init>(Lrh;Ljava/lang/String;Lrh$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Luh$e;-><init>()V

    .line 2
    iput-object p2, p0, Lrh$d;->a:Ljava/lang/String;

    .line 3
    iput-object p3, p0, Lrh$d;->b:Lrh$c;

    return-void
.end method


# virtual methods
.method public f(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lrh$d;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lrh$d;->b:Lrh$c;

    if-nez v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v1, v0, p1}, Lrh$c;->v(Ljava/lang/String;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public i(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lrh$d;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lrh$d;->b:Lrh$c;

    if-nez v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v1, v0, p1}, Lrh$c;->w(Ljava/lang/String;I)V

    :cond_1
    :goto_0
    return-void
.end method
