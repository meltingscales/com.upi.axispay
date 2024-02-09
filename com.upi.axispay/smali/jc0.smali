.class public final synthetic Ljc0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lre0;

.field public final synthetic c:Landroid/widget/Spinner;

.field public final synthetic d:Landroid/widget/Spinner;

.field public final synthetic e:Landroid/widget/Spinner;

.field public final synthetic f:Landroid/widget/Spinner;

.field public final synthetic g:Landroid/app/AlertDialog;


# direct methods
.method public synthetic constructor <init>(Lre0;Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/app/AlertDialog;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljc0;->b:Lre0;

    iput-object p2, p0, Ljc0;->c:Landroid/widget/Spinner;

    iput-object p3, p0, Ljc0;->d:Landroid/widget/Spinner;

    iput-object p4, p0, Ljc0;->e:Landroid/widget/Spinner;

    iput-object p5, p0, Ljc0;->f:Landroid/widget/Spinner;

    iput-object p6, p0, Ljc0;->g:Landroid/app/AlertDialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    iget-object v0, p0, Ljc0;->b:Lre0;

    iget-object v1, p0, Ljc0;->c:Landroid/widget/Spinner;

    iget-object v2, p0, Ljc0;->d:Landroid/widget/Spinner;

    iget-object v3, p0, Ljc0;->e:Landroid/widget/Spinner;

    iget-object v4, p0, Ljc0;->f:Landroid/widget/Spinner;

    iget-object v5, p0, Ljc0;->g:Landroid/app/AlertDialog;

    move-object v6, p1

    invoke-virtual/range {v0 .. v6}, Lre0;->E(Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/app/AlertDialog;Landroid/view/View;)V

    return-void
.end method
