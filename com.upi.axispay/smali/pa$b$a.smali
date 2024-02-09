.class public Lpa$b$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpa$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lwa;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lpa$b;Lwa;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lpa$b$a;->b:Lwa;

    iput-object p3, p0, Lpa$b$a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lpa$b$a;->b:Lwa;

    iget-object v1, p0, Lpa$b$a;->c:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lwa;->a(Ljava/lang/Object;)V

    return-void
.end method
