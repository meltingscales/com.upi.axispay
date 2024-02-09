.class public Lhi$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lhi;


# direct methods
.method public constructor <init>(Lhi;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhi$b;->b:Lhi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lhi$b;->b:Lhi;

    invoke-virtual {v0}, Lhi;->g()V

    return-void
.end method
