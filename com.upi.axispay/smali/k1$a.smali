.class public Lk1$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lfb$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk1;->a(Lfb;)Lw9;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lk1;


# direct methods
.method public constructor <init>(Lk1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk1$a;->a:Lk1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActionProviderVisibilityChanged(Z)V
    .locals 1

    .line 1
    iget-object p1, p0, Lk1$a;->a:Lk1;

    iget-object v0, p1, Lk1;->n:Li1;

    invoke-virtual {v0, p1}, Li1;->L(Lk1;)V

    return-void
.end method
