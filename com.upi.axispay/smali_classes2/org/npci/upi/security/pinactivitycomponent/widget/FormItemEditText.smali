.class public Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;
.super Landroid/widget/EditText;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$a;
    }
.end annotation


# instance fields
.field public A:Landroid/content/res/ColorStateList;

.field public B:[[I

.field public C:[I

.field public D:Landroid/content/res/ColorStateList;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/StringBuilder;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:I

.field public k:[Landroid/graphics/RectF;

.field public l:[F

.field public m:Landroid/graphics/Paint;

.field public n:Landroid/graphics/Paint;

.field public o:Landroid/graphics/Paint;

.field public p:Landroid/graphics/drawable/Drawable;

.field public q:Landroid/graphics/Rect;

.field public r:Z

.field public s:Landroid/view/View$OnClickListener;

.field public t:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$a;

.field public u:Z

.field public v:F

.field public w:F

.field public x:Landroid/graphics/Paint;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    invoke-direct {p0, p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->b:Ljava/lang/String;

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->c:Ljava/lang/StringBuilder;

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->d:Ljava/lang/String;

    const/4 v1, 0x0

    iput v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->e:I

    const/high16 v2, 0x41c00000    # 24.0f

    iput v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->f:F

    const/high16 v2, 0x40800000    # 4.0f

    iput v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->h:F

    const/high16 v2, 0x41000000    # 8.0f

    iput v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->i:F

    const/4 v2, 0x4

    iput v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->j:I

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->q:Landroid/graphics/Rect;

    iput-boolean v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->r:Z

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->t:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$a;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->v:F

    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->w:F

    iput-boolean v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->y:Z

    iput-boolean v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->z:Z

    new-array v0, v2, [[I

    const/4 v3, 0x1

    new-array v4, v3, [I

    const v5, 0x10100a1

    aput v5, v4, v1

    aput-object v4, v0, v1

    new-array v4, v3, [I

    const v5, 0x10100a2

    aput v5, v4, v1

    aput-object v4, v0, v3

    new-array v4, v3, [I

    const v5, 0x101009c

    aput v5, v4, v1

    const/4 v5, 0x2

    aput-object v4, v0, v5

    new-array v3, v3, [I

    const v4, -0x101009c

    aput v4, v3, v1

    const/4 v1, 0x3

    aput-object v3, v0, v1

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->B:[[I

    new-array v0, v2, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->C:[I

    new-instance v0, Landroid/content/res/ColorStateList;

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->B:[[I

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->C:[I

    invoke-direct {v0, v1, v2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->D:Landroid/content/res/ColorStateList;

    invoke-virtual {p0, p1, p2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->d(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void

    :array_0
    .array-data 4
        -0xff0100
        -0x10000
        -0x1000000
        -0x777778
    .end array-data
.end method

.method public static synthetic c(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;)Landroid/view/View$OnClickListener;
    .locals 0

    iget-object p0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->s:Landroid/view/View$OnClickListener;

    return-object p0
.end method

.method private getFullText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-direct {p0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->getMaskChars()Ljava/lang/StringBuilder;

    move-result-object v0

    return-object v0
.end method

.method private getMaskChars()Ljava/lang/StringBuilder;
    .locals 3

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->c:Ljava/lang/StringBuilder;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->c:Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    :goto_0
    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->c:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-eq v1, v0, :cond_2

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->c:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-ge v1, v0, :cond_1

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->c:Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->c:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->c:Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public static synthetic h(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;)Landroid/graphics/Paint;
    .locals 0

    iget-object p0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->n:Landroid/graphics/Paint;

    return-object p0
.end method

.method public static synthetic j(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$a;
    .locals 0

    iget-object p0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->t:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$a;

    return-object p0
.end method

.method public static synthetic k(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;)[F
    .locals 0

    iget-object p0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->l:[F

    return-object p0
.end method


# virtual methods
.method public a(F)I
    .locals 1

    invoke-virtual {p0}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    div-int/lit16 v0, v0, 0xa0

    int-to-float v0, v0

    mul-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public final varargs b([I)I
    .locals 2

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->D:Landroid/content/res/ColorStateList;

    const v1, -0x777778

    invoke-virtual {v0, p1, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    return p1
.end method

.method public final d(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    iget v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->v:F

    invoke-virtual {p0, v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->a(F)I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->v:F

    iget v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->w:F

    invoke-virtual {p0, v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->a(F)I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->w:F

    iget v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->f:F

    invoke-virtual {p0, v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->a(F)I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->f:F

    iget v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->i:F

    invoke-virtual {p0, v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->a(F)I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->i:F

    sget-object v1, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemEditText:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    :try_start_0
    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    sget v4, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemEditText_pinAnimationType:I

    invoke-virtual {v1, v4, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    iget v3, v3, Landroid/util/TypedValue;->data:I

    iput v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->e:I

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemEditText_pinCharacterMask:I

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->b:Ljava/lang/String;

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemEditText_pinRepeatedHint:I

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->d:Ljava/lang/String;

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemEditText_pinLineStroke:I

    iget v4, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->v:F

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->v:F

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemEditText_pinLineStrokeSelected:I

    iget v4, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->w:F

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->w:F

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemEditText_pinLineStrokeCentered:I

    invoke-virtual {v1, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->u:Z

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemEditText_pinCharacterSize:I

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->g:F

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemEditText_pinCharacterSpacing:I

    iget v4, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->f:F

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->f:F

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemEditText_pinTextBottomPadding:I

    iget v4, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->i:F

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->i:F

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemEditText_pinBackgroundIsSquare:I

    iget-boolean v4, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->r:Z

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->r:Z

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemEditText_pinBackgroundDrawable:I

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->p:Landroid/graphics/drawable/Drawable;

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemEditText_pinLineColors:I

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    if-eqz v3, :cond_0

    iput-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->D:Landroid/content/res/ColorStateList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v1, Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->m:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->n:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->o:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->x:Landroid/graphics/Paint;

    iget v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->v:F

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->g:F

    invoke-virtual {p0, v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->setFontSize(F)V

    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$attr;->colorControlActivated:I

    const/4 v4, 0x1

    invoke-virtual {p1, v3, v1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p1, v1, Landroid/util/TypedValue;->data:I

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->C:[I

    aput p1, v1, v2

    const p1, -0x777778

    aput p1, v1, v4

    const/4 v3, 0x2

    aput p1, v1, v3

    invoke-virtual {p0, v2}, Landroid/widget/EditText;->setBackgroundResource(I)V

    const/4 p1, 0x4

    const v0, 0x12d1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x12d2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v1, v3, p1}, Landroid/util/AttributeSet;->getAttributeIntValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->j:I

    int-to-float p1, p1

    iput p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->h:F

    new-instance p1, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$1;

    invoke-direct {p1, p0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$1;-><init>(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;)V

    invoke-super {p0, p1}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$2;

    invoke-direct {p1, p0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$2;-><init>(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;)V

    invoke-super {p0, p1}, Landroid/widget/EditText;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    invoke-virtual {p0}, Landroid/widget/EditText;->getInputType()I

    move-result p1

    const/16 p2, 0x80

    and-int/2addr p1, p2

    const v0, 0x12d3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->b:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->b:Ljava/lang/String;

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/widget/EditText;->getInputType()I

    move-result p1

    const/16 p2, 0x10

    and-int/2addr p1, p2

    if-ne p1, p2, :cond_2

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->b:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->b:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-direct {p0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->getMaskChars()Ljava/lang/StringBuilder;

    move-result-object p1

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->c:Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object p1

    iget-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->q:Landroid/graphics/Rect;

    const v0, 0x12d4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v2, v4, p2}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    iget p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->e:I

    const/4 p2, -0x1

    if-le p1, p2, :cond_4

    move v2, v4

    :cond_4
    iput-boolean v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->y:Z

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method public final e(Ljava/lang/CharSequence;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->n:Landroid/graphics/Paint;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v1, 0x96

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$3;

    invoke-direct {v1, p0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$3;-><init>(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    iget v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->j:I

    if-ne p1, v2, :cond_0

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->t:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$a;

    if-eqz p1, :cond_0

    new-instance p1, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$4;

    invoke-direct {p1, p0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$4;-><init>(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;)V

    invoke-virtual {v1, p1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_0
    const/4 p1, 0x1

    new-array p1, p1, [Landroid/animation/Animator;

    const/4 v2, 0x0

    aput-object v0, p1, v2

    invoke-virtual {v1, p1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :array_0
    .array-data 4
        0x7d
        0xff
    .end array-data
.end method

.method public final f(Ljava/lang/CharSequence;I)V
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->l:[F

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->k:[Landroid/graphics/RectF;

    aget-object v1, v1, p2

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    iget v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->i:F

    sub-float/2addr v1, v2

    aput v1, v0, p2

    const/4 v1, 0x2

    new-array v2, v1, [F

    aget v0, v0, p2

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    invoke-virtual {v3}, Landroid/text/TextPaint;->getTextSize()F

    move-result v3

    add-float/2addr v0, v3

    const/4 v3, 0x0

    aput v0, v2, v3

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->l:[F

    aget v0, v0, p2

    const/4 v4, 0x1

    aput v0, v2, v4

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v5, 0x12c

    invoke-virtual {v0, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v2, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v2}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v2, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$5;

    invoke-direct {v2, p0, p2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$5;-><init>(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;I)V

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->n:Landroid/graphics/Paint;

    const/16 v2, 0xff

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    new-array p2, v1, [I

    fill-array-data p2, :array_0

    invoke-static {p2}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object p2

    invoke-virtual {p2, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v2, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$6;

    invoke-direct {v2, p0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$6;-><init>(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;)V

    invoke-virtual {p2, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    iget v5, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->j:I

    if-ne p1, v5, :cond_0

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->t:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$a;

    if-eqz p1, :cond_0

    new-instance p1, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$7;

    invoke-direct {p1, p0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$7;-><init>(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;)V

    invoke-virtual {v2, p1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_0
    new-array p1, v1, [Landroid/animation/Animator;

    aput-object v0, p1, v3

    aput-object p2, p1, v4

    invoke-virtual {v2, p1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0xff
    .end array-data
.end method

.method public final g(ZZ)V
    .locals 4

    iget-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->z:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->x:Landroid/graphics/Paint;

    new-array p2, v2, [I

    const v0, 0x10100a2

    aput v0, p2, v1

    invoke-virtual {p0, p2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->b([I)I

    move-result p2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_3

    :cond_0
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->x:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/widget/EditText;->isFocused()Z

    move-result v3

    if-eqz v3, :cond_1

    iget v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->w:F

    goto :goto_1

    :cond_1
    iget v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->v:F

    :goto_1
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    if-eqz p1, :cond_2

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->x:Landroid/graphics/Paint;

    new-array p2, v2, [I

    const v0, 0x10100a1

    aput v0, p2, v1

    invoke-virtual {p0, p2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->b([I)I

    move-result p2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroid/widget/EditText;->isFocused()Z

    move-result p1

    if-eqz p2, :cond_4

    if-eqz p1, :cond_3

    new-array p1, v2, [I

    const p2, 0x10100a6

    aput p2, p1, v1

    invoke-virtual {p0, p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->b([I)I

    move-result p1

    goto :goto_2

    :cond_3
    new-array p1, v2, [I

    const p2, -0x10100a6

    aput p2, p1, v1

    invoke-virtual {p0, p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->b([I)I

    move-result p1

    goto :goto_2

    :cond_4
    if-eqz p1, :cond_5

    new-array p1, v2, [I

    const p2, 0x101009c

    aput p2, p1, v1

    invoke-virtual {p0, p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->b([I)I

    move-result p1

    goto :goto_2

    :cond_5
    new-array p1, v2, [I

    const p2, -0x101009c

    aput p2, p1, v1

    invoke-virtual {p0, p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->b([I)I

    move-result p1

    :goto_2
    iget-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->x:Landroid/graphics/Paint;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    :goto_3
    return-void
.end method

.method public final i(ZZ)V
    .locals 4

    iget-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->z:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->p:Landroid/graphics/drawable/Drawable;

    new-array p2, v2, [I

    const v0, 0x10100a2

    aput v0, p2, v1

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->p:Landroid/graphics/drawable/Drawable;

    new-array v2, v2, [I

    const v3, 0x101009c

    aput v3, v2, v1

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    const/4 v0, 0x2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->p:Landroid/graphics/drawable/Drawable;

    new-array p2, v0, [I

    fill-array-data p2, :array_0

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_3

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->p:Landroid/graphics/drawable/Drawable;

    new-array p2, v0, [I

    fill-array-data p2, :array_1

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->p:Landroid/graphics/drawable/Drawable;

    new-array p2, v2, [I

    const v0, -0x101009c

    aput v0, p2, v1

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_3
    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x101009c
        0x10100a1
    .end array-data

    :array_1
    .array-data 4
        0x101009c
        0x10100a0
    .end array-data
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    invoke-direct/range {p0 .. p0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->getFullText()Ljava/lang/CharSequence;

    move-result-object v9

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v10

    new-array v11, v10, [F

    invoke-virtual/range {p0 .. p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    const/4 v12, 0x0

    invoke-virtual {v1, v9, v12, v10, v11}, Landroid/text/TextPaint;->getTextWidths(Ljava/lang/CharSequence;II[F)I

    iget-object v1, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->d:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    new-array v3, v1, [F

    invoke-virtual/range {p0 .. p0}, Landroid/widget/EditText;->getPaint()Landroid/text/TextPaint;

    move-result-object v4

    iget-object v5, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->d:Ljava/lang/String;

    invoke-virtual {v4, v5, v3}, Landroid/text/TextPaint;->getTextWidths(Ljava/lang/String;[F)I

    move v4, v12

    :goto_0
    if-ge v4, v1, :cond_0

    aget v5, v3, v4

    add-float/2addr v2, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    move v13, v2

    move v14, v12

    :goto_1
    int-to-float v1, v14

    iget v2, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->h:F

    cmpg-float v1, v1, v2

    if-gez v1, :cond_b

    iget-object v1, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->p:Landroid/graphics/drawable/Drawable;

    const/4 v15, 0x1

    if-eqz v1, :cond_3

    if-ge v14, v10, :cond_1

    move v1, v15

    goto :goto_2

    :cond_1
    move v1, v12

    :goto_2
    if-ne v14, v10, :cond_2

    move v2, v15

    goto :goto_3

    :cond_2
    move v2, v12

    :goto_3
    invoke-virtual {v0, v1, v2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->i(ZZ)V

    iget-object v1, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->p:Landroid/graphics/drawable/Drawable;

    iget-object v2, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->k:[Landroid/graphics/RectF;

    aget-object v3, v2, v14

    iget v3, v3, Landroid/graphics/RectF;->left:F

    float-to-int v3, v3

    aget-object v4, v2, v14

    iget v4, v4, Landroid/graphics/RectF;->top:F

    float-to-int v4, v4

    aget-object v5, v2, v14

    iget v5, v5, Landroid/graphics/RectF;->right:F

    float-to-int v5, v5

    aget-object v2, v2, v14

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    float-to-int v2, v2

    invoke-virtual {v1, v3, v4, v5, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v1, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->p:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v8}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_3
    iget-object v1, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->k:[Landroid/graphics/RectF;

    aget-object v1, v1, v14

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget v2, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->g:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    if-le v10, v14, :cond_6

    iget-boolean v2, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->y:Z

    if-eqz v2, :cond_5

    add-int/lit8 v2, v10, -0x1

    if-eq v14, v2, :cond_4

    goto :goto_4

    :cond_4
    add-int/lit8 v4, v14, 0x1

    aget v2, v11, v14

    div-float/2addr v2, v3

    sub-float v5, v1, v2

    iget-object v1, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->l:[F

    aget v6, v1, v14

    iget-object v7, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->n:Landroid/graphics/Paint;

    goto :goto_5

    :cond_5
    :goto_4
    add-int/lit8 v4, v14, 0x1

    aget v2, v11, v14

    div-float/2addr v2, v3

    sub-float v5, v1, v2

    iget-object v1, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->l:[F

    aget v6, v1, v14

    iget-object v7, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->m:Landroid/graphics/Paint;

    :goto_5
    move-object/from16 v1, p1

    move-object v2, v9

    move v3, v14

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    goto :goto_6

    :cond_6
    iget-object v2, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->d:Ljava/lang/String;

    if-eqz v2, :cond_7

    div-float v3, v13, v3

    sub-float/2addr v1, v3

    iget-object v3, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->l:[F

    aget v3, v3, v14

    iget-object v4, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->o:Landroid/graphics/Paint;

    invoke-virtual {v8, v2, v1, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_7
    :goto_6
    iget-object v1, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->p:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_a

    if-ge v14, v10, :cond_8

    move v1, v15

    goto :goto_7

    :cond_8
    move v1, v12

    :goto_7
    if-ne v14, v10, :cond_9

    goto :goto_8

    :cond_9
    move v15, v12

    :goto_8
    invoke-virtual {v0, v1, v15}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->g(ZZ)V

    iget-object v1, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->k:[Landroid/graphics/RectF;

    aget-object v2, v1, v14

    iget v2, v2, Landroid/graphics/RectF;->left:F

    aget-object v3, v1, v14

    iget v3, v3, Landroid/graphics/RectF;->top:F

    const/high16 v4, 0x41a00000    # 20.0f

    add-float/2addr v3, v4

    aget-object v5, v1, v14

    iget v5, v5, Landroid/graphics/RectF;->right:F

    aget-object v1, v1, v14

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    add-float v6, v1, v4

    iget-object v7, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->x:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v4, v5

    move v5, v6

    move-object v6, v7

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_a
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_1

    :cond_b
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 6

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/EditText;->onSizeChanged(IIII)V

    invoke-virtual {p0}, Landroid/widget/EditText;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->A:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_0

    iget-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->n:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->m:Landroid/graphics/Paint;

    iget-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->A:Landroid/content/res/ColorStateList;

    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->o:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/widget/EditText;->getCurrentHintTextColor()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result p1

    invoke-static {p0}, Lac;->H(Landroid/view/View;)I

    move-result p2

    sub-int/2addr p1, p2

    invoke-static {p0}, Lac;->I(Landroid/view/View;)I

    move-result p2

    sub-int/2addr p1, p2

    iget p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->f:F

    const/4 p3, 0x0

    cmpg-float p4, p2, p3

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, 0x40000000    # 2.0f

    if-gez p4, :cond_1

    int-to-float p1, p1

    iget p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->h:F

    mul-float/2addr p2, v1

    sub-float/2addr p2, v0

    div-float/2addr p1, p2

    :goto_0
    iput p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->g:F

    goto :goto_1

    :cond_1
    iget p4, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->g:F

    cmpl-float p4, p4, p3

    if-nez p4, :cond_2

    int-to-float p1, p1

    iget p4, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->h:F

    sub-float v0, p4, v0

    mul-float/2addr p2, v0

    sub-float/2addr p1, p2

    div-float/2addr p1, p4

    goto :goto_0

    :cond_2
    :goto_1
    iget p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->h:F

    float-to-int p2, p1

    new-array p2, p2, [Landroid/graphics/RectF;

    iput-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->k:[Landroid/graphics/RectF;

    float-to-int p1, p1

    new-array p1, p1, [F

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->l:[F

    invoke-virtual {p0}, Landroid/widget/EditText;->getHeight()I

    move-result p1

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingBottom()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingTop()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    invoke-static {p2}, Lva;->b(Ljava/util/Locale;)I

    move-result p2

    const/4 p4, 0x0

    const/4 v0, 0x1

    if-ne p2, v0, :cond_3

    move p2, v0

    goto :goto_2

    :cond_3
    move p2, p4

    :goto_2
    if-eqz p2, :cond_4

    const/4 v0, -0x1

    invoke-virtual {p0}, Landroid/widget/EditText;->getWidth()I

    move-result p2

    invoke-static {p0}, Lac;->I(Landroid/view/View;)I

    move-result v2

    sub-int/2addr p2, v2

    int-to-float p2, p2

    iget v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->g:F

    sub-float/2addr p2, v2

    float-to-int p2, p2

    goto :goto_3

    :cond_4
    invoke-static {p0}, Lac;->I(Landroid/view/View;)I

    move-result p2

    :goto_3
    int-to-float v2, p4

    iget v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->h:F

    cmpg-float v2, v2, v3

    if-gez v2, :cond_9

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->k:[Landroid/graphics/RectF;

    new-instance v3, Landroid/graphics/RectF;

    int-to-float p2, p2

    int-to-float v4, p1

    iget v5, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->g:F

    add-float/2addr v5, p2

    invoke-direct {v3, p2, v4, v5, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    aput-object v3, v2, p4

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->p:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_6

    iget-boolean v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->r:Z

    if-eqz v2, :cond_5

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->k:[Landroid/graphics/RectF;

    aget-object v2, v2, p4

    invoke-virtual {p0}, Landroid/widget/EditText;->getPaddingTop()I

    move-result v3

    int-to-float v3, v3

    iput v3, v2, Landroid/graphics/RectF;->top:F

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->k:[Landroid/graphics/RectF;

    aget-object v3, v2, p4

    aget-object v2, v2, p4

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    add-float/2addr v2, p2

    iput v2, v3, Landroid/graphics/RectF;->right:F

    goto :goto_4

    :cond_5
    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->k:[Landroid/graphics/RectF;

    aget-object v2, v2, p4

    iget v3, v2, Landroid/graphics/RectF;->top:F

    iget-object v4, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->q:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    iget v5, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->i:F

    mul-float/2addr v5, v1

    add-float/2addr v4, v5

    sub-float/2addr v3, v4

    iput v3, v2, Landroid/graphics/RectF;->top:F

    :cond_6
    :goto_4
    iget v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->f:F

    cmpg-float v3, v2, p3

    if-gez v3, :cond_7

    int-to-float v2, v0

    iget v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->g:F

    mul-float/2addr v2, v3

    mul-float/2addr v2, v1

    add-float/2addr p2, v2

    goto :goto_5

    :cond_7
    int-to-float v3, v0

    iget v4, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->g:F

    add-float/2addr v4, v2

    mul-float/2addr v3, v4

    add-float/2addr p2, v3

    :goto_5
    float-to-int p2, p2

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->l:[F

    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->k:[Landroid/graphics/RectF;

    aget-object v4, v3, p4

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    iget v5, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->i:F

    sub-float/2addr v4, v5

    aput v4, v2, p4

    iget-boolean v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->u:Z

    if-eqz v2, :cond_8

    aget-object v2, v3, p4

    aget-object v4, v3, p4

    iget v4, v4, Landroid/graphics/RectF;->top:F

    div-float/2addr v4, v1

    iput v4, v2, Landroid/graphics/RectF;->top:F

    aget-object v2, v3, p4

    aget-object v3, v3, p4

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    div-float/2addr v3, v1

    iput v3, v2, Landroid/graphics/RectF;->bottom:F

    :cond_8
    add-int/lit8 p4, p4, 0x1

    goto/16 :goto_3

    :cond_9
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->setError(Z)V

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->k:[Landroid/graphics/RectF;

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->y:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->e:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/widget/EditText;->invalidate()V

    return-void

    :cond_1
    if-le p4, p3, :cond_3

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->e(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1, p2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->f(Ljava/lang/CharSequence;I)V

    :cond_3
    :goto_0
    return-void

    :cond_4
    :goto_1
    iget-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->t:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$a;

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    iget p3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->j:I

    if-ne p2, p3, :cond_5

    iget-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->t:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$a;

    invoke-interface {p2, p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$a;->a(Ljava/lang/CharSequence;)V

    :cond_5
    return-void
.end method

.method public setAnimateText(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->y:Z

    return-void
.end method

.method public setCharSize(F)V
    .locals 0

    iput p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->g:F

    invoke-virtual {p0}, Landroid/widget/EditText;->invalidate()V

    return-void
.end method

.method public setColorStates(Landroid/content/res/ColorStateList;)V
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->D:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Landroid/widget/EditText;->invalidate()V

    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 1

    new-instance p1, Ljava/lang/RuntimeException;

    const v0, 0x12d5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setError(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->z:Z

    return-void
.end method

.method public setFontSize(F)V
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->n:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->o:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method

.method public setLineStroke(F)V
    .locals 0

    iput p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->v:F

    invoke-virtual {p0}, Landroid/widget/EditText;->invalidate()V

    return-void
.end method

.method public setLineStrokeCentered(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->u:Z

    invoke-virtual {p0}, Landroid/widget/EditText;->invalidate()V

    return-void
.end method

.method public setLineStrokeSelected(F)V
    .locals 0

    iput p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->w:F

    invoke-virtual {p0}, Landroid/widget/EditText;->invalidate()V

    return-void
.end method

.method public setMargin([I)V
    .locals 5

    invoke-virtual {p0}, Landroid/widget/EditText;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, 0x0

    aget v1, p1, v1

    const/4 v2, 0x1

    aget v2, p1, v2

    const/4 v3, 0x2

    aget v3, p1, v3

    const/4 v4, 0x3

    aget p1, p1, v4

    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setMaxLength(I)V
    .locals 2

    iput p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->j:I

    int-to-float v0, p1

    iput v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->h:F

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v1, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 p1, 0x0

    aput-object v1, v0, p1

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->s:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public setOnPinEnteredListener(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$a;)V
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->t:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText$a;

    return-void
.end method

.method public setSpace(F)V
    .locals 0

    iput p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->f:F

    invoke-virtual {p0}, Landroid/widget/EditText;->invalidate()V

    return-void
.end method
