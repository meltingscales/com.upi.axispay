.class public Lr3$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lr3;


# direct methods
.method public constructor <init>(Lr3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr3$a;->b:Lr3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr3$a;->b:Lr3;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lr3;->g(Z)V

    return-void
.end method
