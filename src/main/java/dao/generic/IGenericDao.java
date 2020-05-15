package dao.generic;

import java.util.List;

public interface IGenericDao<E> {
	
	 E save(E entity);
	
	 E update(E entity);
	
	 List <E> selectAll();
	
	 List<E> selectAll(String  sf, String trie);//select * from nomtable
	
	 E getById(Long id);
	
	 void delete(E entity);
	 
	 void deleteById(Long id);
	
	 E findOne(String paraName, Object paramValue);//permet de recupere un objet en passant le nom de parametre et ca valeur

	 E findOne(String []paramNames, Object[] paramValues );
	
	 int findCountBy(String paramName, String paramValue);
	
	 List <E> findAll();

	
	

}
