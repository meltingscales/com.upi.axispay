.class public final synthetic Ldp;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lrr;


# instance fields
.field public final synthetic a:Lfp;


# direct methods
.method public synthetic constructor <init>(Lfp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldp;->a:Lfp;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldp;->a:Lfp;

    check-cast p1, Lfp$a;

    invoke-static {v0, p1}, Lfp;->j(Lfp;Lfp$a;)Lfp$b;

    move-result-object p1

    return-object p1
.end method
