.class public final Lfp$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/net/URL;

.field public final b:Lqp;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/net/URL;Lqp;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lfp$a;->a:Ljava/net/URL;

    .line 3
    iput-object p2, p0, Lfp$a;->b:Lqp;

    .line 4
    iput-object p3, p0, Lfp$a;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Ljava/net/URL;)Lfp$a;
    .locals 3

    .line 1
    new-instance v0, Lfp$a;

    iget-object v1, p0, Lfp$a;->b:Lqp;

    iget-object v2, p0, Lfp$a;->c:Ljava/lang/String;

    invoke-direct {v0, p1, v1, v2}, Lfp$a;-><init>(Ljava/net/URL;Lqp;Ljava/lang/String;)V

    return-object v0
.end method
