.class public Lgi$a$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgi$a;->binderDied()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lgi$a;


# direct methods
.method public constructor <init>(Lgi$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgi$a$b;->b:Lgi$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lgi$a$b;->b:Lgi$a;

    iget-object v1, v0, Lgi$a;->i:Lgi;

    invoke-virtual {v1, v0}, Lgi;->K(Lgi$a;)V

    return-void
.end method
