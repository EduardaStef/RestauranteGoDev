package com.godev.restaurantegodev.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCliente is a Querydsl query type for Cliente
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCliente extends EntityPathBase<Cliente> {

    private static final long serialVersionUID = 227850362L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCliente cliente = new QCliente("cliente");

    public final QContato contato;

    public final StringPath cpf = createString("cpf");

    public final QEndereco endereco;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public final ListPath<Pedido, QPedido> pedidos = this.<Pedido, QPedido>createList("pedidos", Pedido.class, QPedido.class, PathInits.DIRECT2);

    public final StringPath sobrenome = createString("sobrenome");

    public QCliente(String variable) {
        this(Cliente.class, forVariable(variable), INITS);
    }

    public QCliente(Path<? extends Cliente> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCliente(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCliente(PathMetadata metadata, PathInits inits) {
        this(Cliente.class, metadata, inits);
    }

    public QCliente(Class<? extends Cliente> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.contato = inits.isInitialized("contato") ? new QContato(forProperty("contato")) : null;
        this.endereco = inits.isInitialized("endereco") ? new QEndereco(forProperty("endereco")) : null;
    }

}

