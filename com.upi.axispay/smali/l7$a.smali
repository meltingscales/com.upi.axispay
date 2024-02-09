.class public Ll7$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll7$a$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public final c:Ll7$d;

.field public final d:Ll7$c;

.field public final e:Ll7$b;

.field public final f:Ll7$e;

.field public g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Li7;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ll7$a$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ll7$d;

    invoke-direct {v0}, Ll7$d;-><init>()V

    iput-object v0, p0, Ll7$a;->c:Ll7$d;

    .line 3
    new-instance v0, Ll7$c;

    invoke-direct {v0}, Ll7$c;-><init>()V

    iput-object v0, p0, Ll7$a;->d:Ll7$c;

    .line 4
    new-instance v0, Ll7$b;

    invoke-direct {v0}, Ll7$b;-><init>()V

    iput-object v0, p0, Ll7$a;->e:Ll7$b;

    .line 5
    new-instance v0, Ll7$e;

    invoke-direct {v0}, Ll7$e;-><init>()V

    iput-object v0, p0, Ll7$a;->f:Ll7$e;

    .line 6
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll7$a;->g:Ljava/util/HashMap;

    return-void
.end method

.method public static synthetic a(Ll7$a;ILandroidx/constraintlayout/widget/ConstraintLayout$b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ll7$a;->f(ILandroidx/constraintlayout/widget/ConstraintLayout$b;)V

    return-void
.end method

.method public static synthetic b(Ll7$a;Lj7;ILm7$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Ll7$a;->h(Lj7;ILm7$a;)V

    return-void
.end method

.method public static synthetic c(Ll7$a;ILm7$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ll7$a;->g(ILm7$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ll7$a;->e()Ll7$a;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroidx/constraintlayout/widget/ConstraintLayout$b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ll7$a;->e:Ll7$b;

    iget v1, v0, Ll7$b;->i:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->e:I

    .line 2
    iget v1, v0, Ll7$b;->j:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->f:I

    .line 3
    iget v1, v0, Ll7$b;->k:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->g:I

    .line 4
    iget v1, v0, Ll7$b;->l:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->h:I

    .line 5
    iget v1, v0, Ll7$b;->m:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->i:I

    .line 6
    iget v1, v0, Ll7$b;->n:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->j:I

    .line 7
    iget v1, v0, Ll7$b;->o:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->k:I

    .line 8
    iget v1, v0, Ll7$b;->p:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->l:I

    .line 9
    iget v1, v0, Ll7$b;->q:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->m:I

    .line 10
    iget v1, v0, Ll7$b;->r:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->n:I

    .line 11
    iget v1, v0, Ll7$b;->s:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->o:I

    .line 12
    iget v1, v0, Ll7$b;->t:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->s:I

    .line 13
    iget v1, v0, Ll7$b;->u:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->t:I

    .line 14
    iget v1, v0, Ll7$b;->v:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->u:I

    .line 15
    iget v1, v0, Ll7$b;->w:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->v:I

    .line 16
    iget v1, v0, Ll7$b;->G:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 17
    iget v1, v0, Ll7$b;->H:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 18
    iget v1, v0, Ll7$b;->I:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 19
    iget v1, v0, Ll7$b;->J:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 20
    iget v1, v0, Ll7$b;->S:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->A:I

    .line 21
    iget v1, v0, Ll7$b;->R:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->B:I

    .line 22
    iget v1, v0, Ll7$b;->O:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->x:I

    .line 23
    iget v1, v0, Ll7$b;->Q:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->z:I

    .line 24
    iget v1, v0, Ll7$b;->x:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->E:F

    .line 25
    iget v0, v0, Ll7$b;->y:F

    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->F:F

    .line 26
    iget-object v0, p0, Ll7$a;->e:Ll7$b;

    iget v1, v0, Ll7$b;->A:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->p:I

    .line 27
    iget v1, v0, Ll7$b;->B:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->q:I

    .line 28
    iget v1, v0, Ll7$b;->C:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->r:F

    .line 29
    iget-object v1, v0, Ll7$b;->z:Ljava/lang/String;

    iput-object v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->G:Ljava/lang/String;

    .line 30
    iget v1, v0, Ll7$b;->D:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->V:I

    .line 31
    iget v1, v0, Ll7$b;->E:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->W:I

    .line 32
    iget v1, v0, Ll7$b;->U:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->K:F

    .line 33
    iget v1, v0, Ll7$b;->V:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->J:F

    .line 34
    iget v1, v0, Ll7$b;->X:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->M:I

    .line 35
    iget v1, v0, Ll7$b;->W:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->L:I

    .line 36
    iget-boolean v1, v0, Ll7$b;->m0:Z

    iput-boolean v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->Y:Z

    .line 37
    iget-boolean v1, v0, Ll7$b;->n0:Z

    iput-boolean v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->Z:Z

    .line 38
    iget v1, v0, Ll7$b;->Y:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->N:I

    .line 39
    iget v1, v0, Ll7$b;->Z:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->O:I

    .line 40
    iget v1, v0, Ll7$b;->a0:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->R:I

    .line 41
    iget v1, v0, Ll7$b;->b0:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->S:I

    .line 42
    iget v1, v0, Ll7$b;->c0:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->P:I

    .line 43
    iget v1, v0, Ll7$b;->d0:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->Q:I

    .line 44
    iget v1, v0, Ll7$b;->e0:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->T:F

    .line 45
    iget v1, v0, Ll7$b;->f0:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->U:F

    .line 46
    iget v1, v0, Ll7$b;->F:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->X:I

    .line 47
    iget v1, v0, Ll7$b;->g:F

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->c:F

    .line 48
    iget v1, v0, Ll7$b;->e:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a:I

    .line 49
    iget v1, v0, Ll7$b;->f:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->b:I

    .line 50
    iget v0, v0, Ll7$b;->c:I

    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 51
    iget-object v0, p0, Ll7$a;->e:Ll7$b;

    iget v1, v0, Ll7$b;->d:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 52
    iget-object v1, v0, Ll7$b;->l0:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 53
    iput-object v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a0:Ljava/lang/String;

    .line 54
    :cond_0
    iget v1, v0, Ll7$b;->p0:I

    iput v1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->b0:I

    .line 55
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-lt v1, v2, :cond_1

    .line 56
    iget v0, v0, Ll7$b;->L:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 57
    iget-object v0, p0, Ll7$a;->e:Ll7$b;

    iget v0, v0, Ll7$b;->K:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 58
    :cond_1
    invoke-virtual {p1}, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a()V

    return-void
.end method

.method public e()Ll7$a;
    .locals 3

    .line 1
    new-instance v0, Ll7$a;

    invoke-direct {v0}, Ll7$a;-><init>()V

    .line 2
    iget-object v1, v0, Ll7$a;->e:Ll7$b;

    iget-object v2, p0, Ll7$a;->e:Ll7$b;

    invoke-virtual {v1, v2}, Ll7$b;->a(Ll7$b;)V

    .line 3
    iget-object v1, v0, Ll7$a;->d:Ll7$c;

    iget-object v2, p0, Ll7$a;->d:Ll7$c;

    invoke-virtual {v1, v2}, Ll7$c;->a(Ll7$c;)V

    .line 4
    iget-object v1, v0, Ll7$a;->c:Ll7$d;

    iget-object v2, p0, Ll7$a;->c:Ll7$d;

    invoke-virtual {v1, v2}, Ll7$d;->a(Ll7$d;)V

    .line 5
    iget-object v1, v0, Ll7$a;->f:Ll7$e;

    iget-object v2, p0, Ll7$a;->f:Ll7$e;

    invoke-virtual {v1, v2}, Ll7$e;->a(Ll7$e;)V

    .line 6
    iget v1, p0, Ll7$a;->a:I

    iput v1, v0, Ll7$a;->a:I

    .line 7
    iget-object v1, p0, Ll7$a;->h:Ll7$a$a;

    iput-object v1, v0, Ll7$a;->h:Ll7$a$a;

    return-object v0
.end method

.method public final f(ILandroidx/constraintlayout/widget/ConstraintLayout$b;)V
    .locals 2

    .line 1
    iput p1, p0, Ll7$a;->a:I

    .line 2
    iget-object p1, p0, Ll7$a;->e:Ll7$b;

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->e:I

    iput v0, p1, Ll7$b;->i:I

    .line 3
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->f:I

    iput v0, p1, Ll7$b;->j:I

    .line 4
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->g:I

    iput v0, p1, Ll7$b;->k:I

    .line 5
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->h:I

    iput v0, p1, Ll7$b;->l:I

    .line 6
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->i:I

    iput v0, p1, Ll7$b;->m:I

    .line 7
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->j:I

    iput v0, p1, Ll7$b;->n:I

    .line 8
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->k:I

    iput v0, p1, Ll7$b;->o:I

    .line 9
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->l:I

    iput v0, p1, Ll7$b;->p:I

    .line 10
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->m:I

    iput v0, p1, Ll7$b;->q:I

    .line 11
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->n:I

    iput v0, p1, Ll7$b;->r:I

    .line 12
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->o:I

    iput v0, p1, Ll7$b;->s:I

    .line 13
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->s:I

    iput v0, p1, Ll7$b;->t:I

    .line 14
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->t:I

    iput v0, p1, Ll7$b;->u:I

    .line 15
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->u:I

    iput v0, p1, Ll7$b;->v:I

    .line 16
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->v:I

    iput v0, p1, Ll7$b;->w:I

    .line 17
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->E:F

    iput v0, p1, Ll7$b;->x:F

    .line 18
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->F:F

    iput v0, p1, Ll7$b;->y:F

    .line 19
    iget-object v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->G:Ljava/lang/String;

    iput-object v0, p1, Ll7$b;->z:Ljava/lang/String;

    .line 20
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->p:I

    iput v0, p1, Ll7$b;->A:I

    .line 21
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->q:I

    iput v0, p1, Ll7$b;->B:I

    .line 22
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->r:F

    iput v0, p1, Ll7$b;->C:F

    .line 23
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->V:I

    iput v0, p1, Ll7$b;->D:I

    .line 24
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->W:I

    iput v0, p1, Ll7$b;->E:I

    .line 25
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->X:I

    iput v0, p1, Ll7$b;->F:I

    .line 26
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->c:F

    iput v0, p1, Ll7$b;->g:F

    .line 27
    iget-object p1, p0, Ll7$a;->e:Ll7$b;

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a:I

    iput v0, p1, Ll7$b;->e:I

    .line 28
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->b:I

    iput v0, p1, Ll7$b;->f:I

    .line 29
    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput v0, p1, Ll7$b;->c:I

    .line 30
    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput v0, p1, Ll7$b;->d:I

    .line 31
    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v0, p1, Ll7$b;->G:I

    .line 32
    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v0, p1, Ll7$b;->H:I

    .line 33
    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v0, p1, Ll7$b;->I:I

    .line 34
    iget v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v0, p1, Ll7$b;->J:I

    .line 35
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->D:I

    iput v0, p1, Ll7$b;->M:I

    .line 36
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->K:F

    iput v0, p1, Ll7$b;->U:F

    .line 37
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->J:F

    iput v0, p1, Ll7$b;->V:F

    .line 38
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->M:I

    iput v0, p1, Ll7$b;->X:I

    .line 39
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->L:I

    iput v0, p1, Ll7$b;->W:I

    .line 40
    iget-boolean v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->Y:Z

    iput-boolean v0, p1, Ll7$b;->m0:Z

    .line 41
    iget-boolean v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->Z:Z

    iput-boolean v0, p1, Ll7$b;->n0:Z

    .line 42
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->N:I

    iput v0, p1, Ll7$b;->Y:I

    .line 43
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->O:I

    iput v0, p1, Ll7$b;->Z:I

    .line 44
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->R:I

    iput v0, p1, Ll7$b;->a0:I

    .line 45
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->S:I

    iput v0, p1, Ll7$b;->b0:I

    .line 46
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->P:I

    iput v0, p1, Ll7$b;->c0:I

    .line 47
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->Q:I

    iput v0, p1, Ll7$b;->d0:I

    .line 48
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->T:F

    iput v0, p1, Ll7$b;->e0:F

    .line 49
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->U:F

    iput v0, p1, Ll7$b;->f0:F

    .line 50
    iget-object v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a0:Ljava/lang/String;

    iput-object v0, p1, Ll7$b;->l0:Ljava/lang/String;

    .line 51
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->x:I

    iput v0, p1, Ll7$b;->O:I

    .line 52
    iget-object p1, p0, Ll7$a;->e:Ll7$b;

    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->z:I

    iput v0, p1, Ll7$b;->Q:I

    .line 53
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->w:I

    iput v0, p1, Ll7$b;->N:I

    .line 54
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->y:I

    iput v0, p1, Ll7$b;->P:I

    .line 55
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->A:I

    iput v0, p1, Ll7$b;->S:I

    .line 56
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->B:I

    iput v0, p1, Ll7$b;->R:I

    .line 57
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->C:I

    iput v0, p1, Ll7$b;->T:I

    .line 58
    iget v0, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->b0:I

    iput v0, p1, Ll7$b;->p0:I

    .line 59
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    .line 60
    invoke-virtual {p2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    move-result v0

    iput v0, p1, Ll7$b;->K:I

    .line 61
    iget-object p1, p0, Ll7$a;->e:Ll7$b;

    invoke-virtual {p2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result p2

    iput p2, p1, Ll7$b;->L:I

    :cond_0
    return-void
.end method

.method public final g(ILm7$a;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Ll7$a;->f(ILandroidx/constraintlayout/widget/ConstraintLayout$b;)V

    .line 2
    iget-object p1, p0, Ll7$a;->c:Ll7$d;

    iget v0, p2, Lm7$a;->v0:F

    iput v0, p1, Ll7$d;->d:F

    .line 3
    iget-object p1, p0, Ll7$a;->f:Ll7$e;

    iget v0, p2, Lm7$a;->y0:F

    iput v0, p1, Ll7$e;->b:F

    .line 4
    iget v0, p2, Lm7$a;->z0:F

    iput v0, p1, Ll7$e;->c:F

    .line 5
    iget v0, p2, Lm7$a;->A0:F

    iput v0, p1, Ll7$e;->d:F

    .line 6
    iget v0, p2, Lm7$a;->B0:F

    iput v0, p1, Ll7$e;->e:F

    .line 7
    iget v0, p2, Lm7$a;->C0:F

    iput v0, p1, Ll7$e;->f:F

    .line 8
    iget v0, p2, Lm7$a;->D0:F

    iput v0, p1, Ll7$e;->g:F

    .line 9
    iget v0, p2, Lm7$a;->E0:F

    iput v0, p1, Ll7$e;->h:F

    .line 10
    iget v0, p2, Lm7$a;->F0:F

    iput v0, p1, Ll7$e;->j:F

    .line 11
    iget v0, p2, Lm7$a;->G0:F

    iput v0, p1, Ll7$e;->k:F

    .line 12
    iget v0, p2, Lm7$a;->H0:F

    iput v0, p1, Ll7$e;->l:F

    .line 13
    iget v0, p2, Lm7$a;->x0:F

    iput v0, p1, Ll7$e;->n:F

    .line 14
    iget-boolean p2, p2, Lm7$a;->w0:Z

    iput-boolean p2, p1, Ll7$e;->m:Z

    return-void
.end method

.method public final h(Lj7;ILm7$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2, p3}, Ll7$a;->g(ILm7$a;)V

    .line 2
    instance-of p2, p1, Landroidx/constraintlayout/widget/Barrier;

    if-eqz p2, :cond_0

    .line 3
    iget-object p2, p0, Ll7$a;->e:Ll7$b;

    const/4 p3, 0x1

    iput p3, p2, Ll7$b;->i0:I

    .line 4
    check-cast p1, Landroidx/constraintlayout/widget/Barrier;

    .line 5
    invoke-virtual {p1}, Landroidx/constraintlayout/widget/Barrier;->getType()I

    move-result p3

    iput p3, p2, Ll7$b;->g0:I

    .line 6
    iget-object p2, p0, Ll7$a;->e:Ll7$b;

    invoke-virtual {p1}, Lj7;->getReferencedIds()[I

    move-result-object p3

    iput-object p3, p2, Ll7$b;->j0:[I

    .line 7
    iget-object p2, p0, Ll7$a;->e:Ll7$b;

    invoke-virtual {p1}, Landroidx/constraintlayout/widget/Barrier;->getMargin()I

    move-result p1

    iput p1, p2, Ll7$b;->h0:I

    :cond_0
    return-void
.end method
