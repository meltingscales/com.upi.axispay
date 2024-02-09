.class public Lhe0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhe0;->X(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lhe0;


# direct methods
.method public constructor <init>(Lhe0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhe0$a;->b:Lhe0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    iget-object p2, p0, Lhe0$a;->b:Lhe0;

    iget-object p2, p2, Lhe0;->R:Ljava/util/List;

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-lez p2, :cond_1

    .line 2
    :cond_0
    iget-object p2, p0, Lhe0$a;->b:Lhe0;

    invoke-static {p2}, Lhe0;->A(Lhe0;)I

    move-result v0

    iput v0, p2, Lhe0;->S:I

    .line 3
    iget-object p2, p0, Lhe0$a;->b:Lhe0;

    iget v0, p2, Lhe0;->S:I

    iget v1, p2, Lhe0;->T:I

    if-eq v0, v1, :cond_0

    .line 4
    iput v0, p2, Lhe0;->T:I

    .line 5
    iget-object v1, p2, Lhe0;->R:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p2, v0}, Lhe0;->B(Lhe0;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    :cond_1
    iget-object p2, p0, Lhe0$a;->b:Lhe0;

    invoke-static {p2}, Lhe0;->C(Lhe0;)V

    .line 7
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
