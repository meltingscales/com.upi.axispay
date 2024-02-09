.class public Ld7$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld7;->onAttachedToWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ld7;


# direct methods
.method public constructor <init>(Ld7;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld7$a;->b:Ld7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld7$a;->b:Ld7;

    invoke-static {v0}, Ld7;->B(Ld7;)Ld7$e;

    move-result-object v0

    invoke-virtual {v0}, Ld7$e;->a()V

    return-void
.end method
