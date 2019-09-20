package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.DigibankEntity;

/**
 * Session Bean implementation class DigibankEJB
 */
@Stateless
@LocalBean
public class DigibankEJB {

	@PersistenceContext
	private EntityManager dg;
    public DigibankEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNew(DigibankEntity digibankEntity) {
    	System.out.println("**********Adding Transaction to the Database*********");
    	dg.persist(digibankEntity);
    }

}
