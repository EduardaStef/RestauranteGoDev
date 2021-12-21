package com.godev.restaurantegodev.repository.custom;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.godev.restaurantegodev.model.Cliente;
import com.godev.restaurantegodev.model.QCliente;
import com.querydsl.jpa.impl.JPAQueryFactory;

public class ClienteRepoCustomImpl implements ClienteRepoCustom{

    public static final QCliente Q_CLIENTE = QCliente.cliente;


    @PersistenceContext
    private EntityManager entityManager;

    private JPAQueryFactory _buildQueryFactory() {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);

        return queryFactory;
    }

   @Override
    public List<Cliente> buscarTodosClientesQueryDsl() {
        List<Cliente> clientes = _buildQueryFactory().selectFrom(Q_CLIENTE).fetch();
        return clientes;
    }
}
