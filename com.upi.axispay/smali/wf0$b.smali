.class public Lwf0$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwf0;->J(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lwf0;


# direct methods
.method public constructor <init>(Lwf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwf0$b;->a:Lwf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 1

    .line 1
    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    .line 2
    iget-object v0, p0, Lwf0$b;->a:Lwf0;

    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    invoke-static {v0, p1}, Lwf0;->E(Lwf0;I)I

    .line 3
    iget-object p1, p0, Lwf0$b;->a:Lwf0;

    invoke-static {p1}, Lwf0;->y(Lwf0;)Landroid/widget/EditText;

    move-result-object p1

    iget-object p2, p0, Lwf0$b;->a:Lwf0;

    invoke-static {p2}, Lwf0;->B(Lwf0;)Ljava/util/ArrayList;

    move-result-object p2

    iget-object v0, p0, Lwf0$b;->a:Lwf0;

    invoke-static {v0}, Lwf0;->D(Lwf0;)I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const v0, 0xdfa

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    aget-object p2, p2, v0

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object p1, p0, Lwf0$b;->a:Lwf0;

    invoke-static {p1}, Lwf0;->F(Lwf0;)I

    move-result p2

    invoke-virtual {p1, p2}, Lwf0;->L(I)V

    return-void
.end method
