.class public Lg0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lg0;


# direct methods
.method public constructor <init>(Lg0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg0$a;->b:Lg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lg0$a;->b:Lg0;

    invoke-virtual {v0}, Lg0;->B()V

    return-void
.end method
