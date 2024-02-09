.class public Ly2$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic b:Ly2;


# direct methods
.method public constructor <init>(Ly2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly2$b;->b:Ly2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly2$b;->b:Ly2;

    invoke-virtual {v0}, Ly2;->e()V

    return-void
.end method
