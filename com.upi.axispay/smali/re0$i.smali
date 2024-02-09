.class public Lre0$i;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre0;->J()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/app/AlertDialog;

.field public final synthetic c:Lre0;


# direct methods
.method public constructor <init>(Lre0;Landroid/app/AlertDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lre0$i;->c:Lre0;

    iput-object p2, p0, Lre0$i;->b:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lre0$i;->c:Lre0;

    iget-object v0, p1, Lre0;->r:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Lre0;->K(Ljava/util/ArrayList;)V

    .line 2
    iget-object p1, p0, Lre0$i;->b:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->dismiss()V

    return-void
.end method
