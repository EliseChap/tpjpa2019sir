package dao.generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@SuppressWarnings("unchecked")
public class GenericDaoImpl<E> implements IGenericDao<E>{
	
	protected EntityManager  em;
	
	private Class<E> type;
	
	public GenericDaoImpl() { 
		
		this.em = EntityManagerHelper.getEntityManager();
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class<E>) pt.getActualTypeArguments()[0];
	
	}
	
	public Class<E> getType() {
		return type;
	}

	public void setType(Class<E> type) {
		this.type = type;
	}

	public E save(E entity) {
		EntityTransaction t = this.em.getTransaction();
		t.begin();
		 em.persist(entity);
		t.commit();
		return entity;
	}

	public E update(E entity) {
		
		EntityTransaction t = this.em.getTransaction();
		t.begin();
	    E res= em.merge(entity);
	    t.commit();
	    return res;
	}

	public List<E> selectAll() {
		Query query= em.createQuery("select t  from "+ type.getSimpleName()+"t");	
		return query.getResultList();
		}

	public List<E> selectAll(String sf, String trie) {
		Query query= em.createQuery("select t  from "+ type.getSimpleName()+" t order by "+sf+ " "+trie);
		return query.getResultList();
	}

	public E getById(Long id) {
		return em.find(type, id);
	}

	public void deleteById(Long id) {
		E tab = getById(id);
		delete(tab);
	}

	public void delete(E entity) {
		EntityTransaction t = this.em.getTransaction();
		t.begin();
		 em.remove(entity);
		 t.commit();
	}
	
	public E findOne(String paraName, Object paramValue) {
		Query query=em.createQuery("select t from"+ type.getSimpleName()+"t where"+ paraName + " = : x");
		query.setParameter(paraName, paramValue);
		/*if(query.getResultList().size()>0) {
			return (E) query.getResultList().get(0);
		}
		return null;*/
		return query.getResultList().size()>0 ? (E) query.getResultList().get(0): null;
	}

	public E findOne(String[] paramNames, Object[] paramValues) {
		if(paramNames.length != paramValues.length) {
			return null;
		}
		String queryString = "select e from"+ type .getSimpleName()+ "e where";
		int len = paramNames.length;
		for(int i=0;i<len;i++) {
			queryString += " e."+paramNames[i]+ "= :x" +i;
			if((i+1)<len) {
				queryString +="and";
			}
		}
		Query query= em.createQuery(queryString)	;
			for(int i=0; i <paramValues.length; i++  ) {
				query.setParameter("x", paramValues[i]);
			}
		return query.getResultList().size()>0 ? (E)query.getResultList().get(0) : null;
	}

	public int findCountBy(String paramName, String paramValue) {
		Query query=em.createQuery("select t from"+ type.getSimpleName()+"t where"+ paramName + " = : x");
		query.setParameter(paramName, paramValue);
		return query.getResultList().size()>0 ?((Long)query.getSingleResult()).intValue() : 0;
	}

	public List<E> findAll() {
		
		return em.createQuery("select t from" + type.getSimpleName()+ "as t", type).getResultList();
	}

	

}
