.class public Lke$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lke;->o(Landroid/view/ViewGroup;Lke$h;Landroid/view/View;Lo4;Lke$g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lke$g;

.field public final synthetic c:Landroidx/fragment/app/Fragment;

.field public final synthetic d:Laa;


# direct methods
.method public constructor <init>(Lke$g;Landroidx/fragment/app/Fragment;Laa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lke$a;->b:Lke$g;

    iput-object p2, p0, Lke$a;->c:Landroidx/fragment/app/Fragment;

    iput-object p3, p0, Lke$a;->d:Laa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lke$a;->b:Lke$g;

    iget-object v1, p0, Lke$a;->c:Landroidx/fragment/app/Fragment;

    iget-object v2, p0, Lke$a;->d:Laa;

    invoke-interface {v0, v1, v2}, Lke$g;->a(Landroidx/fragment/app/Fragment;Laa;)V

    return-void
.end method
