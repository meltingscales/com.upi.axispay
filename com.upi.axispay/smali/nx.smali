.class public Lnx;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnx$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lnx$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final d:Lcx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcx<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcx;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcx<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    .line 2
    iput-object p1, p0, Lnx;->d:Lcx;

    return-void
.end method

.method public static synthetic w(Lnx;)Lcx;
    .locals 0

    .line 1
    iget-object p0, p0, Lnx;->d:Lcx;

    return-object p0
.end method


# virtual methods
.method public A(Lnx$b;I)V
    .locals 7

    .line 1
    invoke-virtual {p0, p2}, Lnx;->z(I)I

    move-result p2

    .line 2
    iget-object v0, p1, Lnx$b;->v:Landroid/widget/TextView;

    .line 3
    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lqv;->mtrl_picker_navigate_to_year_description:I

    .line 4
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    iget-object v1, p1, Lnx$b;->v:Landroid/widget/TextView;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const v5, 0x375b

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v1, p1, Lnx$b;->v:Landroid/widget/TextView;

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v6

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v0, p0, Lnx;->d:Lcx;

    invoke-virtual {v0}, Lcx;->w()Lyw;

    move-result-object v0

    .line 8
    invoke-static {}, Lmx;->o()Ljava/util/Calendar;

    move-result-object v1

    .line 9
    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v2

    if-ne v2, p2, :cond_0

    iget-object v2, v0, Lyw;->f:Lxw;

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lyw;->d:Lxw;

    .line 10
    :goto_0
    iget-object v4, p0, Lnx;->d:Lcx;

    invoke-virtual {v4}, Lcx;->y()Lcom/google/android/material/datepicker/DateSelector;

    move-result-object v4

    invoke-interface {v4}, Lcom/google/android/material/datepicker/DateSelector;->w()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    .line 11
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v1, v5, v6}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 12
    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v5

    if-ne v5, p2, :cond_1

    .line 13
    iget-object v2, v0, Lyw;->e:Lxw;

    goto :goto_1

    .line 14
    :cond_2
    iget-object v0, p1, Lnx$b;->v:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Lxw;->d(Landroid/widget/TextView;)V

    .line 15
    iget-object p1, p1, Lnx$b;->v:Landroid/widget/TextView;

    invoke-virtual {p0, p2}, Lnx;->x(I)Landroid/view/View$OnClickListener;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public B(Landroid/view/ViewGroup;I)Lnx$b;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lov;->mtrl_calendar_year:I

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 3
    new-instance p2, Lnx$b;

    invoke-direct {p2, p1}, Lnx$b;-><init>(Landroid/widget/TextView;)V

    return-object p2
.end method

.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lnx;->d:Lcx;

    invoke-virtual {v0}, Lcx;->v()Lcom/google/android/material/datepicker/CalendarConstraints;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/CalendarConstraints;->o()I

    move-result v0

    return v0
.end method

.method public bridge synthetic l(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    .line 1
    check-cast p1, Lnx$b;

    invoke-virtual {p0, p1, p2}, Lnx;->A(Lnx$b;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lnx;->B(Landroid/view/ViewGroup;I)Lnx$b;

    move-result-object p1

    return-object p1
.end method

.method public final x(I)Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    new-instance v0, Lnx$a;

    invoke-direct {v0, p0, p1}, Lnx$a;-><init>(Lnx;I)V

    return-object v0
.end method

.method public y(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lnx;->d:Lcx;

    invoke-virtual {v0}, Lcx;->v()Lcom/google/android/material/datepicker/CalendarConstraints;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/CalendarConstraints;->n()Lcom/google/android/material/datepicker/Month;

    move-result-object v0

    iget v0, v0, Lcom/google/android/material/datepicker/Month;->d:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public z(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lnx;->d:Lcx;

    invoke-virtual {v0}, Lcx;->v()Lcom/google/android/material/datepicker/CalendarConstraints;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/CalendarConstraints;->n()Lcom/google/android/material/datepicker/Month;

    move-result-object v0

    iget v0, v0, Lcom/google/android/material/datepicker/Month;->d:I

    add-int/2addr v0, p1

    return v0
.end method
