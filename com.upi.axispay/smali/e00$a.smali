.class public Le00$a;
.super Lky;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le00;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Le00;


# direct methods
.method public constructor <init>(Le00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le00$a;->b:Le00;

    invoke-direct {p0}, Lky;-><init>()V

    return-void
.end method


# virtual methods
.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget-object p1, p0, Le00$a;->b:Le00;

    iget-object p2, p1, La00;->c:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {p1}, Le00;->e(Le00;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    return-void
.end method
