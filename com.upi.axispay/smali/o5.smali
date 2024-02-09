.class public Lo5;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public static a(Ls5;Lz4;IILp5;)V
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    move/from16 v10, p2

    move-object/from16 v1, p4

    .line 1
    iget-object v11, v1, Lp5;->a:Lr5;

    .line 2
    iget-object v12, v1, Lp5;->c:Lr5;

    .line 3
    iget-object v13, v1, Lp5;->b:Lr5;

    .line 4
    iget-object v14, v1, Lp5;->d:Lr5;

    .line 5
    iget-object v2, v1, Lp5;->e:Lr5;

    .line 6
    iget v3, v1, Lp5;->k:F

    .line 7
    iget-object v4, v1, Lp5;->f:Lr5;

    .line 8
    iget-object v4, v1, Lp5;->g:Lr5;

    .line 9
    iget-object v4, v0, Lr5;->W:[Lr5$b;

    aget-object v4, v4, v10

    sget-object v5, Lr5$b;->c:Lr5$b;

    const/4 v7, 0x1

    if-ne v4, v5, :cond_0

    move v4, v7

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x2

    if-nez v10, :cond_3

    .line 10
    iget v8, v2, Lr5;->n0:I

    if-nez v8, :cond_1

    move v15, v7

    goto :goto_1

    :cond_1
    const/4 v15, 0x0

    :goto_1
    if-ne v8, v7, :cond_2

    move/from16 v16, v7

    goto :goto_2

    :cond_2
    const/16 v16, 0x0

    :goto_2
    if-ne v8, v5, :cond_6

    goto :goto_5

    .line 11
    :cond_3
    iget v8, v2, Lr5;->o0:I

    if-nez v8, :cond_4

    move v15, v7

    goto :goto_3

    :cond_4
    const/4 v15, 0x0

    :goto_3
    if-ne v8, v7, :cond_5

    move/from16 v16, v7

    goto :goto_4

    :cond_5
    const/16 v16, 0x0

    :goto_4
    if-ne v8, v5, :cond_6

    :goto_5
    move v5, v7

    goto :goto_6

    :cond_6
    const/4 v5, 0x0

    :goto_6
    move-object v7, v11

    const/4 v8, 0x0

    :goto_7
    const/16 v22, 0x0

    if-nez v8, :cond_14

    .line 12
    iget-object v6, v7, Lr5;->T:[Lq5;

    aget-object v6, v6, p3

    if-eqz v5, :cond_7

    const/16 v20, 0x1

    goto :goto_8

    :cond_7
    const/16 v20, 0x4

    .line 13
    :goto_8
    invoke-virtual {v6}, Lq5;->e()I

    move-result v24

    move/from16 v25, v3

    .line 14
    iget-object v3, v7, Lr5;->W:[Lr5$b;

    aget-object v3, v3, v10

    move/from16 v26, v8

    sget-object v8, Lr5$b;->d:Lr5$b;

    if-ne v3, v8, :cond_8

    iget-object v3, v7, Lr5;->v:[I

    aget v3, v3, v10

    if-nez v3, :cond_8

    move/from16 v27, v15

    const/4 v3, 0x1

    goto :goto_9

    :cond_8
    move/from16 v27, v15

    const/4 v3, 0x0

    .line 15
    :goto_9
    iget-object v15, v6, Lq5;->f:Lq5;

    if-eqz v15, :cond_9

    if-eq v7, v11, :cond_9

    .line 16
    invoke-virtual {v15}, Lq5;->e()I

    move-result v15

    add-int v24, v24, v15

    :cond_9
    move/from16 v15, v24

    if-eqz v5, :cond_a

    if-eq v7, v11, :cond_a

    if-eq v7, v13, :cond_a

    move-object/from16 v24, v2

    const/16 v20, 0x8

    goto :goto_a

    :cond_a
    move-object/from16 v24, v2

    .line 17
    :goto_a
    iget-object v2, v6, Lq5;->f:Lq5;

    if-eqz v2, :cond_e

    if-ne v7, v13, :cond_b

    move-object/from16 v28, v11

    .line 18
    iget-object v11, v6, Lq5;->i:Le5;

    iget-object v2, v2, Lq5;->i:Le5;

    const/4 v1, 0x6

    invoke-virtual {v9, v11, v2, v15, v1}, Lz4;->h(Le5;Le5;II)V

    goto :goto_b

    :cond_b
    move-object/from16 v28, v11

    .line 19
    iget-object v1, v6, Lq5;->i:Le5;

    iget-object v2, v2, Lq5;->i:Le5;

    const/16 v11, 0x8

    invoke-virtual {v9, v1, v2, v15, v11}, Lz4;->h(Le5;Le5;II)V

    :goto_b
    if-eqz v3, :cond_c

    if-nez v5, :cond_c

    const/16 v20, 0x5

    :cond_c
    if-ne v7, v13, :cond_d

    if-eqz v5, :cond_d

    .line 20
    invoke-virtual {v7, v10}, Lr5;->f0(I)Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, 0x5

    goto :goto_c

    :cond_d
    move/from16 v1, v20

    .line 21
    :goto_c
    iget-object v2, v6, Lq5;->i:Le5;

    iget-object v3, v6, Lq5;->f:Lq5;

    iget-object v3, v3, Lq5;->i:Le5;

    invoke-virtual {v9, v2, v3, v15, v1}, Lz4;->e(Le5;Le5;II)Lx4;

    goto :goto_d

    :cond_e
    move-object/from16 v28, v11

    :goto_d
    if-eqz v4, :cond_10

    .line 22
    invoke-virtual {v7}, Lr5;->T()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_f

    iget-object v1, v7, Lr5;->W:[Lr5$b;

    aget-object v1, v1, v10

    if-ne v1, v8, :cond_f

    .line 23
    iget-object v1, v7, Lr5;->T:[Lq5;

    add-int/lit8 v2, p3, 0x1

    aget-object v2, v1, v2

    iget-object v2, v2, Lq5;->i:Le5;

    aget-object v1, v1, p3

    iget-object v1, v1, Lq5;->i:Le5;

    const/4 v3, 0x5

    const/4 v6, 0x0

    invoke-virtual {v9, v2, v1, v6, v3}, Lz4;->h(Le5;Le5;II)V

    goto :goto_e

    :cond_f
    const/4 v6, 0x0

    .line 24
    :goto_e
    iget-object v1, v7, Lr5;->T:[Lq5;

    aget-object v1, v1, p3

    iget-object v1, v1, Lq5;->i:Le5;

    iget-object v2, v0, Lr5;->T:[Lq5;

    aget-object v2, v2, p3

    iget-object v2, v2, Lq5;->i:Le5;

    const/16 v3, 0x8

    invoke-virtual {v9, v1, v2, v6, v3}, Lz4;->h(Le5;Le5;II)V

    .line 25
    :cond_10
    iget-object v1, v7, Lr5;->T:[Lq5;

    add-int/lit8 v2, p3, 0x1

    aget-object v1, v1, v2

    iget-object v1, v1, Lq5;->f:Lq5;

    if-eqz v1, :cond_12

    .line 26
    iget-object v1, v1, Lq5;->d:Lr5;

    .line 27
    iget-object v2, v1, Lr5;->T:[Lq5;

    aget-object v3, v2, p3

    iget-object v3, v3, Lq5;->f:Lq5;

    if-eqz v3, :cond_12

    aget-object v2, v2, p3

    iget-object v2, v2, Lq5;->f:Lq5;

    iget-object v2, v2, Lq5;->d:Lr5;

    if-eq v2, v7, :cond_11

    goto :goto_f

    :cond_11
    move-object/from16 v22, v1

    :cond_12
    :goto_f
    if-eqz v22, :cond_13

    move-object/from16 v7, v22

    move/from16 v8, v26

    goto :goto_10

    :cond_13
    const/4 v8, 0x1

    :goto_10
    move-object/from16 v1, p4

    move-object/from16 v2, v24

    move/from16 v3, v25

    move/from16 v15, v27

    move-object/from16 v11, v28

    goto/16 :goto_7

    :cond_14
    move-object/from16 v24, v2

    move/from16 v25, v3

    move-object/from16 v28, v11

    move/from16 v27, v15

    if-eqz v14, :cond_18

    .line 28
    iget-object v1, v12, Lr5;->T:[Lq5;

    add-int/lit8 v2, p3, 0x1

    aget-object v1, v1, v2

    iget-object v1, v1, Lq5;->f:Lq5;

    if-eqz v1, :cond_18

    .line 29
    iget-object v1, v14, Lr5;->T:[Lq5;

    aget-object v1, v1, v2

    .line 30
    iget-object v3, v14, Lr5;->W:[Lr5$b;

    aget-object v3, v3, v10

    sget-object v6, Lr5$b;->d:Lr5$b;

    if-ne v3, v6, :cond_15

    iget-object v3, v14, Lr5;->v:[I

    aget v3, v3, v10

    if-nez v3, :cond_15

    const/4 v3, 0x1

    goto :goto_11

    :cond_15
    const/4 v3, 0x0

    :goto_11
    if-eqz v3, :cond_16

    if-nez v5, :cond_16

    .line 31
    iget-object v3, v1, Lq5;->f:Lq5;

    iget-object v6, v3, Lq5;->d:Lr5;

    if-ne v6, v0, :cond_16

    .line 32
    iget-object v6, v1, Lq5;->i:Le5;

    iget-object v3, v3, Lq5;->i:Le5;

    invoke-virtual {v1}, Lq5;->e()I

    move-result v7

    neg-int v7, v7

    const/4 v8, 0x5

    invoke-virtual {v9, v6, v3, v7, v8}, Lz4;->e(Le5;Le5;II)Lx4;

    goto :goto_12

    :cond_16
    const/4 v8, 0x5

    if-eqz v5, :cond_17

    .line 33
    iget-object v3, v1, Lq5;->f:Lq5;

    iget-object v6, v3, Lq5;->d:Lr5;

    if-ne v6, v0, :cond_17

    .line 34
    iget-object v6, v1, Lq5;->i:Le5;

    iget-object v3, v3, Lq5;->i:Le5;

    invoke-virtual {v1}, Lq5;->e()I

    move-result v7

    neg-int v7, v7

    const/4 v11, 0x4

    invoke-virtual {v9, v6, v3, v7, v11}, Lz4;->e(Le5;Le5;II)Lx4;

    .line 35
    :cond_17
    :goto_12
    iget-object v3, v1, Lq5;->i:Le5;

    iget-object v6, v12, Lr5;->T:[Lq5;

    aget-object v2, v6, v2

    iget-object v2, v2, Lq5;->f:Lq5;

    iget-object v2, v2, Lq5;->i:Le5;

    .line 36
    invoke-virtual {v1}, Lq5;->e()I

    move-result v1

    neg-int v1, v1

    const/4 v6, 0x6

    .line 37
    invoke-virtual {v9, v3, v2, v1, v6}, Lz4;->j(Le5;Le5;II)V

    goto :goto_13

    :cond_18
    const/4 v8, 0x5

    :goto_13
    if-eqz v4, :cond_19

    .line 38
    iget-object v0, v0, Lr5;->T:[Lq5;

    add-int/lit8 v1, p3, 0x1

    aget-object v0, v0, v1

    iget-object v0, v0, Lq5;->i:Le5;

    iget-object v2, v12, Lr5;->T:[Lq5;

    aget-object v3, v2, v1

    iget-object v3, v3, Lq5;->i:Le5;

    aget-object v1, v2, v1

    .line 39
    invoke-virtual {v1}, Lq5;->e()I

    move-result v1

    const/16 v2, 0x8

    .line 40
    invoke-virtual {v9, v0, v3, v1, v2}, Lz4;->h(Le5;Le5;II)V

    :cond_19
    move-object/from16 v0, p4

    .line 41
    iget-object v1, v0, Lp5;->h:Ljava/util/ArrayList;

    if-eqz v1, :cond_1f

    .line 42
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_1f

    .line 43
    iget-boolean v4, v0, Lp5;->q:Z

    if-eqz v4, :cond_1a

    iget-boolean v4, v0, Lp5;->s:Z

    if-nez v4, :cond_1a

    .line 44
    iget v4, v0, Lp5;->j:I

    int-to-float v4, v4

    goto :goto_14

    :cond_1a
    move/from16 v4, v25

    :goto_14
    const/4 v6, 0x0

    move/from16 v30, v6

    move-object/from16 v11, v22

    const/4 v7, 0x0

    :goto_15
    if-ge v7, v2, :cond_1f

    .line 45
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lr5;

    .line 46
    iget-object v3, v15, Lr5;->p0:[F

    aget v3, v3, v10

    cmpg-float v19, v3, v6

    if-gez v19, :cond_1c

    .line 47
    iget-boolean v3, v0, Lp5;->s:Z

    if-eqz v3, :cond_1b

    .line 48
    iget-object v3, v15, Lr5;->T:[Lq5;

    add-int/lit8 v15, p3, 0x1

    aget-object v15, v3, v15

    iget-object v15, v15, Lq5;->i:Le5;

    aget-object v3, v3, p3

    iget-object v3, v3, Lq5;->i:Le5;

    const/4 v6, 0x0

    const/4 v8, 0x4

    invoke-virtual {v9, v15, v3, v6, v8}, Lz4;->e(Le5;Le5;II)Lx4;

    move v8, v6

    goto :goto_17

    :cond_1b
    const/4 v8, 0x4

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    goto :goto_16

    :cond_1c
    const/4 v8, 0x4

    :goto_16
    cmpl-float v19, v3, v6

    if-nez v19, :cond_1d

    .line 49
    iget-object v3, v15, Lr5;->T:[Lq5;

    add-int/lit8 v15, p3, 0x1

    aget-object v15, v3, v15

    iget-object v15, v15, Lq5;->i:Le5;

    aget-object v3, v3, p3

    iget-object v3, v3, Lq5;->i:Le5;

    const/16 v6, 0x8

    const/4 v8, 0x0

    invoke-virtual {v9, v15, v3, v8, v6}, Lz4;->e(Le5;Le5;II)Lx4;

    :goto_17
    move-object/from16 v25, v1

    move/from16 v18, v2

    goto :goto_19

    :cond_1d
    const/4 v8, 0x0

    if-eqz v11, :cond_1e

    .line 50
    iget-object v6, v11, Lr5;->T:[Lq5;

    aget-object v11, v6, p3

    iget-object v11, v11, Lq5;->i:Le5;

    add-int/lit8 v18, p3, 0x1

    .line 51
    aget-object v6, v6, v18

    iget-object v6, v6, Lq5;->i:Le5;

    .line 52
    iget-object v8, v15, Lr5;->T:[Lq5;

    move-object/from16 v25, v1

    aget-object v1, v8, p3

    iget-object v1, v1, Lq5;->i:Le5;

    .line 53
    aget-object v8, v8, v18

    iget-object v8, v8, Lq5;->i:Le5;

    move/from16 v18, v2

    .line 54
    invoke-virtual/range {p1 .. p1}, Lz4;->r()Lx4;

    move-result-object v2

    move-object/from16 v29, v2

    move/from16 v31, v4

    move/from16 v32, v3

    move-object/from16 v33, v11

    move-object/from16 v34, v6

    move-object/from16 v35, v1

    move-object/from16 v36, v8

    .line 55
    invoke-virtual/range {v29 .. v36}, Lx4;->l(FFFLe5;Le5;Le5;Le5;)Lx4;

    .line 56
    invoke-virtual {v9, v2}, Lz4;->d(Lx4;)V

    goto :goto_18

    :cond_1e
    move-object/from16 v25, v1

    move/from16 v18, v2

    :goto_18
    move/from16 v30, v3

    move-object v11, v15

    :goto_19
    add-int/lit8 v7, v7, 0x1

    move/from16 v2, v18

    move-object/from16 v1, v25

    const/4 v3, 0x1

    const/4 v6, 0x0

    const/4 v8, 0x5

    goto/16 :goto_15

    :cond_1f
    if-eqz v13, :cond_25

    if-eq v13, v14, :cond_20

    if-eqz v5, :cond_25

    :cond_20
    move-object/from16 v11, v28

    .line 57
    iget-object v0, v11, Lr5;->T:[Lq5;

    aget-object v0, v0, p3

    .line 58
    iget-object v1, v12, Lr5;->T:[Lq5;

    add-int/lit8 v2, p3, 0x1

    aget-object v1, v1, v2

    .line 59
    iget-object v0, v0, Lq5;->f:Lq5;

    if-eqz v0, :cond_21

    iget-object v0, v0, Lq5;->i:Le5;

    move-object v3, v0

    goto :goto_1a

    :cond_21
    move-object/from16 v3, v22

    .line 60
    :goto_1a
    iget-object v0, v1, Lq5;->f:Lq5;

    if-eqz v0, :cond_22

    iget-object v0, v0, Lq5;->i:Le5;

    move-object v5, v0

    goto :goto_1b

    :cond_22
    move-object/from16 v5, v22

    .line 61
    :goto_1b
    iget-object v0, v13, Lr5;->T:[Lq5;

    aget-object v0, v0, p3

    if-eqz v14, :cond_23

    .line 62
    iget-object v1, v14, Lr5;->T:[Lq5;

    aget-object v1, v1, v2

    :cond_23
    if-eqz v3, :cond_48

    if-eqz v5, :cond_48

    if-nez v10, :cond_24

    move-object/from16 v2, v24

    .line 63
    iget v2, v2, Lr5;->h0:F

    goto :goto_1c

    :cond_24
    move-object/from16 v2, v24

    .line 64
    iget v2, v2, Lr5;->i0:F

    :goto_1c
    move v4, v2

    .line 65
    invoke-virtual {v0}, Lq5;->e()I

    move-result v6

    .line 66
    invoke-virtual {v1}, Lq5;->e()I

    move-result v7

    .line 67
    iget-object v2, v0, Lq5;->i:Le5;

    iget-object v8, v1, Lq5;->i:Le5;

    const/4 v10, 0x7

    move-object/from16 v0, p1

    move-object v1, v2

    move-object v2, v3

    move v3, v6

    move-object v6, v8

    move v8, v10

    invoke-virtual/range {v0 .. v8}, Lz4;->c(Le5;Le5;IFLe5;Le5;II)V

    goto/16 :goto_36

    :cond_25
    move-object/from16 v11, v28

    if-eqz v27, :cond_37

    if-eqz v13, :cond_37

    .line 68
    iget v1, v0, Lp5;->j:I

    if-lez v1, :cond_26

    iget v0, v0, Lp5;->i:I

    if-ne v0, v1, :cond_26

    const/16 v17, 0x1

    goto :goto_1d

    :cond_26
    const/16 v17, 0x0

    :goto_1d
    move-object v8, v13

    move-object v15, v8

    :goto_1e
    if-eqz v15, :cond_48

    .line 69
    iget-object v0, v15, Lr5;->r0:[Lr5;

    aget-object v0, v0, v10

    move-object v7, v0

    :goto_1f
    if-eqz v7, :cond_27

    .line 70
    invoke-virtual {v7}, Lr5;->T()I

    move-result v0

    const/16 v6, 0x8

    if-ne v0, v6, :cond_28

    .line 71
    iget-object v0, v7, Lr5;->r0:[Lr5;

    aget-object v7, v0, v10

    goto :goto_1f

    :cond_27
    const/16 v6, 0x8

    :cond_28
    if-nez v7, :cond_2a

    if-ne v15, v14, :cond_29

    goto :goto_21

    :cond_29
    move-object/from16 v20, v7

    :goto_20
    move-object/from16 v18, v8

    goto/16 :goto_28

    .line 72
    :cond_2a
    :goto_21
    iget-object v0, v15, Lr5;->T:[Lq5;

    aget-object v0, v0, p3

    .line 73
    iget-object v1, v0, Lq5;->i:Le5;

    .line 74
    iget-object v2, v0, Lq5;->f:Lq5;

    if-eqz v2, :cond_2b

    iget-object v2, v2, Lq5;->i:Le5;

    goto :goto_22

    :cond_2b
    move-object/from16 v2, v22

    :goto_22
    if-eq v8, v15, :cond_2c

    .line 75
    iget-object v2, v8, Lr5;->T:[Lq5;

    add-int/lit8 v3, p3, 0x1

    aget-object v2, v2, v3

    iget-object v2, v2, Lq5;->i:Le5;

    goto :goto_23

    :cond_2c
    if-ne v15, v13, :cond_2e

    .line 76
    iget-object v2, v11, Lr5;->T:[Lq5;

    aget-object v3, v2, p3

    iget-object v3, v3, Lq5;->f:Lq5;

    if-eqz v3, :cond_2d

    aget-object v2, v2, p3

    iget-object v2, v2, Lq5;->f:Lq5;

    iget-object v2, v2, Lq5;->i:Le5;

    goto :goto_23

    :cond_2d
    move-object/from16 v2, v22

    .line 77
    :cond_2e
    :goto_23
    invoke-virtual {v0}, Lq5;->e()I

    move-result v0

    .line 78
    iget-object v3, v15, Lr5;->T:[Lq5;

    add-int/lit8 v4, p3, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v3}, Lq5;->e()I

    move-result v3

    if-eqz v7, :cond_2f

    .line 79
    iget-object v5, v7, Lr5;->T:[Lq5;

    aget-object v5, v5, p3

    .line 80
    iget-object v6, v5, Lq5;->i:Le5;

    :goto_24
    move-object/from16 p0, v7

    goto :goto_25

    .line 81
    :cond_2f
    iget-object v5, v12, Lr5;->T:[Lq5;

    aget-object v5, v5, v4

    iget-object v5, v5, Lq5;->f:Lq5;

    if-eqz v5, :cond_30

    .line 82
    iget-object v6, v5, Lq5;->i:Le5;

    goto :goto_24

    :cond_30
    move-object/from16 p0, v7

    move-object/from16 v6, v22

    .line 83
    :goto_25
    iget-object v7, v15, Lr5;->T:[Lq5;

    aget-object v7, v7, v4

    iget-object v7, v7, Lq5;->i:Le5;

    if-eqz v5, :cond_31

    .line 84
    invoke-virtual {v5}, Lq5;->e()I

    move-result v5

    add-int/2addr v3, v5

    .line 85
    :cond_31
    iget-object v5, v8, Lr5;->T:[Lq5;

    aget-object v5, v5, v4

    invoke-virtual {v5}, Lq5;->e()I

    move-result v5

    add-int/2addr v0, v5

    if-eqz v1, :cond_35

    if-eqz v2, :cond_35

    if-eqz v6, :cond_35

    if-eqz v7, :cond_35

    if-ne v15, v13, :cond_32

    .line 86
    iget-object v0, v13, Lr5;->T:[Lq5;

    aget-object v0, v0, p3

    invoke-virtual {v0}, Lq5;->e()I

    move-result v0

    :cond_32
    move v5, v0

    if-ne v15, v14, :cond_33

    .line 87
    iget-object v0, v14, Lr5;->T:[Lq5;

    aget-object v0, v0, v4

    invoke-virtual {v0}, Lq5;->e()I

    move-result v0

    move/from16 v18, v0

    goto :goto_26

    :cond_33
    move/from16 v18, v3

    :goto_26
    if-eqz v17, :cond_34

    const/16 v19, 0x8

    goto :goto_27

    :cond_34
    const/16 v19, 0x5

    :goto_27
    const/high16 v4, 0x3f000000    # 0.5f

    move-object/from16 v0, p1

    move v3, v5

    move-object v5, v6

    move-object v6, v7

    move-object/from16 v20, p0

    move/from16 v7, v18

    move-object/from16 v18, v8

    move/from16 v8, v19

    .line 88
    invoke-virtual/range {v0 .. v8}, Lz4;->c(Le5;Le5;IFLe5;Le5;II)V

    goto :goto_28

    :cond_35
    move-object/from16 v20, p0

    goto/16 :goto_20

    .line 89
    :goto_28
    invoke-virtual {v15}, Lr5;->T()I

    move-result v0

    const/16 v8, 0x8

    if-eq v0, v8, :cond_36

    goto :goto_29

    :cond_36
    move-object/from16 v15, v18

    :goto_29
    move-object v8, v15

    move-object/from16 v15, v20

    goto/16 :goto_1e

    :cond_37
    const/16 v8, 0x8

    if-eqz v16, :cond_48

    if-eqz v13, :cond_48

    .line 90
    iget v1, v0, Lp5;->j:I

    if-lez v1, :cond_38

    iget v0, v0, Lp5;->i:I

    if-ne v0, v1, :cond_38

    const/16 v17, 0x1

    goto :goto_2a

    :cond_38
    const/16 v17, 0x0

    :goto_2a
    move-object v7, v13

    move-object v15, v7

    :goto_2b
    if-eqz v15, :cond_44

    .line 91
    iget-object v0, v15, Lr5;->r0:[Lr5;

    aget-object v0, v0, v10

    :goto_2c
    if-eqz v0, :cond_39

    .line 92
    invoke-virtual {v0}, Lr5;->T()I

    move-result v1

    if-ne v1, v8, :cond_39

    .line 93
    iget-object v0, v0, Lr5;->r0:[Lr5;

    aget-object v0, v0, v10

    goto :goto_2c

    :cond_39
    if-eq v15, v13, :cond_42

    if-eq v15, v14, :cond_42

    if-eqz v0, :cond_42

    if-ne v0, v14, :cond_3a

    move-object/from16 v6, v22

    goto :goto_2d

    :cond_3a
    move-object v6, v0

    .line 94
    :goto_2d
    iget-object v0, v15, Lr5;->T:[Lq5;

    aget-object v0, v0, p3

    .line 95
    iget-object v1, v0, Lq5;->i:Le5;

    .line 96
    iget-object v2, v0, Lq5;->f:Lq5;

    if-eqz v2, :cond_3b

    iget-object v2, v2, Lq5;->i:Le5;

    .line 97
    :cond_3b
    iget-object v2, v7, Lr5;->T:[Lq5;

    add-int/lit8 v3, p3, 0x1

    aget-object v2, v2, v3

    iget-object v2, v2, Lq5;->i:Le5;

    .line 98
    invoke-virtual {v0}, Lq5;->e()I

    move-result v0

    .line 99
    iget-object v4, v15, Lr5;->T:[Lq5;

    aget-object v4, v4, v3

    invoke-virtual {v4}, Lq5;->e()I

    move-result v4

    if-eqz v6, :cond_3d

    .line 100
    iget-object v5, v6, Lr5;->T:[Lq5;

    aget-object v5, v5, p3

    .line 101
    iget-object v8, v5, Lq5;->i:Le5;

    move-object/from16 p0, v6

    .line 102
    iget-object v6, v5, Lq5;->f:Lq5;

    if-eqz v6, :cond_3c

    iget-object v6, v6, Lq5;->i:Le5;

    goto :goto_2e

    :cond_3c
    move-object/from16 v6, v22

    :goto_2e
    move-object/from16 v37, v8

    move-object v8, v6

    move-object/from16 v6, v37

    goto :goto_30

    :cond_3d
    move-object/from16 p0, v6

    .line 103
    iget-object v5, v14, Lr5;->T:[Lq5;

    aget-object v5, v5, p3

    if-eqz v5, :cond_3e

    .line 104
    iget-object v6, v5, Lq5;->i:Le5;

    goto :goto_2f

    :cond_3e
    move-object/from16 v6, v22

    .line 105
    :goto_2f
    iget-object v8, v15, Lr5;->T:[Lq5;

    aget-object v8, v8, v3

    iget-object v8, v8, Lq5;->i:Le5;

    :goto_30
    if-eqz v5, :cond_3f

    .line 106
    invoke-virtual {v5}, Lq5;->e()I

    move-result v5

    add-int/2addr v4, v5

    :cond_3f
    move/from16 v18, v4

    .line 107
    iget-object v4, v7, Lr5;->T:[Lq5;

    aget-object v3, v4, v3

    invoke-virtual {v3}, Lq5;->e()I

    move-result v3

    add-int/2addr v3, v0

    if-eqz v17, :cond_40

    const/16 v19, 0x8

    goto :goto_31

    :cond_40
    const/16 v19, 0x4

    :goto_31
    if-eqz v1, :cond_41

    if-eqz v2, :cond_41

    if-eqz v6, :cond_41

    if-eqz v8, :cond_41

    const/high16 v4, 0x3f000000    # 0.5f

    move-object/from16 v0, p1

    move-object v5, v6

    move-object/from16 v20, p0

    const/16 v21, 0x4

    move-object v6, v8

    move-object/from16 v23, v7

    move/from16 v7, v18

    const/16 v10, 0x8

    move/from16 v8, v19

    .line 108
    invoke-virtual/range {v0 .. v8}, Lz4;->c(Le5;Le5;IFLe5;Le5;II)V

    goto :goto_32

    :cond_41
    move-object/from16 v20, p0

    move-object/from16 v23, v7

    const/16 v10, 0x8

    const/16 v21, 0x4

    :goto_32
    move-object/from16 v0, v20

    goto :goto_33

    :cond_42
    move-object/from16 v23, v7

    move v10, v8

    const/16 v21, 0x4

    .line 109
    :goto_33
    invoke-virtual {v15}, Lr5;->T()I

    move-result v1

    if-eq v1, v10, :cond_43

    move-object v7, v15

    goto :goto_34

    :cond_43
    move-object/from16 v7, v23

    :goto_34
    move-object v15, v0

    move v8, v10

    move/from16 v10, p2

    goto/16 :goto_2b

    .line 110
    :cond_44
    iget-object v0, v13, Lr5;->T:[Lq5;

    aget-object v0, v0, p3

    .line 111
    iget-object v1, v11, Lr5;->T:[Lq5;

    aget-object v1, v1, p3

    iget-object v1, v1, Lq5;->f:Lq5;

    .line 112
    iget-object v2, v14, Lr5;->T:[Lq5;

    add-int/lit8 v3, p3, 0x1

    aget-object v10, v2, v3

    .line 113
    iget-object v2, v12, Lr5;->T:[Lq5;

    aget-object v2, v2, v3

    iget-object v11, v2, Lq5;->f:Lq5;

    if-eqz v1, :cond_46

    if-eq v13, v14, :cond_45

    .line 114
    iget-object v2, v0, Lq5;->i:Le5;

    iget-object v1, v1, Lq5;->i:Le5;

    invoke-virtual {v0}, Lq5;->e()I

    move-result v0

    const/4 v15, 0x5

    invoke-virtual {v9, v2, v1, v0, v15}, Lz4;->e(Le5;Le5;II)Lx4;

    goto :goto_35

    :cond_45
    const/4 v15, 0x5

    if-eqz v11, :cond_47

    .line 115
    iget-object v2, v0, Lq5;->i:Le5;

    iget-object v3, v1, Lq5;->i:Le5;

    invoke-virtual {v0}, Lq5;->e()I

    move-result v4

    const/high16 v5, 0x3f000000    # 0.5f

    iget-object v6, v10, Lq5;->i:Le5;

    iget-object v7, v11, Lq5;->i:Le5;

    .line 116
    invoke-virtual {v10}, Lq5;->e()I

    move-result v8

    const/16 v17, 0x5

    move-object/from16 v0, p1

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    move v4, v5

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move/from16 v8, v17

    .line 117
    invoke-virtual/range {v0 .. v8}, Lz4;->c(Le5;Le5;IFLe5;Le5;II)V

    goto :goto_35

    :cond_46
    const/4 v15, 0x5

    :cond_47
    :goto_35
    if-eqz v11, :cond_48

    if-eq v13, v14, :cond_48

    .line 118
    iget-object v0, v10, Lq5;->i:Le5;

    iget-object v1, v11, Lq5;->i:Le5;

    invoke-virtual {v10}, Lq5;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {v9, v0, v1, v2, v15}, Lz4;->e(Le5;Le5;II)Lx4;

    :cond_48
    :goto_36
    if-nez v27, :cond_49

    if-eqz v16, :cond_50

    :cond_49
    if-eqz v13, :cond_50

    if-eq v13, v14, :cond_50

    .line 119
    iget-object v0, v13, Lr5;->T:[Lq5;

    aget-object v1, v0, p3

    if-nez v14, :cond_4a

    move-object v14, v13

    .line 120
    :cond_4a
    iget-object v2, v14, Lr5;->T:[Lq5;

    add-int/lit8 v3, p3, 0x1

    aget-object v2, v2, v3

    .line 121
    iget-object v4, v1, Lq5;->f:Lq5;

    if-eqz v4, :cond_4b

    iget-object v4, v4, Lq5;->i:Le5;

    goto :goto_37

    :cond_4b
    move-object/from16 v4, v22

    .line 122
    :goto_37
    iget-object v5, v2, Lq5;->f:Lq5;

    if-eqz v5, :cond_4c

    iget-object v5, v5, Lq5;->i:Le5;

    goto :goto_38

    :cond_4c
    move-object/from16 v5, v22

    :goto_38
    if-eq v12, v14, :cond_4e

    .line 123
    iget-object v5, v12, Lr5;->T:[Lq5;

    aget-object v5, v5, v3

    .line 124
    iget-object v5, v5, Lq5;->f:Lq5;

    if-eqz v5, :cond_4d

    iget-object v5, v5, Lq5;->i:Le5;

    move-object/from16 v22, v5

    :cond_4d
    move-object/from16 v5, v22

    :cond_4e
    if-ne v13, v14, :cond_4f

    .line 125
    aget-object v1, v0, p3

    .line 126
    aget-object v2, v0, v3

    :cond_4f
    if-eqz v4, :cond_50

    if-eqz v5, :cond_50

    const/high16 v6, 0x3f000000    # 0.5f

    .line 127
    invoke-virtual {v1}, Lq5;->e()I

    move-result v7

    .line 128
    iget-object v0, v14, Lr5;->T:[Lq5;

    aget-object v0, v0, v3

    invoke-virtual {v0}, Lq5;->e()I

    move-result v8

    .line 129
    iget-object v1, v1, Lq5;->i:Le5;

    iget-object v10, v2, Lq5;->i:Le5;

    const/4 v11, 0x5

    move-object/from16 v0, p1

    move-object v2, v4

    move v3, v7

    move v4, v6

    move-object v6, v10

    move v7, v8

    move v8, v11

    invoke-virtual/range {v0 .. v8}, Lz4;->c(Le5;Le5;IFLe5;Le5;II)V

    :cond_50
    return-void
.end method

.method public static b(Ls5;Lz4;Ljava/util/ArrayList;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls5;",
            "Lz4;",
            "Ljava/util/ArrayList<",
            "Lr5;",
            ">;I)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p3, :cond_0

    .line 1
    iget v1, p0, Ls5;->F0:I

    .line 2
    iget-object v2, p0, Ls5;->I0:[Lp5;

    move-object v3, v2

    move v2, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    .line 3
    iget v2, p0, Ls5;->G0:I

    .line 4
    iget-object v3, p0, Ls5;->H0:[Lp5;

    move v6, v2

    move v2, v1

    move v1, v6

    :goto_0
    if-ge v0, v1, :cond_3

    .line 5
    aget-object v4, v3, v0

    .line 6
    invoke-virtual {v4}, Lp5;->a()V

    if-eqz p2, :cond_1

    if-eqz p2, :cond_2

    .line 7
    iget-object v5, v4, Lp5;->a:Lr5;

    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 8
    :cond_1
    invoke-static {p0, p1, p3, v2, v4}, Lo5;->a(Ls5;Lz4;IILp5;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
