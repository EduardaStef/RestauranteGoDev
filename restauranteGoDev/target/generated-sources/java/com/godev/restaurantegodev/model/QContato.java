package com.godev.restaurantegodev.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QContato is a Querydsl query type for Contato
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QContato extends EntityPathBase<Contato> {

    private static final long serialVersionUID = 318789802L;

    public static final QContato contato = new QContato("contato");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath telefone = createString("telefone");

    public QContato(String variable) {
        super(Contato.class, forVariable(variable));
    }

    public QContato(Path<? extends Contato> path) {
        super(path.getType(), path.getMetadata());
    }

    public QContato(PathMetadata metadata) {
        super(Contato.class, metadata);
    }

}

