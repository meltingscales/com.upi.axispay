.class public Ll0$d;
.super Ll0$g;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:Ldo;


# direct methods
.method public constructor <init>(Ldo;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Ll0$g;-><init>(Ll0$a;)V

    .line 2
    iput-object p1, p0, Ll0$d;->a:Ldo;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll0$d;->a:Ldo;

    invoke-virtual {v0}, Ldo;->start()V

    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll0$d;->a:Ldo;

    invoke-virtual {v0}, Ldo;->stop()V

    return-void
.end method
