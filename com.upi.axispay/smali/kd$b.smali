.class public Lkd$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lkd;


# direct methods
.method public constructor <init>(Lkd;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkd$b;->b:Lkd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lkd$b;->b:Lkd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkd;->J(I)V

    return-void
.end method
