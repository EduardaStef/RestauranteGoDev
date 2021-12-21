package com.godev.restaurantegodev.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPedido is a Querydsl query type for Pedido
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPedido extends EntityPathBase<Pedido> {

    private static final long serialVersionUID = -1151101755L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPedido pedido = new QPedido("pedido");

    public final QCliente cliente;

    public final DatePath<java.time.LocalDate> dataPedido = createDate("dataPedido", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QProduto produto;

    public final QRestaurante restaurante;

    public QPedido(String variable) {
        this(Pedido.class, forVariable(variable), INITS);
    }

    public QPedido(Path<? extends Pedido> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPedido(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPedido(PathMetadata metadata, PathInits inits) {
        this(Pedido.class, metadata, inits);
    }

    public QPedido(Class<? extends Pedido> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cliente = inits.isInitialized("cliente") ? new QCliente(forProperty("cliente"), inits.get("cliente")) : null;
        this.produto = inits.isInitialized("produto") ? new QProduto(forProperty("produto")) : null;
        this.restaurante = inits.isInitialized("restaurante") ? new QRestaurante(forProperty("restaurante"), inits.get("restaurante")) : null;
    }

}

