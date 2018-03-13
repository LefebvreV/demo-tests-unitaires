package dev.utils.test;

import dev.utils.*;

public class StringUtilsTest{
   
	public static void main(String[] args){
		int result = StringUtils.levenshteinDistance("chats", "chat");
		if (result !=1)
			throw new RuntimeException("La distance doit être de 1 pour le test 1");
		else
			System.out.println("Le test 1 fonctionne");
		
		result = StringUtils.levenshteinDistance("chien", "chine");
		if (result !=2)
			throw new RuntimeException("La distance doit être de 2 pour le test 2");
		else
			System.out.println("Le test 2 fonctionne");
		
		result = StringUtils.levenshteinDistance("aviron", "avion");
		if (result !=1)
			throw new RuntimeException("La distance doit être de 1 pour le test 3");
		else
			System.out.println("Le test 3 fonctionne");
		
		result = StringUtils.levenshteinDistance("chien", "chien");
		if (result !=0)
			throw new RuntimeException("La distance doit être de 0 pour le test 4");
		else
			System.out.println("Le test 4 fonctionne");
		
		String msg = null;
		try{
			result = StringUtils.levenshteinDistance(null, null);
		}catch(RuntimeException e){
			msg = e.getMessage();
		}
		if(msg==null)
			throw new RuntimeException("La méthode doit générer un exception pour le test 5");
		
	}
}
