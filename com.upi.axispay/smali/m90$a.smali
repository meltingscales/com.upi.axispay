.class public Lm90$a;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm90;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public v:Landroid/widget/CheckedTextView;

.field public final synthetic w:Lm90;


# direct methods
.method public constructor <init>(Lm90;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm90$a;->w:Lm90;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    const p1, 0x7f0a01db

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckedTextView;

    iput-object p1, p0, Lm90$a;->v:Landroid/widget/CheckedTextView;

    .line 4
    invoke-virtual {p1, p0}, Landroid/widget/CheckedTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public O(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm90$a;->w:Lm90;

    iget-object v0, v0, Lm90;->e:Landroid/util/SparseBooleanArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lm90$a;->v:Landroid/widget/CheckedTextView;

    invoke-virtual {v0, v1}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lm90$a;->v:Landroid/widget/CheckedTextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 4
    :goto_0
    iget-object v0, p0, Lm90$a;->v:Landroid/widget/CheckedTextView;

    iget-object v1, p0, Lm90$a;->w:Lm90;

    iget-object v1, v1, Lm90;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/CheckedTextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->k()I

    move-result p1

    .line 2
    iget-object v0, p0, Lm90$a;->w:Lm90;

    iget-object v0, v0, Lm90;->e:Landroid/util/SparseBooleanArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lm90$a;->v:Landroid/widget/CheckedTextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 4
    iget-object v0, p0, Lm90$a;->w:Lm90;

    iget-object v0, v0, Lm90;->e:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lm90$a;->v:Landroid/widget/CheckedTextView;

    invoke-virtual {v0, v1}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 6
    iget-object v0, p0, Lm90$a;->w:Lm90;

    iget-object v0, v0, Lm90;->e:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    :goto_0
    return-void
.end method
