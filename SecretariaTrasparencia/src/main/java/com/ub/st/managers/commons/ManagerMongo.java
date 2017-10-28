/*
 * Copyright (C) 2017 Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.ub.st.managers.commons;

import com.ub.st.daos.commons.DaoMongoFacade;
import com.ub.st.entities.commons.EntityMongo;
import com.ub.st.utils.exceptions.TokenExpiradoException;
import com.ub.st.utils.exceptions.TokenInvalidoException;
import java.util.List;
import static java.util.stream.Collectors.toList;
import org.mongojack.DBQuery;

/**
 * manaherm para entidades mongoDB
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 * @param <T> entidad a manejar
 */
public abstract class ManagerMongo<T extends EntityMongo<String>> extends ManagerFacade<T, String> {

    protected DaoMongoFacade<T> dao;

    public ManagerMongo(DaoMongoFacade<T> dao) {
        super();
        this.dao = dao;
    }

    public ManagerMongo(DaoMongoFacade<T> dao, String token) throws TokenInvalidoException, TokenExpiradoException {
        super(token);
        this.dao = dao;
    }

    @Override
    public T persist(T entity) {        
        T t = (T) dao.persist(entity);
        return t;
    }

    @Override
    public List<T> persistAll(List<T> entities) throws Exception {
        List<T> ts = dao.persistAll(entities);
        return ts;
    }
    
    @Override
    public void delete(String id) {
        dao.delete(id);
    }

    public void delete(DBQuery.Query q) {
        List<T> ts = this.findAll(q);
        dao.deleteAll(ts.stream().map(t -> t.getId()).collect(toList()));
    }

    //@Override
    @Override
    public void deleteAll(List<String> ids) throws Exception {
        List<T> ts = this.findAll(DBQuery.in("_id", ids));
        dao.deleteAll(ids);
    }

    @Override
    public void update(T entity) throws Exception {
        dao.update(entity);
    }

    public void update(DBQuery.Query q, T t) {
        List<T> ts = this.findAll(q);
        dao.update(q, t);
    }
    
    public T findOne(String id) {
        T t = (T) dao.findOne(id);
        return t;
    }

    public T findOne(DBQuery.Query q) {
        T t = (T) dao.findOne(q);
        return t;
    }

    public T findOne(DBQuery.Query q, String... attributesProjection) {
        return (T) dao.findOne(q, attributesProjection);
    }

    @Override
    public List<T> findAll() {
        return dao.findAll();
    }

    public List<T> findAll(String... attributesProjection) {
        return dao.findAll(attributesProjection);
    }

    public List<T> findall(String... attributesProjection) {
        return dao.findAll(attributesProjection);
    }

    @Override
    public List<T> findAll(int max) {
        return dao.findAll(max);
    }

    public List<T> findAll(int max, String... attributesProjection) {
        return dao.findAll(max, attributesProjection);
    }

    public List<T> findAll(DBQuery.Query q) {
        return dao.findAll(q);
    }

    public List<T> findall(DBQuery.Query query, String... attributesProjection) {
        return dao.findAll(query, attributesProjection);
    }

    public List<T> findAll(DBQuery.Query q, int max) {
        return dao.findAll(q, max);
    }

    public List<T> findAll(DBQuery.Query q, int max, String attributesProjection) {
        return dao.findAll(q, max, attributesProjection);
    }

    public long count(DBQuery.Query q) {
        return dao.count(q);
    }

    @Override
    public long count() {
        return dao.count();
    }

    @Override
    public T findFirst() {
        return (T) dao.findFirst();
    }

    public DaoMongoFacade<T> getDao() {
        return dao;
    }

 
}
