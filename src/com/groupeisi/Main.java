package com.groupeisi;

import com.groupeisi.entities.Role;
import com.groupeisi.entities.User;
import com.groupeisi.repository.IRole;
import com.groupeisi.repository.IUser;
import com.groupeisi.repository.RoleImpl;
import com.groupeisi.repository.UserImpl;

public class Main {

	public static void main(String[] args) {
		
		IRole iRole = new RoleImpl();
		IUser iUser = new UserImpl();
		
		Role role = new Role();		
		//role.setId(1);
		role.setNom("ROLE_ADMIN");
		int result0 = iRole.saisie(role);
		
		User user = new User();
		//user.setId(1);
		user.setPrenom("Gora");
		user.setNom("MBATHIE");
		user.setEmail("mamegor@gmail.com");
		user.setPassword("passer");
		user.setEtat(1);
		//user.addRole(role);
		
		int result1 = iUser.saisie(user);
		
		if(result0 == 1)
			System.out.println("Insertion Role avec succes.");
		else 
			System.out.println("Insertion Role echouee !!!");

		if(result1 == 1)
			System.out.println("Insertion User avec succes.");
		else
			System.out.println("Insertion User echouee !!!");

		iRole.terminate();
		iUser.terminate();

		
		/*public static void main(String[]argv) {    
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("MaBaseDeTestPU");    
		    EntityManager em = emf.createEntityManager();    
		    EntityTransaction transac = em.getTransaction();
		    transac.begin();
		    Personne nouvellePersonne = new Personne();
		    nouvellePersonne.setId(4);
		    nouvellePersonne.setNom("nom4");
		    nouvellePersonne.setPrenom("prenom4");
		    em.persist(nouvellePersonne);
		    transac.commit();
		    
		    em.close();    
		    emf.close();  
		  } */
		
	}

}
