package com.godev.restaurantegodev.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEndereco is a Querydsl query type for Endereco
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEndereco extends EntityPathBase<Endereco> {

    private static final long serialVersionUID = -703953591L;

    public static final QEndereco endereco = new QEndereco("endereco");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath logradouro = createString("logradouro");

    public final NumberPath<Integer> numero = createNumber("numero", Integer.class);

    public final StringPath rua = createString("rua");

    public QEndereco(String variable) {
        super(Endereco.class, forVariable(variable));
    }

    public QEndereco(Path<? extends Endereco> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEndereco(PathMetadata metadata) {
        super(Endereco.class, metadata);
    }

}

