.class public Lmyunmn/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic a:Lmyunmn/b;


# direct methods
.method public constructor <init>(Lmyunmn/b;)V
    .locals 0

    iput-object p1, p0, Lmyunmn/D;->a:Lmyunmn/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)C
    .locals 4

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v0, v3, :cond_1

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    return p1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    sub-int/2addr p1, v2

    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    return p1
.end method

.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 3

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    sub-int/2addr p4, p3

    const/4 p2, 0x1

    if-ne p4, p2, :cond_0

    iget-object p3, p0, Lmyunmn/D;->a:Lmyunmn/b;

    invoke-static {p3}, Lmyunmn/b;->c(Lmyunmn/b;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3, p1}, Lmyunmn/D;->a(Ljava/lang/String;Ljava/lang/String;)C

    move-result p3

    if-eqz p3, :cond_0

    iget-object p4, p0, Lmyunmn/D;->a:Lmyunmn/b;

    invoke-static {p4}, Lmyunmn/b;->h(Lmyunmn/b;)Ljava/util/List;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmyunmn/ae;

    invoke-interface {v2, v0, v1, p3}, Lmyunmn/ae;->a(JC)V

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lmyunmn/D;->a:Lmyunmn/b;

    invoke-static {p3, p1}, Lmyunmn/b;->a(Lmyunmn/b;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lmyunmn/D;->a:Lmyunmn/b;

    invoke-static {p1, p2}, Lmyunmn/b;->a(Lmyunmn/b;Z)V

    return-void
.end method
