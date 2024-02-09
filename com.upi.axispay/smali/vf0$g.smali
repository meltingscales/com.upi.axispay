.class public Lvf0$g;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvf0;->z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lvf0;


# direct methods
.method public constructor <init>(Lvf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvf0$g;->a:Lvf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 1
    iget-object p1, p0, Lvf0$g;->a:Lvf0;

    iget-object p1, p1, Lvf0;->o:Landroid/widget/EditText;

    const p2, 0x31f3

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object p1, p0, Lvf0$g;->a:Lvf0;

    iget-object p1, p1, Lvf0;->p:Landroid/widget/EditText;

    const p2, 0x31f4

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object p1, p0, Lvf0$g;->a:Lvf0;

    iget-object p1, p1, Lvf0;->o:Landroid/widget/EditText;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 4
    iget-object p1, p0, Lvf0$g;->a:Lvf0;

    iget-object p1, p1, Lvf0;->p:Landroid/widget/EditText;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setEnabled(Z)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lvf0$g;->a:Lvf0;

    iget-object p1, p1, Lvf0;->o:Landroid/widget/EditText;

    const p2, 0x31f5

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p0, Lvf0$g;->a:Lvf0;

    iget-object p1, p1, Lvf0;->p:Landroid/widget/EditText;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object p1, p0, Lvf0$g;->a:Lvf0;

    iget-object p1, p1, Lvf0;->o:Landroid/widget/EditText;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setEnabled(Z)V

    .line 8
    iget-object p1, p0, Lvf0$g;->a:Lvf0;

    iget-object p1, p1, Lvf0;->p:Landroid/widget/EditText;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setEnabled(Z)V

    :goto_0
    return-void
.end method
