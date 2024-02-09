.class public Ljf0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljf0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljf0;


# direct methods
.method public constructor <init>(Ljf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ljf0$a;->b:Ljf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Ljf0$a;->b:Ljf0;

    iget-object p1, p1, Ljf0;->o:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    .line 2
    iget-object p1, p0, Ljf0$a;->b:Ljf0;

    const/4 v0, 0x1

    iput-boolean v0, p1, Ljf0;->w:Z

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p1, Ljf0;->x:Z

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
