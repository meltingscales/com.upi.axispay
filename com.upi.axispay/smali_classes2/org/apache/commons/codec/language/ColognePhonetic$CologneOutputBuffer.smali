.class public Lorg/apache/commons/codec/language/ColognePhonetic$CologneOutputBuffer;
.super Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/commons/codec/language/ColognePhonetic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "CologneOutputBuffer"
.end annotation


# instance fields
.field private lastCode:C

.field public final synthetic this$0:Lorg/apache/commons/codec/language/ColognePhonetic;


# direct methods
.method public constructor <init>(Lorg/apache/commons/codec/language/ColognePhonetic;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneOutputBuffer;->this$0:Lorg/apache/commons/codec/language/ColognePhonetic;

    .line 2
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;-><init>(Lorg/apache/commons/codec/language/ColognePhonetic;I)V

    const/16 p1, 0x2f

    .line 3
    iput-char p1, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneOutputBuffer;->lastCode:C

    return-void
.end method


# virtual methods
.method public copyData(II)[C
    .locals 3

    .line 1
    new-array v0, p2, [C

    .line 2
    iget-object v1, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->data:[C

    const/4 v2, 0x0

    invoke-static {v1, p1, v0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public put(C)V
    .locals 2

    const/16 v0, 0x2d

    if-eq p1, v0, :cond_1

    .line 1
    iget-char v0, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneOutputBuffer;->lastCode:C

    if-eq v0, p1, :cond_1

    const/16 v0, 0x30

    if-ne p1, v0, :cond_0

    iget v0, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->length:I

    if-nez v0, :cond_1

    .line 2
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->data:[C

    iget v1, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->length:I

    aput-char p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 3
    iput v1, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->length:I

    .line 4
    :cond_1
    iput-char p1, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneOutputBuffer;->lastCode:C

    return-void
.end method
