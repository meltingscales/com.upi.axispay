.class public Lyi$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lyi;


# direct methods
.method public constructor <init>(Lyi;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyi$a;->b:Lyi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyi$a;->b:Lyi;

    const/16 v1, 0x1f4

    invoke-virtual {v0, v1}, Lyi;->k(I)V

    return-void
.end method
