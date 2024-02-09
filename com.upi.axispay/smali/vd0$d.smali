.class public Lvd0$d;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/app/DatePickerDialog$OnDateSetListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvd0;->A(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lvd0;


# direct methods
.method public constructor <init>(Lvd0;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvd0$d;->c:Lvd0;

    iput p2, p0, Lvd0$d;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDateSet(Landroid/widget/DatePicker;III)V
    .locals 5

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 2
    invoke-virtual {p1, p2, p3, p4}, Ljava/util/Calendar;->set(III)V

    .line 3
    iget p1, p0, Lvd0$d;->b:I

    const/4 v0, 0x0

    const v1, 0x5a5

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x5a6

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    if-ne p1, v3, :cond_0

    .line 4
    iget-object p1, p0, Lvd0$d;->c:Lvd0;

    iget-object p1, p1, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array p4, v3, [Ljava/lang/Object;

    add-int/2addr p3, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p4, v0

    invoke-static {v1, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lvd0$d;->c:Lvd0;

    iget-object p1, p1, Lvd0;->s:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    .line 6
    iget-object p1, p0, Lvd0$d;->c:Lvd0;

    iget-object p1, p1, Lvd0;->t:Lcom/upi/axispay/custom/FloatingInputLayout;

    const p2, 0x5a7

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Lvd0$d;->c:Lvd0;

    iget-object p1, p1, Lvd0;->t:Lcom/upi/axispay/custom/FloatingInputLayout;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array p4, v3, [Ljava/lang/Object;

    add-int/2addr p3, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p4, v0

    invoke-static {v1, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/FloatingInputLayout;->setText(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lvd0$d;->c:Lvd0;

    iget-object p1, p1, Lvd0;->t:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    :goto_0
    return-void
.end method
