.class public Lzz$a$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzz$a;->afterTextChanged(Landroid/text/Editable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/widget/AutoCompleteTextView;

.field public final synthetic c:Lzz$a;


# direct methods
.method public constructor <init>(Lzz$a;Landroid/widget/AutoCompleteTextView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzz$a$a;->c:Lzz$a;

    iput-object p2, p0, Lzz$a$a;->b:Landroid/widget/AutoCompleteTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lzz$a$a;->b:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    move-result v0

    .line 2
    iget-object v1, p0, Lzz$a$a;->c:Lzz$a;

    iget-object v1, v1, Lzz$a;->b:Lzz;

    invoke-static {v1, v0}, Lzz;->o(Lzz;Z)V

    .line 3
    iget-object v1, p0, Lzz$a$a;->c:Lzz$a;

    iget-object v1, v1, Lzz$a;->b:Lzz;

    invoke-static {v1, v0}, Lzz;->p(Lzz;Z)Z

    return-void
.end method
