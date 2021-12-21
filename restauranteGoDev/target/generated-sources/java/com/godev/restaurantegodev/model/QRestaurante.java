package com.godev.restaurantegodev.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRestaurante is a Querydsl query type for Restaurante
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRestaurante extends EntityPathBase<Restaurante> {

    private static final long serialVersionUID = -1973743800L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRestaurante restaurante = new QRestaurante("restaurante");

    public final QContato contato;

    public final QEndereco endereco;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public final EnumPath<com.godev.restaurantegodev.enums.TipoRestaurante> tipo = createEnum("tipo", com.godev.restaurantegodev.enums.TipoRestaurante.class);

    public QRestaurante(String variable) {
        this(Restaurante.class, forVariable(variable), INITS);
    }

    public QRestaurante(Path<? extends Restaurante> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRestaurante(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRestaurante(PathMetadata metadata, PathInits inits) {
        this(Restaurante.class, metadata, inits);
    }

    public QRestaurante(Class<? extends Restaurante> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.contato = inits.isInitialized("contato") ? new QContato(forProperty("contato")) : null;
        this.endereco = inits.isInitialized("endereco") ? new QEndereco(forProperty("endereco")) : null;
    }

}

