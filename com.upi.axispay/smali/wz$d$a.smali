.class public Lwz$d$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwz$d;->a(Lcom/google/android/material/textfield/TextInputLayout;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/widget/EditText;

.field public final synthetic c:Lwz$d;


# direct methods
.method public constructor <init>(Lwz$d;Landroid/widget/EditText;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwz$d$a;->c:Lwz$d;

    iput-object p2, p0, Lwz$d$a;->b:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lwz$d$a;->b:Landroid/widget/EditText;

    iget-object v1, p0, Lwz$d$a;->c:Lwz$d;

    iget-object v1, v1, Lwz$d;->a:Lwz;

    invoke-static {v1}, Lwz;->h(Lwz;)Landroid/text/TextWatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method
