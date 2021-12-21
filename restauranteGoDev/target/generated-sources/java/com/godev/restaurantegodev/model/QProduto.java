package com.godev.restaurantegodev.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QProduto is a Querydsl query type for Produto
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProduto extends EntityPathBase<Produto> {

    private static final long serialVersionUID = -942210695L;

    public static final QProduto produto = new QProduto("produto");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Double> preco = createNumber("preco", Double.class);

    public final StringPath produtoNome = createString("produtoNome");

    public QProduto(String variable) {
        super(Produto.class, forVariable(variable));
    }

    public QProduto(Path<? extends Produto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProduto(PathMetadata metadata) {
        super(Produto.class, metadata);
    }

}

