.class public Lre0$o;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre0;->G(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lre0;


# direct methods
.method public constructor <init>(Lre0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lre0$o;->b:Lre0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lre0$o;->b:Lre0;

    invoke-virtual {v0, p1}, Lre0;->A(Landroid/view/View;)V

    return-void
.end method
