.class public Le00$c$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le00$c;->a(Lcom/google/android/material/textfield/TextInputLayout;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/widget/EditText;

.field public final synthetic c:Le00$c;


# direct methods
.method public constructor <init>(Le00$c;Landroid/widget/EditText;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le00$c$a;->c:Le00$c;

    iput-object p2, p0, Le00$c$a;->b:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le00$c$a;->b:Landroid/widget/EditText;

    iget-object v1, p0, Le00$c$a;->c:Le00$c;

    iget-object v1, v1, Le00$c;->a:Le00;

    invoke-static {v1}, Le00;->f(Le00;)Landroid/text/TextWatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method
