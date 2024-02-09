.class public Lb9$c$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb9$c;->a(ILandroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lb9$c;


# direct methods
.method public constructor <init>(Lb9$c;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb9$c$b;->c:Lb9$c;

    iput p2, p0, Lb9$c$b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lb9$c$b;->c:Lb9$c;

    iget v1, p0, Lb9$c$b;->b:I

    invoke-virtual {v0, v1}, Lb9$c;->d(I)V

    return-void
.end method
