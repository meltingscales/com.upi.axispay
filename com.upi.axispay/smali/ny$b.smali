.class public final Lny$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lub;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lny;->a(Landroid/view/View;Lny$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lny$d;

.field public final synthetic b:Lny$e;


# direct methods
.method public constructor <init>(Lny$d;Lny$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lny$b;->a:Lny$d;

    iput-object p2, p0, Lny$b;->b:Lny$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Lic;)Lic;
    .locals 3

    .line 1
    iget-object v0, p0, Lny$b;->a:Lny$d;

    new-instance v1, Lny$e;

    iget-object v2, p0, Lny$b;->b:Lny$e;

    invoke-direct {v1, v2}, Lny$e;-><init>(Lny$e;)V

    invoke-interface {v0, p1, p2, v1}, Lny$d;->a(Landroid/view/View;Lic;Lny$e;)Lic;

    return-object p2
.end method
