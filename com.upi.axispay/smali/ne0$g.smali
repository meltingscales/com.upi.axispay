.class public Lne0$g;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lne0;->D(Landroidx/viewpager/widget/ViewPager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lne0;


# direct methods
.method public constructor <init>(Lne0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lne0$g;->a:Lne0;

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
    iget-object v0, p0, Lne0$g;->a:Lne0;

    invoke-static {v0}, Lne0;->x(Lne0;)Lcom/google/android/material/tabs/TabLayout;

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
    iget-object v0, p0, Lne0$g;->a:Lne0;

    invoke-static {v0}, Lne0;->x(Lne0;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$g;->g()I

    move-result p1

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Ljg0;->T(Lcom/google/android/material/tabs/TabLayout;II)V

    return-void
.end method
