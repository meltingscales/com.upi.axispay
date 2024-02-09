.class public final synthetic Lyj;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lvk;

.field public final synthetic c:Lem;

.field public final synthetic d:Lyk;


# direct methods
.method public synthetic constructor <init>(Lvk;Lem;Lyk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyj;->b:Lvk;

    iput-object p2, p0, Lyj;->c:Lem;

    iput-object p3, p0, Lyj;->d:Lyk;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lyj;->b:Lvk;

    iget-object v1, p0, Lyj;->c:Lem;

    iget-object v2, p0, Lyj;->d:Lyk;

    invoke-virtual {v0, v1, v2}, Lvk;->S(Lem;Lyk;)V

    return-void
.end method
