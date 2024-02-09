.class public final synthetic Li70;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ln70;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Ln70;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li70;->b:Ln70;

    iput-object p2, p0, Li70;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Li70;->b:Ln70;

    iget-object v1, p0, Li70;->c:Landroid/content/Context;

    invoke-static {v0, v1}, Ln70;->n(Ln70;Landroid/content/Context;)V

    return-void
.end method
