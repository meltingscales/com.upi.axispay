.class public Lre0$l;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre0;->H(Landroidx/viewpager/widget/ViewPager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lre0;


# direct methods
.method public constructor <init>(Lre0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lre0$l;->a:Lre0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/material/tabs/TabLayout$g;)V
    .locals 0

    return-void
.end method

.method public b(Lcom/google/android/material/tabs/TabLayout$g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lre0$l;->a:Lre0;

    invoke-static {v0}, Lre0;->x(Lre0;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$g;->g()I

    move-result p1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Ljg0;->T(Lcom/google/android/material/tabs/TabLayout;II)V

    return-void
.end method

.method public c(Lcom/google/android/material/tabs/TabLayout$g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lre0$l;->a:Lre0;

    invoke-static {v0}, Lre0;->x(Lre0;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$g;->g()I

    move-result p1

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Ljg0;->T(Lcom/google/android/material/tabs/TabLayout;II)V

    return-void
.end method
