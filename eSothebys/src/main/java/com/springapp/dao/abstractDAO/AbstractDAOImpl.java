package com.springapp.dao.abstractDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Internet on 2015-02-12.
 */

@SuppressWarnings("unchecked")
public abstract class AbstractDAOImpl<T, K extends Serializable> implements AbstractDAO<T, K> {
    private Class<T> baseEntityType;
    private Class<K> primaryKeyClass;

    @PersistenceContext(unitName = "entityManager")
    private EntityManager entityManager;

    public AbstractDAOImpl() {
    }

    public AbstractDAOImpl(Class<T> collType, Class<K> keyType){
        this.baseEntityType = collType;
        this.primaryKeyClass = keyType;
    }

    protected EntityManager getEntityManager() {
        return this.entityManager;
    }

    public void create(T entity) {

        this.entityManager.persist(entity);
    }

    public void update(T entity) {

        this.entityManager.merge(entity);
    }

    public T getById(K id) {
        T result = (T) this.entityManager.find(baseEntityType.getClass(), id);
        return result;
    }

    public void delete(T entity) {

        this.entityManager.remove(entity);
    }

    @SuppressWarnings("unchecked")
    public List<T> getAll() {
        String query = String.format("select x from %s x where x.", baseEntityType.getClass().getName());
        List<T> results = (List<T>) this.entityManager.createQuery(query).getResultList();
        return results;
    }

    private List<T> getByCriteria(Map<String, String> )
}
