.class public Lkf0$d;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/app/DatePickerDialog$OnDateSetListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkf0;->C()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lkf0;


# direct methods
.method public constructor <init>(Lkf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkf0$d;->b:Lkf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDateSet(Landroid/widget/DatePicker;III)V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 2
    invoke-virtual {p1, p2, p3, p4}, Ljava/util/Calendar;->set(III)V

    .line 3
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    const/4 p3, 0x5

    const/4 p4, 0x1

    .line 4
    invoke-virtual {p2, p3, p4}, Ljava/util/Calendar;->add(II)V

    .line 5
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p4

    const/16 v0, 0x2d

    .line 6
    invoke-virtual {p4, p3, v0}, Ljava/util/Calendar;->add(II)V

    .line 7
    invoke-virtual {p2, p1}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    move-result p2

    const p3, 0x135b

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    if-gez p2, :cond_0

    invoke-virtual {p4, p1}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    move-result p2

    if-lez p2, :cond_0

    .line 8
    iget-object p2, p0, Lkf0$d;->b:Lkf0;

    invoke-static {p2}, Lkf0;->y(Lkf0;)Landroid/widget/EditText;

    move-result-object p2

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-static {p1, p3}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object p1, p0, Lkf0$d;->b:Lkf0;

    invoke-static {p1}, Lkf0;->y(Lkf0;)Landroid/widget/EditText;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setVisibility(I)V

    goto :goto_0

    .line 10
    :cond_0
    iget-object p2, p0, Lkf0$d;->b:Lkf0;

    invoke-static {p2}, Lkf0;->y(Lkf0;)Landroid/widget/EditText;

    move-result-object p2

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-static {p1, p3}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method
