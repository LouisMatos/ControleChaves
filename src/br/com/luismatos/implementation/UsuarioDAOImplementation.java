package br.com.luismatos.implementation;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.jboss.logging.Logger;

import br.com.luismatos.dao.UsuarioDAO;
import br.com.luismatos.genericdao.GenericDAOImplementation;
import br.com.luismatos.model.Usuario;

public class UsuarioDAOImplementation extends GenericDAOImplementation<Usuario> implements UsuarioDAO {

	Logger logger;

	public UsuarioDAOImplementation() {
		super(Usuario.class);
	}

	public boolean existeEmail(Usuario usuario) {

		if (!entityManager.getTransaction().isActive()) {
			entityManager.getTransaction().begin();
		}

		Query query = entityManager.createQuery("select u from Usuario u where u.email = :pEmail ")
				.setParameter("pEmail", usuario.getEmail());

		boolean encontrado = !query.getResultList().isEmpty();
		System.out.println("Existe usuario " + usuario.getEmail() + "? " + encontrado);
		entityManager.flush();
		entityManager.getTransaction().commit();
		return encontrado;

	}

	/*
	 * public Usuario existeUsuario(Usuario usuario){ Usuario usu = null;
	 * 
	 * if(!entityManager.getTransaction().isActive()){
	 * entityManager.getTransaction().begin(); }
	 * 
	 * 
	 * Query query = entityManager.
	 * createQuery("select u from Usuario u where u.email = :pEmail and u.senha = :pSenha"
	 * ).setParameter("pEmail", usuario.getEmail()).setParameter("pSenha",
	 * usuario.getSenha()); boolean encontrado =
	 * !query.getResultList().isEmpty();
	 * 
	 * if(encontrado == true){ usu = (Usuario) entityManager.
	 * createQuery("select u from Usuario u where u.email = :pEmail and u.senha = :pSenha"
	 * ).setParameter("pEmail", usuario.getEmail()).setParameter("pSenha",
	 * usuario.getSenha()).getSingleResult(); }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * //System.out.println("Existe Usuário " + usuario.getEmail() + "? " +
	 * encontrado); entityManager.flush();
	 * entityManager.getTransaction().commit(); return usu; }
	 */
	public Usuario existeUsuario(Usuario usuario) {

		try {
			if (!entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().begin();
			}
			
			CriteriaBuilder builder = entityManager.getCriteriaBuilder();
			CriteriaQuery<Usuario> criteria = builder.createQuery(Usuario.class);

			Root<Usuario> usuarioRoot = criteria.from(Usuario.class);
			Predicate predicate = builder.and();
			
			predicate = builder.and(predicate, builder.equal(usuarioRoot.get("email"), usuario.getEmail()));
			predicate = builder.and(predicate, builder.equal(usuarioRoot.get("senha"), usuario.getSenha()));
			
			TypedQuery<Usuario> typedQuery = entityManager.createQuery(criteria.select(usuarioRoot).where(predicate));
			
			Usuario usu = null;
			if(!typedQuery.getResultList().isEmpty()){
				usu = typedQuery.getSingleResult();
				System.out.println(usu.toString());
			}
			
			
			//usu = entityManager.createQuery(criteria).getSingleResult();
			
			return usu;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			entityManager.flush();
			entityManager.getTransaction().commit();
		}
	}

}
